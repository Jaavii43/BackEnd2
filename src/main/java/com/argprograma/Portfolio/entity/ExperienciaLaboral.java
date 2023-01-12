
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String empresa;
 private String fecha_inicio;
 private String fecha_fin;
 private String trabajo;
 
    public ExperienciaLaboral(){        
    } 
    
    public ExperienciaLaboral(String empresa, String fecha_inicio, String fecha_fin, String trabajo) {
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.trabajo = trabajo;
    }
}
