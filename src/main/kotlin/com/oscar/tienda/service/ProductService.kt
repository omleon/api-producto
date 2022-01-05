package com.oscar.tienda.service

import com.oscar.tienda.model.Product
import com.oscar.tienda.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository
    fun list(): List<Product> {
        return productRepository.findAll()
    }
    fun save(product: Product): Product {
        return productRepository.save(product)
    }
    fun update(product: Product):Product{
        return  productRepository.save(product)
    }

    fun updateDescription (product: Product):Product {
        val response = productRepository.findById(product.id)
            ?: throw Exception()
        response.apply {
            this.description=product.description
        }
        return productRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        productRepository.deleteById(id)
        return true
    }
}