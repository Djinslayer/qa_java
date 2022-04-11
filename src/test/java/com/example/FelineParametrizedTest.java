package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int countOfKittens;

    public FelineParametrizedTest(int countOfKitten) {
        this.countOfKittens = countOfKitten;
    }

    @Parameterized.Parameters(name = "Тестовые данные: количество кошек {0}")
    public static Object[][] getKittensData() {
        return new Object[][]{
                {3},
                {0},
                {-3},
        };
    }

    @Test
    public void getKittensWithParametrizedReturnCorrectInt() {
        //Arrange
        Feline feline = new Feline();
        //Act
        int actual = feline.getKittens(countOfKittens);
        //Assert
        Assert.assertEquals("Количество котят не соответствует ожидаемому", countOfKittens, actual);
    }

}
