package com.guiaEscalada.infrastructure;

import com.guiaEscalada.model.Climber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimberRepository extends JpaRepository<Climber, Long>{

    Climber findByEmail(String email);
}
