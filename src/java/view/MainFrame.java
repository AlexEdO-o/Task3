package view;

import model.TypeOfCell;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel panel;
    private JPanel[][] field;
    private int size;

    public MainFrame(int size) {
        this.size = size;
        this.panel = new JPanel();
        this.field = new JPanel[size][size];
        this.setContentPane(panel);
        panel.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field[i][j] = new JPanel();
                panel.add(field[i][j]);
                field[i][j].setBorder(new BevelBorder(1));
                field[i][j].setBackground(Color.GREEN);
            }
        }
        this.setSize(800, 800);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setField(TypeOfCell[][] field) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (field[i][j]) {
                    case BLACK: this.field[i][j].setBackground(Color.BLACK);
                    break;

                    case WHITE: this.field[i][j].setBackground(Color.WHITE);
                    break;

                    case EMPTY: this.field[i][j].setBackground(Color.GREEN);
                    break;
                }
            }
        }
    }
}
