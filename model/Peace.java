package model;

public class Peace {
    private boolean isKing;
    private String color;

    public Peace(String color) {
        this.color = color;
    }

    public void setIsKing(boolean isKing) {
        this.isKing = isKing;
    }

    public boolean getIsKing() {
        return isKing;
    }

    public String getColor() {
        return color;
    }
}