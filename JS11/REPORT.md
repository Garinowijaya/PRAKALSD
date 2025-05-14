|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020230|
| Nama |  Garino Wijaya |
| Kelas | TI - 1I |
| Repository | (https://github.com/Garinowijaya/PRAKALSD/new/main/JS11) |

# Labs #11 QUEUE

## 2.1.2 Result

![experiment1](img/experiment1.png)
![experiment1](img/experiment12.png)

**2.1.3 Question** 
1. In the Queue class, the attributes front and rear are initially set to -1 to inidcate that the queue is currently empty and has no valid front or rear position yet
2. In the enqueue method, this line is used to implement the behavior of a circular queue. This condition checks whether the rear pointer has reached the last index of the aray. If it has, it wraps around and resets rear to 0 so that the queue can use empty slots at the beginning of the array. This allows for more efficient memory usage, preventing unused space even when the array is not fully occupied linearly
3. Similarly, in the dequeue method, this line ensures that when the front pointer reaches the end of the array, it wraps back to the beginning. This behavior is essential in a circular queue because it allows the queue to continue functioning correctly after some elements have been removed from the front.
4. In the print method, the loop variable i starts from the value of front rather than 0 because front marks the current starting point of the queue.
5. This line is used to increment index i while maintaining the circular structure of the queue. by using the modulo operator, the index automatically wraps around to 0 when it reaches max.
6. A queue overflow occurs when an attempt is made to enqueue data into a queue that is already full. In the program this condition is handled in this line

![Queue Overflow](img/QueueFull.png)

7. I modify this method

![Exit](img/Enqueue.png)

## 2.2.2 Result

![Cuplikan layar 2025-05-14 214552](https://github.com/user-attachments/assets/7151c665-94f3-4af4-8485-4a8797987284)
![Cuplikan layar 2025-05-14 214729](https://github.com/user-attachments/assets/f2bf66cb-0507-4205-9ef5-af82ba635823)
![Cuplikan layar 2025-05-14 214833](https://github.com/user-attachments/assets/34093d7e-961f-4101-9ee4-497f7e2fc071)
![Cuplikan layar 2025-05-14 214928](https://github.com/user-attachments/assets/a0e0b0bc-1158-403e-a094-c9411e57d282)


**2.2.3 Question** 
1. The Queue class works with primitive int values, while StudentQueue is designed to manage complex objects of type Student.
2. The enqueue and dequeue methods in StudentQueue are mostly the same in logic as those in Queue, but the difference is in the data they handle. In Queue, the methods work with numbers (int), while in StudentQueue, they work with objects of the Student class. So instead of just adding or removing a number, the methods in StudentQueue add or remove student data,
3. The front attribute is initialized to 0 which differs from the Queue class where front is initially -1. This difference is due to a design variation. The StudentQueue class assumes that the front position is always pointing to a valid index, even if the queue is empty.
4. Program:

![viewRear method](img/viewRear().png)
![viewRear main](img/main.png)
![viewRear main](img/main2.png)

## 2.3 Assignment

![Cuplikan layar 2025-05-14 215343](https://github.com/user-attachments/assets/9975bd36-3750-4a2f-8112-5ae8693309ad)
![Cuplikan layar 2025-05-14 215440](https://github.com/user-attachments/assets/7e9a6b43-44a4-41f9-8af7-848808d0ee81)
![Cuplikan layar 2025-05-14 215526](https://github.com/user-attachments/assets/fbee9554-c778-40ad-91cf-fe4808ade3cb)
![Cuplikan layar 2025-05-14 215618](https://github.com/user-attachments/assets/c6bc9912-d148-4eda-9bd9-c1e175d52952)
![Cuplikan layar 2025-05-14 215653](https://github.com/user-attachments/assets/e1d578f4-44c9-4072-92e6-eed48bcdc0a5)




**Program Flow** 
1. The program displays a menu of options to the user in a do-while loop inside the main method. The program ask the user to input a number to choose a menu option. Based on the input, a switch-case structure runs the corresponding block of code
2. If the user choose option 1 (Add student), the program asks the user to input student data (NIM, name, study program, and class name). After collecting the inputs, a Student object is created and passed to the enqueue(student) method.
- The enqueue method checks if the queue is full using isFull()
- If not full, it increases the rear pointer using circular indexing (rear + 1)%max, stores the student object and increments size by 1
3. Option 2 (Process KRS approval for 2 students), the program processes 2 students at once by calling dequeue() in a loop
- The dequeue() method checks if the queue is empty using isEmpty()
- If not empty, it retrieves the student at front, advances front using circular indexing, decrease size, and returns the student
- The student's information is then printed using print() method
4. Option 3 (Display all students), the program calls queue.print() to shw all students currently in the queue. 
- print() method loops from front to rear using circulara logic
- Each student is printed using their print() method
5. Option 4 (Show the first 2 students), the program prints the first 2 student queue without removing them. It runs a loop up to 2 times and calculates the actual index using (front+i)%max to get the right student in the circular array and prints them
6. Option 5 (Show last student), the program calls the viewRear() method to show the most recently added student.
- viewRear() method directly accesses the student at rear and prints their data
7. Option 6 (Show total students), the program prints the current size of the queue (how many students are still waiting for KRS approval)
8. Option 7 (Show total approved students), the program displays the value of approvedStudent (a counter for how many student have completed the approval process), and prints 30 minus approvedStudent to show the number of remaining students that can be approved by the lecturer
9. Option 8 (Clear data), the program reset the queue by setting front, rear, size, and also approvedStudent back to their empty value
10. Option 0 (Exit), the loop breaks, and the program stops running
