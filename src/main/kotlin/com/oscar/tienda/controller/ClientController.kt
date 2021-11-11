package com.oscar.tienda.controller

import com.oscar.tienda.model.Client
import com.oscar.tienda.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client>{
        return clientService.list()
    }
    @PostMapping
    fun save(@RequestBody client:Client): Client{
        return clientService.save(client)
        }
    @PutMapping
        fun update (@RequestBody client: Client):Client{
        return clientService.update(client)
    }
    @PatchMapping
    fun updaateDescription (@RequestBody client: Client): Client{
        return  clientService.updateDescription(client)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id")id: Long):Boolean{
    return clientService.delete(id)
    }
}