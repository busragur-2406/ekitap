package com.ornek.ekitap.kontrol;

import com.ornek.ekitap.model.Kitap;
import com.ornek.ekitap.servis.KitapServis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnaSayfaKontrol {

    private final KitapServis kitapServis;

    public AnaSayfaKontrol(KitapServis kitapServis) {
        this.kitapServis = kitapServis;
    }

    @GetMapping("/")
    public String anasayfa(Model model) {

        List<Kitap> kitaplar = kitapServis.tumKitaplariGetir();
        model.addAttribute("kitaplar", kitaplar);

        return "anasayfa";
    }
}