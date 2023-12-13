package com.example.hexagonaltest.cart.adapter.out.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerators;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@SequenceGenerators(
        {
                @SequenceGenerator(
                        name = "hexagonal_service_cart_seq",
                        sequenceName = "cart_service_seq",
                        initialValue = 6,
                        allocationSize = 12
                )
        }
)
public class Cart {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hexagonal_service_cart_seq")
    @Column(name = "cart_id")
    private Long id;
    @Setter
    private Long productId;
    @Setter
    private Long customerId;
}
