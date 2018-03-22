package com.guiaEscalada.action;

import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;

public class CreateClimber {
    private ClimberRepository climberRepository;

    public CreateClimber(ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

    public void execute(Climber climber){
        climberRepository.saveAndFlush(climber);
    }
}
