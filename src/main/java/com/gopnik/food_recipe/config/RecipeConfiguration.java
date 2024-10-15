package com.gopnik.food_recipe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeConfiguration {

    @Bean
    public String myBean()
    {
        return "Aamir";
    }
}
