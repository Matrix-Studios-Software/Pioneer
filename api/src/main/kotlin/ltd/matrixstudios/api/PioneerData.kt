package ltd.matrixstudios.api

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoDatabase

object PioneerData {

    lateinit var mongoClient: MongoClient
    lateinit var mongoDatabase: MongoDatabase

    fun connect(uri: String)
    {
        mongoClient = MongoClient(MongoClientURI(uri))

        mongoDatabase = mongoClient.getDatabase("Pioneer")
    }
}