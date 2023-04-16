package com.example.player.controller

import com.example.player.model.Player
import com.example.player.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController {

    @Autowired
    lateinit var PlayerService:PlayerService

    @GetMapping
    fun list():List<Player> {
    return PlayerService.list()
}
    @PostMapping
    fun save(@RequestBody player: Player):Player{
        return PlayerService.save(player)
    }
}