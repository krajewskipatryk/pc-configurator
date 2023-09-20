package com.wisepc.wisepc.model.part.domain;

import com.wisepc.wisepc.part.constants.Currency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
abstract class StandardPCEntity {
    @ManyToOne
    @JoinColumn(name = "model")
    protected Model model;

    @ManyToOne
    @JoinColumn(name = "brand")
    protected Brand brand;

    @Column(name = "price")
    protected Integer price;

    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    protected Currency currency;
}
