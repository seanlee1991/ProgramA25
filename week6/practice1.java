package week6;
import java.util.Arrays;
public class practice1 {
    public static void main(String[] args) {
        
                 int [ ] arrayA = {5,3,4,1,2}; 
               Arrays.sort(arrayA); 
        
               for (int i = 0; i < arrayA.length; i++) { 
                    System.out.println(arrayA[i]); 
               } 
           
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* 
        int [] arrayA = {1,2};
        int [] arrayB = new int[2];

        //copy without additional classes
        for (int i = 0; i < arrayB.length; i++) {

            arrayB[i] = arrayA[i];

            
            
        }

        arrayA[0] = 10;

       
        
        for (int i = 0; i < arrayB.length; i++) {

            System.out.println("Array A: " +arrayA[i]);
            System.out.println("Array B: " +arrayB[i]);
            
        }

        //Copy array using Array class
        int [] arrayC = Arrays.copyOf(arrayA, 5);

        for (int i = 0; i < arrayC.length; i++) {

            System.out.println("Array C: " +arrayC[i]);
            
            
        }
        */
        
        // int [] numbers = {10,20,30,50};
        // numbers [0] = 12;
        // for (int i=0; i < numbers.length; i++) {
        //     System.out.println(numbers [i]);
        // }



        /*Scanner input = new Scanner(System.in);

        int [] age = new int[5];
    
        for ( int i =0; i< 5; i++) {
            System.out.println("Enter your age: ");
            age[i] = input.nextInt();
        }

        //sort age small to big
        Arrays.sort(age);
        System.out.println("Sorted ages are: ");
        for ( int i= 0;i<5;i++){
            System.out.println(age[i]);
        }

        //Search for an age
        int ageToSearch = 25;
        int returnIndex = Arrays.binarySearch(age, ageToSearch);

        System.out.println("Index of search age " + ageToSearch + ": " + returnIndex); */

        /*ArrayList <Integer> ages = new ArrayList<Integer>();
        ages.add(19);
        ages.add(23);
        ages.add(58);
        ages.add(0, 9);

        for (int i =0; i < ages.size(); i++) {
            System.out.printf("Age at index %d: %d\n", i, ages.get(i)); //same as  arrayName[i]
        } */

        // int [] [] arrayA = {{1,2,3,4}, {11,12,13,15}};
        // arrayA[0][3] = 22;

        // System.out.println(arrayA[0][3]);

        // int [][] arrayA = {{1,2,3,4}, {11,12,13,15}};
        // for (int i = 0; i < arrayA.length; i++) {
        //     for (int j = 0; j < arrayA[i].length; j++) {
        //         System.out.println(arrayA[i][j]);

                
        //     }
            
            
        // }



    

    }
}
