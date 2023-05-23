package me.exercise.recursion;

public class TreeNode {
    private int value; // ключ узла
    private TreeNode leftChild; // Левый узел потомок
    private TreeNode rightChild; // Правый узел потомок

    public void printNode() { // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение :" + value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(final TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
