
package com.ornek.ekitap.kontrol.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.ornek.ekitap.model.Kategori;
import com.ornek.ekitap.servis.KategoriServis;

@Controller
public class AdminKategoriKontrol {

    private final KategoriServis kategoriServis;

    public AdminKategoriKontrol(KategoriServis kategoriServis) {
        this.kategoriServis = kategoriServis;
    }

    @GetMapping("/admin/kategori/ekle")
    public String kategoriSayfasi(Model model) {
        model.addAttribute("kategoriler",kategoriServis.tumKategorileriGetir());
        model.addAttribute("kategori", new Kategori());
        return "admin/kategori_form";
    }

    @PostMapping("/admin/kategori/ekle")
    public String kategoriEkle(@ModelAttribute Kategori kategori) {
        kategoriServis.kaydet(kategori);
        return "redirect:/admin/kategori/ekle";
    }
    
}
