package com.springhow.examples.springboot.springbootbannerexample;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
        String hello_world = AnsiOutput.toString(AnsiColor.GREEN, "Hello World", AnsiColor.DEFAULT,
                AnsiStyle.FAINT);
        PrintStream printStream = new PrintStream(System.out);
        printStream.println(AnsiOutput.toString(AnsiColor.GREEN, "Hello World", AnsiColor.DEFAULT,
                AnsiStyle.FAINT));
    }
}
