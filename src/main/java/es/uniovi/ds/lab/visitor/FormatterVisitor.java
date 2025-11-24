package es.uniovi.ds.lab.visitor;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;

public class FormatterVisitor implements Visitor {

    @Override
    public void visitProgram(Program program) {
        for (Statement statement : program.statements)
            // visit(statement)
            ;
    }

    @Override
    public void visitInput(Input input) {
        System.out.print("input ");
        visitVariable(input.variable);
        System.out.println(";");
    }

    @Override
    public void visitPrint(Print print) {
        System.out.print("print ");
        // visit(print.expression);
        System.out.println(";");
    }

    @Override
    public void visitArithmetic(Arithmetic arithmetic) {
        // visit(arithmetic.left);
        System.out.print(" " + arithmetic.operator + " ");
        // visit(arithmetic.right);
    }

    @Override
    public void visitVariable(Variable variable) {
        System.out.print(variable.name);
    }

}
