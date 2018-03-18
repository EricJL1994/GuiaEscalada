package com.guiaEscalada.infrastructure;

import com.guiaEscalada.model.Climber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimberRepository extends JpaRepository<Climber, Long>{
}
