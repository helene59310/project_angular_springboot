package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Produit;
import com.example.demo.repositories.ProduitRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit() {
		Produit produit = new Produit("PC Hp", 2800.500, new Date());
		produitRepository.save(produit);
	}

	@Test
	public void testFindProduit() {
		Produit produit = produitRepository.findById(1L).get();
		System.out.println(produit);
	}

		@Test
	public void testUpdateProduit() {
		Produit produit = produitRepository.findById(8L).get();
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
		List<Produit> produits = produitRepository.findAll();
		for (Produit produit:produits)
		System.out.println(produit);
	}
}
