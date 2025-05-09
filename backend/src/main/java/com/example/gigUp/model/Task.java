package com.example.gigUp.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private User poster;
    private String location;
    private Boolean regional;
    private Boolean worldwide; 
    private List<User> bidders;
    private User completer;
    private Date completionDate;
    private String category;
    private Integer rate;
    private String description;
    private Integer duration;
    private List<String> keywords; 

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public List<String> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean isRegional() {
        return this.regional;
    }

    public Boolean getRegional() {
        return this.regional;
    }

    public void setRegional(Boolean regional) {
        this.regional = regional;
    }

    public Boolean isWorldwide() {
        return this.worldwide;
    }

    public Boolean getWorldwide() {
        return this.worldwide;
    }

    public void setWorldwide(Boolean worldwide) {
        this.worldwide = worldwide;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public User getPoster() {
        return this.poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public List<User> getBidders() {
        return this.bidders;
    }

    public void setBidders(List<User> bidders) {
        this.bidders = bidders;
    }

    public User getCompleter() {
        return this.completer;
    }

    public void setCompleter(User completer) {
        this.completer = completer;
    }

    public Date getCompletionDate() {
        return this.completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
