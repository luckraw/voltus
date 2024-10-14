package com.luckraw.voltus.service;

import com.luckraw.voltus.domain.dtos.InvoiceDTO;
import com.luckraw.voltus.domain.entity.Invoice;
import com.luckraw.voltus.mapper.InvoiceMapper;
import com.luckraw.voltus.repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceMapper invoiceMapper;

    public List<InvoiceDTO> getAllInvoices() {
        List<Invoice> invoices = invoiceRepository.findAll();
        return invoiceMapper.toDTOList(invoices);
    }

    public InvoiceDTO getInvoiceById(Long id) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        return invoiceMapper.toDTO(invoice);
    }

    public InvoiceDTO createInvoice(InvoiceDTO dto) {
        Invoice invoice = invoiceMapper.toEntity(dto);
        invoice = invoiceRepository.save(invoice);
        return invoiceMapper.toDTO(invoice);
    }

    public InvoiceDTO updateInvoice(Long id, InvoiceDTO dto) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow();
        invoiceMapper.updateEntityFromDTO(dto, invoice);
        invoice = invoiceRepository.save(invoice);
        return invoiceMapper.toDTO(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}
