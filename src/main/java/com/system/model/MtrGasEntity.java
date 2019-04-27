package com.system.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.UUID;

public class MtrGasEntity implements DomainMtrGas {
    private BigInteger mtrId;
    private BigInteger value;
    private Timestamp date;
    private UUID uuid;
    private Timestamp datevalue;
    private BigInteger rfEquipmentId;

    public MtrGasEntity(BigInteger mtrId, BigInteger value, Timestamp date, UUID uuid, Timestamp datevalue, BigInteger rfEquipmentId) {
        this.mtrId = mtrId;
        this.value = value;
        this.date = date;
        this.uuid = uuid;
        this.datevalue = datevalue;
        this.rfEquipmentId = rfEquipmentId;
    }

    public BigInteger getMtrId() {
        return mtrId;
    }

    public void setMtrId(BigInteger mtrId) {
        this.mtrId = mtrId;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Timestamp getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(Timestamp datevalue) {
        this.datevalue = datevalue;
    }

    public BigInteger getRfEquipmentId() {
        return rfEquipmentId;
    }

    public void setRfEquipmentId(BigInteger rfEquipmentId) {
        this.rfEquipmentId = rfEquipmentId;
    }
}