package org.enes.service;

import org.enes.entity.Competitor;
import org.enes.repository.CompetitorRepository;

import java.util.List;

public class CompetitorService {

    CompetitorRepository competitorRepository;

    public CompetitorService(){
        this.competitorRepository = new CompetitorRepository();
    }


    public List<Competitor> findAll() {
        return competitorRepository.findAll();
    }

    public Competitor updateWinner(Competitor winner) {
        return competitorRepository.update(winner);
    }
}
