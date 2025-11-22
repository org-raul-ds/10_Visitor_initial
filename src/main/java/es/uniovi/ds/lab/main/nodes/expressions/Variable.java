package es.uniovi.ds.lab.main.nodes.expressions;

public class Variable implements Expression {

    // NOTE: they should be private with getters and setters, but are left public to streamline the class
    public String name;

    public Variable(String name) {
        this.name = name;
    }

}
