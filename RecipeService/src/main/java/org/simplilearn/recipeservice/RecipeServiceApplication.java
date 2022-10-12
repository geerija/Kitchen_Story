package org.simplilearn.recipeservice;

import org.simplilearn.recipeservice.entities.Recipe;
import org.simplilearn.recipeservice.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecipeServiceApplication {
	@Autowired
	private RecipeRepository recipeRepository;
	public static void main(String[] args) {
		SpringApplication.run(RecipeServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		CommandLineRunner runner=new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Recipe recipe1=new Recipe();
				recipe1.setName("Chicken Masala");
				recipe1.setDescription("dsjfds f udshfdshuhu dhfgds");
				recipe1.setImageUrl("https://images.unsplash.com/photo-1565557623262-b51c2513a641?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y2hpY2tlbiUyMG1hc2FsYXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
				recipe1.setPrice(200);
				Recipe recipe2=new Recipe();
				recipe2.setName("Panner Butter Masala");
				recipe2.setDescription("sjdas dsuadu uisdagds");
				recipe2.setImageUrl("https://images.unsplash.com/photo-1613435392903-f28f66534cf3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8cGFubmVyJTIwYnV0dGVyJTIwbWFzYWxhfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
				recipe2.setPrice(150);
				Recipe recipe3=new Recipe();
				recipe3.setName("Chicken Tandoori");
				recipe3.setDescription("dfjdsf sdfudsukfh dsuihf  uddfdsu");
				recipe3.setImageUrl("https://images.unsplash.com/photo-1610057099431-d73a1c9d2f2f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2hpY2tlbiUyMHRhbmRvb3JpfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
				recipe3.setPrice(500);
				recipeRepository.save(recipe1);
				recipeRepository.save(recipe2);
				recipeRepository.save(recipe3);
				
			}
		};
		return runner;
	}

}
