package com.company;

public class Grid {
    int height;
    int width;


    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void printGrid() {
        for(int y = 0; y < this.height; y++) {

            for(int x = 0; x < this.width; x++) {

                if(y == 0 || y == this.height - 1) {
                    System.out.print("x");
                } else if(x == 0){
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println("x");
        }
    }
}
