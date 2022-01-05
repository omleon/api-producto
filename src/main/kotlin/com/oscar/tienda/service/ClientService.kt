package com.oscar.tienda.service

import com.oscar.tienda.model.Client
import com.oscar.tienda.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository
    fun list(): List<Client> {
        return clientRepository.findAll()
    }
    fun save(client:Client): Client {
        return clientRepository.save(client)
    }
    fun update(client: Client):Client{
        return  clientRepository.save(client)
    }

    fun updateDescription (client: Client):Client {
        val response = clientRepository.findById(client.id)
            ?: throw Exception()
        response.apply {
            this.nombre=client.nombre
        }
        return clientRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        clientRepository.deleteById(id)
        return true
    }
}
