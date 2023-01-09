
package com.argprograma.Portfolio.Repository;

import com.argprograma.Portfolio.entity.ExperienciaLaboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RExperienciaLaboral extends JpaRepository<ExperienciaLaboral,Long>  {

    public Optional<ExperienciaLaboral> findByEmpresa(String empresa);
    
}
