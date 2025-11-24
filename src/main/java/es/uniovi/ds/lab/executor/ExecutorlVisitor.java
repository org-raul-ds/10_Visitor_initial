package es.uniovi.ds.lab.executor;

import java.util.*;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;
import es.uniovi.ds.lab.visitor.Visitor;

public class ExecutorlVisitor {

    // Auxiliary method to get an integer input from the user
    private int getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
