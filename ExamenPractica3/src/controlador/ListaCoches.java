/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Coche;

/**
 *
 * @author alumno
 */
public class ListaCoches extends ArrayList<Coche>{
    //creamos el atributo actual
    int actual;

    //creamos el constructor
    public ListaCoches() {
        super();
        this.actual= 0;
    }
    
    /*creamos 3 metodos booleanos, uno para saber si la lista esta vacia 
    y los otros dos para saber si estamos en el ultimo o en el primero*/
    public boolean esVacia(){
        return this.isEmpty();
    }
    
     public boolean esPrimero() {
        return !this.isEmpty() && actual == 0;
    }

    public boolean esUltimo() {
        return !this.isEmpty() && actual == this.size() - 1;
    }
    
    //creamos un metodo para avanzar y oro para retroceder usando los buleanos anteriores
    public void avanzar() {
        if (!this.esUltimo()) {
            actual++;
        }
    }
    
    public void retroceder() {
        if (!this.esPrimero()) {
            actual--;
        }
    }
    
    //creamos los metodos para ir al ultimo o al primero
    public void irAlPrimero() {
        if (!this.isEmpty()) {
            actual = 0;
        } else {
            actual = -1;
        }
    }

    public void irAlUltimo() {
        if (!this.isEmpty()) {
            actual = this.size() - 1;
        } else {
            actual = -1;
        }
    }
    
    //creamos un metodo para añadir coches y otro para borrarlos
    public void añadirCoche(Coche c){
        this.add(c);
        if (actual == -1) {
            actual = 0;
        } else {
            actual = this.size() - 1; 
        }
    } 
    
    public void borrarCoche() {
        if (!this.isEmpty() && actual >= 0 && actual < this.size()) {
            this.remove(actual);
            if (this.isEmpty()) {
                actual = -1;
            } else if (actual >= this.size()) {
                actual = this.size() - 1;
            }
        }
    }
    
    public Coche obtenerCocheActual() {
        if (!this.isEmpty() && actual >= 0 && actual < this.size()) {
            return this.get(actual);
        }
        return null;
    }

    public void ordenarPorMatricula() {
        if (this.size() > 1) {
            for (int i = 0; i < this.size() - 1; i++) {
                for (int j = 0; j < this.size() - 1 - i; j++) {
                    Coche c1 = this.get(j);
                    Coche c2 = this.get(j + 1);

                    if (c1.getMatricula().compareToIgnoreCase(c2.getMatricula()) != -1) {
                        this.set(j, c2);
                        this.set(j + 1, c1);
                    }
                }
            }
            actual = 0; 
        }
    }
}
