package com.example.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    Iterable<OrderEntity> findByUserId(Long userId);
}
