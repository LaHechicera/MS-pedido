package com.perfulandia.pedidoservice.repository;

import com.perfulandia.pedidoservice.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
