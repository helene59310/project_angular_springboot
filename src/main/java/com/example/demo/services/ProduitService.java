package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.CategorieEntity;
import com.example.demo.entities.ProduitEntity;

public interface ProduitService {
    ProduitEntity saveProduit(ProduitEntity produitEntity);
    ProduitEntity updateProduit(ProduitEntity produitEntity);
    void deleteProduit(ProduitEntity produitEntity);
    void deleteProduitById(Long idProduit);
    ProduitEntity getProduit(Long idProduit);
    List<ProduitEntity> getAllProduits();
    List<ProduitEntity> findByNomProduit(String nomProduit);
    List<ProduitEntity> findByNomProduitContains(String nomProduit);
    List<ProduitEntity> findByPrixProduit(Double prixProduit);
    List<ProduitEntity> findByNomPrix (String nomProduit, Double prixProduit);
    List<ProduitEntity> findByCategorie(CategorieEntity categorie);
    List<ProduitEntity> findByCategorieIdCat(Long idProduit);
    List<ProduitEntity> findByOrderByNomProduitAsc();
    List<ProduitEntity> trierProduitsNomsPrix();

}
