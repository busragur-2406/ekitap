package com.ornek.ekitap.servis;

import com.ornek.ekitap.model.*;
import com.ornek.ekitap.repository.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SepetServis {

    private final MusteriRepository musteriRepository;
    private final SepetRepository sepetRepository;
    private final KitapRepository kitapRepository;
    private final SepetUrunuRepository sepetUrunuRepository;

    // Dependency Injection
    public SepetServis(
            MusteriRepository musteriRepository,
            SepetRepository sepetRepository,
            KitapRepository kitapRepository,
            SepetUrunuRepository sepetUrunuRepository) {

        this.musteriRepository = musteriRepository;
        this.sepetRepository = sepetRepository;
        this.kitapRepository = kitapRepository;
        this.sepetUrunuRepository = sepetUrunuRepository;
    }

    @Transactional
    public void sepeteEkle(String kullaniciAdi, Integer kitapId) {

    	Musteri musteri = musteriRepository.findByKullaniciAdi(kullaniciAdi);

    	if (musteri == null) {
    	    throw new RuntimeException("Müşteri bulunamadı");
    	}
    	
        
	    Sepet sepet = sepetRepository.findByMusteri(musteri);
		    if (sepet == null) {
		        sepet = new Sepet();
		        sepet.setMusteri(musteri);
		        sepet = sepetRepository.save(sepet);
		    }

        
        Kitap kitap = kitapRepository.findById(kitapId).orElseThrow();

        
        SepetUrunu urun = sepetUrunuRepository
                .findBySepetAndKitap(sepet, kitap);

	       
	        if (urun == null) {
	            urun = new SepetUrunu();
	            urun.setSepet(sepet);
	            urun.setKitap(kitap);
	            urun.setAdet(1);
	        } else {
	            urun.setAdet(urun.getAdet() + 1);
	        }
        
        sepetUrunuRepository.save(urun);
    }
}