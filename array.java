// declare an "Array"
String[] cars;



// assign values to an "Array"
// String "Array"
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};



// access element
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);



// change array element
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Tesla";
System.out.println(cars[0]);



// array length
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);


// fixed-sized array using "new" keyword
String[] cars = new String[5];
cars[0] = "Volvo";
cars[1] = "Tesla";
cars[2] = "Ford";
cars[3] = "Audi";
cars[4] = "BMW";
System.out.println(cars[0]);


// looping over an array – indexes and values
String[] cars = {"Volvo", "BMW", "Ford", "Mac"};
for(int i = 0; i < cars.length; i++){
   System.out.println(cars[i]);
}


// calculating sum
int[] numbers = {10, 5, 15, 15, 20, 30, 45};
int sum = 0;

for(int i = 0; i < numbers.length; i++){
   sum += numbers[i];
}
   System.out.println(sum);


// for each loop – for values only
String[] cars = {"Volvo", "BMW", "Ford", "Mac"};
for(String car : cars){
   System.out.println(car);
}


// calculate average
int[] ages = {10, 15, 20, 5, 10};
float avg = 0;
float sum = 0;

int length = ages.length;

for(int age : ages){
   sum += age;
}

avg = sum / length;
System.out.println("Average is :" + avg);


// calculate lowest age
   // find lowest age
   int[] ages = {10, 15, 20, 5, 10};

   // length of array
   int length = ages.length;

   // for lowest age and assign first element
   int lowestAge = ages[0];

   for(int age : ages){
      if (lowestAge > age);
      lowestAge = age;
   }
System.out.println(lowestAge);


// using break and continue with loop
// skip negative number and stop if value == 0
// skip negative number and stop loop if zero found
int[] numbers = {3, -1, 7, 0, 9};

for(int n : numbers){
   if (n < 0) {
      continue;
   }
   if (n == 0) {
      break;
   }
   System.out.println(n);
}


// find min and max number in an array
// min and max number
// min and max number
int[] numbers = {3, -1, 7, 0, 9};

int max = numbers[0];
int min = numbers[0];

for(int n : numbers){
   if (n > max) {
      max = n;
   }
   if (n < min) {
      min = n;
   }
}
System.out.println(max);
System.out.println(min);


// for loop for index and element control
// example - seat number and person sitting
String[] seats = {"A", "B", "C", "D", "E"};

for(int i = 0; i < seats.length; i++) {
   System.out.println(i + " " + seats[i]);
}


// declare multidimensional array
// multidimensional array
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };


// access elements
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
System.out.println(myNumbers[1][2]); 


// print multidimensional array
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };

for (int i = 0; i < myNumbers.length; i++) {
   for (int j = 0; j < myNumbers[i].length; j++) {
      System.out.print(myNumbers[i][j] + " ");
   }

   System.out.println();
}


// change element in 2D Array
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]);


// row and column (lengths) in 2D array
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

System.out.println("Rows: " + myNumbers.length);             // 2
System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
System.out.println("Cols in row 1: " + myNumbers[1].length); // 5


// loop through multidimensional array
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int row = 0; row < myNumbers.length; row++) {
   for (int col = 0; col < myNumbers[row].length; col++) {
      System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
   }
}


// for each loop
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNumbers) {
   for (int num : row) {
      System.out.println(num);
   }
}


// toString(arr) -- print array
int[] arr = {10, 20, 30, 40, 50};
System.out.println(Arrays.toString(arr));


// create ArrayList
   // Create an ArrayList to store fruits
   ArrayList<String> fruits = new ArrayList<>();

   // Add elements using the add() method
   fruits.add("Apple");
   fruits.add("Banana");
   fruits.add("Mango");

   // Print the ArrayList
   System.out.println("Fruits List: " + fruits);
}


// access element
ArrayList<String> fruits = new ArrayList<>();

// Add elements using the add() method
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");

// Print the ArrayList
System.out.println(fruits.get(0));


// update item/element
// Add initial values to the ArrayList
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(10);

// Update the second element (index 1)
numbers.set(1, 99);

// Print updated elements
System.out.println("Updated second element: " + numbers.get(1));


// update elements manually
// Step 1: Declare and initialize the ArrayList
ArrayList<Integer> marks = new ArrayList<>();
marks.add(48);

// Step 2: Update each element manually (split get and set)
int firstMark = marks.get(0);
firstMark = firstMark + 2;
marks.set(0, firstMark);

int secondMark = marks.get(1);
secondMark = secondMark + 2;
marks.set(1, secondMark);

int thirdMark = marks.get(2);
thirdMark = thirdMark + 2;
marks.set(2, thirdMark);

// Step 3: Print updated elements manually
System.out.println("Updated Marks:");
System.out.println(marks.get(0));
System.out.println(marks.get(1));
System.out.println(marks.get(2));


// ArrayList size method
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);

// Use the size() method to get ArrayList size
int listSize = numbers.size();

// Print the number of elements
System.out.println(listSize);


// iterating over loop
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);

