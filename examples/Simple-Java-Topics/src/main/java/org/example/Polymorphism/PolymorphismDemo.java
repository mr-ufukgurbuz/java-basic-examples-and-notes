package org.example.Polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;
        plant2.grow();

        tree.shedLeaves();

        doGrow(tree);
        // plant2.shedLeaves();
    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
