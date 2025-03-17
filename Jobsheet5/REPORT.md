|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020230|
| Nama |  Garino Wijaya |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Garinowijaya/PRAKALSD/new/main/Jobsheet5)|

# JOB SHEET 5 REPORT

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms
## 5.2.2 Result : 

![image](https://github.com/user-attachments/assets/f187bc85-b8dd-4df4-a728-b1769122e772)

## 5.2.3. Question's Answer : 

1. The difference in base case between if and else 
- If condition: uses checks if n is equal to 1, and if it does, it directly returns 1. It serves to stop the infinite recursion
- Else condition: it recursively calls facotrialDC(n-1), by multiplying n with factorial of (n-1) then continues to breakdown the smaller problems / subproblems until it reach 1, or n ==1

![Cuplikan layar 2025-03-17 185350](https://github.com/user-attachments/assets/b08b39d5-d409-413a-928d-5634846334e6)

So the if condition stops the recursion and return fixed value, while the else condition performs recursive multiplication until it reach value 1.

2. We can use while loop as an alternative for loop in factorialBF() like this and work the same :

![Cuplikan layar 2025-03-17 185528](https://github.com/user-attachments/assets/4dc8f18f-6813-43d7-8098-d1ed374cc021)

3. Differences Between facto = facto * i; and int facto = n * factorialDC(n-1);
- Facto = facto * i : It updates an existing variable in the loop. It performs continuously multiplication like 1x1,1x2,3x3,8x4
- int facto = n * factorialDC(n-1) : It creates new variable in each recursive call factorialDC(). The multiplication happens backward as the recursive call return

4. The factorialBF() works iteratively looping the value one by one, while factorialDC() works by recursion and splitting the problems into smaller subproblems then solving it

## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
## 5.3.2 Result : 

![Cuplikan layar 2025-03-17 190515 (2)](https://github.com/user-attachments/assets/b50b3633-9d1e-4596-9983-b92f7ea44890)

## 5.3.3. Question's Answer : 

1. Both method has the same function, that is to calculate n to the power of e. The difference are, powerBF() use bruteforce and done iteratively, while powerDC() use divide and conquer and done by recursion
2. Yes, the combine stage exist it in this block of code

![Cuplikan layar 2025-03-17 191104](https://github.com/user-attachments/assets/44d99e05-e54e-4da5-942f-070268592483)

3. Yes, the method could be implemented without parameter, because baseNumber and exponent is already stored as class variable, so we can use this instead.
4. The powerBF() use iteration, it use loop to multiply baseNumber by itself exponent number of times. While,powerDC()it uses recursion to split the exponentiation into smaller problems. Reduces the problem size by half each time

## 5.4 Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms
## 5.4.2 Result : 

![Cuplikan layar 2025-03-17 192004 (2)](https://github.com/user-attachments/assets/38e77672-72a2-4517-9fab-2b0e5cae6d1c)

## 5.4.3. Question's Answer : 
1. mid variable is needed so that it can divide the problem into 2 smaller subproblems. It helps by dividing the array into 2 halves, left subarray and right sub
2. totalDC(arr, l, mid) Recursively computes the sum of the left half of the array (from index l to mid). totalDC(arr, mid+1, r) Recursively computes the sum of the right half of the array (from index mid+1 to r).
3. It's necessary since it's the combine stage, and returns the total sum for the current segment of the array
4. The if(l==r){ return arr[l]; is the base case

![Cuplikan layar 2025-03-17 192132](https://github.com/user-attachments/assets/8607974b-c46d-4819-8015-d34ff89f84bc)

When the left index l is equal to the right index r
5. Divide the array into two halves, left and right. Each halves have a recursion function to sum the total. Finally it will returned the combined value of left half and right half.

## 5.5. Assignments
a) Find the highest Midterm Score (UTS) using the Divide and Conquer approach.

![Cuplikan layar 2025-03-17 192331](https://github.com/user-attachments/assets/51c47553-1d1c-4e43-9d21-e6c0d454a8fa)

b) Find the lowest Midterm Score (UTS) using the Divide and Conquer approach.

![Cuplikan layar 2025-03-17 192423](https://github.com/user-attachments/assets/ae23f9fd-4df7-435b-a094-588277024699)

c) Calculate the average Final Score (UAS) of all students using the Brute Force approach.

![Cuplikan layar 2025-03-17 192513](https://github.com/user-attachments/assets/9f9e8231-4c54-4405-b524-41180a61f45e)

## Main : 

![Cuplikan layar 2025-03-17 192606](https://github.com/user-attachments/assets/1cd2b2e1-b744-45d1-bcbc-95054b2e3ea6)

## Result : 

![Cuplikan layar 2025-03-17 192702](https://github.com/user-attachments/assets/a187d66d-9b69-48c4-86fa-e85e5cf9bd46)
























































































