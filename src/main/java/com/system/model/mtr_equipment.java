package com.system.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "mtr_equipment")
public class mtr_equipment {
    private long equipmentid;
    private String name;
    private UUID uuid;

    @Id
    @GeneratedValue
    @Column(name = "equipmentid", nullable = false)
    public long getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(long equipmentid) {
        this.equipmentid = equipmentid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
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
        mtr_equipment that = (mtr_equipment) o;
        return equipmentid == that.equipmentid &&
                Objects.equals(name, that.name) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentid, name, uuid);
    }

    private Set<mtr_gas> mtr_gas2;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rf_equipmentid")
//    @JoinColumn
    public Set<mtr_gas> getMtr_gas() {
        return mtr_gas2;
    }

    public void setMtr_gas(Set<mtr_gas> mtr_gas2) {
        this.mtr_gas2 = mtr_gas2;
    }
}
