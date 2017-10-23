package com.company;

public class GamePiece {

    int posX;
    int posY;
    boolean frozen;
    String pieceName;

    public GamePiece(int x, int y, String pieceName) {
        this.posX = x;
        this.posY = y;
        this.frozen = false;
        this.pieceName = pieceName;
    }
    public void move() {
        if(!this.frozen){
            this.posX += 1;
            this.posY += 1;
        }
    }
    public void freeze() {
        this.frozen = !this.frozen;
    }


}
