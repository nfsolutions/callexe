package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exec {
    public static void main(String args[]) {
        try {
            Process process = new ProcessBuilder("C:\\Users\\nydi\\source\\repos\\OutputStream\\OutputStream\\bin\\Release\\net5.0\\OutputStream.exe").start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;

            System.out.printf("Output of running %s is:", Arrays.toString(args));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            /*Process p = new ProcessBuilder("C:\\Users\\nydi\\source\\repos\\OutputStream\\OutputStream\\bin\\Release\\net5.0\\OutputStream.exe").start();
            String line;
            BufferedReader bri = new BufferedReader (new InputStreamReader(p.getInputStream()));
            BufferedReader bre = new BufferedReader (new InputStreamReader(p.getErrorStream()));
            while ((line = bri.readLine()) != null) {
                System.out.println(line);
            }
            bri.close();
            while ((line = bre.readLine()) != null) {
                System.out.println(line);
            }
            bre.close();
            p.waitFor();
            System.out.println("Done.");*/
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}