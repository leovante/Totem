package com.system.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class mtr_start {
    private long startid;
    private Object date;
    private Object uuid;

    @Id
    @Column(name = "startid", nullable = false)
    public long getStartid() {
        return startid;
    }

    public void setStartid(long startid) {
        this.startid = startid;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Basic
    @Column(name = "uuid", nullable = true)
    public Object getUuid() {
        return uuid;
    }

    public void setUuid(Object uuid) {
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
