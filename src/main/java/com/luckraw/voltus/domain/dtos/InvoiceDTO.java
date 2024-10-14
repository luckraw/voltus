package com.luckraw.voltus.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO {

    private SubscriptionDTO subscription;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private BigDecimal amount;
    private boolean isPaid;
}
