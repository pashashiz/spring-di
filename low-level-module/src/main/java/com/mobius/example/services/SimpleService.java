package com.mobius.example.services;

import com.mobius.example.CentralizedConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    @Autowired private CentralizedConfiguration configuration;

    public String doWork() {
        if (!configuration.isLicenseValid())
            throw new IllegalStateException("Sorry, the license is not valid");
        return "Work is done!";
    }

}
