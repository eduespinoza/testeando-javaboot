package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

    @Autowired
    private Repo repo;

    public Pedido getPedido(Long id){
        return repo.findById(id).get();
    }

    public Long setPedido(Pedido p){
        return repo.save(p).getId();
    }
    
}
