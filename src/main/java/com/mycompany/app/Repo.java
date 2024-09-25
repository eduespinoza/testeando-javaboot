package com.mycompany.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Pedido, Long>{
    
}
