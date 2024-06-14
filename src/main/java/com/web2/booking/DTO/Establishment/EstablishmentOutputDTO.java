package com.web2.booking.DTO.Establishment;

import java.util.List;
import java.util.UUID;

import com.web2.booking.models.AddressModel;
import com.web2.booking.models.ProductModel;
import com.web2.booking.models.UserProfileModel;

public record EstablishmentOutputDTO(UUID id, UserProfileModel userProfileModel, AddressModel addressModel, String description, String cnpj, List<ProductModel> products) {
    
}