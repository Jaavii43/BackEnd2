
package com.argprograma.Portfolio.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity


public class Educacion {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String escuela;
 private String fecha_inicio;
 private String fecha_fin;
 private String titulo;
 
 
 
    public Educacion(String escuela, String fecha_inicio, String fecha_fin, String titulo) {
        this.escuela = escuela;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.titulo = titulo;
    }


 
 
}
