package es.uniovi.ds.lab.nodes.statements;

import es.uniovi.ds.lab.nodes.expressions.Expression;

public class Print implements Statement {

    // NOTE: they should be private with getters and setters, but are left public to streamline the class
    public Expression expression;

    public Print(Expression expression) {
        this.expression = expression;
    }

}
