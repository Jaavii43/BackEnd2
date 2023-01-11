
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperienciaLaboral implements ISExperienciaLaboral{
    @Autowired
    RExperienciaLaboral rExperinciaLaboral;

    @Override
    public List<ExperienciaLaboral> getEmpresa() {
        List<ExperienciaLaboral> listaEmpresas =  rExperinciaLaboral.findAll();
        return listaEmpresas;
    }
    @Override
    public void saveEmpresa(ExperienciaLaboral empre) {
        rExperinciaLaboral.save(empre);
    }

    @Override
    public void deleteEmpresa(Long id) {
        rExperinciaLaboral.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findEmpresa(Long id) {
        ExperienciaLaboral empre=rExperinciaLaboral.findById(id).orElse(null);
        return empre;
    }
   
         
//    public List<ExperienciaLaboral> list(){
//        return rExperinciaLaboral.findAll();
//    }
//    public Optional<ExperienciaLaboral> getOne(Long id){
//        return rExperinciaLaboral.findById(id);
//    }
//    public Optional<ExperienciaLaboral> getByEmpresa(String empresa){
//        return rExperinciaLaboral.findByEmpresa(empresa);
//    }
//    public void save(ExperienciaLaboral exp){
//        rExperinciaLaboral.save(exp);
//    }
//    public void delete(Long Id){
//        rExperinciaLaboral.deleteById(id);
//    }
    
//    public ExperienciaLaboral findExperienciaLaboral (Long id) {
//        ExperienciaLaboral expe=rExperinciaLaboral.findById(id) .orElse(null);
//        return expe;
//    }

}
