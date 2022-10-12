/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Interface.RoomInterface;
import Reto3_ciclo3.demo.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */

@Repository

public class RoomRepository {
    @Autowired
    private RoomInterface extensionesCrud;
    
    //Método para leer tabla category
    public List<Room> getAll(){
        return(List<Room>) extensionesCrud.findAll();
    }
    
    //Método 2
    public Optional<Room> getRoom (int id){
        return extensionesCrud.findById(id);
    }
    
    //Método Guardar
    public Room save (Room room){
        return extensionesCrud.save(room);
    }
    
    //Método para borrar
    public void delete (Room room){
        extensionesCrud.delete(room);
    }
    
}
