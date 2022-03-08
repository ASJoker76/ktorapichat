package com.asshinichi.data

import com.asshinichi.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages (): List<Message>

    suspend fun insertMessage (message: Message)
}