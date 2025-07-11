package model.blocks;

import java.awt.*;

public abstract class Block {
    protected int row, col;
    protected boolean owned = false;
    protected String owner = null;

    public Block(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isOwned() {
        return owned;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owned = true;
        this.owner = owner;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public abstract String getType();

    public abstract Color getColor();

    public abstract boolean isBuildable();

    public abstract int getGoldGeneration();

    public abstract int getFoodGeneration();
}
