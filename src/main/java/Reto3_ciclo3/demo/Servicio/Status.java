/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Servicio;

/**
 *
 * @author Christian
 */
public class Status {
    private int completed;
    private int cancelled;
    
    //COnstructor

    public Status(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }
    
    //Métodos GET y SET

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }
    
}
