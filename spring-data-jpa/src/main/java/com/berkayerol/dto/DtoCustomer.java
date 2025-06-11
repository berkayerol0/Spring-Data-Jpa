package com.berkayerol.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL) //diğer entityden dönerken null'ları dönme
public class DtoCustomer {

    private Long id;

    private String name;

    private DtoAddress address;
}
