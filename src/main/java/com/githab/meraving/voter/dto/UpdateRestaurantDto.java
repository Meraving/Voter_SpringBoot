package com.githab.meraving.voter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateRestaurantDto {

    @NotBlank
    private String name;
}
