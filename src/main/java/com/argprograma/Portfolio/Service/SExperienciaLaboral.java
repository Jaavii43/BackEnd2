
package com.argprograma.Portfolio.Service;

import com.argprograma.Portfolio.Repository.RExperienciaLaboral;
import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperienciaLaboral {
    @Autowired
    RExperienciaLaboral rExperinciaLaboral;
    
    public List<ExperienciaLaboral> list(){
        return rExperinciaLaboral.findAll();
    }
    public Optional<ExperienciaLaboral> getOne(Long id){
        return rExperinciaLaboral.findById(id);
    }
    public Optional<ExperienciaLaboral> getByEmpresa(String empresa){
        return rExperinciaLaboral.findByEmpresa(empresa);
    }
}
