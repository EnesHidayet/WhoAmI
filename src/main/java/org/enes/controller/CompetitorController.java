package org.enes.controller;

import org.enes.entity.Competitor;
import org.enes.service.CompetitorService;

import java.util.List;

public class CompetitorController {

    CompetitorService competitorService;
    public CompetitorController(){
        this.competitorService= new CompetitorService();
    }

    public List<Competitor> findAll() {
        return competitorService.findAll();
    }

    public Competitor updateWinner(Competitor winner) {
        return competitorService.updateWinner(winner);
    }
}
