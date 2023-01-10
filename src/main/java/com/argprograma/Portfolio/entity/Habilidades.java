
package com.argprograma.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String area;
 private String porcentaje;  
 
   public Habilidades(String area, String porcentaje) {
        this.area = area;
        this.porcentaje = porcentaje;
    }
}
  
