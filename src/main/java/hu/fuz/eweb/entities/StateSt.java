package hu.fuz.eweb.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "STATE_ST", schema = "PUBLIC", catalog = "TEST")
public class StateSt {
    private long stId;
    private long foId;
    private String stCode;
    private String stDescription;
    private FolyamatFo folyamatFoByFoId;
    private Collection<TransitionTr> transitionTrsByStId;
    private Collection<TransitionTr> transitionTrsByStId_0;

    @Id
    @Column(name = "ST_ID")
    public long getStId() {
        return stId;
    }

    public void setStId(long stId) {
        this.stId = stId;
    }

    @Basic
    @Column(name = "FO_ID", insertable = false, updatable = false)
    public long getFoId() {
        return foId;
    }

    public void setFoId(long foId) {
        this.foId = foId;
    }

    @Basic
    @Column(name = "ST_CODE")
    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    @Basic
    @Column(name = "ST_DESCRIPTION")
    public String getStDescription() {
        return stDescription;
    }

    public void setStDescription(String stDescription) {
        this.stDescription = stDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateSt stateSt = (StateSt) o;
        return stId == stateSt.stId &&
                foId == stateSt.foId &&
                Objects.equals(stCode, stateSt.stCode) &&
                Objects.equals(stDescription, stateSt.stDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stId, foId, stCode, stDescription);
    }

    @ManyToOne
    @JoinColumn(name = "FO_ID", referencedColumnName = "FO_ID", nullable = false)
    public FolyamatFo getFolyamatFoByFoId() {
        return folyamatFoByFoId;
    }

    public void setFolyamatFoByFoId(FolyamatFo folyamatFoByFoId) {
        this.folyamatFoByFoId = folyamatFoByFoId;
    }

    @OneToMany(mappedBy = "stateStByStIdFrom")
    public Collection<TransitionTr> getTransitionTrsByStId() {
        return transitionTrsByStId;
    }

    public void setTransitionTrsByStId(Collection<TransitionTr> transitionTrsByStId) {
        this.transitionTrsByStId = transitionTrsByStId;
    }

    @OneToMany(mappedBy = "stateStByStIdTo")
    public Collection<TransitionTr> getTransitionTrsByStId_0() {
        return transitionTrsByStId_0;
    }

    public void setTransitionTrsByStId_0(Collection<TransitionTr> transitionTrsByStId_0) {
        this.transitionTrsByStId_0 = transitionTrsByStId_0;
    }
}
