package com.oscar.tienda.model

import javax.persistence.*

@Entity
@Table(name = "producto")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description: String? = null
    var details: String? = null

}