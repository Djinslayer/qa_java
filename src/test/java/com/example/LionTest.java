package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectInt() throws Exception {
        //Arrange
        Lion lion = new Lion("Самец");
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        //Act
        int actualKittens = lion.getKittens(feline);
        //Assert
        assertEquals("Ожидается другое количество котят (1)", expectedKittens, actualKittens);
    }

    @Test
    public void getFoodReturnsCorrectList() throws Exception {
        //Arrange
        Lion lion = new Lion("Самка");
        String animalKind = "Хищник";
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood(animalKind)).thenReturn(expectedFood);
        //Act
        List<String> actualFood = lion.getFood(feline);
        //Assert
        assertEquals("Ожидается список для хищника", expectedFood, actualFood);
    }

}