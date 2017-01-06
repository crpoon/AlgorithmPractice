package com.crpoon.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        StringBuilder sb = new StringBuilder();
            String hour = time.substring(0,2);
            if (time.charAt(8) == 'P' && !hour.equals("12")) {
                sb.append(Integer.parseInt(hour) + 12);
            } else if (time.charAt(8) == 'A' && hour.equals("12")) {
                sb.append("00");
            } else {
                sb.append(hour);
            }
            sb.append(time.substring(2,8));
            System.out.println(sb.toString());
        
    }
}
