package com.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
public class mtr_start {
    private long startid;
    private Timestamp date;
    private UUID uuid;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "startid", nullable = false)
    public long getStartid() {
        return startid;
    }

    public void setStartid(long startid) {
        this.startid = startid;
    }

    @Basic
    @Column(name = "date", nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", shape = JsonFormat.Shape.STRING, timezone = "Europe/Moscow")
    @CreationTimestamp
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @GeneratedValue(
            generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "uuid", nullable = true)
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mtr_start mtr_start = (mtr_start) o;
        return startid == mtr_start.startid &&
                Objects.equals(date, mtr_start.date) &&
                Objects.equals(uuid, mtr_start.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startid, date, uuid);
    }
}
