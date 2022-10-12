package org.simplilearn.recipeservice.exceptions;

public class RecipeNotFoundException extends RuntimeException{
	public RecipeNotFoundException(String desc) {
		super(desc);
	}
}
