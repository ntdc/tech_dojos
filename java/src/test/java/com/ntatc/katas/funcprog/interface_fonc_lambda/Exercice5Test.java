package com.ntatc.katas.funcprog.interface_fonc_lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercice5Test {

    @Test
    void testExercice5() {
        Integer sans = Exercice5.sans();

        Integer avec = Exercice5.avec();

        Assertions.assertEquals(sans, avec);
    }
}
