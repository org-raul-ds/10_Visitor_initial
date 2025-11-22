package es.uniovi.ds.lab.visitor;

import es.uniovi.ds.lab.main.nodes.Program;
import es.uniovi.ds.lab.main.nodes.expressions.*;
import es.uniovi.ds.lab.main.nodes.statements.*;

public class FormatterVisitor implements Visitor {

    @Override
    public void visit(Program program) {
        for (Statement statement : program.statements)
            // format(statement)
            ;
    }

    @Override
    public void visit(Input input) {
        System.out.print("input ");
        // formatVariable(input.variable);
        System.out.println(";");
    }

    @Override
    public void visit(Print print) {
        System.out.print("print ");
        // format(print.expression);
        System.out.println(";");
    }

    @Override
    public void visit(Variable variable) {
        System.out.print(variable.name);
    }

    @Override
    public void visit(Arithmetic arithmetic) {
        // format(arithmetic.left);
        System.out.print(" " + arithmetic.operator + " ");
        // format(arithmetic.right);
    }

}
