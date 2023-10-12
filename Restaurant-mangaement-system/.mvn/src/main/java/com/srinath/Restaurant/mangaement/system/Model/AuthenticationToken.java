package com.srinath.Restaurant.mangaement.system.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data

@Entity
public class AuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationDateTime;


    @OneToOne
    @JoinColumn(name = "fk_user_Id")
    User user;
    @OneToOne
    Admin admin;

    public AuthenticationToken(Long tokenId, String tokenValue, LocalDateTime tokenCreationDateTime, User user, Admin admin) {
        this.tokenId = tokenId;
        this.tokenValue = tokenValue;
        this.tokenCreationDateTime = tokenCreationDateTime;
        this.user = user;
        this.admin = admin;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public LocalDateTime getTokenCreationDateTime() {
        return tokenCreationDateTime;
    }

    public void setTokenCreationDateTime(LocalDateTime tokenCreationDateTime) {
        this.tokenCreationDateTime = tokenCreationDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public AuthenticationToken(Admin admin)
    {
        this.admin = admin;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();
    }


    public AuthenticationToken(User user)
    {
        this.user = user;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();
    }
}
