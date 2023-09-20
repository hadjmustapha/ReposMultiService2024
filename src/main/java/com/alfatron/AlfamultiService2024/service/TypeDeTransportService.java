package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.model.TypeDeTransport;
import com.alfatron.AlfamultiService2024.repository.TypeDeTransportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TypeDeTransportService {

    private TypeDeTransportRepository typeDeTransportRepository;

    public List<TypeDeTransport> findAll(){
        return typeDeTransportRepository.findAll();
    }

    public Optional<TypeDeTransport> findById(int id) {
       return typeDeTransportRepository.findById(id);
    }
}
