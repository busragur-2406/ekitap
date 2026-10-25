package com.ornek.ekitap.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sepet")
public class Sepet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private Musteri musteri;

    @Column(nullable = false)
    private LocalDateTime olusturmaZamani = LocalDateTime.now();

    public Sepet() {
    }

    public Integer getId() {
        return id;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public LocalDateTime getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(LocalDateTime olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
    }
}