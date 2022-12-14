#Jogo

import javax.swing.JOptionPane;
import java.util.Scanner;

public class JogoDaVelha {
    static Scanner scan = new Scanner(System.in);
    static String[][] jogoDaVelha = new String[3][3];
    static int i = 0, j = 0;
    static int Jogadas = 0, Jogador = 0;
    static boolean[][] O = new boolean[3][3];
    static boolean[][] X = new boolean[3][3];

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, " O JOGO COMEÇOU ");
        desenhoInicial();
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                jogoDaVelha[i][j] = "   ";
            }
        }
        jogoDaVelha[0][1] = " X ";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                X[i][j] = true;
                O[i][j] = true;
                jogoDaVelha[i][j] = "   ";
            }
        }
        while (X(X) == false & O(O) == false & Jogadas < 9) {
            i = Integer.parseInt(JOptionPane.showInputDialog("\nDIGITE A COLUNA: "));
            j = Integer.parseInt(JOptionPane.showInputDialog("\nDIGITE A LINHA: "));
            if (i >= 0 & i <= 2 & j >= 0 & j <= 2) {
                Jogadas++;
                if (Jogador % 2 == 0) {
                    if (X[i][j] == false || O[i][j] == false) {
                        JOptionPane.showMessageDialog(null, "POSIÇÃO JÁ PREENCHIDA OU FORA DOS PARÂMETROS");
                    } else {
                        Jogador++;
                        jogoDaVelha[i][j] = "X";
                        X[i][j] = false;
                        imprimi(jogoDaVelha);
                    }
                } else {
                    if (X[i][j] == false || O[i][j] == false) {
                        JOptionPane.showMessageDialog(null, "POSIÇÃO JÁ PREENCHIDA OU FORA DOS PARÂMETROS");
                    } else {
                        Jogador++;
                        jogoDaVelha[i][j] = "O";
                        O[i][j] = false;
                        imprimi(jogoDaVelha);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "POSIÇÃO JÁ PREENCHIDA OU FORA DOS PARÂMETROS");
            }
        }
        if (X(X) == true) {
            JOptionPane.showMessageDialog(null, "X GANHOU!!");
        } else if (O(O) == true) {
            JOptionPane.showMessageDialog(null, "O GANHOU!!");
        } else {
            JOptionPane.showMessageDialog(null, "VELHA (EMPATE)");
        }
    }

    public static void desenhoInicial() {
        JOptionPane.showMessageDialog(null,"ESTE É O DESENHO INCIAL DO JOGO\n    0   1  2\n0 |   |   |   |\n1 |   |   |   |\n2 |   |   |   |\n");
    }

    public static void imprimi(String[][] jogoDaVelha) {
        JOptionPane.showMessageDialog(null,
                "\n    0   1   2  \n-------------\n" + "0 |" + jogoDaVelha[0][0] + "|" + jogoDaVelha[1][0] + "|"+ jogoDaVelha[2][0] + "|" + "\n1 |" + jogoDaVelha[0][1] + "|" + jogoDaVelha[1][1] + "|"+ jogoDaVelha[2][1] + "|" + "\n2 |" + jogoDaVelha[0][2] + "|" + jogoDaVelha[1][2] + "|"+ jogoDaVelha[2][2] + "|" + "\n  -------------");
    }

    public static boolean X(boolean[][] X) {
        if (X[0][0] == false & X[1][1] == false & X[2][2] == false) {
            return true;
        }
        if (X[2][0] == false & X[1][1] == false & X[0][2] == false) {
            return true;
        }
        if (X[0][0] == false & X[0][1] == false & X[0][2] == false) {
            return true;
        }
        if (X[1][0] == false & X[1][1] == false & X[1][2] == false) {
            return true;
        }
        if (X[2][0] == false & X[2][1] == false & X[2][2] == false) {
            return true;
        }
        if (X[0][0] == false & X[1][1] == false & X[2][2] == false) {
            return true;
        }
        if (X[0][0] == false & X[1][0] == false & X[2][0] == false) {
            return true;
        }
        if (X[0][1] == false & X[1][1] == false & X[2][1] == false) {
            return true;
        }
        if (X[0][2] == false & X[1][2] == false & X[2][2] == false) {
            return true;
        } else
            return false;
    }

    public static boolean O(boolean[][] O) {
        if (O[0][0] == false & O[1][1] == false & O[2][2] == false) {
            return true;
        }
        if (O[2][0] == false & O[1][1] == false & O[0][2] == false) {
            return true;
        }
        if (O[0][0] == false & O[0][1] == false & O[0][2] == false) {
            return true;
        }
        if (O[1][0] == false & O[1][1] == false & O[1][2] == false) {
            return true;
        }
        if (O[2][0] == false & O[2][1] == false & O[2][2] == false) {
            return true;
        }
        if (O[0][0] == false & O[1][1] == false & O[2][2] == false) {
            return true;
        }
        if (O[0][0] == false & O[1][0] == false & O[2][0] == false) {
            return true;
        }
        if (O[0][1] == false & O[1][1] == false & O[2][1] == false) {
            return true;
        }
        if (O[0][2] == false & O[1][2] == false & O[2][2] == false) {
            return true;
        } else
            return false;
    }
}
