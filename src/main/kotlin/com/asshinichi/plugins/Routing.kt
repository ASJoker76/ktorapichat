package com.asshinichi.plugins

import chatSocket
import com.asshinichi.room.RoomController
import getAllMessages
import io.ktor.routing.*
import io.ktor.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install (Routing){
        chatSocket (roomController)
        getAllMessages (roomController)
    }
}
