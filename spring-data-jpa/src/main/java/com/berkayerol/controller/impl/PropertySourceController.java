package com.berkayerol.controller.impl;

import com.berkayerol.configuration.DataSource;
import com.berkayerol.configuration.GlobalProperties;
import com.berkayerol.configuration.GlobalProperties2;
import com.berkayerol.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private GlobalProperties2 globalProperties2;

    @GetMapping("/datasource2")
    public DataSource getDataSource2() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(globalProperties2.getUrl());
        dataSource.setUsername(globalProperties2.getUsername());
        dataSource.setPassword(globalProperties2.getPassword());

        return dataSource;
    }

    @GetMapping("/servers")
    public List<Server> getServers() {
        System.out.println("Secret Key = "+globalProperties.getKey());
        return globalProperties.getServers();
    }

}
