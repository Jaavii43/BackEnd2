
package com.profile.Prueba.service;

import java.util.List;
import java.util.Optional;
import com.profile.Prueba.Repository.RExperienciaLaboral;
import com.profile.Prueba.entity.ExperienciaLaboral;
import jakarta.transaction.Transactional;
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
