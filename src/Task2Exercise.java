import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Task2Exercise  {

    public static  String givenList_shouldReturnARandomElement() {
        String path = "/Users/vintaviousgilbert/Desktop/DataStructuresClass/Assignment 2/cars.csv";

      ArrayList<String> carList = new ArrayList<>();

        try {
              BufferedReader  br = new BufferedReader(new FileReader(path));

              while (br.ready()) {

                    carList.add(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Enter in 10, 50, 100, 200, 500, 700, or 1000.");
        Scanner scan = new Scanner(System.in);
        int UserInput = scan.nextInt();
        // Step:4
        System.out.println("Enter userInput number: " + UserInput);


            int randomIndex = (int) (Math.random() * UserInput);
        System.out.println("Random Index: " + randomIndex);

        String[] carArray = new String[randomIndex];
        carArray = carList.toArray(carArray);


        String randomListItem = carList.get(randomIndex);
        System.out.println( "Random vehicle from list: "  + randomListItem);


        long startTime = System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;

        return " Time taken: " +  estimatedTime;
    }




    public static <T extends Comparable<T>> int linearSearch(T[] data, int min, int max, T target) {

        for (int i = min; i <= max; i++) {
            if (data[i].compareTo(target) == 0) {
                return i;
            }
        }

        return -1;

    }


    public static <T extends Comparable<T>> int binarySearch(T[] data, int min, int max, T target) {

        while (min < max){
            int mid  = (min + max) / 2;
            int cmp = data[mid].compareTo(target);

            if (cmp < 0){
                min = mid + 1;
            } else if (cmp > 0){
                max = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }



}
