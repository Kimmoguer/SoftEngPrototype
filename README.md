# Prototype Design Pattern - Animal Example

This Java project demonstrates the Prototype Design Pattern.

## Files
- Animal.java → abstract base class
- Sheep.java → Sheep class
- Cow.java → Cow class
- Horse.java → Horse class
- AnimalRegistry.java → stores animal prototypes and creates clones
- TestAnimal.java → main class to test the program

## How it works
Instead of creating new objects from scratch every time, the registry stores prototype objects.
When needed, the program clones the prototype and returns a new object.

## Compile
```bash
javac *.java