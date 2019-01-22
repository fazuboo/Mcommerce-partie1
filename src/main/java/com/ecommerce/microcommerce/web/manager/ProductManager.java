package com.ecommerce.microcommerce.web.manager;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductManager {

    @Autowired
    ProductDao productDao;

    public Map<String, Integer> genererMarges() {
        Map<String, Integer> marges = new HashMap<>();
        List<Product> products = productDao.findAll();
        for(Product p : products) {
            marges.put(p.getNom(), p.getMarge());
        }

        return marges;
    }

}
