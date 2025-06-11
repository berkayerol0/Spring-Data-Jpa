package com.berkayerol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {

    private Integer id;

    private String firstName;

    private String lastName;

    private List<DtoCourse> courses = new ArrayList<>(); //OOP kullandığımız için nullpointer hatası almayalım.
}
