import model.Ingredient;
import org.junit.jupiter.api.Test;
import Exception.InvalidNumberException;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    private Ingredient ingredient;

    public void setupStage1(){
        ingredient = new Ingredient("Tomate" , 245);
    }

    @Test
    public void addNewWeight(){
        setupStage1();
        ingredient.addWeight(54);
        assertEquals(ingredient.getWeight() , 299);
    }

    @Test
    public void addNewWeightInvalid(){
        setupStage1();

        assertThrows(InvalidNumberException.class, ()-> ingredient.addWeight(-100));
    }

    @Test
    public void removeNewWeight(){
        setupStage1();
        ingredient.decreaserWeight(45);
        assertEquals(ingredient.getWeight() , 200);
    }

    @Test
    public void removeNewWeightInvalid(){
        setupStage1();

        assertThrows(InvalidNumberException.class, ()-> ingredient.decreaserWeight(-100));
    }

}
