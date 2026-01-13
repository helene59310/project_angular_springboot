package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long idCat;
    
    private String nomCat;
    private String descriptionCat;

    @JsonIgnore
    @OneToMany (mappedBy = "categorie")
    private List<ProduitEntity> produitEntity;

}
