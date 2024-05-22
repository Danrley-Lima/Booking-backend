package com.web2.booking.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "establishment")
@Data
public class EstablishmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private AddressModel addressModel;

    @NotBlank
    private String description;

    @NotBlank
    @Size(min = 14, max = 14)
    @CNPJ
    private String cnpj;

    @OneToMany
    private List<ProductModel> products;
}