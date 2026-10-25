package com.ornek.ekitap.repository;


import com.ornek.ekitap.model.Musteri;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MusteriRepository extends JpaRepository<Musteri,Integer>{

	Musteri findByKullaniciAdi(String kullaniciAdi);
}
