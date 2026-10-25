package com.ornek.ekitap.kontrol.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminAnaSayfaKontrol {

    @GetMapping("/admin")
    public String adminAnaSayfa() {
        return "admin/anasayfa";
    }
}
