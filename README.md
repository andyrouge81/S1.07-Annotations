# 🧩 S1.06 - Java Annotations

## 🧾 Task Objectives


- Learn how to use Java annotations such as @Override, @Deprecated, and custom annotations.
- Understand how annotations help with code clarity, compatibility, and compiler behavior.
- Create and apply a custom annotation to serialize a Java object into a JSON file.
- Understand and use Java Reflection and metadata annotations.
- Integrate dependencies using Maven (pom.xml).
- Manage your code versioning and collaboration using Git and GitHub.

---

## 📚 Documentation

- [Oracle Java Annotations](https://docs.oracle.com/javase/tutorial/java/annotations/index.html)
- [Baeldung - Introduction to Java Annotations](https://www.baeldung.com/java-custom-annotation)
- [Jackson Library for JSON Serialization](https://github.com/FasterXML/jackson)
- [Maven Central Repository](https://central.sonatype.com/?smo=true)

---

## 🧪 Proposed Exercises

### 🔹 Level 1

<details>

### Exercise 1

Create a hierarchy of objects with three classes:
`Worker`, `OnlineWorker`, and `InPersonWorker`.

The Worker class should have the following attributes:

- `name`
- `surname`
- `hourlyRate`

It must also include a method `calculateSalary()` that receives the number of worked hours as a parameter and multiplies it by the hourly rate.
The child classes should override this method using the `@Override` annotation.
In the `main()` method of the main class, make the necessary calls to demonstrate how the `@Override` annotation works.

Additional details:

In the InPersonWorker class, the salary calculation should include an additional static attribute called `fuelCost`.
The salary is computed as `(hoursWorked * hourlyRate) + fuelCost`.

In the OnlineWorker class, the salary calculation should include a constant attribute `INTERNET_FEE`.
The salary is computed as `(hoursWorked * hourlyRate) + INTERNET_FEE`.

### Exercise 2

Add some deprecated methods to the child classes and use the `@Deprecated` annotation.
From an external class, invoke the deprecated methods, suppressing compiler warnings using the `@SuppressWarnings("deprecation")` annotation.

</details>


### 🔹 Level 2
<details>

### Exercise 1

Create a custom annotation that allows serializing a Java object into a JSON file.
The annotation must include a parameter indicating the directory path where the resulting file will be stored.

</details>

---

## 💻 Technologies Used

- Java 17 or higher
- IntelliJ IDEA / Eclipse / VS Code (with Java support)
- Jackson or Gson for JSON serialization
- Git & GitHub for version control
- Maven (optional, for dependency management)

## 🤖 Requirements

- Java SDK 17 or higher
- A Java-compatible IDE
- Git installed in your terminal
 -Internet connection to install dependencies

## ⚙️ Maven Steps

Ensure your `pom.xml` includes the following dependency for Jackson:

```xml
      <dependencies>
         <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.17.2</version>
        </dependency>
      </dependencies>

```

🚀 Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/andyrouge81/S1.06-Annotations.git

2. Navigate to the project folder:
    ```bash
    cd S1.06-Annotations

3. Open the project in your preferred IDE.
4. Make sure the JDK version matches the one configured in your IDE.

## ▶️ Execution

- Open the Main.java file for each exercise.
- Run the main method to see the output.
- Try modifying values or annotations to observe their effects.

## 🤝 Contributions

1. Fork this repository
2. Create a new branch:
    ```bash
    git checkout -b feature/NewFeature

3. Make your changes and commit them:
   ```bash
   git commit -m "feat: added custom annotation example"

4. Push your branch:
    ```bash
    git push origin feature/NewFeature

5.Open a Pull Request to propose your improvements.

## 💌 Contact

For questions, feedback, or suggestions, feel free to open an _Issue_ or contact via your [GitHub Profile](https://github.com/andyrouge81/S1.06-Annotations.git)
  
