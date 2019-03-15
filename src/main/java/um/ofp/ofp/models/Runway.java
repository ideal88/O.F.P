package um.ofp.ofp.models;

import javax.persistence.*;

@Entity
public class Runway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long runwayID;

    private String runwayDesignation;
    @ManyToOne
    private Waypoint waypoint;
    private Double runwayLength;
    private Double runwayWidth;
    @ManyToOne
    private RunwaySurfaceType runwaySurfaceType;
    private Double runwayBeginningLatitude;
    private Double runwayBeginningLongitude;
    private Double runwayBeginningHeading;
    private Double runwayBeginningElevation;
    private Double runwayEndLatitude;
    private Double runwayEndLongitude;
    private Double runwayEndHeading;
    private Double runwayEndElevation;

    public Long getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(Long runwayID) {
        this.runwayID = runwayID;
    }

    public String getRunwayDesignation() {
        return runwayDesignation;
    }

    public void setRunwayDesignation(String runwayDesignation) {
        this.runwayDesignation = runwayDesignation;
    }

    public Waypoint getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(Waypoint waypoint) {
        this.waypoint = waypoint;
    }

    public Double getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(Double runwayLength) {
        this.runwayLength = runwayLength;
    }

    public Double getRunwayWidth() {
        return runwayWidth;
    }

    public void setRunwayWidth(Double runwayWidth) {
        this.runwayWidth = runwayWidth;
    }

    public RunwaySurfaceType getRunwaySurfaceType() {
        return runwaySurfaceType;
    }

    public void setRunwaySurfaceType(RunwaySurfaceType runwaySurfaceType) {
        this.runwaySurfaceType = runwaySurfaceType;
    }

    public Double getRunwayBeginningLatitude() {
        return runwayBeginningLatitude;
    }

    public void setRunwayBeginningLatitude(Double runwayBeginningLatitude) {
        this.runwayBeginningLatitude = runwayBeginningLatitude;
    }

    public Double getRunwayBeginningLongitude() {
        return runwayBeginningLongitude;
    }

    public void setRunwayBeginningLongitude(Double runwayBeginningLongitude) {
        this.runwayBeginningLongitude = runwayBeginningLongitude;
    }

    public Double getRunwayBeginningHeading() {
        return runwayBeginningHeading;
    }

    public void setRunwayBeginningHeading(Double runwayBeginningHeading) {
        this.runwayBeginningHeading = runwayBeginningHeading;
    }

    public Double getRunwayBeginningElevation() {
        return runwayBeginningElevation;
    }

    public void setRunwayBeginningElevation(Double runwayBeginningElevation) {
        this.runwayBeginningElevation = runwayBeginningElevation;
    }

    public Double getRunwayEndLatitude() {
        return runwayEndLatitude;
    }

    public void setRunwayEndLatitude(Double runwayEndLatitude) {
        this.runwayEndLatitude = runwayEndLatitude;
    }

    public Double getRunwayEndLongitude() {
        return runwayEndLongitude;
    }

    public void setRunwayEndLongitude(Double runwayEndLongitude) {
        this.runwayEndLongitude = runwayEndLongitude;
    }

    public Double getRunwayEndHeading() {
        return runwayEndHeading;
    }

    public void setRunwayEndHeading(Double runwayEndHeading) {
        this.runwayEndHeading = runwayEndHeading;
    }

    public Double getRunwayEndElevation() {
        return runwayEndElevation;
    }

    public void setRunwayEndElevation(Double runwayEndElevation) {
        this.runwayEndElevation = runwayEndElevation;
    }
}
