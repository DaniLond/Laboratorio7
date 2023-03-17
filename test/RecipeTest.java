import model.Ingredient;
import model.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {
    private Recipe recipe;

    public void setupStage1(){
        recipe= new Recipe();
    }

    public void setupStage2(){
        Ingredient ingredientUno= new Ingredient("Cebolla" , 315);
        Ingredient ingredientDos= new Ingredient("Ajo" , 58);
        Ingredient ingredientTres= new Ingredient("Arroz" , 520);
        recipe.addIngredient(ingredientTres.getName(), ingredientTres.getWeight());
        recipe.addIngredient(ingredientDos.getName(), ingredientDos.getWeight());
        recipe.addIngredient(ingredientUno.getName(), ingredientUno.getWeight());
    }

    @Test
    public void addNewIngredient(){
        setupStage1();
        recipe.addIngredient("Sal" , 12);
        assertEquals(recipe.getSize() , 1);
        assertEquals(recipe.getLast().getName() , "Sal");
        assertEquals(recipe.getLast().getWeight() , 12);
    }

    @Test
    public void addMoreIngrediente(){
        setupStage1();
        setupStage2();
        recipe.addIngredient("Pimienta" , 6);
        assertEquals(recipe.getSize() , 4);
        assertEquals(recipe.getLast().getName() , "Pimienta");
        assertEquals(recipe.getLast().getWeight() , 6);
    }

    @Test
    public void addIngrenienteExisting(){
        setupStage1();
        setupStage2();
        recipe.addIngredient("Ajo" , 21);
        assertEquals(recipe.getSize() , 3);
        assertEquals(recipe.getIngredients().get(1).getWeight() , 79);
    }

    @Test
    public void removeIngrediente(){
        setupStage1();
        setupStage2();
        recipe.removeIngredient("Ajo");
        assertEquals(recipe.getSize() , 2);
    }
}
