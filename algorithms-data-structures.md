# Algorithms and Data Structures

## Table of Contents

1. [Introduction](#introduction)
2. [Algorithms](#algorithms)
3. [Types of Algorithms](#types-of-algorithms)
4. [Big O Notation](#big-o-notation)

### Introduction

Algorithms and data structures are fundamental to computer science and programming. They are the building blocks of
software development and are essential to creating efficient and scalable programs. Algorithms are step-by-step
procedures for solving problems, while data structures are ways of organizing and storing data in a computer so that it
can be accessed and modified efficiently.

### Algorithms

An algorithm is a set or instructions for computing a task.
It is a step-by-step procedure for solving a problem in a finite amount of time.
Algorithms can be expressed in many different ways, including natural language, pseudocode, and programming languages.
They are used in many different applications, including search engines, social networks, and video games.
Algorithm efficiency is often measured in terms of time complexity and space complexity.
Algorithm correctness is also important, and algorithms are often tested using test cases to ensure that they produce
the correct output for a given input.
This is done by mathematical induction, which is a method of proving that a statement is true for all natural numbers.

* **Time Complexity**: Time complexity is a measure of the amount of time an algorithm takes to run as a function of the
  size of the input.
  It is often expressed using Big O notation, which describes the limiting behavior of a function as the input size
  grows.
* **Space Complexity**: Space complexity is a measure of the amount of memory an algorithm uses as a function of the
  size of the input.
  It is also often expressed using Big O notation.

### Types of Algorithms

There are many different types of algorithms, each with its own characteristics and uses.
Some common types of algorithms include:

- **Search Algorithms**: Search algorithms are used to find a specific item in a collection of items.
  Some common search algorithms include linear search, binary search, and depth-first search.
    * **Linear or Sequential Search** O(n): Linear search is a simple search algorithm that checks each element in a
      list
      until it finds the desired item.
      The items in the list do not need to be in any particular order.
    * **Binary Search** O(log n): Binary search is used to search for an item in a sorted list.
      It works by repeatedly dividing the list in half and checking the middle element.
      If the middle element is the desired item, the search is complete.

- **Sorting Algorithms**: Sorting algorithms are used to arrange a list of items in a specific order.
  Some common sorting algorithms include bubble sort, selection sort, insertion sort, merge sort, and quicksort.
    * **Bubble Sort** O(n^2): Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
      compares adjacent elements, and swaps them if they are in the wrong order.
    * **Selection Sort** O(n^2): Selection sort is a simple sorting algorithm that repeatedly selects the smallest
      element from the unsorted portion of the list and swaps it with the first unsorted element.
    * **Insertion Sort** O(n^2): Insertion sort is a simple sorting algorithm that builds the final sorted list one
      item at a time by inserting each item into its correct position.
    * **Merge Sort** O(n log n): Merge sort is a divide-and-conquer algorithm that divides the list into two halves,
      sorts each half, and then merges the sorted halves.
    * **Quick Sort** O(n log n): Quick sort is a divide-and-conquer algorithm that selects a pivot element and
      partitions
      the list into two sublist, one with elements less than the pivot and one with elements greater than the pivot.
      It then recursively sorts the sublist.

### Big O Notation

Theoretical definition of the complexity of an algorithm as a function of the size.
It is commonly used to analyze the efficiency of algorithms and data structures.
The notation describes the worst-case scenario for an algorithm, which is useful for understanding
how the algorithm will perform as the input size grows.

- **O(1) Constant Time**: The algorithm takes the same amount of time to run, regardless of the size of the input.
- **O(n) Linear Time**: The algorithm's running time increases linearly with the size of the input.
- **O(log n) Logarithmic Time**: The algorithm's running time increases logarithmically with the size of the input.
- **O(n log n) Quasilinear Runtimes**: The algorithm means that for each n element, will be executed log n times.
- **O(n^2) Quadratic Time**
- **O(2^n) Exponential Time**