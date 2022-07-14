package ltd.matrixstudios.bukkit.tags

import ltd.matrixstudios.bukkit.PioneerBukkit

object TagHandler {

    val tags = hashMapOf<String, Tag>()

    fun loadIntoHashMap() {
        val response = PioneerBukkit.instance.tagService.fetch().execute()

        if (response.isSuccessful) {
            for (tag in response.body()!!) {
                tags[tag.id] = tag
            }
        }
    }

    fun recache(tagId: String) {
        val response = PioneerBukkit.instance.tagService.fetchWithId(tagId).execute()

        if (response.isSuccessful) {
            if (response.body() != null) {
                tags[tagId] = response.body()!!
            }
        }
    }

    fun exists(id: String): Boolean {
        return tags[id] != null
    }

    fun byTagId(id: String): Tag? {
        return tags[id]
    }
}