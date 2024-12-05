package app.models;

import java.util.List;

public class Grid {
    private int rows;
    private int cols;
    private List<List<Integer>> initialOnes;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public List<List<Integer>> getInitialOnes() {
        return initialOnes;
    }

    public void setInitialOnes(List<List<Integer>> initialOnes) {
        this.initialOnes = initialOnes;
    }
}