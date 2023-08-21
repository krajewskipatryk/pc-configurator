package com.wisepc.wisepc.model.parts.domain;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.producers.Brand;
import com.wisepc.wisepc.model.producers.Model;
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
