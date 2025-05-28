|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020230|
| Nama | Garino Wijaya |
| Kelas | TI - 1I |
| Repository | |

# Labs #13 Double LINKED LIST

## 12.2.2 Result

![experiment1 (1)](https://github.com/user-attachments/assets/292e856f-bd71-4b19-bc37-c25e6ccddb02)
**12.2.3 Question** 
1. A singly linked list consists of nodes where each node has a next pointer that links to the following node, allowing traversal in only one direction. Meanwhile, doubly linked list contains nodes with both next and prev pointers, enabling bidirectional traversal.
2. next: points to the subsequent node in the list, enabling forward traversal
prev: points to the preceding node, allowing backward traversal.
3. The purpose of the constructor is to initializes an empty list by setting both head and tail to null. This indicate that the list contains no nodes when first created.
4. The code checks if the list is empty. If true, the new node becomes both the head and tail of the list, as it is the only node present.
5. When inserting a new node at the beginning of a non-empty list, head.prev = newNode sets the previous pointer of the current head node to point back to newNode. This establishes a bidirectional link between the new node (now the head) and the former first node.
6. The statement updates the prev pointer of the node that follows current to point to newNode. It ensures the new node is properly linked into the list by placing newNode between current and current.next and maintaining the backward link from current.next back to newNode
7. The print() method implements traversal by iterating through each node starting from head. temp = temp.next advances the temp reference to the next node in the list, allowing the loop to visit every node sequentially until temp becomes null.
8. If the node matching the key (temp) is the tail, this code efficiently appends the new node using addLast(), avoiding manual linkage. If removed, the method would still work but would require explicit handling of tail updates, making the code more error-prone.
9. This code checks whether the nim of the current node matches the search key, ignoring case differences.

## 12.3.2 Result

![experiment2](https://github.com/user-attachments/assets/63340117-0591-4e32-9637-64f289e40dcf)

**12.3.3 Question** 
1. head = head.next moves the head pointer to the next node, effectively removing the first node from the list. head.prev = null ensures the new head node no longer references the removed node (breaks the backward link).
2. This condition checks if the list has only one node, if true both head and tail must be set to null to properly empty the list. Without this check, the methods might incorrectly assume multiple nodes exist, leading to NullPointerException.
3. We can do traverse from head to find the second to last node, then update its next pointer to null like this:

![Cuplikan layar 2025-05-28 132118](https://github.com/user-attachments/assets/9c25ad6f-15d6-402c-a99d-4ca9bed220da)

4. This code handle edge cases where the list is empty, avoiding NullPointerException when attempting to access nodes.
5. At the beginning it calls removeFirst() to update head and break the forward/backward links. At the ened it calls removeLast() to update tail and break the links.
6. The process is first locate the node at index(temp) and update the surrounding nodes links temp.prev.next = temp.next; temp.next.prev = temp.prev;
7. Modified code:

![Cuplikan layar 2025-05-28 132315](https://github.com/user-attachments/assets/21edbdb4-de22-45b6-a2a2-b27d47416523)

## Assignment

1. add()

![Cuplikan layar 2025-05-28 132456](https://github.com/user-attachments/assets/ae34c774-97e4-4ba5-a05b-c387afeed802)

- The method checks if the index is valid
- If index is 0, it calls addFirst()
- If index equals list size, it calls addLast()
- If index is in middle positions, it locates the node before the target position and insert the new node by adjusting pointers
2. removeAfter()

![Cuplikan layar 2025-05-28 132604](https://github.com/user-attachments/assets/e017f5ea-a492-45dd-9ef7-9f8432a7c1bd)

- The method searches for the node containing the key
- If next node is tail, it calls removeLast()
- For middle nodes, it adjust the pointers
3. getFirst(), getLast(), getIndex()

![Cuplikan layar 2025-05-28 132818](https://github.com/user-attachments/assets/68f0c250-6c74-42d1-8bf5-e6d2bfe7b3b7)

- getFirst() returns head's data
- getLast() returns tail's data
- getIndex() validates index, traverses to the specified position and returns the node's data
4. getSize()

![Cuplikan layar 2025-05-28 132923](https://github.com/user-attachments/assets/1cb21986-ac0e-4e3a-a61d-97e426fa9f58)

- The method traverses from head to tail
- Increment counter for each node
- Return total count
5. indexOf()

![Cuplikan layar 2025-05-28 133015](https://github.com/user-attachments/assets/b3a5109f-f0dd-49bc-8a60-c5b70304b8f8)

- The method traverses list while checking each node's nim
- It returns current index if found and -1 if not found


