/*
 * This source file was generated by the Gradle 'init' task
 */

import containers.*;

public class RecipeCalculator
{
    public static void main(String[] args)
    {
        // Constructing *the book*
        RecipeBook recipe_book = new RecipeBook();

        //System.out.println(recipe_book.calculateIngredients("electric_motor_lv"));
        System.out.println(recipe_book.calculateIngredients("wooden_paxel", 1));
    }
}
