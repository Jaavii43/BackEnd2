
package com.argprograma.Portfolio.Controller;
import com.argprograma.Portfolio.Service.SExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CExperienciaLaboral {
    
    @Autowired
    SExperienciaLaboral expeServ;

    @PostMapping ("new/experiencialaboral")
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral ExperiServ){
        expeServ.save(ExperiServ);
    }
    @GetMapping ("ver/experiencialaboral")
    @ResponseBody  
    public List<ExperienciaLaboral> verExperienciaLaboral(){
        return expeServ.list();
    } 
    @DeleteMapping("delete/(id)")
    public void eliminarExperienciaLaboral(@PathVariable Long id)    {
        expeServ.delete(id);
    }
    
    @PutMapping ("personas/editar/{id}")
        public ExperienciaLaboral editExperienciaLaboral (@PathVariable Long id,
                            @RequestParam ("empresa") String nuevaempresa,
                            @RequestParam ("apellido") String nuevfecha_inicio,
                            @RequestParam ("edad") int nuevafecha_fin,
                            @RequestParam ("trabajo") String nuevotrabajo){
   
      ExperienciaLaboral ExperiServ = SExperienciaLaboral.findExperienciaLaboral (id);
    
      ExperiServ.setEmpresa(nuevaempresa);
      perso.setNombre(nuevoNombre);
      perso.setEdad(nuevaEdad);
      interPersona.savePersona(perso);
     
      return perso;
        }

}