package com.system.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "mtr_equipment")
public class mtr_equipment implements Serializable {
    private BigInteger equipmentid;
    private String name;
    private UUID uuid;

    public mtr_equipment() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipmentid", nullable = false)
    public BigInteger getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(BigInteger equipmentid) {
        this.equipmentid = equipmentid;
    }

    @Basic
    @Column(name = "name", length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rf_equipmentid", fetch = FetchType.LAZY)
    @JsonManagedReference
    public Set<mtr_gas> getMtr_gas() {
        return mtr_gas2;
    }

    public void setMtr_gas(Set<mtr_gas> mtr_gas2) {
        this.mtr_gas2 = mtr_gas2;
    }
}
