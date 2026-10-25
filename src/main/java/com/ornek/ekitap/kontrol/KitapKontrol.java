
package com.ornek.ekitap.kontrol;


import org.springframework.web.bind.annotation.*;
import com.ornek.ekitap.model.Kitap;
import com.ornek.ekitap.servis.KitapServis;
import org.springframework.stereotype.Controller;

@Controller
public class KitapKontrol {

    private final KitapServis kitapServis;
    public KitapKontrol(KitapServis kitapServis) {
        this.kitapServis = kitapServis;
    }

    /*
    @PostMapping("/kitap/ekle")
    public String kitapEkle(@ModelAttribute Kitap kitap) {

        kitapServis.kaydet(kitap);
        return "redirect:/kitaplar";
    }
    */
}
