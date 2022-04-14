package com.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void getFoodPredatorReturnsCorrectList() throws Exception {
        //Arrange
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualFood = feline.eatMeat();
        //Assert
        assertEquals("Ожидается список еды для хищника", expectedFood, actualFood);
    }

    @Test
    public void getFoodHerbivoreReturnsCorrectList() throws Exception {
        //Arrange
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Трава", "Различные растения");
        //Act
        List<String> actualFood = feline.getFood("Травоядное");
        //Assert
        assertEquals("Ожидается список еды для травоядных", expectedFood, actualFood);
    }

    @Test
    public void getFoodExceptionReturnCorrectMessage() throws Exception {
        //Arrange
        Feline feline = new Feline();
        String expectedValue = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = null;
        exception = Assert.assertThrows("Исключения не сработало", Exception.class, () -> {
            feline.getFood("Млекопитающее");
        });
        //Act
        String actualValue = exception.getMessage();
        //Assert
        Assert.assertEquals("Сообщение об исключении не соответствует ожидаемому", expectedValue, actualValue);
    }

    @Test
    public void eatMeatReturnCorrectList() throws Exception {
        //Arrange
        Feline feline = new Feline();
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualValue = feline.eatMeat();
        //Assert
        Assert.assertEquals("Ожидается список еды для хищника", expectedValue, actualValue);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        //Arrange
        String expectedFamily = "Кошачьи";
        Feline feline = new Feline();
        //Act
        String actualFamily = feline.getFamily();
        //Assert
        assertEquals("Ожидается семейство Кошачьи", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensStaticReturnsCorrectValue() {
        //Arrange
        int expectedKittens = 1;
        Feline feline = new Feline();
        //Act
        int actualKittens = feline.getKittens();
        //Assert
        assertEquals("Ожидается другое количество котят (1)", expectedKittens, actualKittens);
    }

}