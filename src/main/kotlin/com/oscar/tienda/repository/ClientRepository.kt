package com.oscar.tienda.repository

import com.oscar.tienda.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository:JpaRepository <Client,Long> {
        // interface WorkoutRepository:JpaRepository<Workout, Long> {}
        fun findById(id: Long?): Client?
}
