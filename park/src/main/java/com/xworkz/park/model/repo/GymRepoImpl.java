package com.xworkz.park.model.repo;

import com.xworkz.park.dto.GymDto;
import org.springframework.stereotype.Repository;

@Repository
public class GymRepoImpl implements GymRepo{

    public GymRepoImpl() {
        System.out.println("Creating GymRepoImpl");
    }

    @Override
    public boolean save(GymDto gymDto) {
        System.out.println("Running save in GymRepoImpl");
        return true;
    }
}
