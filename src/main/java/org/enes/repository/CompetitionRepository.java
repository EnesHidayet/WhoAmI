package org.enes.repository;

import org.enes.entity.Competition;

public class CompetitionRepository extends RepositoryManager<Competition,Long>{

    public CompetitionRepository(){
        super(new Competition());
    }
}
