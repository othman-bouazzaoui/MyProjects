package com.othman.p1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.othman.p1.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
