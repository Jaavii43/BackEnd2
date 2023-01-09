
package com.profile.Prueba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @PostMapping
    public String decirHola(){
        
        return "Hola Mundo";
    
    }
    
}
