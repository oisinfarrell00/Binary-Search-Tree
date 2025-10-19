# 🌳 Binary Search Tree (BST)

## 🧠 Overview
A **Binary Search Tree (BST)** is a type of **binary tree** where each node follows a specific ordering property:
- Every node’s **left child** contains a value **less than** the node’s value.
- Every node’s **right child** contains a value **greater than** the node’s value.

This structure allows **efficient searching, insertion, and deletion** — all in **O(log n)** time on average.

---

## ⚙️ Key Operations

| Operation | Description | Average Time | Worst Case | Notes |
|------------|--------------|---------------|-------------|--------|
| **Search** | Find whether a value exists in the tree | O(log n) | O(n) | Follows path left/right recursively until found |
| **Insert** | Add a new value while maintaining BST property | O(log n) | O(n) | Recursively find the correct position |
| **Delete** | Remove a node and restructure tree accordingly | O(log n) | O(n) | Three cases: leaf, one child, or two children |
| **Traversal** | Visit nodes in specific order (Inorder, Preorder, Postorder) | O(n) | O(n) | Inorder gives sorted output |

---

## 🗑️ Deletion – 3 Cases
1. **Node is a leaf:** Simply remove it.  
2. **Node has one child:** Replace the node with its child.  
3. **Node has two children:**  
   - Find the **inorder successor** (smallest value in the right subtree).  
   - Replace node’s value with successor’s value.  
   - Delete the successor node.

---

## 🔁 Traversals
- **Inorder (Left → Root → Right)** → Sorted order output  
- **Preorder (Root → Left → Right)** → Used for tree copying  
- **Postorder (Left → Right → Root)** → Used for tree deletion  

---

## 📊 Complexity Summary

| Operation | Average Case | Worst Case | Space Complexity |
|------------|---------------|-------------|------------------|
| Search | O(log n) | O(n) | O(h) (stack depth) |
| Insert | O(log n) | O(n) | O(h) |
| Delete | O(log n) | O(n) | O(h) |

> ⚠️ **Note:** Worst case occurs when the tree becomes **unbalanced** (e.g., inserting sorted data without balancing), forming a *linked list*.  
> To prevent this, use **self-balancing BSTs** like AVL or Red-Black Trees.

---

## 💡 Why Use a BST?
✅ Faster than arrays or linked lists for search/insert/delete (on average)  
✅ Maintains sorted order of elements  
✅ Great for range queries and ordered data  

---

## 💻 Code Reference
This repo includes:
- `insert(Node root, int key)`
- `search(Node root, int key)`
- `delete(Node root, int key)`
- `inorderTraversal(Node root)`

Each demonstrates **recursive logic** and how parent-child relationships are maintained during modification.

---

## 🧩 Interview Tip
> “A BST gives me logarithmic efficiency for sorted data operations — but only if it’s balanced.  
> That’s why balanced variants like AVL or Red-Black trees are often preferred in production systems.”

---

