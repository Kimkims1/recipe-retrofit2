package braine.foodrecipe.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import braine.foodrecipe.models.Recipe;

public
class RecipeResponse {
    @SerializedName("recipe")
    @Expose
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeResponse{" +
                "recipe=" + recipe +
                '}';
    }
}
