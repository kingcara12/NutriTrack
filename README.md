# 🍽️ **NutriTrack – Dietary Monitoring Console System**

**Your console-based nutrition tracker.**

IT - 2114

Agno, Zhairyl B.

Cara, King Jerald S.

Fernandez, Amil

---

## ✦ **Overview**

**NutriTrack** is a **console-based Java application** that allows users to monitor the nutritional value of various foods.
Foods are categorized into:

* **Fruit**
* **Vegetable**
* **Protein**

Each item contains nutritional data including **Calories**, **Carbs**, and **Protein**.

The program applies **Object-Oriented Programming (OOP)** and simple **file handling** to save meal summaries into a text file.

Users can:

* Add food to a meal
* View all available foods
* Search for food by name
* View total meal nutrition
* Save the result to a text file

All interaction is done through a menu-driven terminal interface.

---

## ✦ **Project Structure**

```
📂 NutriTrack/
└── 📂 src/
    ├── Food.java
    ├── Fruit.java
    ├── Protein.java
    └── Vegetable.java
    └── NutriTrack.java
    📂 data/
    └── meal_summary.txt
```

### **File Description**

* **NutriTrack.java** – Entry point of the program, handles menu and user interaction
* **Food.java** – Parent class defining shared properties (calories, carbs, protein)
* **Fruit.java / Vegetable.java / Protein.java** – Subclasses extending `Food`
* **meal_summary.txt** – Stores saved meal summaries

---

## ✦ **Features**

1. **Add Food** – Create and add food items to the current meal.
2. **View All Foods** – Displays all foods grouped by category.
3. **Search Food** – Search any food by name.
4. **Meal Summary** – Calculates total **Calories**, **Carbs**, and **Protein**.
5. **File Saving** – Automatically saves meal results into `meal_summary.txt`.

---

## ✦ **Object-Oriented Principles Applied**

📌 **Encapsulation** Private attributes inside the Food class ensure secure data management using getters like (getName(), getCalories() etc)

📌 **Inheritance** Fruit, Vegetable, and Protein extend the Food class to reuse its properties. 

📌 **Polymorphism** The displayInfo() method is overridden in each subclass. 

📌 **Abstraction** The main program uses functions without needing to know the internal logic of file handling like (loadSampleFoods(), viewAllFoods() , searchFood() etc)

---

## ✦ **Example Output**

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

### `meal_summary.txt` Example

```
Meal Summary
Calories: 78
Carbs: 1
Protein: 6

Meal Summary
Calories: 119
Carbs: 11
Protein: 7
```

---

## ✦ **Contributors**

* Agno, Zhairyl B.
* Cara, King Jerald S.
* Fernandez, Amil

---

## ✦ **Acknowledgement**

We express our sincere gratitude to our instructor and classmates for the guidance and support throughout the development of this final project.





