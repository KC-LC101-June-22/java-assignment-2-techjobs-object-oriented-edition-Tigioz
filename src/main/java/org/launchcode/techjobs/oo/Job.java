package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //constructors
    public Job () {
        id = nextId;
        nextId++;
    }
    public Job (String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {

        String DNA = "Data not available";

        if (name == "" || name == null )   {
            name = DNA;
        }
        if (employer.getValue().equals("") || employer == null) {
            employer.setValue(DNA);
        }
        if (location == null || location.getValue().equals("")) {
            location.setValue(DNA);
        }
        if (positionType == null || positionType.getValue().equals("")) {
            positionType.setValue(DNA);
        }
        if (coreCompetency == null || coreCompetency.getValue().equals("")) {
            coreCompetency.setValue(DNA);
        }


        if (name.equals(DNA) && employer.getValue().equals(DNA) && location.getValue().equals(DNA) && positionType.getValue().equals(DNA) && coreCompetency.getValue().equals(DNA)) {
            return "OOPS! This job does not seem to exist.";
        }
        else {
            return  "\nID: " + id +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    '\n';
        }
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
