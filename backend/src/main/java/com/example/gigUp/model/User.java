package com.example.gigUp.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String bio;
    private String name;
    private Date dob;
    private List<Task> completedTasks;
    private List<Task> postedTasks;
    private List<String> skills; 

    public Long getUserId() {
        return this.id;
    }

    public User() {
    }

    public User(Long id, String location, String bio, String name, Date dob, List<Task> completedTasks, List<Task> postedTasks, List<String> skills) {
        this.id = id;
        this.location = location;
        this.bio = bio;
        this.name = name;
        this.dob = dob;
        this.completedTasks = completedTasks;
        this.postedTasks = postedTasks;
        this.skills = skills;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Task> getCompletedTasks() {
        return this.completedTasks;
    }

    public void setCompletedTasks(List<Task> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public List<Task> getPostedTasks() {
        return this.postedTasks;
    }

    public void setPostedTasks(List<Task> postedTasks) {
        this.postedTasks = postedTasks;
    }

    public User id(Long id) {
        setId(id);
        return this;
    }

    public User location(String location) {
        setlocation(location);
        return this;
    }

    public User bio(String bio) {
        setBio(bio);
        return this;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User dob(Date dob) {
        setDob(dob);
        return this;
    }

    public User completedTasks(List<Task> completedTasks) {
        setCompletedTasks(completedTasks);
        return this;
    }

    public User postedTasks(List<Task> postedTasks) {
        setPostedTasks(postedTasks);
        return this;
    }

    public User skills(List<String> skills) {
        setSkills(skills);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(location, user.location) && Objects.equals(bio, user.bio) && Objects.equals(name, user.name) && Objects.equals(dob, user.dob) && Objects.equals(completedTasks, user.completedTasks) && Objects.equals(postedTasks, user.postedTasks) && Objects.equals(skills, user.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, bio, name, dob, completedTasks, postedTasks, skills);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", location='" + getlocation() + "'" +
            ", bio='" + getBio() + "'" +
            ", name='" + getName() + "'" +
            ", dob='" + getDob() + "'" +
            ", completedTasks='" + getCompletedTasks() + "'" +
            ", postedTasks='" + getPostedTasks() + "'" +
            ", skills='" + getSkills() + "'" +
            "}";
    }

    public void setUserId(Long id) {
        this.id = id;
    }

    public String getlocation() {
        return this.location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getSkills() {
        return this.skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    
}
