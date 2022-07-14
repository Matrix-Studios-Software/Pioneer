package ltd.matrixstudios.bukkit.ranks

import ltd.matrixstudios.bukkit.PioneerBukkit

object RankHandler {

    val ranks = hashMapOf<String, Rank>()

    fun loadIntoHashMap()
    {
        val response = PioneerBukkit.instance.rankService.fetch().execute()

        if (response.isSuccessful)
        {
            for (rank in response.body()!!)
            {
                ranks[rank.id] = rank
            }
        }
    }

    fun recache(rankId: String)
    {
        val response = PioneerBukkit.instance.rankService.fetchWithId(rankId).execute()

        if (response.isSuccessful)
        {
            if (response.body() != null)
            {
                ranks[rankId] = response.body()!!
            }
        }
    }

    fun exists(id: String) : Boolean
    {
        return ranks[id] != null
    }

    fun byRankId(id: String) : Rank?
    {
        return ranks[id]
    }
}