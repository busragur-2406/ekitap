
package com.ornek.ekitap.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "siparis_urunu")
public class SiparisUrunu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int adet;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal birimFiyat;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal araToplam;

    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Siparis siparis;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Kitap kitap;
    
    public SiparisUrunu() {
    }

    public Integer getId() {
        return id;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        if (adet <= 0) {
            throw new IllegalArgumentException(
                "Ürün adedi sıfırdan büyük olmalıdır."
            );
        }

        this.adet = adet;
    }

    public BigDecimal getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(BigDecimal birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public BigDecimal getAraToplam() {
        return araToplam;
    }

    public void setAraToplam(BigDecimal araToplam) {
        this.araToplam = araToplam;
    }
}
