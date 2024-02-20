package com.zombie.apocalyse.resource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zombie.apocalyse.survivor.Survivor;
import jakarta.persistence.*;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean water;
    private boolean ammunition;
    private boolean  food;
    private boolean  medication;


//getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isAmmunition() {
        return ammunition;
    }

    public void setAmmunition(boolean ammunition) {
        this.ammunition = ammunition;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isMedication() {
        return medication;
    }

    public void setMedication(boolean medication) {
        this.medication = medication;
    }


// table relationships
    @JsonIgnore
    @ManyToOne
    private Survivor survivor;

    public Survivor getSurvivorsurvivor() {
        return survivor;
    }

    public void setSurvivor(Survivor survivor) {
        this.survivor = survivor;
    }





}
