package com.skplanet.refactorexample.step08;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class DeLombokTest {

    private Long id;
    private String name;
    private Object obj;

}