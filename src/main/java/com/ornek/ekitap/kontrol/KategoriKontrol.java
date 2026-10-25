
package com.ornek.ekitap.kontrol;

import org.springframework.web.bind.annotation.*;
import com.ornek.ekitap.model.Kategori;
import com.ornek.ekitap.servis.KategoriServis;
import org.springframework.stereotype.Controller;

@Controller
public class KategoriKontrol {

    private final KategoriServis kategoriServis;
    public KategoriKontrol(KategoriServis kategoriServis) {
        this.kategoriServis = kategoriServis;
    }

    @PostMapping("/kategori/ekle")
    public String kategoriEkle(@ModelAttribute Kategori kategori) {

        kategoriServis.kaydet(kategori);
        return "redirect:/kategoriler";
    }
}
