package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ProduitEntity;

public interface ProduitRepository extends JpaRepository<ProduitEntity, Long> {

    List<ProduitEntity> findByNomProduit(String nom);
    List<ProduitEntity> findByNomProduitContains(String nom);
    List<ProduitEntity> findByPrixProduit(Double prix);

}
