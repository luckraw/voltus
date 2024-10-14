package com.luckraw.voltus.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionDTO {

    private UserDTO user;
    private PlanDTO plan;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
}
