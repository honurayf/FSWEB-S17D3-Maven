package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kangaroo {
    private Integer id;
    private String name;
    private Double weight;
    private Double height;
    private String gender;
    private Boolean isAggressive;
}
