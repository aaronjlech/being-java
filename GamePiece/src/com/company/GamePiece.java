package com.company;

public class GamePiece {

    int posX;
    int posY;
    boolean frozen;
    char pieceVal;

    public GamePiece(int x, int y, char pieceVal) {
        this.posX = x;
        this.posY = y;
        this.frozen = false;
        this.pieceVal = pieceVal;
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
