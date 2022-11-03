package com.example.SpringHomeWork21.controller;

import com.example.SpringHomeWork21.model.Item;
import com.example.SpringHomeWork21.service.ShoppingCartService ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id")List<Integer> ids) {
        shoppingCartService.add(ids);
    }

    @GetMapping("/get")
    public Collection<Item> get(){
        return shoppingCartService.get();
    }
}
