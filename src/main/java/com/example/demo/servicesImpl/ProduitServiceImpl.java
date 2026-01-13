package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.CategorieEntity;
import com.example.demo.entities.ProduitEntity;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

    //@Autowired
    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public ProduitEntity saveProduit(ProduitEntity produitEntity) {
        return produitRepository.save(produitEntity);
    }

    @Override
    public ProduitEntity updateProduit(ProduitEntity produitEntity) {
        return produitRepository.save(produitEntity);
    }

    @Override
    public void deleteProduit(ProduitEntity produitEntity) {
        produitRepository.delete(produitEntity);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public ProduitEntity getProduit(Long id) {
       return produitRepository.findById(id).get();
    }

    @Override
    public List<ProduitEntity> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<ProduitEntity> findByNomProduit(String nomProduit) {
        return produitRepository.findByNomProduit(nomProduit);
    }

    @Override
    public List<ProduitEntity> findByNomProduitContains(String nomProduit) {
        return produitRepository.findByNomProduitContains(nomProduit);
    }

    @Override
    public List<ProduitEntity> findByPrixProduit(Double prixProduit) {
        return produitRepository.findByPrixProduit(prixProduit);
    }

    @Override
    public List<ProduitEntity> findByNomPrix(String nomProduit, Double prixProduit) {
        return produitRepository.findByNomPrix(nomProduit, prixProduit);
    }

    @Override
    public List<ProduitEntity> findByCategorie(CategorieEntity categorie) {
        return produitRepository.findByCategorie(categorie);
    }

    @Override
    public List<ProduitEntity> findByCategorieIdCat(Long idProduit) {
        return produitRepository.findByCategorieIdCat(idProduit);
    }

    @Override
    public List<ProduitEntity> findByOrderByNomProduitAsc() {
        return produitRepository.findByOrderByNomProduitAsc();
    }

    @Override
    public List<ProduitEntity> trierProduitsNomsPrix() {
        return produitRepository.trierProduitsNomsPrix();
    }

}
