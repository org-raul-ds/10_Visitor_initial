package es.uniovi.ds.lab.visitor;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;

public interface Visitor {

    void visitProgram(Program program);

    void visitInput(Input input);

    void visitPrint(Print print);

    void visitArithmetic(Arithmetic arithmetic);

    void visitVariable(Variable variable);

}
