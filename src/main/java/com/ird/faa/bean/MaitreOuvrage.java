package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;

import com.ird.faa.security.bean.User;


@Entity
@Table(name = "maitre_ouvrage")
public class MaitreOuvrage  extends User  {


    public MaitreOuvrage(String username) {
    super(username);
    }
            @Column(length = 500)
            private String ice;
            @Column(length = 500)
            private String identifiantFiscale;
            @Column(length = 500)
            private String adresse;
            @Column(columnDefinition = "boolean default false")
                private boolean credentialsNonExpired = false;
            @Column(columnDefinition = "boolean default false")
                private boolean enabled = false;
            @Column(columnDefinition = "boolean default false")
                private boolean accountNonExpired = false;
            @Column(columnDefinition = "boolean default false")
                private boolean accountNonLocked = false;
            @Column(columnDefinition = "boolean default false")
                private boolean passwordChanged = false;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date createdAt ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date updatedAt ;
            @Column(length = 500)
            private String username;
            @Column(length = 500)
            private String password;
            @Column(length = 500)
            private String prenom;
            @Column(length = 500)
            private String nom;
            @Column(length = 500)
            private String equivalenceAvecPanelErc;
            @Column(length = 500)
            private String baseHorizon;
          @Transient
        private String role;



public MaitreOuvrage(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getIce(){
            return this.ice;
            }
            public void setIce(String ice){
            this.ice = ice;
            }
            public String getIdentifiantFiscale(){
            return this.identifiantFiscale;
            }
            public void setIdentifiantFiscale(String identifiantFiscale){
            this.identifiantFiscale = identifiantFiscale;
            }
            public String getAdresse(){
            return this.adresse;
            }
            public void setAdresse(String adresse){
            this.adresse = adresse;
            }
        public boolean  getCredentialsNonExpired(){
        return this.credentialsNonExpired;
        }
        public void setCredentialsNonExpired(boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
        }
        public boolean  getEnabled(){
        return this.enabled;
        }
        public void setEnabled(boolean enabled){
        this.enabled = enabled;
        }
        public boolean  getAccountNonExpired(){
        return this.accountNonExpired;
        }
        public void setAccountNonExpired(boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
        }
        public boolean  getAccountNonLocked(){
        return this.accountNonLocked;
        }
        public void setAccountNonLocked(boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
        }
        public boolean  getPasswordChanged(){
        return this.passwordChanged;
        }
        public void setPasswordChanged(boolean passwordChanged){
        this.passwordChanged = passwordChanged;
        }
            public Date getCreatedAt(){
            return this.createdAt;
            }
            public void setCreatedAt(Date createdAt){
            this.createdAt = createdAt;
            }
            public Date getUpdatedAt(){
            return this.updatedAt;
            }
            public void setUpdatedAt(Date updatedAt){
            this.updatedAt = updatedAt;
            }
            public String getUsername(){
            return this.username;
            }
            public void setUsername(String username){
            this.username = username;
            }
            public String getPassword(){
            return this.password;
            }
            public void setPassword(String password){
            this.password = password;
            }
            public String getPrenom(){
            return this.prenom;
            }
            public void setPrenom(String prenom){
            this.prenom = prenom;
            }
            public String getNom(){
            return this.nom;
            }
            public void setNom(String nom){
            this.nom = nom;
            }
            public String getEquivalenceAvecPanelErc(){
            return this.equivalenceAvecPanelErc;
            }
            public void setEquivalenceAvecPanelErc(String equivalenceAvecPanelErc){
            this.equivalenceAvecPanelErc = equivalenceAvecPanelErc;
            }
            public String getBaseHorizon(){
            return this.baseHorizon;
            }
            public void setBaseHorizon(String baseHorizon){
            this.baseHorizon = baseHorizon;
            }
            public String getRole(){
            return this.role;
            }
            public void setRole(String role){
            this.role = role;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaitreOuvrage maitreOuvrage = (MaitreOuvrage) o;
        return id != null && id.equals(maitreOuvrage.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

