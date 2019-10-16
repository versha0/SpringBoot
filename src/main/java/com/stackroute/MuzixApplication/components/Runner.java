package com.stackroute.MuzixApplication.components;

import com.stackroute.MuzixApplication.domain.Muzix;
import com.stackroute.MuzixApplication.exception.MuzixAlreadyExists;
import com.stackroute.MuzixApplication.service.MuzixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    MuzixService muzixService;
    @Autowired
    public Runner(MuzixService muzixService){
        this.muzixService = muzixService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("here");
        try {
            muzixService.saveNewMuzix(new Muzix(403, "Runner", "comment"));
        } catch (MuzixAlreadyExists muzixAlreadyExists) {
            muzixService.updateMuzix(new Muzix(403, "Runner", "comment"));
        }
    }
}
