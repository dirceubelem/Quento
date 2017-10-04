package br.com.cotemig.quento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 19/09/2017.
 */

public class Match {

    private int totalNumbers;
    private int total;
    private int[] numbers;

    public Match(int totalNumbers, int total, int... numbers) {
        this.totalNumbers = totalNumbers;
        this.total = total;
        this.numbers = numbers;
    }

    public int getTotalNumbers() {
        return totalNumbers;
    }

    public void setTotalNumbers(int totalNumbers) {
        this.totalNumbers = totalNumbers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public static List<Match> createListMatch() {
        List<Match> l = new ArrayList<>();

        l.add(new Match(2, 9, 5, 4, 3, 2));
        l.add(new Match(3, 9, 5, 4, 3, 1));
        l.add(new Match(4, 9, 5, 4, 1, 1));
        l.add(new Match(3, 10, 5, 4, 1, 1));
        l.add(new Match(4, 11, 5, 4, 1, 1));

        return l;
    }
}
