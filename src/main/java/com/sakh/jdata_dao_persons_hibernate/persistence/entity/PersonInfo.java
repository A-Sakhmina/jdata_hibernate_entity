package com.sakh.jdata_dao_persons_hibernate.persistence.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class PersonInfo implements Serializable {
    private String name;
    private String surname;
    private int age;

}
