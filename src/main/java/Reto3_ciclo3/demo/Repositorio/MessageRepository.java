/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Interface.MessageInterface;
import Reto3_ciclo3.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Christian
 */

@Repository

public class MessageRepository {
    @Autowired
    private MessageInterface extensionesCrud;
    
    //Método para leer tabla category
    public List<Message> getAll(){
        return(List<Message>) extensionesCrud.findAll();
    }
    
    //Método 2
    public Optional<Message> getMessage (int id){
        return extensionesCrud.findById(id);
    }
    
    //Método Guardar
    public Message save (Message message){
        return extensionesCrud.save(message);
    }
    
    //Método para borrar
    public void delete (Message message){
        extensionesCrud.delete(message);
    }
}
