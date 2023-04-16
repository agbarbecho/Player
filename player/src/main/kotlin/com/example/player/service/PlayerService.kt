package com.example.player.service

import com.example.player.model.Player
import com.example.player.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlayerService {


    @Autowired
    lateinit var PlayerRepository: PlayerRepository

    fun list():List<Player>{
        return PlayerRepository.findAll()
    }
    //number:Long
    fun save(player:Player):Player{
        return PlayerRepository.save(player)
    }
}