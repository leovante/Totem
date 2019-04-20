package com.system.model;

import java.sql.Timestamp;
import java.util.UUID;

public class MtrGasEntity implements Domain {
    private long mtrId;
    private long value;
    private Timestamp date;
    private UUID uuid;

    public MtrGasEntity(UUID uuid, Timestamp date, long value, long mtrId){
        this.mtrId = mtrId;
        this.value = value;
        this.date = date;
        this.uuid = uuid;
    }

    public long getMtrId() {
        return mtrId;
    }

    public void setMtrId(long mtrId) {
        this.mtrId = mtrId;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Object getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
