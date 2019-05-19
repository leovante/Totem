package com.system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "mtr_gas")
public class mtr_gas implements Serializable {
    private long gasid;
    private long value;
    private Timestamp date;
    private UUID uuid;
    private Timestamp datevalue;
    private BigInteger rfEquipmentid;

    @JsonCreator
    public mtr_gas(@JsonProperty("gasid") long gasid,
                   @JsonProperty("value") long value,
                   @JsonProperty("date") Timestamp date,
                   @JsonProperty("uuid") UUID uuid,
                   @JsonProperty("datevalue") Timestamp datevalue,
                   @JsonProperty("rf_equipmentid") mtr_equipment rf_equipmentid) {
        this.gasid = gasid;
        this.value = value;
        this.date = date;
        this.uuid = uuid;
        this.datevalue = datevalue;
        this.rf_equipmentid = rf_equipmentid;
    }

    public mtr_gas() {
    }

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
    @Column(name = "value", nullable = false)
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Basic
    @Column(name = "date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
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
    @Column(name = "uuid", unique = true, nullable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()")
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "datevalue")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    public Timestamp getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(Timestamp datevalue) {
        this.datevalue = datevalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mtr_gas mtr_gas = (mtr_gas) o;
        return gasid == mtr_gas.gasid &&
                value == mtr_gas.value &&
                Objects.equals(date, mtr_gas.date) &&
                Objects.equals(uuid, mtr_gas.uuid) &&
                Objects.equals(datevalue, mtr_gas.datevalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gasid, value, date, uuid, datevalue);
    }

    private mtr_equipment rf_equipmentid;

    @ManyToOne
    @JoinColumn(name = "rf_equipmentid", referencedColumnName = "equipmentid", nullable = false)
    @JsonBackReference
    @JsonDeserialize
    public mtr_equipment getRf_equipmentid() {
        return rf_equipmentid;
    }

    public void setRf_equipmentid(mtr_equipment rf_equipmentid) {
        this.rf_equipmentid = rf_equipmentid;
    }

    public void setRfEquipmentid(BigInteger rfEquipmentid) {
        this.rfEquipmentid = rfEquipmentid;
    }
}