package model;

public class Game {

    Field field;
    int size;

    public Game(int size) {
        this.size = size;
        field = new Field(size);
        field.setCell(size/2, size/2, TypeOfCell.BLACK);
        field.setCell(size/2, size/2 - 1, TypeOfCell.WHITE);
        field.setCell(size/2 - 1, size/2, TypeOfCell.WHITE);
        field.setCell(size/2 - 1, size/2 - 1, TypeOfCell.BLACK);
    }

    public Field getField() {
        return field;
    }

    public Boolean setCell(int x, int y, boolean isBlack) {
    if(field.getCell(x,y) != TypeOfCell.EMPTY) {
        return false;
    }
    TypeOfCell cell;
    if (isBlack) {
        cell = TypeOfCell.BLACK;
    } else {
        cell = TypeOfCell.WHITE;
    }
    checkHoriz(x, y, cell);
    checkDiag(x, y, cell);
    checkVert(x, y, cell);
    return true;
    }

    public void checkHoriz(int x, int y, TypeOfCell cell) {
        for (int i = x; i < size; i++) {
            if(field.getCell(i, y) == cell) {
                for (int j = x; j <= i; j++) {
                    field.setCell(j, y, cell);
                }
                break;
            }
        }
        for (int i = 0; i < x; i++) {
            if(field.getCell(i, y) == cell) {
                for (int j = i; j <= x; j++) {
                    field.setCell(j, y, cell);
                }
                break;
            }
        }
    }

    public void checkVert(int x, int y, TypeOfCell cell) {
        for (int i = y; i < size; i++) {
            if (field.getCell(x, i) == cell) {
                for (int j = y; j < i; j++) {
                    field.setCell(x, j, cell);
                }
                break;
            }
        }
        for (int i = 0; i < y; i++) {
            if(field.getCell(x, i) == cell) {
                for (int j = 0; j < i; j++) {
                    field.setCell(x, j, cell);
                }
                break;
            }
        }
    }

    public void checkDiag(int x, int y, TypeOfCell cell) {

    }

}
