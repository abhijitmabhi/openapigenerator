package com.ama.openapigenerator.controller;

import com.ama.openapigenerator.api.PetApi;
import com.ama.openapigenerator.dto.ApiResponseDto;
import com.ama.openapigenerator.dto.PetDto;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController implements PetApi {
    @Override
    public ResponseEntity<PetDto> addPet(PetDto petDto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<PetDto>> findPetsByStatus(String status) {
        return null;
    }

    @Override
    public ResponseEntity<List<PetDto>> findPetsByTags(List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<PetDto> getPetById(Long petId) {
        return null;
    }

    @Override
    public ResponseEntity<PetDto> updatePet(PetDto petDto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponseDto> uploadFile(Long petId, String additionalMetadata, Resource body) {
        return null;
    }
}
