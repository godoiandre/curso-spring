package com.godoiandre.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godoiandre.dscatalog.entities.Category;

//Anottations @RestController p/ indicar que a classe é um controlador REST
// e @RequestMapping p indicar  que a classe é mapeador de requisições
@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Books"));
        list.add(new Category(2L, "Electronics"));
        return ResponseEntity.ok().body(list);

    }
}
