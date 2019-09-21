import java.util.Arrays;

class Main {
  public static void main(String[] args) {
      OrderChecker checker = new OrderChecker();
      ArrayTest myTest = new ArrayTest();   
      int[] myArray = new int[15];
      int arraySize = myArray.length;

      System.out.println("\n\n\t\t\t\t\t\t𝓐𝓼𝓬𝓮𝓷𝓭𝓲𝓷𝓰  / 𝓓𝓮𝓼𝓬𝓮𝓷𝓭𝓲𝓷𝓰 𝓐𝓻𝓻𝓪𝔂 ?\n\n");
      myTest.arrayTestFunction(myArray);
      if(arraySize == 0){
        System.out.println("Empty array!");
        return;
      }    
      if(checker.isAscending(myArray)) {
        System.out.println("Array " + Arrays.toString(myArray) + " is in ascending order\n");
      } else {
        System.out.println("Array " +  Arrays.toString(myArray) + " is NOT in ascending order\n");
      }
      if(checker.isDescending(myArray)) {
        System.out.println("Array " +  Arrays.toString(myArray) + " is in descending order\n");
      } else {
        System.out.println("Array " +  Arrays.toString(myArray) + " is NOT in descending order\n");
      }
  }
}

class OrderChecker {
  public boolean isAscending(int myArray[]) {
    boolean ascendingList = true;
    for(int i = 0; i < myArray.length - 1; ++i) {     
      if(myArray[i] > myArray[i + 1]) {
        ascendingList = false;
      }  
    } 
    return ascendingList;
  }

  public boolean isDescending(int myArray[]) {
    boolean descendingList = true;
    for(int i = 0; i < myArray.length - 1; ++i) {
      if(myArray[i] < myArray[i + 1]) {
        descendingList = false;
      }
    }
    return descendingList;
  }
}

class ArrayTest {
  public void arrayTestFunction (int myArray[]) {
      // RANDOM ORDER TEST
      for(int i = 0; i < myArray.length; ++i)
      {
        myArray[i] = (int) (Math.random() * 100);
      }

      //ASCENDING ORDER TEST 
      // for(int i = myArray.length - 1; i > 0; --i) {
      //   myArray[i] = i;
      // }

      // DESCENDING ORDER TEST
      // int index = 0;
      // for(int i = myArray.length - 1; i > 0; --i) {
      //   myArray[index] = i;
      //   index++;
      // }
  }

}
