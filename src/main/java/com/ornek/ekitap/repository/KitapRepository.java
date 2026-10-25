package com.ornek.ekitap.repository;

import com.ornek.ekitap.model.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository<Kitap, Integer> {

}
