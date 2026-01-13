package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.CategorieEntity;
import com.example.demo.entities.ProduitEntity;

public interface ProduitRepository extends JpaRepository<ProduitEntity, Long> {

    List<ProduitEntity> findByNomProduit(String nom);
    List<ProduitEntity> findByNomProduitContains(String nom);
    List<ProduitEntity> findByPrixProduit(Double prix);

    @Query("select p from ProduitEntity p where p.nomProduit like %:nomProduit and p.prixProduit > :prixProduit")
    List<ProduitEntity> findByNomPrix (@Param("nomProduit") String nomProduit,@Param("prixProduit") Double prixProduit);

    @Query("select p from ProduitEntity p where p.categorie = ?1")
    List<ProduitEntity> findByCategorie(CategorieEntity categorie);

    List<ProduitEntity> findByCategorieIdCat(Long id);

    List<ProduitEntity> findByOrderByNomProduitAsc();

    @Query("select p from ProduitEntity p order by p.nomProduit ASC, p.prixProduit DESC")
    List<ProduitEntity> trierProduitsNomsPrix();
}
