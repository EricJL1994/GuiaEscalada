package com.guiaEscalada.action;

import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;

public class CreateClimber {
    private Climber climber;
    private ClimberRepository climberRepository;

    public CreateClimber(Climber climber, ClimberRepository climberRepository) {
        this.climber = climber;
        this.climberRepository = climberRepository;
    }

    public void execute(){
        climberRepository.saveAndFlush(climber);
    }
}
