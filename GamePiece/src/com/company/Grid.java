package com.company;

import java.util.ArrayList;

public class Grid {
    int height;
    int width;
    ArrayList<ArrayList<String>> board;

    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
//        this.board =
    }
    private ArrayList<ArrayList<String>> makeGrid() {
        for(int y = 0; y < this.height; y++) {
            this.board = new ArrayList<>();
            this.board[y] = new <ArrayList<String>;

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
