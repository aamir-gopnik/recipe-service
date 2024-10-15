package com.gopnik.food_recipe.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/recipe/")
@Slf4j
public class RecipeController {
    @Autowired
    String myBean;

    @GetMapping("getIngredients/{recipeName}")
    public List<String> getIngredients(@PathVariable String recipeName)
    {
        System.out.println(myBean);
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Paneer");
        ingredients.add("butter");
        ingredients.add("Oregano");
        ingredients.add("Black Pepper Powder");
        ingredients.add("Salt");

        return ingredients;
    }



}
