package com.oscar.tienda.controller

import com.oscar.tienda.model.Product
import com.oscar.tienda.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun list(): List<Product>{
        return productService.list()
    }
   /* @PostMapping
    fun save(@RequestBody product:Product): Product{
        return productService.save(product)
    */}
