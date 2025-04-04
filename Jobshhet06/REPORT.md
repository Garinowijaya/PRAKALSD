|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020230|
| Nama |  GARINO WIJAYA |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Garinowijaya/PRAKALSD/blob/main/Jobshhet06/REPORT.md)|

# JOB SHEET 6 REPORT

## 6.2 Experiment 1 - Implementing Sorting Using Objects
## RESULT A. SORTING – BUBBLE SORT : 

![image](https://github.com/user-attachments/assets/a6196021-723d-4d7a-b301-11092de7fdf2)

## RESULT B. SORTING – SELECTION SORT : 

![image](https://github.com/user-attachments/assets/86df9b03-9171-458a-8310-22f335d5c9ea)

## RESULT C. SORTING – INSERTION SORT : 

![image](https://github.com/user-attachments/assets/0948365e-3703-4b30-9cee-703083299c26)

## 6.2.5 Question'S Answer : 
1. This line of code has a function to perform a swapping operation between 2 elements in array if they are out of order. For example if data[j] > data[j+1] it’ll swap. This type of sort (bubble sort) is to ensure that larger elements gradually move toward the end of arrah with each pass.
2. Code that implements the minimum value search algorithm in selection sort

![Cuplikan layar 2025-03-25 080400](https://github.com/user-attachments/assets/e0e3263f-22c0-430f-8b81-2fb15a215f49)

3. The purpose of the condition in the loop, while (j>=0 && data[j] > key is we’ll continue shifting elements to the right if they are greater than key, it ensure us that we don’t go out of bound and it stops when we reach the beginning of the array (j >=0 ). It’s just basically ensuring the sorted order is maintained
4. The purpose data[j+1] = data[j]; is to shifts the element data[j] one position to the right, making space to insert the key in it’s correct position. It’ll continue until we find the right place for the variable key to keep it sorted.

## 6.3 Experiment 2- Sorting Using an Array of Objects
## 6.3.3 RESULT : 

![Cuplikan layar 2025-03-25 080552](https://github.com/user-attachments/assets/6e013b17-c457-462b-9c4a-42e1626dbd13)

## 6.3.4 Question's Answer : 
1. Answer question a-c

![Cuplikan layar 2025-03-25 080728](https://github.com/user-attachments/assets/5b0d67ae-7ffe-46af-9b0b-e9de1bc930a0)

   a. The outer loop runs idx-1 times because each pass moves the largest remaining element to its correct position. After the idx-1 pass, the array is fully sorted and no passes needed again.

   b. The inner loop runs fewer times in each pass, the reason of it because after the “i” passes, the last “i” elements are already sorted & dont need to be checked again

   c. If there are 50 students the “i” loops run about 49 times. The reason why it run 49 times is i =0 to i = 48, after 49 passes, all 50 studentswill be sorted, & there’s no need for the 50th pass. Example : for (int i = 0; i < idx -1 ; i++) since idx is 50 (student) the loop runs while i < 49 meaning “i” goes from 0 to 48.

2. Modify

![Cuplikan layar 2025-03-25 083759](https://github.com/user-attachments/assets/9e9e3ff9-3d24-478d-b93c-b5d57907ffad)

## 6.3.5 Sorting Student Data Based on GPA (Selection Sort)
## 6.3.8 RESULT : 

![Cuplikan layar 2025-03-25 084051 (2)](https://github.com/user-attachments/assets/9c651e13-ac99-4407-8757-f47644fc511f)

## 6.3.9 Question's Answer : 
The code snippet is part of the Selection Sort algorithm. It finds the student with the lowest GPA in the unsorted part of the list.

Main Idea / Core Logic : 

- minIndex starts at the current possitition (i)
- The loop checks the remaining students (j = i + 1 to idx).
- If a student with a lower GPA is found, minIndex is updated.
- After the loop, minIndex holds the index of the smallest GPA, which will be swapped into the correct position.

Therefore, this process helps sort students in ascending order by GPA using Selection Sort

## 6.3.10 Sorting Student Data Based on GPA Using Insertion Sort
## 6.3.13 Question's Answer : 
Modified insertionSort() method : 

![Cuplikan layar 2025-03-25 085052](https://github.com/user-attachments/assets/32318aa6-c35d-42d2-ac61-91dffc3c01b5)

We just have to change the ">" into "<" for descending between the j > 0 && listStudent[j-1].gpa < temp.gpa

## 6.4 Assignment
## Assignment Result :

![Cuplikan layar 2025-03-25 090021](https://github.com/user-attachments/assets/a1dd5176-4608-461b-a792-00af772fd738)

![Cuplikan layar 2025-03-25 090049](https://github.com/user-attachments/assets/5cacf40b-271a-4829-820d-538d9db3aef3)

![Cuplikan layar 2025-03-25 090152](https://github.com/user-attachments/assets/a1cfd20b-752b-4b95-a1b3-427d28c88996)

![Cuplikan layar 2025-03-25 090347](https://github.com/user-attachments/assets/0d6fdd87-643b-4ae5-9312-5e9bbf9d7b0a)
