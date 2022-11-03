package com.example.SpringHomeWork21.coponent;


import com.example.SpringHomeWork21.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;

@Component
@SessionScope
public class Basket {

    private final Collection<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(Collection<Item> items){
        this.items.addAll(items);
    }

    public Collection<Item> get() {
        return new ArrayList<>(items);
    }
}
