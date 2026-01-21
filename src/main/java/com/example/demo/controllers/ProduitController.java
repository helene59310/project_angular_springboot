package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ProduitEntity;
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitController {

   @Autowired
   ProduitService produitService;

   @GetMapping("/all")
   public List<ProduitEntity> getAllProduits() {
        return produitService.getAllProduits();
   }

   @GetMapping("/{id}")
   public ProduitEntity getProduitById(@PathVariable("id") Long id) {
      return produitService.getProduit(id);
   }

   @PostMapping("/createProduct")
   public ProduitEntity createProduit(@RequestBody ProduitEntity produit) {
      return produitService.saveProduit(produit);
   }

   @PutMapping("/updateProduct")
   public ProduitEntity updateProduit(@RequestBody ProduitEntity produit) {
      return produitService.updateProduit(produit);
   }

   @DeleteMapping("/deleteProduct/{id}")
   public void deleteProduit(@PathVariable("id") Long id) {
      produitService.deleteProduitById(id);
   }

   @GetMapping("/productsByCat/{idCat}")
   public List<ProduitEntity> getProduitsByIdCat(@PathVariable("idCat") Long idCat) {
      return produitService.findByCategorieIdCat(idCat);
   }
}
