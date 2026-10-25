package com.ornek.ekitap.repository;

import com.ornek.ekitap.model.Sepet;
import com.ornek.ekitap.model.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SepetRepository extends JpaRepository<Sepet,Integer>{

	  Sepet findByMusteri(Musteri musteri);
	
}
