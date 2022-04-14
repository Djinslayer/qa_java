package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    @Mock
    Feline feline;

    private final String sex;
    private final boolean expectedHasMane;

    public LionParametrizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "Тестовые данные: Пол {0} Результат {1}")
    public static Object[][] getManeBySex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionHasManeBySexIsCorrect() throws Exception {
        //Arrange
        Lion lion = new Lion(sex, feline);
        //Act
        boolean actual = lion.doesHaveMane();
        //Assert
        assertEquals("Ожидается другой пол", expectedHasMane, actual);
    }
}