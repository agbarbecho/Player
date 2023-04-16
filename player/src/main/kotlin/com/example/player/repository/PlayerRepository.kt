package com.example.player.repository

import com.example.player.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository:JpaRepository<Player, Long> {
}