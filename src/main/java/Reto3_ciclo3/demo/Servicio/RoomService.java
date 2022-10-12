/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Servicio;

import Reto3_ciclo3.demo.Modelo.Room;
import Reto3_ciclo3.demo.Repositorio.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */

@Service

public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    
    //Importar Métodos del Repositorio
    public List<Room> getAll(){
        return roomRepository.getAll();
    }
    
    public Optional<Room> getRoom(int id){
        return roomRepository.getRoom(id);
    }
    
    public Room save(Room room){
        if (room.getId() == null){
            return roomRepository.save(room);
        }else {
            Optional<Room> room1 = roomRepository.getRoom(room.getId());
            if(room1.isEmpty()){
                return roomRepository.save(room);
            }else {
                return room;
            }
        }
    }
    
    //Método actualizar
    public Room update(Room room){
        if(room.getId()!=null){
            Optional<Room> e= roomRepository.getRoom(room.getId());
            if(!e.isEmpty()){
                if(room.getName()!=null){
                    e.get().setName(room.getName());
                }
                if(room.getHotel()!=null){
                    e.get().setHotel(room.getHotel());
                }
                if(room.getStars()!=null){
                    e.get().setStars(room.getStars());
                }
                if(room.getDescription()!=null){
                    e.get().setDescription(room.getDescription());
                }
                if(room.getCategory()!=null){
                    e.get().setCategory(room.getCategory());
                }
                roomRepository.save(e.get());
                return e.get();
            }else{
                return room;
            }
        }else{
            return room;
        }
    }
    
    //Método delete
    public boolean deleteRoom(int id){
        Boolean d = getRoom(id).map(room -> {
            roomRepository.delete(room);
            return true;        
        }).orElse(false);
        return d;
    }
}
