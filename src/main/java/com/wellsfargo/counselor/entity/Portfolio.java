package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false )
    @CreationTimestamp
    private LocalDateTime creationDate;

    public Portfolio() {
    }

    public Portfolio(long portfolioId, long clientId, LocalDateTime creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
