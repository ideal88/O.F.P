package org.aerosystem.operationalflightplan.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 *
 */
@Entity
public class Waypoint {

    @Id
    private String waypointID;
    private String waypointName;
    private double waypointLatitude;
    private double waypointLongitude;
    private double waypointMagnaticVariation;
    private String waypointComment;
   // private String waypointTypeID;
    private String  waypointNavaidName;
    private String waypointState;
    private LocalDateTime waypointLastupdate;
    private double waypointNavaidMagnaticVariation;
    private boolean waypointHasFuel;
    private String waypointAddress;
    private String waypointPatternAltitude;
    private boolean waypointIsActive;
    @ManyToOne
    private Country country;
    @ManyToOne
    private WaypointType waypointType;
    @OneToMany(mappedBy = "waypoint")
    private Set<Runway> runways;
    @OneToMany(mappedBy = "waypoint")
    private Set<Frequency> frequencies;
    @OneToMany(mappedBy = "waypoint")
    private Set<Fix> fixes;

    public Set<Frequency> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(Set<Frequency> frequencies) {
        this.frequencies = frequencies;
    }

    public Set<Fix> getFixes() {
        return fixes;
    }

    public void setFixes(Set<Fix> fixes) {
        this.fixes = fixes;
    }

    public WaypointType getWaypointType() {
        return waypointType;
    }

    public void setWaypointType(WaypointType waypointType) {
        this.waypointType = waypointType;
    }

    public Set<Runway> getRunways() {
        return runways;
    }

    public void setRunways(Set<Runway> runways) {
        this.runways = runways;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getWaypointID() {
        return waypointID;
    }

    public void setWaypointID(String waypointID) {
        this.waypointID = waypointID;
    }

    public String getWaypointName() {
        return waypointName;
    }

    public void setWaypointName(String waypointName) {
        this.waypointName = waypointName;
    }

    public double getWaypointLatitude() {
        return waypointLatitude;
    }

    public void setWaypointLatitude(double waypointLatitude) {
        this.waypointLatitude = waypointLatitude;
    }

    public double getWaypointLongitude() {
        return waypointLongitude;
    }

    public void setWaypointLongitude(double waypointLongitude) {
        this.waypointLongitude = waypointLongitude;
    }

    public double getWaypointMagnaticVariation() {
        return waypointMagnaticVariation;
    }

    public void setWaypointMagnaticVariation(double waypointMagnaticVariation) {
        this.waypointMagnaticVariation = waypointMagnaticVariation;
    }

    public String getWaypointComment() {
        return waypointComment;
    }

    public void setWaypointComment(String waypointComment) {
        this.waypointComment = waypointComment;
    }



    public String getWaypointNavaidName() {
        return waypointNavaidName;
    }

    public void setWaypointNavaidName(String waypointNavaidName) {
        this.waypointNavaidName = waypointNavaidName;
    }

    public String getWaypointState() {
        return waypointState;
    }

    public void setWaypointState(String waypointState) {
        this.waypointState = waypointState;
    }

    public LocalDateTime getWaypointLastupdate() {
        return waypointLastupdate;
    }

    public void setWaypointLastupdate(LocalDateTime waypointLastupdate) {
        this.waypointLastupdate = waypointLastupdate;
    }

    public double getWaypointNavaidMagnaticVariation() {
        return waypointNavaidMagnaticVariation;
    }

    public void setWaypointNavaidMagnaticVariation(double waypointNavaidMagnaticVariation) {
        this.waypointNavaidMagnaticVariation = waypointNavaidMagnaticVariation;
    }

    public boolean isWaypointHasFuel() {
        return waypointHasFuel;
    }

    public void setWaypointHasFuel(boolean waypointHasFuel) {
        this.waypointHasFuel = waypointHasFuel;
    }

    public String getWaypointAddress() {
        return waypointAddress;
    }

    public void setWaypointAddress(String waypointAddress) {
        this.waypointAddress = waypointAddress;
    }

    public String getWaypointPatternAltitude() {
        return waypointPatternAltitude;
    }

    public void setWaypointPatternAltitude(String waypointPatternAltitude) {
        this.waypointPatternAltitude = waypointPatternAltitude;
    }

    public boolean isWaypointIsActive() {
        return waypointIsActive;
    }

    public void setWaypointIsActive(boolean waypointIsActive) {
        this.waypointIsActive = waypointIsActive;
    }
}
