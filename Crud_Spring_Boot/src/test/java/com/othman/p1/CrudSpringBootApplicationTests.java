package com.othman.p1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.othman.p1.models.Produit;
import com.othman.p1.repos.ProduitRepository;

@SpringBootTest
class CrudSpringBootApplicationTests {
	@Autowired
	private ProduitRepository produitrepo;
		
	@Test
	public void TestCreateProduit() {
		Produit p = new Produit("Dell", 1200D, new Date());
		produitrepo.save(p);
	}
	
	@Test
	public void TestFindProduit() {
		Produit p = produitrepo.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void TestUpdateProduit() {
		Produit p = produitrepo.findById(1L).get();
		p.setPrixProduit(2000D);
		produitrepo.save(p);
		System.out.println(p);
	}
	
	@Test
	public void TestDeleteProduit() {
		produitrepo.deleteById(1L);
	}
	
	@Test
	public void TestAllProduits() {
		List<Produit> prods = produitrepo.findAll();
		for(Produit p :prods) {
			System.out.println(p);
		}
		
	}
}
