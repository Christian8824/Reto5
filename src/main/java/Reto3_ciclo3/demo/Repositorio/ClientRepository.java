/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Interface.ClientInterface;
import Reto3_ciclo3.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Christian
 */

@Repository

public class ClientRepository {
    @Autowired
    private ClientInterface extensionesCrud;
    
    //Método para leer tabla category
    public List<Client> getAll(){
        return(List<Client>) extensionesCrud.findAll();
    }
    
    //Método 2
    public Optional<Client> getClient (int id){
        return extensionesCrud.findById(id);
    }
    
    //Método Guardar
    public Client save (Client client){
        return extensionesCrud.save(client);
    }
    
    //Método para borrar
    public void delete (Client client){
        extensionesCrud.delete(client);
    }
}
