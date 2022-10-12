package org.simplilearn.recipeservice.controllers;

import java.util.List;

import org.simplilearn.recipeservice.entities.Recipe;
import org.simplilearn.recipeservice.services.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/recipeapi")
public class RecipeController {
	private RecipeService recipeService;
	
	public RecipeController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}
	@PostMapping("/recipes")
	public ResponseEntity<?> insertRecipe(@RequestBody Recipe recipe)
	{
		recipeService.insertRecipe(recipe);
		return new ResponseEntity<String>("Inserted Success fully", HttpStatus.CREATED);
	}
	@GetMapping("/recipes")
	public ResponseEntity<List<Recipe>> getRecipes()
	{
		List<Recipe> recipes=recipeService.getRecipes();
		return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
	}
	@DeleteMapping("/recipes/delete/{id}")
	public ResponseEntity<?> deleteRecipe(@PathVariable("id") int id)
	{
		recipeService.deleteRecipe(id);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
	@PutMapping("/recipes/{id}")
	public ResponseEntity<?> updateRecipe(@PathVariable("id") int id,@RequestBody Recipe recipe)
	{
		recipeService.updateRecipe(id, recipe);
		return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
	}
}
