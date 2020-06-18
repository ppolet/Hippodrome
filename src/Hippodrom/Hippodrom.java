/*
//// https://javarush.ru/quests/lectures/questmultithreading.level01.lecture16 
*/
package Hippodrom;

import java.util.ArrayList;
import java.util.List;

public class Hippodrom {
    private List<Horse> horses = new ArrayList<>();

    public static Hippodrom game;

    public List<Horse> getHorses() {
        return horses;
    }
    
    public Hippodrom(List<Horse> horses){
        this.horses = horses;
    }
    
    public void move(){
        for (int i = 0; i<horses.size(); i++){
            horses.get(i).move();
        }
    }
    
    public void print(){
        for(int i = 0; i<horses.size(); i++){
            horses.get(i).print();
        }
        for(int i = 1; i<=2; i++) System.out.println();
    }
    
    public void run() throws InterruptedException{
        for(int i = 1; i<=100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    
    public Horse getWinner(){
        int max = 0;
        for (int i = 0; i<horses.size(); i++){
            if (horses.get(i).getDistance() > horses.get(max).getDistance()) max = i;
        }
        return horses.get(max);
    }
    
    public void printWinner(){
        System.out.println("WINNER IS " + getWinner().getName());
    }
    
    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Horse1", 3, 0));
        horses.add(new Horse("Horse2", 3, 0));
        horses.add(new Horse("Horse3", 3, 0));
        
        game = new Hippodrom(horses);
        
        game.getHorses().add(new Horse("Horse4", 3, 0));
        
        try {
            game.run();
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        game.printWinner();
    }
}
