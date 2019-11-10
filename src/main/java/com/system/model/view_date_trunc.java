package com.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Immutable
public class view_date_trunc implements Serializable {
    private BigInteger id;
    private Timestamp date;
    private Long rashod;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    public BigInteger getid() {
        return id;
    }

    public void setid(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true, insertable = false, updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", shape = JsonFormat.Shape.STRING, timezone = "Europe/Moscow")
    @CreationTimestamp
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "rashod", nullable = true, insertable = false, updatable = false)
    public Long getRashod() {
        return rashod;
    }

    public void setRashod(Long rashod) {
        this.rashod = rashod;
    }

}