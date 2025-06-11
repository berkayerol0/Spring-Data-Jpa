package com.berkayerol.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError<T> {

    private String id;

    private Date errorTime;

    private T errors;
}


//errorlar standart olarak böyle dönsün diye böyle bi class açtık yani zamanını, hangisi olduğunu ve hatalarını
// göstericek her bir field için