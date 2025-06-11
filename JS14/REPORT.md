|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020230 |
| Name |Garino Wijaya|
| Class | TI - 1I |
| Repository | [link] (https://github.com/Garinowijaya/PRAKALSD) |

# Jobsheet XIV Tree
## 14.2 Experiment 1
### 14.2.1 Results
![Cuplikan layar 2025-06-11 191540](https://github.com/user-attachments/assets/e09c67c8-207b-482e-a3c7-7fb97071811e)
![Cuplikan layar 2025-06-11 191608](https://github.com/user-attachments/assets/1646a5ae-f333-483d-9b5e-93d6b3980b2f)

### 14.2.2 Question Answers
1. Because binary search tree maintains, a concistent sorted structure where the left child node is always smaller than the parent node, and the right child node is always bigger than the parent node. This allows the tree to search like a sorted array
2. In node class the `left` is used to point to the left child node, while `right` attribute point to the right child node
3a. `root` is the the topmost node, the starting point of the tree, where operation like traverse, add, delete etc starts.
3b. The initial value is set to `null`, meaning the tree is empty
4. If the tree is empty (`root == null`), then a new node containing the data is created. This new node is assigned as the root of the tree. This means the first node added becomes the starting point (`root`) of the entire Binary Search Tree (BST).
5. The general purpose of the code is to correctly position a new student node based on their IPK value by navigating the tree from the root down. If new IPK is smaller, go left:
If left child exists → continue down
If left child is null → insert node here
If new IPK is larger, go right:
If right child exists → continue down
If right child is null → insert node here
6. Locate the node to delete (`current`).
Because it has two children, we need to, replace `current` with a node that preserves the BST property.
The best replacement is the smallest node in the right subtree of current.
Call getSuccessor(current):
Finds the in-order successor.
If `successor` is not current.right, it relocates the `successor`'s right child (if any) properly.
Replace current with `successor`:
`successor.left` = `current.left`
And connect successor to parent of current.
`getSuccesor()` assist by finding the smallest node in the right subtree (in-order successor).
Replaces the deleted node with this successor.
Adjusts pointers to maintain the BST order.
