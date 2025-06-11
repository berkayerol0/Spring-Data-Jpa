package com.berkayerol.controller;

import com.berkayerol.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
