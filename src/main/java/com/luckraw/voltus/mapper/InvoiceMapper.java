package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.InvoiceDTO;
import com.luckraw.voltus.domain.entity.Invoice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface InvoiceMapper {

    InvoiceDTO map(Invoice invoice);

    List<InvoiceDTO> map(List<Invoice> invoices);
}
