
package com.argprograma.Portfolio.Repository;

import com.profile.Prueba.entity.Educacion;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface REducacion extends JpaRepository<Educacion,Long>{
    
}

