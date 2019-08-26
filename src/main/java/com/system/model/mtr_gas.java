package com.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
public class mtr_gas {
    private long gasid;
    private Timestamp date;
    private UUID uuid;
    private Long rfEquipmentid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gasid", nullable = false)
    public long getGasid() {
        return gasid;
    }

    public void setGasid(long gasid) {
        this.gasid = gasid;
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
//            strategy = GenerationType.AUTO,
            generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
//    @Type(type = "pg-uuid")
    @Column(name = "uuid", nullable = true)
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "rf_equipmentid", nullable = true)
    public Long getRfEquipmentid() {
        return rfEquipmentid;
    }

    public void setRfEquipmentid(Long rfEquipmentid) {
        this.rfEquipmentid = rfEquipmentid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mtr_gas mtr_gas = (mtr_gas) o;
        return gasid == mtr_gas.gasid &&
                Objects.equals(date, mtr_gas.date) &&
                Objects.equals(uuid, mtr_gas.uuid) &&
                Objects.equals(rfEquipmentid, mtr_gas.rfEquipmentid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gasid, date, uuid, rfEquipmentid);
    }
}
