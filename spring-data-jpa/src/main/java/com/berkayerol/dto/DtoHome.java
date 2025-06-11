package com.berkayerol.dto;

import com.berkayerol.entites.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoHome {

    private Long id;

    private BigDecimal price;

    private List<DtoRoom> rooms = new ArrayList<>();
}
