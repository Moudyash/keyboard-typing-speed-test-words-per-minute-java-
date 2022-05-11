/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedy.test;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pc
 */
public class SpeedyTest {
  static String[] bwords = {"monster", "guest", "public", "fluffy", "apple",
        "lorem", "space", "pc", "index", "dog", "cat", "hello", " hammer",
        "want", "to", "the", "microphone", "your", "i","Thing", "Time", "people", "Day", "Man",
        "Woman", "Child","small","orange","work","laptop","phone","walking","we","are","runing","today"};
  
    public static void main(String[] args) throws InterruptedException {
     Random rand = new Random();
     Scanner in = new Scanner(System.in);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);//بخلي الكود يظهر بعد مدة معينة من الوقت
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
          for (int i = 0; i < 20; i++) {
            System.out.print(bwords[rand.nextInt(bwords.length)] + " ");
            }
        System.out.println();
        double start = LocalTime.now().toNanoOfDay();
        String type = in.nextLine();
        //end time  your time when end
        double end = LocalTime.now().toNanoOfDay();
        //total time end - start
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numofchars = type.length();
        double min = seconds / 60;
                int wpm = (int) ((((double) numofchars / 5) / seconds) * 60);
        System.out.println("Your WPM Is " + wpm + "!");
        System.out.println("socends= " + seconds + "!");
        System.out.println("minutes= " + min + "!");
    }
    
}