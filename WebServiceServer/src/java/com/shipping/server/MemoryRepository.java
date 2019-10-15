package com.shipping.server;

import java.util.HashMap;
import java.util.Map;


import com.shipping.server.models.Model;
import java.util.Collection;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhmci
 * @param <T>
 */
public class MemoryRepository<T extends Model> {
    private Integer count = 0;
    
    private final Map<Integer, T> models = new HashMap<>();
    
    
    public void save(T model) {
        Date currentDate = new Date();
        
        if (model.getId() == null) {
            this.count++;
            model.setId(this.count);
            model.setCreatedAt(currentDate);
        }

        model.setUpdatedAt(currentDate);
        
        this.models.put(model.getId(), model);
    }
    
    public T find(Integer id) {
        return this.models.get(id);
    }
    
    public Collection<T> getAll() {
        return this.models.values();
    }
    
}
