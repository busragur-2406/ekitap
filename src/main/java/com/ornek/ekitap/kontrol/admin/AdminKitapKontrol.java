
package com.ornek.ekitap.kontrol.admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.ornek.ekitap.model.Kitap;
import com.ornek.ekitap.servis.KitapServis;
import com.ornek.ekitap.servis.KategoriServis;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminKitapKontrol {

    private final KitapServis kitapServis;
    private final KategoriServis kategoriServis;

    public AdminKitapKontrol(KitapServis kitapServis,KategoriServis kategoriServis) {

        this.kitapServis = kitapServis;
        this.kategoriServis = kategoriServis;
    }

    @GetMapping("/admin/kitap/ekle")
    public String kitapSayfasi(Model model) {

        model.addAttribute("kitaplar", kitapServis.tumKitaplariGetir());
        model.addAttribute("kategoriler", kategoriServis.tumKategorileriGetir());
        model.addAttribute("kitap", new Kitap());

        return "admin/kitap_form";
    }

    @PostMapping("/admin/kitap/ekle")
    public String kitapEkle(@ModelAttribute Kitap kitap) {

    	kitapServis.kaydet(kitap);
        return "redirect:/admin/kitap/ekle";
    }

}
