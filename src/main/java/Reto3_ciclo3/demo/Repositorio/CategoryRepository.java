/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_ciclo3.demo.Repositorio;

import Reto3_ciclo3.demo.Interface.CategoryInterface;
import Reto3_ciclo3.demo.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */

@Repository

public class CategoryRepository {
    @Autowired
    private CategoryInterface extensionesCrud;
    
    //Método para leer tabla category
    public List<Category> getAll(){
        return(List<Category>) extensionesCrud.findAll();
    }
    
    //Método 2
    public Optional<Category> getCategory (int id){
        return extensionesCrud.findById(id);
    }
    
    //Método Guardar
    public Category save (Category category){
        return extensionesCrud.save(category);
    }
    
    //Método para borrar
    public void delete (Category category){
        extensionesCrud.delete(category);
    }
    
}
