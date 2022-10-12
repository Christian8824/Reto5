/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_ciclo3.demo.Interface;

import Reto3_ciclo3.demo.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Christian
 */
public interface ClientInterface extends CrudRepository<Client, Integer>  {
    
}
