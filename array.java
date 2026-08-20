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

