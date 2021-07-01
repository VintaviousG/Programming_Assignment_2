import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {
        //User input for car

        String CarsFile = "/Users/vintaviousgilbert/Desktop/DataStructuresClass/Assignment 2/cars.csv";

        Scanner scan = new Scanner(System.in);
        printMenu();

        int  userChoice = scan.nextInt();
        String Model = scan.nextLine();

        ArrayList<String> carList = new ArrayList<>();
        Car car = new Car();

        while (true) {

            try {
                BufferedReader  br = new BufferedReader(new FileReader(CarsFile));

                String line;
                //Step: 1
                while ((line = br.readLine()) != null) {

                carList.add(br.readLine());


                }

            } catch (IOException e) {
                e.printStackTrace();

            }

            if (userChoice == 1){

                ListAllCars(CarsFile);
                System.out.println("Which car would you like information on");
                readFile(CarsFile, Model);

                break;


            } else if (userChoice == 2 ) {

                System.out.println("Enter in car, for information ");

                readFile(CarsFile, Model);
                long startTime = System.nanoTime();
                long estimatedTime = System.nanoTime() - startTime;
                System.out.println(estimatedTime);
                break;

            } else if (userChoice == 3){
                // Quit program
                System.out.println("Thanks for playing");
                System.exit(0);
                break;

            }else{
                System.out.println("Must have been an Error");

            }

        }

        System.out.println(Task2Exercise.givenList_shouldReturnARandomElement());

    }


    static void printMenu(){
        System.out.println("Enter 1 for all cars ");
        System.out.println("Enter 2 for Linear Search ");
        System.out.println("Enter 3 to quit program ");

    }

       static void readFile(String file, String CarModel) {

       Scanner sc = new Scanner(System.in);
        CarModel = sc.nextLine();

        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {


                String[] str = line.split(cvsSplitBy);

                 String name = str[9];


                if(name.equals(CarModel) ){

                    System.out.println(" City mpg: " + str[0] );
                    System.out.println(" Classification: " + str[1] );
                    System.out.println(" Driveline: " + str[2] );
                    System.out.println(" Engine Type: " + str[3] );
                    System.out.println(" Fuel Type: " + str[4] );
                    System.out.println(" Height: " + str[5] );
                    System.out.println(" Highway mpg: " + str[6] );
                    System.out.println(" Horsepower: " + str[7] );
                    System.out.println(" Hybrid: " + str[8] );
                    System.out.println(" ID: " + str[9] );
                    System.out.println(" Length: " + str[10] );
                    System.out.println(" Make: " + str[11] );
                    System.out.println(" Model Year: " + str[12] );
                    System.out.println(" Number of Forward Gears: " + str[13]);
                    System.out.println(" Torque: " + str[14] );
                    System.out.println(" Transmission: " + str[15]);
                    System.out.println(" Width: " + str[16] );
                    System.out.println(" Year: " + str[17]);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }





     static void ListAllCars(String path){

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line;
            while ((line = br.readLine()) != null) {

                String[] row = line.split(",");

                System.out.println("Here are all the cars available: " + row[9] );

            }

        } catch (Exception e){
            e.printStackTrace();
        }
   }
}
