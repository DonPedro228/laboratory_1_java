package main_4;

public class CountSymbol {
    private char symbol;
    private int count;

    public CountSymbol() {
        this.symbol = '\0';
        this.count = 0;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getCount() {
        return count;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementCount() {
        this.count++;
    }

    public static void countSymbols(String text, CountSymbol[] symbols, int[] uniqueCount) {
        for (char ch : text.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < uniqueCount[0]; i++) {
                if (symbols[i].getSymbol() == ch) {
                    symbols[i].incrementCount();
                    found = true;
                    break;
                }
            }
            if (!found) {
                symbols[uniqueCount[0]].setSymbol(ch);
                symbols[uniqueCount[0]].setCount(1);
                uniqueCount[0]++;
            }
        }
    }

    public static void displayCount(CountSymbol[] symbols, int uniqueCount) {
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("Symbol: " + symbols[i].getSymbol() + " : Count: " + symbols[i].getCount());
        }
    }
}

