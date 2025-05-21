|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020230 |
| Name |Garino Wijaya|
| Class | TI - 1I |
| Repository | [link] (https://github.com/Garinowijaya/PRAKALSD/new/main) |

# Jobsheet XII Linked List

## 2.1 Experiment 1 Implementing Single Linked List
### 2.1.2 Output Verification  
![Cuplikan layar 2025-05-21 204827](https://github.com/user-attachments/assets/600b0b9c-a0e7-4219-926b-3c8c937d74cb)


### 2.1.3 Questions Answer
1. Because the first command that we write is to print the linkedlist while we have not add any data, so the result is the linkedlist is empty
2. The general purpose is a temporary pointer used to traverse the linked list starting from the head. In `print()` it is used to loop through the list from the head to the tail and print each node’s student data. In `insertAfter(Student std, String key)` it is used to searches through the list to find the node with a name matching key. Once found, it inserts the new node after it. In `insertAt(int index, Student std)` it is used to moves through the list to reach the node just before the target index, so the new node can be inserted at the correct position.
3. ![image2](https://github.com/user-attachments/assets/52e979e4-19a9-4ba4-8b85-d657ef9d4990)
![image3 (1)](https://github.com/user-attachments/assets/8b60d316-aae9-4d94-96e8-e5b666d1fb5f)

4. If we remove the tail attribute, we will need to traverse to the end everytime when we try to add new data on `addLast()`

## 2.2 Experiment 2 Accessing Element in Single Linked List
### 2.2.2 Output verification
![image4 (1)](https://github.com/user-attachments/assets/8772288b-32a8-4439-a097-d6c8d8f9578a)

### 2.2.3 Questions Answer
1. The break is used to exit the loop as soon as the target node is found and removed
2. `temp.next = temp.next.next;` is used to remove the node after `temp` by skipping it, then the `if` command will check, if `temp.next == null` it will assign `tail` with the value index of `temp`

## ASSIGNMENT
The implementation can be seen on the source file `Student19.java`, `Node19.java`, `LinkedQueue.java`, and `MainLinkQueue.java`.  
![image5](https://github.com/user-attachments/assets/12226f57-0998-4c57-90cb-d664fe22a7a9)
![image6](https://github.com/user-attachments/assets/fc996ddb-3e53-4c67-9b42-835e7ed15a4d)
![image7](https://github.com/user-attachments/assets/54b04911-6b67-4387-a4ff-cff79f48f8e1)
![image8](https://github.com/user-attachments/assets/b1120a48-39e7-495a-a783-b9fac111a6b4)
![image9](https://github.com/user-attachments/assets/7dc45a1a-7ad8-40e9-a4e1-a12d68f661e1)
