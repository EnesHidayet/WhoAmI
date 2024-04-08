package org.enes.service;

import org.enes.entity.Competition;
import org.enes.repository.CompetitionRepository;

public class CompetitionService {

    CompetitionRepository competitionRepository;

    public CompetitionService(){
        this.competitionRepository = new CompetitionRepository();
    }


    public Competition save(Competition competition) {
        return competitionRepository.save(competition);
    }
}
