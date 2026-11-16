
package modelo;

import java.time.LocalDate;


public class Coche {
    //creamos los atributos
    String matricula;
    LocalDate fechaMatriculacion;
    Float precio;
    
    //creamos el constructor, los getter y los setter
    
    
    //constructores
    public Coche() {
    }

    public Coche(String matricula, LocalDate fechaMatriculacion, Float precio) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.precio = precio;
    }

    //getters
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public Float getPrecio() {
        return precio;
    }

    //setters
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    //cambiamos el toString

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + "\nFecha de Matriculacion: " + this.fechaMatriculacion + "\nPrecio: " + this.precio;
    }
}
