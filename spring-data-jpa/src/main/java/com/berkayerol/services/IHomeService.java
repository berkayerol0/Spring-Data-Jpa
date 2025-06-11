package com.berkayerol.services;

import com.berkayerol.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
