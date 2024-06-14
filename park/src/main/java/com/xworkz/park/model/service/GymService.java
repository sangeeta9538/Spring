package com.xworkz.park.model.service;

import com.xworkz.park.dto.GymDto;

public interface GymService {

    boolean validateAndSave(GymDto gymDto);
}
