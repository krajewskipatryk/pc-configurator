package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.producers.Brand;
import com.wisepc.wisepc.model.producers.Manufacturer;
import com.wisepc.wisepc.model.producers.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "graphic_card")
public class GraphicCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "brand_id")
    @ManyToOne
    @JoinColumn(name = "brand")
    private Brand brand;

    @Column(name = "manufacturer_id")
    @ManyToOne
    @JoinColumn(name = "manufacturer")
    private Manufacturer manufacturer;

    @Column(name = "model_id")
    @ManyToOne
    @JoinColumn(name = "model")
    private Model model;

    @Column(name = "tdp")
    private int tdp;


}
