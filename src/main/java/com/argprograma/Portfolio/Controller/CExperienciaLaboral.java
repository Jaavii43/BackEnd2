
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

    @GetMapping("ver/experiencialaboral")
    @ResponseBody  
    public List<ExperienciaLaboral> verExperienciaLaboral(){
        return expeServ.getEmpresa();
    }
    
    @PostMapping("new/experiencialaboral")
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral ExperiServ){
        expeServ.saveEmpresa(ExperiServ);
    }

    @DeleteMapping("delete/(id)")
    public void eliminarExperienciaLaboral(@PathVariable Long id)    {
        expeServ.deleteEmpresa(id);
    }
    
    @PutMapping ("personas/editar/{id}")
        public ExperienciaLaboral editExperienciaLaboral (@PathVariable Long id,
                            @RequestParam ("empresa") String nuevaEmpresa,
                            @RequestParam ("fecha_inicio") String nuevaFecha_inicio,
                            @RequestParam ("fecha_fin") String nuevaFecha_fin,
                            @RequestParam ("trabajo") String nuevoTrabajo){
   
      ExperienciaLaboral ExperiServ=expeServ.findEmpresa(id);
    
      ExperiServ.setEmpresa(nuevaEmpresa);
      ExperiServ.setFecha_inicio(nuevaFecha_inicio);
      ExperiServ.setFecha_fin(nuevaFecha_fin);
      ExperiServ.setTrabajo(nuevoTrabajo);
      expeServ.saveEmpresa(ExperiServ);
     //retorna la nueva persona
      return ExperiServ;
        }

}