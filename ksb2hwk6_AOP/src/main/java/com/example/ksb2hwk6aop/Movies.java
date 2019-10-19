package com.example.ksb2hwk6aop;


public class Movies {

    long id;
    String name;
    int year;
    String producer;

    public Movies() {
    }

    public Movies(long id, String name, int year, String producer) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.producer = producer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", producer='" + producer + '\'' +
                '}';
    }
}
