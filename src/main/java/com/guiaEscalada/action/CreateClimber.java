package com.guiaEscalada.action;

import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CreateClimberService")
public class CreateClimber {
    private final ClimberRepository climberRepository;

    @Autowired
    public CreateClimber(ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

    public void execute(Climber climber){
        climberRepository.saveAndFlush(climber);
    }
}
