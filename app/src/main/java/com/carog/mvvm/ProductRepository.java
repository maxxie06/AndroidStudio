package com.carog.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public LiveData<List<Product>> getProducts() {
        MutableLiveData<List<Product>> data = new MutableLiveData<>();

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200));
        products.add(new Product(2, "Phone", 800));
        products.add(new Product(3, "Headphones", 150));

        data.setValue(products);
        return data;
    }
}
