package org.simplilearn.recipeservice.services;

import java.util.List;

import org.simplilearn.recipeservice.entities.Recipe;
import org.simplilearn.recipeservice.exceptions.RecipeNotFoundException;
import org.simplilearn.recipeservice.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService{
	private RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public void insertRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
	}

	@Override
	public void deleteRecipe(int id) {
		recipeRepository.deleteById(id);
	}

	@Override
	public List<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}

	@Override
	public Recipe getRecipe(int id) {
		return recipeRepository.findById(id).orElseThrow(()->new RecipeNotFoundException("Recipe Not Found"));
	}

	@Override
	public void updateRecipe(int id, Recipe recipe) {
		Recipe recipe1=recipeRepository.findById(id).orElseThrow(()->new RecipeNotFoundException("Recipe Not Found"));
		recipe1.setName(recipe.getName());
		recipe1.setDescription(recipe.getDescription());
		recipe1.setImageUrl(recipe.getImageUrl());
		recipe1.setPrice(recipe.getPrice());
		recipeRepository.save(recipe1);
		
	}

}
