

# 🍽️ NutriTrack – Dietary Monitoring Console System

**Your console-based nutrition tracker.**

IT - 2114
Agno, Zhairyl B.
Cara, King Jerald S.
Fernadez, Amil

---

## ✦ Overview

NutriTrack Lite is a **console-based Java application** that allows users to monitor the basic nutritional value of food. The program organizes foods into three main categories: **Fruit, Vegetable, and Protein**, each containing essential nutritional data such as **Calories, Carbs, and Protein**.

It applies Object-Oriented Programming (OOP) principles and simple file handling to save meal summaries in a text file.

Users can:

* Add food to a meal
* View all available foods
* Search food by name
* View total meal nutrition
* Save results to a text file

All data is processed through a menu-driven interface inside the terminal.

---

## ✦ Project Structure

```
📂 NutriTrack/
└── 📂 src/
    ├── Food.java          
    ├── Fruit.java
    └── Protein.java
    └── Vegetable.java

```

**File Description:**

* **NutriTrack.java** – Entry point of the program, contains the menu and user interactions.
* **Food.java** – The parent class where common properties like calories, carbs, and protein are defined.
* **Fruit.java / Vegetable.java / Protein.java** – Child classes extending `Food` using inheritance.
* **meal_summary.txt** – Stores the total nutrition of the selected meal.

---

## ✦ Features

1. **Add Food**
   Create and include food in the current meal.

2. **View All Foods**
   Display all available foods grouped by category.

3. **Search Food**
   Find a specific food by name.

4. **Meal Summary**
   Calculates total **Calories**, **Carbs**, and **Protein**.

5. **File Saving**
   Automatically saves results in `meal_summary.txt`.

---

## ✦ Object-Oriented Principles Applied

📌 **Encapsulation**
Private attributes inside the Food class ensure secure data management using getters like (getName(),
getCalories() etc)

📌 **Inheritance**
`Fruit`, `Vegetable`, and `Protein` extend the `Food` class to reuse its properties.

📌 **Polymorphism**
The `displayInfo()` method is overridden in each subclass.

📌 **Abstraction**
The main program uses functions without needing to know the internal logic of file handling like (loadSampleFoods(), viewAllFoods()
, searchFood() etc)

---

## ✦ Example Output

```
NUTRITRACK
[1] View All Foods
[2] Search Food
[3] Add Food to Meal
[4] View Meal Summary
[5] Exit

Enter choice: 4

Calories: 119
Carbs: 11g
Protein: 7g

Meal saved to meal_summary.txt
```
meal_summary.txt Snippet

Meal Summary
Calories: 78
Carbs: 1
Protein: 6

Meal Summary
Calories: 119
Carbs: 11
Protein: 7

---

## ‧₊˚ ┊ Contributors
 	
Agno, Zhairyl B.
Cara, King Jerald S.
Fernadez, Amil

## ✦ Acknowledgement

We express our sincere gratitude to our instructor and classmates for the guidance and support provided throughout the completion of this final project.

"# NutriTrack" 
