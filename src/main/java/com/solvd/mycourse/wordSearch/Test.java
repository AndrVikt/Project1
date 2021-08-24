package com.solvd.mycourse.wordSearch;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String args[])throws IOException {
        File writeFile = new File("src/main/resources/writeFile.txt");
        File readFile = new File("src/main/resources/readFile.txt");

        Scanner scan = new Scanner(readFile);
        writeFile.createNewFile();

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;

        FileWriter writer = new FileWriter(writeFile);


        writer.write("The Building Company sources,\n distributes, \nwholesales & retails general &\n specialised building materials.\n");
        writer.flush();
        writer.close();


        FileReader fr = new FileReader(readFile);
        char [] a = new char[900];
        fr.read(a);

        for(char c : a)
            System.out.print(c);
        fr.close();
    }
}

}
