package com.stackroute.MuzixApplication.components;

import com.stackroute.MuzixApplication.domain.Muzix;
import com.stackroute.MuzixApplication.exception.MuzixAlreadyExists;
import com.stackroute.MuzixApplication.service.MuzixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private MuzixService muzixService;
    private Environment environment;

    public Runner(@Autowired MuzixService muzixService, @Autowired Environment environment) {
        this.muzixService = muzixService;
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("here");
        Muzix muzix = new Muzix(444, environment.getProperty("in.name"), environment.getProperty("in.comment"));
        try {
            muzixService.saveNewMuzix(muzix);
        } catch (MuzixAlreadyExists muzixAlreadyExists) {
            muzixService.updateMuzix(muzix);
        }
    }
}
