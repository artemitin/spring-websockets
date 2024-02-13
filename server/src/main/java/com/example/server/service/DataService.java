package com.example.server.service;

import com.example.server.model.DataRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataService {
    public String save(DataRequest request) {
        return UUID.randomUUID().toString();
    }
}
