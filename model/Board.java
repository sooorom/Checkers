package model;

import java.util.List;

public class Board {
    public Cell[][] getCells() {
        return cells;
    }

    private Cell[][] cells = new Cell[8][8];
    private List<Peace> removedPeacesFirstPlayer;
    private List<Peace> removedPeacesSecondPlayer;

    public void init() {
        fill();
        setPeaces();
    }

    private void fill() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                String color = "black";

                if ((y + x) % 2 == 0) {
                    color = "white";
                }

                Cell cell = new Cell(x, y, color);
                cells[x][y] = cell;
            }
        }
    }

    private void setPeaces() {
        setPeacesFirstPlayer();
        setPeacesSecondPlayer();
    }

    private void setPeacesSecondPlayer() {
        for (int x = 0; x < 4; x++) {
            for (int y = 1; y < 8; y += 2) {
                Peace peace = new Peace("yellow");
                cells[x][y].setPeace(peace);
            }
        }
    }

    private void setPeacesFirstPlayer() {
        for (int x = 5; x < 8; x++) {
            for (int y = 0; y < 8; y += 2) {
                Peace peace = new Peace("blue");
                cells[x][y].setPeace(peace);
            }
        }
    }

    public void movePeace(int cellOfX, int cellOfY, int xTo, int yTo) {
        Cell cell = cells[cellOfX][cellOfY];
        Peace peace = cell.getPeace();
        cell.removePeace();

        cells[xTo][yTo].setPeace(peace);
    }

    public void removePeace(int x, int y) {
        Cell cell = cells[x][y];
        cell.removePeace();
    }
}