package Hippodrom;

public class Horse {
    private String name;
    private double speed;
    private double distance;
    
    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    
    public void move(){
        distance += speed * Math.random();
    }
    
    public void print(){
        //String s = String.format(".{%d}", (int)distance);
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<(int)distance; i++) s.append(".");
        System.out.println(s + name);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public double getSpeed(){
        return speed;
    }
    
    public void setSpeed(double speed){
        this.speed = speed;
    }
    
    
    public double getDistance(){
        return distance;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }
}
