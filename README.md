# Java Programming Assignment

## 📚 Topics Covered:
- Lambda Expressions
- Java Streams API
- Collections Framework

## 📝 Problem Statements

### ✅ Problem 1: Sorting Employees (Easy Level)
#### Description:
Write a Java program to sort a list of Employee objects using lambda expressions. Each Employee object should have the following attributes:
- `name` (String)
- `age` (int)
- `salary` (double)

#### Example Input:
```java
List<Employee> employees = Arrays.asList(
    new Employee("John", 30, 50000),
    new Employee("Alice", 25, 60000),
    new Employee("Bob", 35, 45000)
);
```

#### Example Output:
```
Employee{name='Bob', age=35, salary=45000.0}
Employee{name='John', age=30, salary=50000.0}
Employee{name='Alice', age=25, salary=60000.0}
```

---

### ✅ Problem 2: Filtering and Sorting Students (Medium Level)
#### Description:
Create a Java program that uses lambda expressions and stream operations to:
1. Filter students who scored above 75%
2. Sort them by marks in descending order
3. Display their names

#### Example Input:
```java
List<Student> students = Arrays.asList(
    new Student("Emma", 85),
    new Student("Liam", 72),
    new Student("Olivia", 90),
    new Student("Noah", 78)
);
```

#### Example Output:
```
Olivia
Emma
Noah
```

---

### ✅ Problem 3: Processing a Large Dataset of Products (Hard Level)
#### Description:
Write a Java program to process a dataset of products using streams. Perform the following operations:
1. Group products by category
2. Find the most expensive product in each category
3. Calculate the average price of all products

#### Example Input:
```java
List<Product> products = Arrays.asList(
    new Product("Laptop", "Electronics", 75000),
    new Product("Smartphone", "Electronics", 50000),
    new Product("Table", "Furniture", 10000),
    new Product("Chair", "Furniture", 5000)
);
```

#### Example Output:
```
Most Expensive Product per Category:
Electronics: Laptop (75000.0)
Furniture: Table (10000.0)

Average Price of All Products: 35000.0
```

---

## 🛠 Requirements:
- Java 8 or above
- IDE (Eclipse / IntelliJ / VS Code)

## 📌 Notes:
- The assignment covers key Java concepts such as Lambda Expressions, Streams, and Collection Framework operations.
- Sorting, filtering, and aggregations are performed using modern Java features.
- The problems help reinforce Java fundamentals through practical implementation.

📢 *This assignment provides hands-on experience with Java collections and stream processing. Feel free to enhance and customize the solutions!* 🚀

