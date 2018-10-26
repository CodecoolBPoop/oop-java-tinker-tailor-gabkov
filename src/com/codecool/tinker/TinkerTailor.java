package com.codecool.tinker;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {
    
    private int kSeq;
    private int N;
    
    private List<Integer> nums = new ArrayList<>();
    private List<Integer> outPut = new ArrayList<>();

    TinkerTailor(int n, int k){
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        kSeq = k;
        N = n;
        tinkerTailor(nums, outPut);
    }

    private void tinkerTailor(List<Integer> numbers, List<Integer> out){

        if(out.size() == N){
            System.out.println(out);
        } else {
            for (int j = 1; j < kSeq; j++) {
                numbers.add(numbers.get(0));
                numbers.remove(0);
            }
            out.add(numbers.get(0));
            numbers.remove(0);

            tinkerTailor(numbers, out);
        }
    }

    public static void main(String[] args) {
        TinkerTailor test = new TinkerTailor(10, 7);
        TinkerTailor test3 = new TinkerTailor(5, 3);
        TinkerTailor test1 = new TinkerTailor(10, 3);
        TinkerTailor test2 = new TinkerTailor(10, 4);
    }
}
