package com.example.server.service;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

//Example of a factory
@Component
public class Factory extends AbstractFactoryBean<DataService> {

    @Override
    public Class<?> getObjectType() {
        return DataService.class;
    }

    @Override
    protected DataService createInstance() {
        return new DataService();
    }
}
