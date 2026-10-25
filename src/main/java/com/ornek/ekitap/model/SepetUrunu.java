
package com.ornek.ekitap.model;

import jakarta.persistence.*;

@Entity
@Table(
    name = "sepet_urunu",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {"sepet_id", "kitap_id"}
    )
)
public class SepetUrunu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Sepet sepet;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Kitap kitap;

    @Column(nullable = false)
    private int adet;

    public SepetUrunu() {
    }

    public Integer getId() {
        return id;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
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
}
