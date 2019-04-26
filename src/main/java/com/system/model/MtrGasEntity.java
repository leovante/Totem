package com.system.model;

import java.sql.Timestamp;
import java.util.UUID;

public class MtrGasEntity implements DomainMtrGas {
    private Long mtrId;
    private Long value;
    private Timestamp date;
    private UUID uuid;
    private Timestamp dateValue;

    public MtrGasEntity(Long mtrId, Long value, Timestamp date, UUID uuid, Timestamp dateValue) {
        this.mtrId = mtrId;
        this.value = value;
        this.date = date;
        this.uuid = uuid;
        this.dateValue = dateValue;
    }

    public Long getMtrId() {
        return mtrId;
    }

    public void setMtrId(Long mtrId) {
        this.mtrId = mtrId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
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

    public Timestamp getDateValue() {
        return dateValue;
    }

    public void setDateValue(Timestamp dateValue) {
        this.dateValue = dateValue;
    }
}