package com.ornek.ekitap.kontrol;

import org.springframework.web.bind.annotation.*;
import com.ornek.ekitap.model.Musteri;
import com.ornek.ekitap.servis.MusteriServis;
import org.springframework.stereotype.Controller;

@Controller
public class MusteriKontrol {

    private final MusteriServis musteriServis;
    public MusteriKontrol(MusteriServis musteriServis) {
        this.musteriServis = musteriServis;
    }

    @PostMapping("/musteri/ekle")
    public String musteriEkle(@ModelAttribute Musteri musteri) {

        musteriServis.kaydet(musteri);
        return "redirect:/musteriler";
    }
}