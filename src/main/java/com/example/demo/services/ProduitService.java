package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.ProduitEntity;

public interface ProduitService {
    ProduitEntity saveProduit(ProduitEntity produitEntity);
    ProduitEntity updateProduit(ProduitEntity produitEntity);
    void deleteProduit(ProduitEntity produitEntity);
    void deleteProduitById(Long id);
    ProduitEntity getProduit(Long id);
    List<ProduitEntity> getAllProduits();
}
