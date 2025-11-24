package es.uniovi.ds.lab.nodes.statements;

import es.uniovi.ds.lab.nodes.expressions.Variable;

public class Input implements Statement {

    // NOTE: they should be private with getters and setters, but are left public to streamline the class
    public Variable variable;

    public Input(Variable variable) {
        this.variable = variable;
    }

}
