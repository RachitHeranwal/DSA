# Data Structures and Algorithms (DSA) Repository

A comprehensive collection of Data Structures and Algorithms implementations in Java. This repository contains solutions to various DSA problems organized by categories.

## 📚 Repository Structure

```
DSA/
├── SlidingWindow/       # Sliding Window technique problems
├── LinkedList/          # Linked List problems
├── BinarySearch/        # Binary Search problems
├── Strings/            # String manipulation problems
```

## 🎯 Problem Categories

### 1. Sliding Window
The sliding window technique is an efficient method for solving problems that involve arrays or strings where you need to find a contiguous subarray/substring that satisfies certain conditions.

**Problems Implemented:**
- **Maximum Points from Cards** (`Sliding.java`) - Calculate maximum score by taking k cards from either end
- **Permutation in String** (`PermutationInString.java`) - Check if one string's permutation is a substring of another
- **Longest Substring with Character Replacement** (`LogestSubstringcharactersReplacement.java`) - Find longest substring with at most k character replacements
- **Longest Substring Without Repeating Characters** (`LongestSubstringwithoutcharcters.java`) - Find length of longest substring without repeating characters
- **Max Consecutive Ones III** (`MaxConsecutiveOnesIII.java`) - Find longest consecutive 1s with at most k flips
- **Fruit Into Baskets** (`FruitIntoBaskets.java`) - Maximum fruits collected with two baskets
- **Subarray Product Less Than K** (`Subarray_Product_Less_Than_K.java`) - Count subarrays with product less than k
- **Maximum Average Subarray** (`Maximum_Average_Subarray.java`) - Find maximum average of subarray of size k

### 2. Linked List
Linked List is a linear data structure where elements are stored in nodes, and each node points to the next node.

**Problems Implemented:**
- **Remove Elements** (`Main.java`) - Remove all nodes with a specific value from linked list
- **Merge Two Sorted Lists** (`mergeLinkedList.java`) - Merge two sorted linked lists into one
- **Remove Duplicates** (`Duplicates.java`) - Remove duplicate nodes from sorted linked list
- **Reverse Linked List** (`ReverseALinkedList.java`) - Reverse a singly linked list
- **Segregate Even and Odd Nodes** (`evenOdd.java`) - Rearrange list with even nodes before odd nodes
- **Palindrome Linked List** (`isPalindromebro.java`) - Check if a linked list is a palindrome
- **Intersection of Two Linked Lists** (`intersectionofLinkedList.java`) - Find the intersection node of two linked lists

### 3. Binary Search
Binary Search is an efficient algorithm for finding an element in a sorted array with O(log n) time complexity.

**Problems Implemented:**
- **Search a 2D Matrix** (`Search_a_2D_Matrix.java`) - Search for a value in a 2D matrix with sorted rows and columns

### 4. Strings
String manipulation and processing problems.

**Problems Implemented:**
- **Remove Outermost Parentheses** (`RemoveOutermostParentheses.java`) - Remove outermost parentheses from valid parentheses string

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Running a Program

1. **Using Command Line:**
```bash
# Navigate to the repository directory
cd DSA

# Compile a Java file
javac SlidingWindow/Sliding.java

# Run the compiled class
java SlidingWindow.Sliding
```

2. **Using an IDE:**
- Open the repository in your preferred Java IDE
- Navigate to the problem you want to run
- Right-click on the file and select "Run"

### Example

To run the Sliding Window problem:
```bash
javac SlidingWindow/Sliding.java
java SlidingWindow.Sliding
```

Expected Output:
```
Max score: 12
Max score: 4
Max score: 55
```

## 💡 Code Structure

Each implementation typically contains:
- **Main class** with the problem solution
- **Solution method** implementing the algorithm
- **Main method** with test cases demonstrating usage
- **Helper methods** for common operations (printing, building data structures, etc.)

### Example Structure (LinkedList):
```java
public class ReverseALinkedList {
    // Solution method
    public ListNode reverseList(ListNode head) {
        // Implementation
    }
    
    // Helper method
    public static void printList(ListNode head) {
        // Implementation
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test implementation
    }
}
```

## 🧩 Key Concepts

### Sliding Window Pattern
Used for problems involving:
- Finding subarrays/substrings with specific properties
- Maximum/minimum values in a window
- Fixed or variable window sizes

### Linked List Operations
Common operations include:
- Traversal
- Insertion and deletion
- Reversal
- Detecting cycles
- Finding middle elements

### Binary Search Applications
- Searching in sorted arrays
- Finding boundaries
- Optimization problems
- 2D matrix search

## 📝 Notes

- All implementations include test cases in the `main` method
- Each file is part of its respective package (e.g., `package SlidingWindow;`)
- Solutions are optimized for clarity and efficiency
- Comments are included where necessary to explain complex logic

## 🎓 Learning Resources

This repository is ideal for:
- Interview preparation
- Learning DSA concepts
- Understanding problem-solving patterns
- Practicing Java programming

## 📊 Statistics

- **Total Problems:** 17
- **Categories:** 4
- **Language:** Java

## 🤝 Contributing

Feel free to:
- Add new problems
- Optimize existing solutions
- Fix bugs
- Improve documentation

## 📄 License

This repository is for educational purposes.

---

**Happy Coding!** 🚀
