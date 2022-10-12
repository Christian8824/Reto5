/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Interface.ReservationInterface;
import Reto3_ciclo3.demo.Modelo.Client;
import Reto3_ciclo3.demo.Modelo.Reservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */

@Repository

public class ReservationRepository {
    @Autowired
    private ReservationInterface extensionesCrud;
    
    //Método para leer tabla category
    public List<Reservation> getAll(){
        return(List<Reservation>) extensionesCrud.findAll();
    }
    
    //Método 2
    public Optional<Reservation> getReservation (int id){
        return extensionesCrud.findById(id);
    }
    
    //Método Guardar
    public Reservation save (Reservation reservation){
        return extensionesCrud.save(reservation);
    }
    
    //Método para borrar
    public void delete (Reservation reservation){
        extensionesCrud.delete(reservation);
    }
    
    //Datos para Reto 5
    public List<Reservation> getReservationByStatus (String status){
        return extensionesCrud.findAllByStatus(status);
    }
    
    public List<Reservation> informePeriodoTiempoReservas (Date a, Date b){
        return extensionesCrud.findAllByStartDateAfterAndStartDateBefore(a,b);
    }
    
    public List<CountClient> getTopClient(){
        List<CountClient> res=new ArrayList<>();
        List<Object[]> report = extensionesCrud.countTotalReservationByClient();
        for (int i=0;i<report.size();i++){
            res.add(new CountClient((Long)report.get(i)[1],(Client) report.get(i)[0]));
        }
        return res;
    }
}
