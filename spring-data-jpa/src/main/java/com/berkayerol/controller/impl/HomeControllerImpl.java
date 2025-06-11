package com.berkayerol.controller.impl;

import com.berkayerol.controller.IHomeController;
import com.berkayerol.dto.DtoHome;
import com.berkayerol.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/home")
public class HomeControllerImpl implements IHomeController {

    @Autowired
    private IHomeService iHomeService;

    @GetMapping("/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
        return iHomeService.findHomeById(id);
    }
}
