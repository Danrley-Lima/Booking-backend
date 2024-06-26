package com.web2.booking.DTO.Establishment;

import java.util.List;
import java.util.UUID;

import com.web2.booking.models.AddressModel;
import com.web2.booking.models.ProductModel;
import com.web2.booking.models.UserModel;

public record EstablishmentOutputDTO(UUID id, UserModel UserModel, AddressModel addressModel, String description, String cnpj, List<ProductModel> products) {
    
}
