package com.ornek.ekitap.servis;

import org.springframework.stereotype.Service;

import com.ornek.ekitap.model.Musteri;
import com.ornek.ekitap.repository.MusteriRepository;

@Service
public class MusteriServis {

    private final MusteriRepository musteriRepository;

    public MusteriServis(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    public Musteri kaydet(Musteri musteri) {

        return musteriRepository.save(musteri);
    }
}