/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


/**
 *
 * @author alumno
 */
public class ControlErrores {
    public static boolean comprobarMatriculas(String matricula){
        if(matricula.contentEquals("1234ABC") == false){
            return false;
        }
        else{
            return true;
        }
    } 
    
    public static boolean comprobarPrecio(Float precio){
        if(precio <0 || precio >150000){
            return false;
        }else{
            return true;
        }
    }

}
