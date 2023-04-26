//package org.redfx.javaqc.ch02.hellostrange;

import org.redfx.strange.algorithm.Classic;

public class Main {

    public static void main (String[] args) {
        System.out.println("Using high-level Strange API to generate random bits");
        System.out.println("----------------------------------------------------");
      
        int numBits = 16;
        StringBuffer bitPattern = new StringBuffer();
        for (int i = 0; i < numBits; i++) {
        	if (Classic.randomBit() > 0) {
        		bitPattern.append("1");
        	}
        	else {
        		bitPattern.append("0");
        	}
        }
        int value = Integer.parseInt(bitPattern.toString(), 2);
        System.out.println("Generated "+numBits+" bits, and "+value+" was the result in decimal.");
        System.out.printf("%x", value);
    }
}
