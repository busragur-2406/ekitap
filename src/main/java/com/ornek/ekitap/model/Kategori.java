	package com.ornek.ekitap.model;
	
	import jakarta.persistence.*;
	
	@Entity
	@Table(name = "kategori")
	public class Kategori {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
	    @Column(nullable = false, unique = true)
	    private String ad;
	
	    public Kategori() {
	    }
	
	    public Integer getId() {
	        return id;
	    }
	
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    
	    public String getAd() {
	        return ad;
	    }
	
	    public void setAd(String ad) {
	        this.ad = ad;
	    }
		
	}
	
	
	
	
	
	
	
