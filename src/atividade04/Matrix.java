package atividade04;

public class Matrix {

    private double[][] cells;

    Matrix(double[][] cells) {
        this.cells = new double[cells.length][cells[0].length];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {

                this.cells[i][j] = cells[i][j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                a.append(this.cells[i][j]).append(" ");
            }
            a.append("\n");
        }
        return a.toString();
    }

    public double[][] toArray() {
        double[][] result = new double[this.getRows()][this.getColumns()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.cells[i][j];
            }
        }

        return result;
    }

    public int getRows() {

        return this.cells.length;

    }

    public int getColumns() {

        return this.cells[0].length;

    }

    public double getAt(int i, int j) {
        return this.cells[i][j];
    }

    public Matrix plus(Matrix m) {
        double[][] result = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.cells[i][j] + m.getAt(i, j);
            }
        }
        return (new Matrix(result));
    }

    public Matrix minus(Matrix m) {

        double[][] result = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.cells[i][j] - m.getAt(i, j);
            }
        }
        return (new Matrix(result));

    }

    public Matrix times(Matrix m) {

        double[][] result = new double[this.getRows()][m.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < m.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    result[i][j] += this.cells[i][k] * m.getAt(k, j);
                }
            }
        }
        return new Matrix(result);
    }

    public Matrix times(double e) {

        double[][] result = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[i][j] = this.cells[i][j] * e;
            }
        }
        return (new Matrix(result));

    }

    public Matrix getTranspose() {

        double[][] result = new double[this.getColumns()][this.getRows()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result[j][i] = this.cells[i][j];
            }
        }
        return (new Matrix(result));

    }

    public boolean isSquare() {
        if (this.getColumns() == this.getRows()) {

            return true;

        } else {
            return false;
        }

    }

    public boolean isSymmetric() {
        if (!this.isSquare()) {
            return false;
        }

        int size = this.getRows();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.cells[i][j] != this.cells[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
