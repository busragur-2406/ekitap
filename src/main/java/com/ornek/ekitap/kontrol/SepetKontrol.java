package com.ornek.ekitap.kontrol;

import com.ornek.ekitap.servis.SepetServis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class SepetKontrol {

    private final SepetServis sepetServis;

    public SepetKontrol(SepetServis sepetServis) {
        this.sepetServis = sepetServis;
    }

    @PostMapping("/sepet/ekle")
    public String sepeteEkle(@RequestParam Integer kitapId, Principal principal) {

        String kullaniciAdi = principal.getName();
        sepetServis.sepeteEkle(kullaniciAdi, kitapId);

        return "redirect:/";
    }
}