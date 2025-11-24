package es.uniovi.ds.lab.executor;

import java.util.*;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;
import es.uniovi.ds.lab.visitor.Visitor;

public class ExecutorlVisitor {

    private Scanner scanner = new Scanner(System.in);

    // Auxiliary method to get an integer input from the user
    private int getUserInput() {
        return scanner.nextInt();
    }
}
