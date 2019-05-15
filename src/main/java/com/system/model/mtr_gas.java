package com.system.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "mtr_gas")
public class mtr_gas {
    private long gasid;
    private long value;
    private Timestamp date;
    private UUID uuid;
    private Timestamp datevalue;
    private int rfEquipmentid;

    @Id
    @GeneratedValue
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
    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "uuid", nullable = true)
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "datevalue", nullable = true)
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
    @JoinColumn(name = "rf_equipmentid", referencedColumnName="equipmentid", nullable = false)
    public mtr_equipment getRf_equipmentid() {
        return rf_equipmentid;
    }

    public void setRf_equipmentid(mtr_equipment rf_equipmentid) {
        this.rf_equipmentid = rf_equipmentid;
    }
}
