package org.enes.repository;

import org.enes.entity.Competitor;

public class CompetitorRepository extends RepositoryManager<Competitor,Long>{

    public CompetitorRepository(){
        super(new Competitor());
    }
}
