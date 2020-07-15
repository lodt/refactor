package com.skplanet.refactorexample.step08;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LombokTest {

    private Long id;
    private String name;
    private String address;

    private static final String NAME = "james";
    private final Object object;
    private final Object object2 = new Object();

}
