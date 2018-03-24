package com.guiaEscalada.action;

import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;

public class UpdateClimber {
    private ClimberRepository climberRepository;

    public UpdateClimber(ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

    public void execute(long id, Climber climber){
        climber.setId(id);
        climberRepository.save(climber);
    }
}
