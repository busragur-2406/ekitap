
package com.ornek.ekitap.servis;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ornek.ekitap.model.Kitap;
import com.ornek.ekitap.repository.KitapRepository;
import com.ornek.ekitap.repository.KategoriRepository;
import com.ornek.ekitap.model.Kategori;
@Service
public class KitapServis {

    private final KitapRepository kitapRepository;
    private final KategoriRepository kategoriRepository;

    public KitapServis(KitapRepository kitapRepository,KategoriRepository kategoriRepository) {

        this.kitapRepository = kitapRepository;
        this.kategoriRepository = kategoriRepository;
    }

    public List<Kitap> tumKitaplariGetir() {
        return kitapRepository.findAll();
    }


    public void kaydet(Kitap kitap) {

        Integer kategoriId = kitap.getKategori().getId();
        
        Kategori kategori = kategoriRepository.findById(kategoriId)
            .orElseThrow(() ->
                new IllegalArgumentException(
                    "Kategori bulunamadı: " + kategoriId));

        kitap.setKategori(kategori);
        kitapRepository.save(kitap);
    }

}
