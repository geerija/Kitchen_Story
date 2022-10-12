package org.simplilearn.recipeservice.services;

import java.util.List;

import org.simplilearn.recipeservice.entities.Recipe;

public interface RecipeService {
	void insertRecipe(Recipe recipe);
	void deleteRecipe(int id);
	List<Recipe> getRecipes();
	Recipe getRecipe(int id);
	void updateRecipe(int id,Recipe recipe);
}
