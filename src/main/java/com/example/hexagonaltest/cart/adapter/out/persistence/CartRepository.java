package com.example.hexagonaltest.cart.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
