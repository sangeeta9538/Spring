package com.xworkz.park.model.service;

import com.xworkz.park.dto.GymDto;
import com.xworkz.park.model.repo.GymRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymServiceImpl implements GymService{

    public GymServiceImpl() {
        System.out.println("Creating GymServiceImpl");
    }

    @Autowired
    private GymRepo gymRepo;

    @Override
    public boolean validateAndSave(GymDto gymDto) {
        System.out.println("Running validateAndSave in GymServiceImpl");
        boolean save=this.gymRepo.save(gymDto);
        if(save){
            System.out.println("GymForm is saved succcessfully in service"+ gymDto);
        }else {
            System.out.println("GymForm is not saved succcessfully in service"+ gymDto);
        }
        return true;
    }
}
