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


