package um.ofp.ofp.models;

import javax.persistence.*;

@Entity
public class Fix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

private  String fixNavaid;
@ManyToOne
private Waypoint waypoint;
@ManyToOne
private FixType fixType;
private String fixRadial;
private  String FixDistance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFixNavaid() {
        return fixNavaid;
    }

    public void setFixNavaid(String fixNavaid) {
        this.fixNavaid = fixNavaid;
    }

    public Waypoint getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(Waypoint waypoint) {
        this.waypoint = waypoint;
    }

    public FixType getFixType() {
        return fixType;
    }

    public void setFixType(FixType fixType) {
        this.fixType = fixType;
    }

    public String getFixRadial() {
        return fixRadial;
    }

    public void setFixRadial(String fixRadial) {
        this.fixRadial = fixRadial;
    }

    public String getFixDistance() {
        return FixDistance;
    }

    public void setFixDistance(String fixDistance) {
        FixDistance = fixDistance;
    }
}
