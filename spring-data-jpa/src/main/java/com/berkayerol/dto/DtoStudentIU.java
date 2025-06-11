package com.berkayerol.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "The firstname field cannot be left blank.")
    @Size(min = 3, max = 30)
    private String firstName;

    @NotEmpty(message = "The lastname field cannot be left blank.")
    @Size(min = 3, max = 30)
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Please enter an address in e-mail format.")
    private String email;

    @NotEmpty(message = "Tckn field cannot be left blank.")
    @Size(min = 11, max = 11, message = "Tckn field must be 11 characters.")
    private String tckn;

}
