
package com.ornek.ekitap.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "siparis")
public class Siparis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal genelToplam = BigDecimal.ZERO;

    @Column(nullable = false)
    private LocalDateTime olusturmaZamani = LocalDateTime.now();

    @Column(nullable = false, length = 20)
    private String durum = "YENI";

    @ManyToOne
    @JoinColumn(nullable = false)
    private Musteri musteri;
    
    public Siparis() {
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

    public BigDecimal getGenelToplam() {
        return genelToplam;
    }

    public void setGenelToplam(BigDecimal genelToplam) {
        this.genelToplam = genelToplam;
    }

    public LocalDateTime getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(LocalDateTime olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
