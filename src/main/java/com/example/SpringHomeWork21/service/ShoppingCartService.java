package com.example.SpringHomeWork21.service;

import com.example.SpringHomeWork21.coponent.Basket;
import com.example.SpringHomeWork21.model.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ShoppingCartService {

    private final Basket basket;
    private Map<Integer, Item> items;

    public ShoppingCartService(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init(){
        items = Map.of(
                1,new Item(1, "Смартфон", 15_000),
                2,new Item(2, "Планшет", 25_000),
                3,new Item(3, "Микроволновка", 5_000)
        );
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream().map(id->items.get(id)).collect(Collectors.toList())
        );
    }
    public Collection<Item> get(){
        return basket.get();
    }
}
