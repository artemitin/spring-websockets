package com.example.client.service;

import com.example.client.model.DataRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataService {

    public DataService() {
        System.out.println("I'm created");
    }

    public String save(DataRequest request) {
        return UUID.randomUUID().toString();
    }
}
