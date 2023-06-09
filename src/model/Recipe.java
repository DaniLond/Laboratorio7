package model;

import java.util.LinkedList;

public class Recipe {
    private LinkedList<Ingredient> ingredients;

    public Recipe() {
        ingredients = new LinkedList<Ingredient>();
    }

    public void addIngredient(String n, double w) {

        Ingredient searched = null;
        for (int i = 0; i < ingredients.size() && searched==null; i++) {
            Ingredient current = ingredients.get(i);
            if(current.getName().equals(n)) {
                searched = current;
            }
        }

        if(searched!=null) {
            searched.addWeight(w);
        }else {
            Ingredient newIngredient = new Ingredient(n, w);
            ingredients.add(newIngredient);
        }
    }

    public void removeIngredient(String n){
        for (int i = 0; i < ingredients.size() ; i++) {
            if(ingredients.get(i).getName().equals(n)) {
                ingredients.remove(ingredients.get(i));
            }
        }
    }

    public LinkedList<Ingredient> getIngredients(){
        return ingredients;
    }

    public int getSize(){
        return ingredients.size();
    }

    public Ingredient getLast(){
        return ingredients.getLast();
    }
}
