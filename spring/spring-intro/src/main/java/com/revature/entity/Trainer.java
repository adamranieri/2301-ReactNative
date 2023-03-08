package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Trainer {
    private String name;
    private Pokemon starter;
    private int num_badges;
}