// using a for loop
for (int i = 0; i < numbers.size(); i++) {
   System.out.println(i + ": " + numbers.get(i));


// taking array input as list
Scanner sc = new Scanner(System.in);

// Step 1: Declare an ArrayList
ArrayList<Integer> marks = new ArrayList<>();

// Step 2: Take input for each element
System.out.println("Enter marks of 5 students:");
for (int i = 0; i < 5; i++) {
   marks.add(sc.nextInt());
}

// Step 3: Print the entered marks
System.out.println("You entered:");
for (int i = 0; i < marks.size(); i++) {
   System.out.println("Student " + (i + 1) + ": " + marks.get(i));
}


// adding specific element at index
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add(1, "Mango");

System.out.println(fruits.get(0));
System.out.println(fruits.get(1));


// Close the scanner
sc.close();


// remove element
ArrayList<String> subjects = new ArrayList<>();
subjects.add("Math");
subjects.add("English");
subjects.add("Science");
subjects.remove(1);
System.out.println(subjects);
// Adding array and shifting to right
ArrayList<Integer> nums = new ArrayList<>(); nums.add(0, 10);
nums.add(1, 20); nums.add(1, 15); System.out.println(nums);


// check if element exists
// checking if element exists in the list
ArrayList<String> library = new ArrayList<>();
library.add("Harry Potter");
library.add("The Hobbit");
library.add("1984");
library.add("To Kill a Mockingbird");
// Check if books are available
boolean hasHobbit = library.contains("The Hobbit");
boolean hasGatsby = library.contains("The Great Gatsby");
// Print results
System.out.println("Is 'The Hobbit' available? " + hasHobbit);
System.out.println("Is 'The Great Gatsby' available? " + has-
Gatsby);


// example – fruits are in the basket
Scanner sc = new Scanner(System.in);
// Step 1: Take input for number of fruits in the basket
int n = sc.nextInt();
sc.nextLine(); // consume newline
// Step 2: Store basket fruits in ArrayList
ArrayList<String> fruits = new ArrayList<>();
for (int i = 0; i < n; i++) {
fruits.add(sc.nextLine());
}
// Step 3: Take number of favorite fruits to check
int m = sc.nextInt();
sc.nextLine(); // consume newline
// Step 4: Check each favorite fruit
for (int i = 0; i < m; i++) {
String favFruit = sc.nextLine();
System.out.println(fruits.contains(favFruit));
}
sc.close();


// isEmpty() Method in ArrayList
ArrayList<String> fruits = new ArrayList<>();
System.out.println(fruits.isEmpty()); // Output: true
fruits.add("Apple");
System.out.println(fruits.isEmpty());


// ArrayList clear() Method in Java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange"); // till here fruits ArrayList have size 3
fruits.clear()


// example – clear shopping cart
// Create an ArrayList called cart
ArrayList<String> cart = new ArrayList<>();
// Add items to the cart
cart.add("Milk");
cart.add("Bread");
cart.add("Eggs");
// Print the cart contents and size
System.out.println("Current cart items: " + cart);
System.out.println("Number of items: " + cart.size());
// Clear the cart
cart.clear();
// Print the cart contents again and verify it's empty
System.out.println("Cart after clearing: " + cart);
System.out.println("Number of items now: " +
cart.size());
System.out.println("Is cart empty? " + cart.isEmpty());


// sorting array
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
public static void main(String[] args){
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(2);
numbers.add(8);
Collections.sort(numbers); // Now the list is [2, 5, 8]
// Reverse order (Descending)
Collections.sort(numbers, Collections.reverseOrder()); //
Now the list is [8, 5, 2]
// Example with strings:
ArrayList<String> names = new ArrayList<>();
names.add("John");
names.add("Alice");
names.add("Bob");
Collections.sort(names); // Now the list is ["Alice",
"Bob", "John"]
// Reverse order (Descending)
// Now the list is ["John", "Bob", "Alice"]
Collections.sort(names, Collections.reverseOrder());
}
}


// 2d ArrayList
// Declare and initialize a 3x3 matrix with predefined values
int[][] matrix = {
{1, 2, 3}, // First row
{4, 5, 6}, // Second row
{7, 8, 9} // Third row
};
// Print a message indicating matrix declaration
System.out.println("Declaring a 3x3 matrix:");
// Print the matrix in a structured format (without using loops)
System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[
0][2]); // Print first row
System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[
1][2]); // Print second row
System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[
2][2]); // Print third row


// zero matrix initialization
Scanner scanner = new Scanner(System.in);
// Declare a 2x2 matrix
int[][] matrix = new int[2][2];
// Take user input for each element
System.out.println();
matrix[0][0] = scanner.nextInt();
matrix[0][1] = scanner.nextInt();
matrix[1][0] = scanner.nextInt();
matrix[1][1] = scanner.nextInt();
// Display the matrix
System.out.println("Matrix:");
System.out.println(matrix[0][0] + " " + matrix[0][1]);
System.out.println(matrix[1][0] + " " + matrix[1][1]);
scanner.close();


// iterating array with nested loop
// Step 1: Declare and Initialize a 2D array
int[][] matrix = {
{10, 20, 30},
{40, 50, 60},
{70, 80, 90}
};
// Step 2: Iterate through the 2D array using nested loops
System.out.println("2D Array Elements:");
for (int i = 0; i < matrix.length; i++) { // Row iteration
for (int j = 0; j < matrix[i].length; j++) { // Column iteration
System.out.print(matrix[i][j] + " ");
}
System.out.println(); // Move to the next line after printing
a row
}


// total marks with 2D iteration
Scanner scanner = new Scanner(System.in);
// Step 1: Create a 3x3 integer 2D array
int[][] marks = new int[3][3];
