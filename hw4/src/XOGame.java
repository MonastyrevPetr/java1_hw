import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class XOGame {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while ((true)) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выиграли");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("input coord x y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    static boolean aiAttack() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j]==DOT_EMPTY){
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        return true;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    static boolean aiDefend() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j]==DOT_EMPTY){
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j]=DOT_O;
                        return true;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    static void aiTurn() {
        int x;
        int y;
        if (!aiAttack()) {
            if(!aiDefend()){
                do {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                } while (!isCellValid(y, x));
                map[y][x] = DOT_O;
            }
        }
    }

    static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (verticalLine(c, i, j) || horizonLine(c, i, j) || diagonal1Line(c, i, j) || diagonal2Line(c, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean verticalLine(char c, int y, int x) {
        if (y + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = y; i < y + DOTS_TO_WIN; i++) {
            if (map[i][x] != c) {
                return false;
            }
        }
        return true;
    }

    static boolean horizonLine(char c, int y, int x) {
        if (x + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = x; i < x + DOTS_TO_WIN; i++) {
            if (map[y][i] != c) {
                return false;
            }
        }
        return true;
    }

    static boolean diagonal1Line(char c, int y, int x) {
        if (y + DOTS_TO_WIN > SIZE || x + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[y + i][x + i] != c) {
                return false;
            }
        }
        return true;
    }

    static boolean diagonal2Line(char c, int y, int x) {
        if (y - DOTS_TO_WIN+1 < 0 || x + DOTS_TO_WIN > SIZE) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[y - i][x + i] != c) {
                return false;
            }
        }
        return true;
    }
}
