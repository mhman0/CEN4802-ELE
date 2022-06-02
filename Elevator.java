

import java.util.Scanner;

public class Elevator {
  public static void main(String[] args){
      Elevator e = new Elevator();
      e.ask();
    }
    
    //variables
    Scanner intel = new Scanner(System.in);
    final int maxFloor = 5;
    final int minFloor = 1;
    int curFloor=1;
    int desFloor=0;
    
    //functions
    void display(Object o){
      System.out.println(o);
    }
    void ask(Object o) {
      System.out.print(o);
    }
    void delay(int ms) {
      try{
        Thread.sleep(ms);
      } catch (Exception e) {}
    }
    void goUp() {
      while (curFloor++ < desFloor) {display("Going Up ... Current Floor: "+ curFloor +" | To: " + desFloor);
      delay(600);
      }
      curFloor --;
    }
    void goDown() {
      while(curFloor -- > desFloor) {
        display("Going Down... Current Floor"+ curFloor +" | To: " + desFloor);
        delay(600);
      }
      curFloor++;
    }
  void ask() {
    ask("Current Floor: "+ curFloor +" | Enter desired floor (1, 2, 3, 4, 5): ");
      desFloor = intel.nextInt();
      if(desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor) {
        display("Error. Current Floor is: "+ curFloor);
        ask();
        } else {
            display("closing door...");
            delay(600);
            if(desFloor <curFloor) {
                goDown();
            } else if (desFloor > curFloor) {
                goUp();
            }
        }
        display("door opening... Welcome to Floor "+ curFloor);
        ask();
      }
  }