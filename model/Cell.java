package model;

public class Cell {
    private Peace peace;
    final int x;
    final int y;
    final String color;

    public Cell() {

    }

    public Cell(Peace peace) {
        this.peace = peace;
    }

    public void setPeace(Peace peace) {
        this.peace = peace;
    }

    public Peace getPeace() {
        return peace;
    }

    public void removePeace() {
        this.peace = null;
        
    }


}