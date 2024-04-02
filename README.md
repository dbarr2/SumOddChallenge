# SumOdd - Odd Number Sum Calculator

The `SumOdd` class is a simple Java utility designed to calculate the sum of odd numbers within a given range. The class consists of two methods that work together to identify odd numbers and compute their sum.

## Features

- **isOdd**: A method to determine whether a given integer is odd.
- **sumOdd**: A method that sums all odd numbers within a specified range (inclusive).

## How It Works

- The `isOdd` method takes an integer as a parameter and returns `true` if the number is odd, `false` otherwise. This method is used to check the oddness of a number.
- The `sumOdd` method takes two integers, representing the start and end of a range. It then iterates through this range, utilizing the `isOdd` method to check each number and summing up all odd numbers found. If either the start or end is less than 0, the method returns -1, indicating an invalid input.

## Example Use

The `SumOdd` class can be employed in a variety of contexts where it is necessary to find the sum of odd numbers within a range. For example, it can be used in statistical calculations, numerical analysis, or even in educational contexts to teach iteration and conditional logic.

When executed, the class's main method demonstrates the use of the `sumOdd` function with various ranges, providing the expected outcomes as comments.

## Conclusion

The `SumOdd` class is an example of a basic Java program that demonstrates control flow, method definition, and the concept of method overloading. It is a practical tool for those beginning their journey in Java programming, as well as a clean example of a utility class that performs a specific task.

Thank you for exploring the `SumOdd` class. This intuitive program is a great stepping stone towards mastering the foundational elements of Java programming.
