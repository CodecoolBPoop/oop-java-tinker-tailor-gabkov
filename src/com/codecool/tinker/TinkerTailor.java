package com.codecool.tinker;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {
    
    private int kSeq;
    private int N;
    
    private List<Integer> nums = new ArrayList<>();
    private List<Boolean> used = new ArrayList<>();
    private List<Integer> outPut = new ArrayList<>();


    TinkerTailor(int n, int k){
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            used.add(false);
        }
        kSeq = k;
        N = n;
        tinkerTailor(nums, k, outPut);
    }


    public void tinkerTailor(List<Integer> numbers, int i, List<Integer> out){

        if(out.size() == N){
            System.out.println(out);
            return;
        } else {
            out.add(numbers.get(i-1));
            numbers.remove(i-1);
            //System.out.println("out: " + out);

            for (int j = 0; j < i-1; j++) {
                numbers.add(numbers.get(j));
                //System.out.println("ADD numbers: " + numbers);
            }

            for (int j = 0; j < i-1; j++) {
                numbers.remove(0);
                //System.out.println("REM numbers: " + numbers);

            }
            //System.out.println();

            if(kSeq > numbers.size()){
                int shift = kSeq-numbers.size();
                for (int j = 0; j <= shift; j++) {
                    numbers.add(numbers.get(j));
                    //System.out.println("ADD numbers2: " + numbers);
                }
            }
            i = kSeq;
            tinkerTailor(numbers, i, out);
        }
    }
    
    public static void main(String[] args) {
        TinkerTailor test = new TinkerTailor(10, 3);
    }
}
