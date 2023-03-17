package model;
import Exception.InvalidNumberException;

public class Ingredient {
    private String name;
    private double weight;

    public Ingredient(String n, double w) {
        name = n;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void addWeight(double additionalW) throws InvalidNumberException {
        if (additionalW < 0){
            throw new InvalidNumberException();
        }
        weight = weight + additionalW;
    }

    public void decreaserWeight(double decreaser) throws InvalidNumberException{
        if(decreaser < 0){
            throw new InvalidNumberException();
        }
        weight= weight - decreaser;
    }
}
