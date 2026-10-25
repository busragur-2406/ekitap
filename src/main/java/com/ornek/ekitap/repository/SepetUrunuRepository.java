package com.ornek.ekitap.repository;

import com.ornek.ekitap.model.SepetUrunu;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ornek.ekitap.model.Sepet;
import com.ornek.ekitap.model.Kitap;

public interface SepetUrunuRepository extends JpaRepository<SepetUrunu,Integer>{

    SepetUrunu findBySepetAndKitap(Sepet sepet, Kitap kitap);
	
}
