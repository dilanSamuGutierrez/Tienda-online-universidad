/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import enums.Role;

/**
 *
 * @author Dilan
 */
public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;
    private Role role;

    public Usuario(int id, String nombre, String email, String password, Role role) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
    

}
