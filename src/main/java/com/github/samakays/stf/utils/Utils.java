package com.github.samakays.stf.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Utils {
    public String runCmd(String command) {
        Runtime rt = Runtime.getRuntime();
        final StringBuffer output = new StringBuffer();
        try {
            final Process p = rt.exec(command);

            new Thread(new Runnable() {
                public void run() {
                    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String line = null;
                    try {
                        while ((line = input.readLine()) != null) {
                            output.append(line + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
