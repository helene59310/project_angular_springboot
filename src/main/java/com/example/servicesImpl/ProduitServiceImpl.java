package com.example.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

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

}
