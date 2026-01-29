package com.carog.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class ProductViewModel extends ViewModel {

    private LiveData<List<Product>> productList;

    public ProductViewModel() {
        ProductRepository repository = new ProductRepository();
        productList = repository.getProducts();
    }

    public LiveData<List<Product>> getProductList() {
        return productList;
    }
}
