//import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.*;
public class Prompt
{
     private static final Scanner in = new Scanner(System.in);
     //
     // Reads console input and checks if it is the correct type (int)
     //
     public static int getInt(String prompt)
     {
          //
          // Loop until a valid entry is received
          //
          while(true)
          {
               // 
               // Get input
               //
               System.out.println(prompt);
               
               //
               // Check if it is an integer
               //
               if(Prompt.in.hasNextInt())
               {
                    // Integer inputed, return result
                    int answer = Prompt.in.nextInt();
                    Prompt.in.nextLine();
                    return answer;
               }
               else
               {
                    // Invalid data type entered
                    String input = Prompt.in.nextLine();
                    System.out.println("Error:" + input + " is not an integer.");
               }
          }
     }
     //String prompt
     public static String getString(String prompt)
     {
          //
          // Loop until a valid entry is received
          //
          while(true)
          {
               // 
               // Get input
               //
               System.out.println(prompt);
               
               //
               // Check if it is an integer
               //
               if(Prompt.in.hasNext())
               {
                    // Integer inputed, return result
                    String answer = Prompt.in.nextLine();
                    return answer;
               }
               else
               {
                    // Invalid data type entered
                    String input = Prompt.in.nextLine();
                    System.out.println("Error:" + input + " is not a String");
               }
          }
     }

     //Enter a int between the lowest and highest (including)
     public static int getInt(String prompt, int lowest, int highest )
     {
    	 //
         // Loop until a valid entry is received
         //
         while(true)
         {
              // 
              // Get input
              //
              System.out.println(prompt);
              
              //
              // Check if it is an integer
              //
              if(Prompt.in.hasNextInt())
              {
            	  int number = Prompt.in.nextInt();
            	  if(number >= lowest && number <= highest) {
                   // Integer inputed, return result
                   int answer = number;
                   Prompt.in.nextLine();
                   return answer;
            	  }
            	  else {
            		  String input = Prompt.in.nextLine();
                      System.out.println("Error:" + input + " is not between the range of: " + lowest + " and " + highest);
            	  }
              }
              else
              {
                   // Invalid data type entered
                   String input = Prompt.in.nextLine();
                   System.out.println("Error:" + input + " is not an integer.");
              }
         }

     }
     public static int getInt(String prompt, int lowest, int highest, int exit )
     {
    	 //
         // Loop until a valid entry is received
         //
         while(true)
         {
              // 
              // Get input
              //
              System.out.println(prompt);
              
              //
              // Check if it is an integer
              //
              if(Prompt.in.hasNextInt())
              {
            	  int number = Prompt.in.nextInt();
            	  if(number == exit) {
            		  System.out.println("program exited");
            		  System.exit(0);
            	  }
            	  if(number >= lowest && number <= highest) {
                   // Integer inputed, return result
                   int answer = number;
                   Prompt.in.nextLine();
                   return answer;
            	  }
            	  else {
            		  String input = Prompt.in.nextLine();
                      System.out.println("Error:" + input + " is not between the range of: " + lowest + " and " + highest);
            	  }
              }
              else
              {
                   // Invalid data type entered
                   String input = Prompt.in.nextLine();
                   System.out.println("Error:" + input + " is not an integer.");
              }
         }

     }
     //enter a float 
     public static float getFloat(String prompt)
     {
          //
          // Loop until a valid entry is received
          //
          while(true)
          {
               // 
               // Get input
               //
               System.out.println(prompt);
               
               //
               // Check if it is an integer
               //
               if(Prompt.in.hasNextFloat())
               {
                    // Integer inputed, return result
                    float answer = Prompt.in.nextFloat();
                    Prompt.in.nextLine();
                    return answer;
               }
               else
               {
                    // Invalid data type entered
                    String input = Prompt.in.nextLine();
                    System.out.println("Error:" + input + " is not a float (number).");
               }
          }
     }
     //enter a float between lowest and highest (including)
     public static float getFloat(String prompt, float lowest, float highest )
     {
    	 //
         // Loop until a valid entry is received
         //
         while(true)
         {
              // 
              // Get input
              //
              System.out.println(prompt);
              
              //
              // Check if it is an integer
              //
              if(Prompt.in.hasNextFloat())
              {
            	  float number = Prompt.in.nextFloat();
            	  if(number >= lowest && number <= highest) {
                   // Integer inputed, return result
                   float answer = number;
                   Prompt.in.nextLine();
                   return answer;
            	  }
            	  else {
            		  
            		  String input = Prompt.in.nextLine();
                      System.out.println("Error:" + input + " is not between the range of: " + lowest + " and " + highest);
            	  }
              }
              else
              {
                   // Invalid data type entered
                   String input = Prompt.in.nextLine();
                   System.out.println("Error:" + input + " is not a float.");
              }
         }

     }
     
