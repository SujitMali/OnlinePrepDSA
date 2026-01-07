package _2_Non_Linear_Data_Structures_Practice;

import java.util.Scanner;

public class _2_BinarySearchTree {
    public static void main(String[] args) {

        //Remember that the Binary tree has no instruction for insertion
        //BST is the one which has strict instruction that bigger should be on left
        //and the smaller should be on right.

        //TreeNode root = new TreeNode(1);
        //TreeNode leftChild = new TreeNode(2);
        //TreeNode rightChild = new TreeNode(3);
        //root.left = leftChild;
        //root.right = rightChild;
        //preOrder(root);
        //inOrder(root);
        //postOrder(root);

        TreeNode root = null; // Start empty
        // Insert numbers in random order
        root = insert(root, 50);
        insert(root, 20);
        insert(root, 70);
        insert(root, 10);
        insert(root, 80);
        // Magic Test
        System.out.print("Sorted: ");
        inOrder(root);

    }

    // 1. PRE-ORDER (Root First)
    public static void preOrder(TreeNode node) {
        if (node == null) return; // Stop at the bottom

        System.out.print(node.data + " "); // 1. ROOT
        preOrder(node.left);               // 2. Left
        preOrder(node.right);              // 3. Right
    }

    // 2. IN-ORDER (Root Middle)
    public static void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);                // 1. Left
        System.out.print(node.data + " "); // 2. ROOT
        inOrder(node.right);               // 3. Right
    }

    // 3. POST-ORDER (Root Last)
    public static void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);              // 1. Left
        postOrder(node.right);             // 2. Right
        System.out.print(node.data + " "); // 3. ROOT
    }
    // 4. Insertion in BST.
    public static TreeNode insert(TreeNode current, int value) {
        // 1. BASE CASE: We found an empty spot! Create the node here.
        if (current == null) {
            return new TreeNode(value);
        }

        // 2. RECURSION: Decision Time
        if (value < current.data) {
            // Go Left (and link the result back to current.left)
            current.left = insert(current.left, value);
        }
        else if (value > current.data) {
            // Go Right
            current.right = insert(current.right, value);
        }

        // 3. Return the pointer (keeps the chain connected)
        // 3. Return the pointer (keeps the chain connected)
        return current;
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}





// ================= AVL Tree ==================
//package _2_Non_Linear_Data_Structures_Practice;
//
//import java.util.Scanner;
//
//public class _2_BinarySearchTree {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Node root = null;
//
//        System.out.println("╔═══════════════════════════════════════════════╗");
//        System.out.println("║     AVL SELF-BALANCING TREE VISUALIZER       ║");
//        System.out.println("╚═══════════════════════════════════════════════╝");
//        System.out.println("Enter numbers to insert. Type 'exit' to stop.\n");
//
//        while (true) {
//            System.out.print("Insert → ");
//            String input = sc.next();
//
//            if (input.equalsIgnoreCase("exit")) break;
//
//            try {
//                int value = Integer.parseInt(input);
//                root = insert(root, value);
//
//                System.out.println("\n🌳 AVL Tree Structure (Auto-Balanced):");
//                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
//                System.out.println("(Smaller ← LEFT | RIGHT → Bigger)\n");
//                printTree(root, "", false);
//                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
//
//            } catch (NumberFormatException e) {
//                System.out.println("⚠️  Invalid input. Enter a number.\n");
//            }
//        }
//
//        System.out.println("\n📊 Final Tree Statistics:");
//        System.out.println("Height: " + height(root));
//        System.out.println("Nodes: " + countNodes(root));
//        System.out.print("InOrder (Sorted): ");
//        inOrder(root);
//        System.out.println("\n");
//    }
//
//    // ================= AVL INSERT =================
//
//    static Node insert(Node node, int key) {
//
//        // Standard BST insert
//        if (node == null) return new Node(key);
//
//        if (key < node.data)
//            node.left = insert(node.left, key);
//        else if (key > node.data)
//            node.right = insert(node.right, key);
//        else
//            return node; // Duplicate not allowed
//
//        // Update height
//        node.height = 1 + Math.max(height(node.left), height(node.right));
//
//        // Get balance factor
//        int balance = getBalance(node);
//
//        // Left Left Case (LL)
//        if (balance > 1 && key < node.left.data)
//            return rightRotate(node);
//
//        // Right Right Case (RR)
//        if (balance < -1 && key > node.right.data)
//            return leftRotate(node);
//
//        // Left Right Case (LR)
//        if (balance > 1 && key > node.left.data) {
//            node.left = leftRotate(node.left);
//            return rightRotate(node);
//        }
//
//        // Right Left Case (RL)
//        if (balance < -1 && key < node.right.data) {
//            node.right = rightRotate(node.right);
//            return leftRotate(node);
//        }
//
//        return node;
//    }
//
//    // ================= ROTATIONS =================
//
//    static Node rightRotate(Node y) {
//        Node x = y.left;
//        Node T2 = x.right;
//
//        // Perform rotation
//        x.right = y;
//        y.left = T2;
//
//        // Update heights
//        y.height = Math.max(height(y.left), height(y.right)) + 1;
//        x.height = Math.max(height(x.left), height(x.right)) + 1;
//
//        return x;
//    }
//
//    static Node leftRotate(Node x) {
//        Node y = x.right;
//        Node T2 = y.left;
//
//        // Perform rotation
//        y.left = x;
//        x.right = T2;
//
//        // Update heights
//        x.height = Math.max(height(x.left), height(x.right)) + 1;
//        y.height = Math.max(height(y.left), height(y.right)) + 1;
//
//        return y;
//    }
//
//    // ================= HELPER FUNCTIONS =================
//
//    static int height(Node node) {
//        return node == null ? 0 : node.height;
//    }
//
//    static int getBalance(Node node) {
//        return node == null ? 0 : height(node.left) - height(node.right);
//    }
//
//    static int countNodes(Node node) {
//        if (node == null) return 0;
//        return 1 + countNodes(node.left) + countNodes(node.right);
//    }
//
//    // ================= BEAUTIFUL TREE PRINTER =================
//    // Shows actual tree structure like a real tree with circular nodes
//
//    static void printTree(Node node, String prefix, boolean isLeft) {
//        if (node == null) return;
//
//        // Print right subtree first (top of visual)
//        if (node.right != null) {
//            printTree(node.right, prefix + (isLeft ? "│       " : "        "), false);
//        }
//
//        // Print current node with proper connections
//        System.out.println(prefix + (isLeft ? "└───────" : "┌───────") + "(" + node.data + ")");
//
//        // Print left subtree (bottom of visual)
//        if (node.left != null) {
//            printTree(node.left, prefix + (isLeft ? "        " : "│       "), true);
//        }
//    }
//
//    // ================= TREE TRAVERSALS =================
//
//    static void inOrder(Node node) {
//        if (node == null) return;
//        inOrder(node.left);
//        System.out.print(node.data + " ");
//        inOrder(node.right);
//    }
//}
//
//// ================= NODE CLASS =================
//
//class Node {
//    int data;
//    int height;
//    Node left, right;
//
//    Node(int data) {
//        this.data = data;
//        this.height = 1;
//    }
//}