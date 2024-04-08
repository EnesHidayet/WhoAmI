package org.enes.service;

import org.enes.repository.CelebrityCharacteristicsRepository;

public class CelebrityCharacteristicsService {

    CelebrityCharacteristicsRepository celebrityCharacteristicsRepository;

    public CelebrityCharacteristicsService(){
        this.celebrityCharacteristicsRepository = new CelebrityCharacteristicsRepository();
    }


}
