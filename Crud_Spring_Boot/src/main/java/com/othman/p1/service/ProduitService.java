package com.othman.p1.service;

import java.util.List;

import com.othman.p1.models.Produit;

public interface ProduitService {
	public Produit saveProduit(Produit p);
	public Produit updateProduit(Produit p);
	public Produit getProduit(Long id);
	public void deleteProduit(Produit p);
	public void deleteByIdProduit(Long id);
	public List<Produit> getAllProduits();
	
}
