package org.enes.service;

import org.enes.entity.Celebrity;
import org.enes.repository.CelebrityRepository;

import java.util.List;

public class CelebrityService {

    CelebrityRepository celebrityRepository;

    public CelebrityService(){
        this.celebrityRepository = new CelebrityRepository();
    }

    public List<Celebrity> findAll() {
        return celebrityRepository.findAll();
    }
}
