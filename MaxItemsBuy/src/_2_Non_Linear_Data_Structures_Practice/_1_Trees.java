package _2_Non_Linear_Data_Structures_Practice;
import java.util.ArrayList;
import java.util.List;

public class _1_Trees {
    public static void main(String[] args) {
        // Create nodes
        NormalTreeNode root = new NormalTreeNode(1);

        NormalTreeNode child1 = new NormalTreeNode(2);
        NormalTreeNode child2 = new NormalTreeNode(3);
        NormalTreeNode child3 = new NormalTreeNode(4);

        // Attach children to root
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Add grandchildren
        child1.children.add(new NormalTreeNode(5));
        child1.children.add(new NormalTreeNode(6));

        child3.children.add(new NormalTreeNode(7));
        printTree(root, 0);

    }

    static void printTree(NormalTreeNode node, int level) {
        if (node == null) return;

        // Indentation based on depth
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        // Print current node
        System.out.println(node.data);

        // Print children
        for (NormalTreeNode child : node.children) {
            printTree(child, level + 1);
        }
    }

}


class NormalTreeNode {
    int data;
    List<NormalTreeNode> children;

    NormalTreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}


