|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020230 |
| Name |Garino Wijaya|
| Class | TI - 1I |
| Repository | [link] ((https://github.com/Garinowijaya/PRAKALSD/new/main) |

# Jobsheet VII Searching

## 7.2 Experiment 1 -Sequential Search Method

### 7.2.2 Result
![Screenshot](img/image1.png)
![Screenshot](img/image2.png)

### 7.2.3 Questions Answer
1. The difference is `showData()` display the detail of data that is searched, while `showPosition()` only display wether the data is found or not, and the location of the searched data if found
2. It compares the the value of `search` and the value of `listSTD[i].nim` if it is of the smae valu, then it will assign the value of `position` with the value/index of `i`. And then `break` is used to stop the search if its already found to prevent it looking to unneccessary array
3. No, the program will not run into an error, and the result will still be correct. Because we use sequential search, it will check every element from the start of the array to the end
4. The `position` is initialized by -1 instead of 0 is because, if the data is not found then it will return the value of -1, which will display that the data is not found. If we initialize it with 0, the program will return value 0, which will tell that the data is located in index 0 which is not correct

## 7.3 Experiment 2 -Binary Search Method

### 7.3.2 Result
![image3](https://github.com/user-attachments/assets/aab10a31-3b81-463f-bf22-4db9c0b8775c)

![image4](https://github.com/user-attachments/assets/107162d8-8ca8-4525-91ba-484e8756f19c)


### 7.3.3 Questions Answer
1. The program which runs the divide process is ![Cuplikan layar 2025-04-09 111912](https://github.com/user-attachments/assets/7f794a72-1715-4b8d-b4a8-fdc23114825b)

2. The program which runs the conquer process is, if the element is found ![Cuplikan layar 2025-04-09 112117](https://github.com/user-attachments/assets/b7114eea-6ec2-4839-a369-3c4af4938a33)
, if not found use recursive call ![Cuplikan layar 2025-04-09 112237](https://github.com/user-attachments/assets/a0afe18b-507b-4e42-98d2-4fccf5fed740)
, or `return -1` if not found at all
3. If the data is not sorted, it will return an incorrect answer, because in binary search it is assumed that the aray of data is already sorted in an ascending order. And if it is sorted in a descending order, it will not work correctly. If we want to sort it from descending order we can modify the code like this:![Cuplikan layar 2025-04-09 112714](https://github.com/user-attachments/assets/c239851a-1172-439c-985c-9a86a8091ecf)

4.![Cuplikan layar 2025-04-09 113042](https://github.com/user-attachments/assets/b0470b41-0c6a-4fc0-8358-1e1dc38bc696)

 ![image10](https://github.com/user-attachments/assets/5186dab5-c5e4-44f2-99c4-540bff52d585)


## 7.4 Experiment 3 - Review Divide & Conquer
![image11](https://github.com/user-attachments/assets/d2ce997a-f1d5-46b6-87f0-d3907a6b6caf)


### 7.4.2 Result
![Screenshot](img/image11.png)
