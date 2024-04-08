package org.enes.repository;

import org.enes.entity.CelebrityCharacteristics;

public class CelebrityCharacteristicsRepository extends RepositoryManager<CelebrityCharacteristics,Long>{

    public CelebrityCharacteristicsRepository(){
        super(new CelebrityCharacteristics());
    }
}
