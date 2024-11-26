package com.ntatc.katas.funcprog.interface_fonc_lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercice4Test {

    @Test
    void testExercice4() {
        String sans = Exercice4.sans();

        String avec = Exercice4.avec();

        Assertions.assertEquals(sans, avec);
    }
}
