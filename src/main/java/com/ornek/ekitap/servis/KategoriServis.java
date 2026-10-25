
package com.ornek.ekitap.servis;

import java.util.List;

import org.springframework.stereotype.Service;
  
import com.ornek.ekitap.model.Kategori;
import com.ornek.ekitap.repository.KategoriRepository;

@Service
public class KategoriServis {

    private final KategoriRepository kategoriRepository;

    public KategoriServis(KategoriRepository kategoriRepository) {
        this.kategoriRepository = kategoriRepository;
    }

    public List<Kategori> tumKategorileriGetir() {
        return kategoriRepository.findAll();
    }
    
    public Kategori kaydet(Kategori kategori) {
        return kategoriRepository.save(kategori);
    }
}
