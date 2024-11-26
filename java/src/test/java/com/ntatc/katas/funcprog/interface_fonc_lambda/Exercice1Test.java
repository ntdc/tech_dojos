package com.ntatc.katas.funcprog.interface_fonc_lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Exercice1Test {

    @Test
    void testExercice1() {
        List<String> sans = Exercice1.sans();

        List<String> avec = Exercice1.avec();

        Assertions.assertEquals(sans, avec);
    }
}
