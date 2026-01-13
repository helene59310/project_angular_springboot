package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.CategorieEntity;
import com.example.demo.entities.ProduitEntity;
import com.example.demo.repositories.ProduitRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit() {
		ProduitEntity produit = new ProduitEntity("PC Test", 500.500, new Date());
		produitRepository.save(produit);
	}

	@Test
	public void testFindProduit() {
		ProduitEntity produit = produitRepository.findById(2L).get();
		System.out.println(produit);
	}

	@Test
	public void testUpdateProduit() {
		ProduitEntity produit = produitRepository.findById(5L).get();
		produit.setNomProduit("PC Asus");
		produitRepository.save(produit);
		System.out.println(produit);
	}

	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}

	@Test
	public void testFindAllProduits() {
		List<ProduitEntity> produits = produitRepository.findAll();
		for (ProduitEntity produit : produits)
			System.out.println(produit);
	}

	@Test
	public void testFindByNomProduit() {
		List<ProduitEntity> produits = produitRepository.findByNomProduit("PC Hp");
		for (ProduitEntity produit : produits)
			System.out.println(produit);
	}

	@Test
	public void testFindByNomProduitContains() {
		List<ProduitEntity> produits = produitRepository.findByNomProduitContains("e");
		for (ProduitEntity produit : produits)
			System.out.println(produit);
	}

	@Test
	public void testFindByPrixProduit() {
		List<ProduitEntity> produits = produitRepository.findByPrixProduit(500.5);
		for (ProduitEntity produit : produits)
			System.out.println(produit);
	}

	@Test
	public void testfindByNomPrix() {
		List<ProduitEntity> prods = produitRepository.findByNomPrix("PC Asus", 900.5);
		for (ProduitEntity p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByCategorie() {
		CategorieEntity cat = new CategorieEntity();
		cat.setIdCat(2L);
		List<ProduitEntity> prods = produitRepository.findByCategorie(cat);
		for (ProduitEntity p : prods) {
			System.out.println(p);
		}
	}

}
