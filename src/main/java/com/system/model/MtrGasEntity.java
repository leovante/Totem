package com.system.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "mtr_gas", schema = "public", catalog = "postgres")
public class MtrGasEntity {
    private Long mtrId;
    private Long value;
    private Timestamp date;
    private UUID uuid;

    @Id
    @Column(name = "mtr_id")
    public Long getMtrId() {
        return mtrId;
    }

    public void setMtrId(Long mtrId) {
        this.mtrId = mtrId;
    }

    @Basic
    @Column(name = "value")
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "uuid")
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
        MtrGasEntity that = (MtrGasEntity) o;
        return mtrId == that.mtrId &&
                value == that.value &&
                Objects.equals(date, that.date) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mtrId, value, date, uuid);
    }
}
