package es.uniovi.ds.lab.format;

import es.uniovi.ds.lab.main.nodes.Program;
import es.uniovi.ds.lab.main.nodes.expressions.*;
import es.uniovi.ds.lab.main.nodes.statements.*;

public class Formatter {

    public void formatProgram(Program program) {
        for (Statement statement : program.statements)
            // format(statement)
            ;
    }

    public void formatInput(Input input) {
        System.out.print("input ");
        formatVariable(input.variable);
        System.out.println(";");
    }

    public void formatPrint(Print print) {
        System.out.print("print ");
        // format(print.expression);
        System.out.println(";");
    }

    public void formatVariable(Variable variable) {
        System.out.print(variable.name);
    }

    public void formatArithmetic(Arithmetic arithmetic) {
        // format(arithmetic.left);
        System.out.print(" " + arithmetic.operator + " ");
        // format(arithmetic.right);
    }

}
