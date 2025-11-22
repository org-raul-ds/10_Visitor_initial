package es.uniovi.ds.lab.visitor;

import es.uniovi.ds.lab.main.nodes.Program;
import es.uniovi.ds.lab.main.nodes.expressions.*;
import es.uniovi.ds.lab.main.nodes.statements.*;

public interface Visitor {

    void visit(Program program);

    void visit(Input input);

    void visit(Print print);

    void visit(Variable variable);

    void visit(Arithmetic arithmetic);
}
