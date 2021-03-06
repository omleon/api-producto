package com.oscar.tienda.repository

import com.oscar.tienda.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository <Product,Long> {
    fun findById(id: Long?): Product?
}
