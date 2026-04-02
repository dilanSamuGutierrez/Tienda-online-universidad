/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Categoria;
import Service.CategoriaService;
/**
 *
 * @author Helinks
 */
public class CategoriaController {
    CategoriaService service= new CategoriaService();
    
    public boolean Create(String nombre){
        Categoria categoria= new Categoria(0,nombre);
        return service.Create(categoria);
    }
    public boolean Edit(int id,String nombre){
        Categoria categoria= new Categoria(id,nombre);
        return service.Edit(categoria);
    }
    
    public Categoria Read(int id){
        Categoria categoria= new Categoria(id,"");
        return service.Read(categoria);
    }
    
    public boolean Delete(int id){
        Categoria categoria= new Categoria(id,"");
        return service.Delete(categoria);
    }
}
