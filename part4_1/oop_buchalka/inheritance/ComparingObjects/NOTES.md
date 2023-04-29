## Comparing Objects
### Wrote by Dev on 28/04/2023

*If we want to be able to compare two objects of our own design with the equals method, *
*that method must be defined in the class.*
*The method equals is defined as a method that returns a*
*boolean type value — the return value indicates whether the objects are equal.*

`ArrayList<Bird> birds = new ArrayList<>()
Bird red = new Bird("Red");

if (birds.contains(red)) {
    System.out.println("Red is on the list.");
} else {
    System.out.println("Red is not on the list.");
}

birds.add(red);
if (birds.contains(red)) {
    System.out.println("Red is on the list.");
} else {
    System.out.println("Red is not on the list.");
}


System.out.println("However!");

red = new Bird("Red");
if (birds.contains(red)) {
    System.out.println("Red is on the list.");
} else {
    System.out.println("Red is not on the list.");
}`

### We can notice in the example above that we can search a list for our own objects. First, when the bird had not been added to the list, it is not found — and after adding it is found. When the program switches the red object into a new object, with exactly the same contents as before, it is no longer equal to the object on the list, and therefore cannot be found on the list.

### The contains method of a list uses the equals method that is defined for the objects in its search for objects. In the example above, the Bird class has no definition for that method, so a bird with exactly the same contents — but a different reference — cannot be found on the list.

### Let's implement the equals method for the class Bird. The method examines if the names of the objects are equal — if the names match, the birds are thought to be equal.
