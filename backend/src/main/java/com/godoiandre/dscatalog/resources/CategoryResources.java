package com.godoiandre.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godoiandre.dscatalog.entities.Category;
import com.godoiandre.dscatalog.services.CategoryService;

//Anottations @RestController p/ indicar que a classe é um controlador REST
// e @RequestMapping p indicar  que a classe é mapeador de requisições
@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
    @Autowired
    private CategoryService service;
    
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
