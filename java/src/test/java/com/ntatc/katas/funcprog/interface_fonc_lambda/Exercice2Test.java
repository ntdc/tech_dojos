package com.ntatc.katas.funcprog.interface_fonc_lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Exercice2Test {

    @Test
    void testExercice2() {
        List<Integer> sans = Exercice2.sans();

        List<Integer> avec = Exercice2.avec();

        Assertions.assertEquals(sans, avec);
    }
}
