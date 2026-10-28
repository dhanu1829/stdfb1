// Student Feedback Management System
// JavaScript File

console.log("Student Feedback Management System Loaded Successfully!");

// Smooth button click effect
const buttons = document.querySelectorAll("button");

buttons.forEach(button => {
    button.addEventListener("click", () => {
        button.style.transform = "scale(0.97)";
        setTimeout(() => {
            button.style.transform = "scale(1)";
        }, 150);
    });
});

// Welcome message
window.addEventListener("load", () => {
    console.log("Welcome to the Student Feedback Management System");
});