/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Modelo.Client;

/**
 *
 * @author Christian
 */
public class CountClient {

    private Long total;
    private Client client;

//COnstructor
    public CountClient(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

//Métodos GET y SET
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
