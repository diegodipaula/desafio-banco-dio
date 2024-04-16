package com.turtlemedia.desafiobancodio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DigitalBank {
    private String name;
    private List<Account> accounts;
}
