package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.InvoiceDTO;
import com.luckraw.voltus.domain.entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {


    InvoiceDTO toDTO(Invoice invoice);

    Invoice toEntity(InvoiceDTO dto);

    List<InvoiceDTO> toDTOList(List<Invoice> invoices);

    void updateEntityFromDTO(InvoiceDTO dto, @MappingTarget Invoice invoice);
}
