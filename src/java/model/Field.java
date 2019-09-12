package model;

public class Field {

    TypeOfCell[][] field;
    int size;

    public Field(int size) {
        field = new TypeOfCell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = TypeOfCell.EMPTY;
            }
        }
    }

    public void setCell(int x, int y, TypeOfCell isBlack) {
            field[y][x] = isBlack;
    }

    public TypeOfCell[][] getField() {
        return field;
    }

    public TypeOfCell getCell(int x, int y) {
        return field[y][x];
    }
}
