package com.githab.meraving.voter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateMenuDto {

    @NotNull
    private LocalDate date;

    @NotNull
    private Long restaurantId;

}
