package com.berkayerol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoAddress {

    private Long id;

    private String addressDescription;

    private DtoCustomer dtoCustomer;
}
