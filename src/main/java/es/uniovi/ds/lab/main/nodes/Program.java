package es.uniovi.ds.lab.main.nodes;

import java.util.*;

import es.uniovi.ds.lab.main.nodes.statements.Statement;

public class Program implements Node {

    // NOTE: they should be private with getters and setters, but are left public to streamline the class
    public List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = new ArrayList<>(statements);
    }

}
