package org.enes.controller;

import org.enes.entity.Competition;
import org.enes.service.CompetitionService;

public class CompetitionController {

    CompetitionService competitionService;

    public CompetitionController(){
        this.competitionService= new CompetitionService();
    }

    public Competition save(Competition competition) {
        return competitionService.save(competition);
    }
}
