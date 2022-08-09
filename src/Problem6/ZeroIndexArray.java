package Problem6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ZeroIndexArray {

    private ArrayList<Integer> numbers;

    public ZeroIndexArray(ArrayList<Integer> numbers) {
        this.numbers = new ArrayList<>();
    }


    public void PreIndex(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println("Numbers until given input: " + this.numbers.get(i));
        }
    }

    public void postIndex(int x) {
        for (int i = x; i >= 0; i++) {
            System.out.println("Numbers until given input: " + this.numbers.get(i));
        }
    }

    public void MaxNumber(ArrayList<Integer> A) {
        int MaximumNumber = Collections.max(this.numbers);
        System.out.println("Maximum Number: " + MaximumNumber);
    }

    public void difference(int x) {
        ArrayList<Integer> PreIndexArrayList = new ArrayList<>();


    }}

