package org.enes.repository;

import org.enes.entity.Celebrity;

public class CelebrityRepository extends RepositoryManager<Celebrity,Long>{

    public CelebrityRepository(){
        super(new Celebrity());
    }
}
