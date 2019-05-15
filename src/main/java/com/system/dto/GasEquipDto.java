package com.system.dto;

import java.sql.Timestamp;
import java.util.UUID;

public class GasEquipDto {
    private long gasid;
    private long value;
    private Object date;
    private UUID gasUuid;
    private Timestamp datevalue;

    private long equipmentid;
    private String name;
    private UUID equipUuid;


    public GasEquipDto(long gasid, long value, Object date, UUID gasUuid, Timestamp datevalue, long equipmentid, String name, UUID equipUuid) {
        this.gasid = gasid;
        this.value = value;
        this.date = date;
        this.gasUuid = gasUuid;
        this.datevalue = datevalue;
        this.equipmentid = equipmentid;
        this.name = name;
        this.equipUuid = equipUuid;
    }

    public long getGasid() {
        return gasid;
    }

    public void setGasid(long gasid) {
        this.gasid = gasid;
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

    public void setDate(Object date) {
        this.date = date;
    }

    public UUID getGasUuid() {
        return gasUuid;
    }

    public void setGasUuid(UUID gasUuid) {
        this.gasUuid = gasUuid;
    }

    public Timestamp getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(Timestamp datevalue) {
        this.datevalue = datevalue;
    }

    public long getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(long equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getEquipUuid() {
        return equipUuid;
    }

    public void setEquipUuid(UUID equipUuid) {
        this.equipUuid = equipUuid;
    }
}