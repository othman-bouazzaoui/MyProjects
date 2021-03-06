package com.othman.p1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.othman.p1.models.Produit;
import com.othman.p1.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService{
   
	@Autowired
	private ProduitRepository ProduitRepo;
	
	@Override
	public Produit saveProduit(Produit p) {

		return ProduitRepo.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		
		return ProduitRepo.save(p);
	}

	@Override
	public Produit getProduit(Long id) {
		Produit p = ProduitRepo.findById(id).get();
		return p;
	}

	@Override
	public void deleteProduit(Produit p) {
		ProduitRepo.delete(p);
	}

	@Override
	public void deleteByIdProduit(Long id) {
		ProduitRepo.deleteById(id);		
	}

	@Override
	public List<Produit> getAllProduits() {
		List<Produit> prods = ProduitRepo.findAll();
		return prods;
	}

}
