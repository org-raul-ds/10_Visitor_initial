package es.uniovi.ds.lab.visitor;

import static java.lang.System.out;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;

public class FormatterVisitor implements Visitor {

    @Override
    public void visitProgram(Program program) {
        for (Statement statement : program.statements)
            // visit(statement);
            ;
    }

    @Override
    public void visitInput(Input input) {
        out.print("input ");
        visitVariable(input.variable);
        out.println(";");
    }

    @Override
    public void visitPrint(Print print) {
        out.print("print ");
        // visit(print.expression);
        out.println(";");
    }

    @Override
    public void visitArithmetic(Arithmetic arithmetic) {
        // visit(arithmetic.left);
        out.print(" " + arithmetic.operator + " ");
        // visit(arithmetic.right);
    }

    @Override
    public void visitVariable(Variable variable) {
        out.print(variable.name);
    }

}