   //enter a double
     public static double getDouble(String prompt)
     {
          //
          // Loop until a valid entry is received
          //
          while(true)
          {
               // 
               // Get input
               //
               System.out.println(prompt);
               
               //
               // Check if it is an integer
               //
               if(Prompt.in.hasNextDouble())
               {
                    // Integer inputed, return result
                    double answer = Prompt.in.nextDouble();
                    Prompt.in.nextLine();
                    return answer;
               }
               else
               {
                    // Invalid data type entered
                    String input = Prompt.in.nextLine();
                    System.out.println("Error:" + input + " is not a double.");
               }
          }
     }
     //enter a double between lowest and highest (including)
     public static double getDouble(String prompt, double lowest, double highest )
     {
    	 //
         // Loop until a valid entry is received
         //
         while(true)
         {
              // 
              // Get input
              //
              System.out.println(prompt);
              
              //
              // Check if it is an integer
              //
              if(Prompt.in.hasNextDouble())
              {
            	  double number = Prompt.in.nextDouble();
            	  if(number >= lowest && number <= highest) {
                   // Integer inputed, return result
                   double answer = number;
                   Prompt.in.nextLine();
                   return answer;
            	  }
            	  else {
            		  
            		  String input = Prompt.in.nextLine();
                      System.out.println("Error:" + input + " is not between the range of: " + lowest + " and " + highest);
            	  }
              }
              else
              {
                   // Invalid data type entered
                   String input = Prompt.in.nextLine();
                   System.out.println("Error:" + input + " is not a double.");
              }
         }
         
         

     }
   //Helper method that creates a File Object by opening it for the user entered file name
     public static File getFile(String prompt)
     {
          //Keep trying till a valid filename is entered 
          while (true)
          {
               System.out.println(prompt); //prompt user to enter a file name
               String fileName = in.nextLine().trim();//read user input and trim off extra characters
               
               //Create the File object (open it) for the file entered
               File inputFile = new File(fileName);
               
               //Check if the file open was successful, create error message if not
               if (!inputFile.exists())
               {
                    System.out.println("Error: " + fileName + " does not exist.");
               }
               else if (inputFile.isDirectory())
               {
                    System.out.println("Error: " + fileName + " is a directory.");
               }
               else if (!inputFile.canRead())
               {
                    System.out.println("Error: " + fileName + " is not readable.");
               }
               else
               {
                    //File open was successful, return File object
                    return inputFile;
               } 
          }
     }
     
     //Create a scanner object connected to the opened file
     public static Scanner getInputScanner(String prompt)
     {
          //Error catching for the scanner object creation
          try
          {
               //Open the input file (getFile()) and construct a scanner 
               //Object connected to it
               return new Scanner(Prompt.getFile(prompt));
          }
          catch (FileNotFoundException ex) //error creating the scanner object
          {
               System.out.println(ex.getMessage());
               System.out.println("in" + System.getProperty("user.dir"));
               System.exit(1);
          }
          return null;
     }
     
     //Opens an output file
     //This action will overwrite the output file if it already exists
     public static PrintWriter getPrintWriter(String prompt)
     {
          System.out.println(prompt);  //Ask user to enter the output file name
          String fileName = in.nextLine().trim();  //Remove extra characters
          
          //Opens the output file
          File outputFile = new File(fileName);
          
          try
          {
               //constructs & returns a PrintWriter object connected to the output file 
               return new PrintWriter(outputFile);
          }
          catch (FileNotFoundException ex)
          {
               //Error occured inform user
               System.out.println(ex.getMessage());
               System.out.println("in" + System.getProperty("user.dir"));
               System.exit(1);
          }
          return null;
     }
     
   
     
     // Code to test class
     
     public static void main(String[] args) {
          
    	 
          int testInput = 0;
          float testInputf = 0;
          //testInputf = Prompt.getFloatRange("Enter a float between 1 and 5", 1, 5);
          //testInputf = Prompt.getFloat("Enter a float");
          //testInput = Prompt.getIntRange("Enter an integer between 1 and 5", 1, 5);
         // testInput = Prompt.getInt("Enter an integer");
         //System.out.printf("%d was input %n", testInput);
         // System.out.printf("%f was input %n", testInputf);
          
          
        
     }
}