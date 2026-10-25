
package com.ornek.ekitap.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "kitap")
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String baslik;

    @Column(nullable = false)
    private String yazar;

    @Column(unique = true)
    private String isbn;

    private Integer baskiYili;

    private Integer sayfaSayisi;

    @Column(nullable = false)
    private BigDecimal fiyat;

    @Column(nullable = false)
    private Integer stok;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Kategori kategori;

    public Kitap() {
    }

    public Integer getId() {
        return id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getBaskiYili() {
        return baskiYili;
    }

    public void setBaskiYili(Integer baskiYili) {
        this.baskiYili = baskiYili;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
}