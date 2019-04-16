package system.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mtr_gas", schema = "public", catalog = "postgres")
public class MtrGasEntity {
    private long mtrId;
    private long value;
    private Object date;
    private Object uuid;

    @Id
    @Column(name = "mtr_id")
    public long getMtrId() {
        return mtrId;
    }

    public void setMtrId(long mtrId) {
        this.mtrId = mtrId;
    }

    @Basic
    @Column(name = "value")
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Basic
    @Column(name = "date")
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Basic
    @Column(name = "uuid")
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
