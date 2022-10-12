package org.simplilearn.recipeservice.repositories;

import org.simplilearn.recipeservice.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

}
