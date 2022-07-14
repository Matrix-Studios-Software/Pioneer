package ltd.matrixstudios.bukkit.grant.menu

import ltd.matrixstudios.bukkit.api.API
import ltd.matrixstudios.bukkit.grant.Grant
import ltd.matrixstudios.bukkit.utils.Chat
import ltd.matrixstudios.bukkit.utils.TimeUtil
import ltd.matrixstudios.bukkit.utils.menu.Button
import ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.Date

class GrantsMenu(val player: Player, val grants: Collection<Grant>) : PaginatedMenu(18, player) {

    override fun getPagesButtons(player: Player): MutableMap<Int, Button> {
        val buttons = hashMapOf<Int, Button>()

        var index = 0

        for (grant in grants)
        {
            buttons[index++] = GrantsButton(grant)
        }

        return buttons
    }

    override fun getTitle(player: Player): String {
        return "Grants Menu"
    }

    class GrantsButton(val grant: Grant) : Button()
    {
        override fun getMaterial(player: Player): Material {
            return Material.WOOL
        }

        override fun getDescription(player: Player): MutableList<String>? {
            val desc = mutableListOf<String>()
            desc.add(Chat.format("&3&m------------------------------"))
            desc.add(Chat.format("&eRank: &r" + grant.getGrantedRank()!!.color + grant.getGrantedRank()!!.displayName))
            desc.add(Chat.format("&eIssued By: &r${API.getProfile(grant.executor)!!.username}"))
            desc.add(Chat.format("&eReason: &f${grant.reason}"))
            if (grant.duration == Long.MAX_VALUE)
            {
                desc.add(Chat.format("&eDuration: &fForever"))
            } else
            {
                desc.add(Chat.format("&eDuration: &f${TimeUtil.formatDuration(grant.duration)}"))
            }
            desc.add(Chat.format("&3&m------------------------------"))

            return desc
        }

        override fun getDisplayName(player: Player): String? {
            return Chat.format("&c&l(Active) &3${Date(grant.addedAt)}")
        }

        override fun getData(player: Player): Short {
            return 5
        }

        override fun onClick(player: Player, slot: Int, type: ClickType) {

        }

    }
}