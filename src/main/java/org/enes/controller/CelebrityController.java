package org.enes.controller;

import org.enes.entity.Celebrity;
import org.enes.service.CelebrityService;

import java.util.List;

public class CelebrityController {

    CelebrityService celebrityService;

    public CelebrityController(){
        this.celebrityService= new CelebrityService();
    }

    public List<Celebrity> findAll() {
        return celebrityService.findAll();
    }
}
