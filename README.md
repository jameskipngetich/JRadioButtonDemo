# JRadioButton Image Gallery

A simple, interactive Java Swing application that demonstrates how to use `JRadioButton`, `ButtonGroup`, and `BorderLayout` to switch between different images dynamically.

## Features
* **Mutually Exclusive Selection:** Uses `ButtonGroup` so only one animal can be selected at a time.
* **Dynamic Image Scaling:** Automatically resizes large images to fit the display area using `Image.getScaledInstance`.
* **Responsive Layout:** Utilizes `BorderLayout` to ensure components stay organized even if the window is resized.

---

## Project Structure
For the code to run correctly, your project folder **must** look like this:



```text
ProjectFolder/
├── src/
│   └── JRadioButtonDemo.java    <-- Your code
├── bird.png                     <-- Image files must be here
├── cat.png
├── dog.png
├── rabbit.png
└── pig.png
```
## Requirements
* JDK 8 or higher

## How to run
```
javac JRadioButtonDemo.java
```

```
java JRadioButtonDemo
```

