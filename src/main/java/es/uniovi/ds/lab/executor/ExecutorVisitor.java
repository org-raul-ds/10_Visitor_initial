package es.uniovi.ds.lab.executor;

import java.util.*;

import es.uniovi.ds.lab.nodes.Program;
import es.uniovi.ds.lab.nodes.expressions.*;
import es.uniovi.ds.lab.nodes.statements.*;
import es.uniovi.ds.lab.visitor.Visitor;

/*
// Input
    input heigth;
    input width;
    print heigth * width;

// Output
    Type value for heigth: 5
    Type value for width: 10
    50
*/

/*
Requirements:
- All variables are of `int` type.
- If you access an uninitialized variable, it defaults to 0.
- Only has addition, subtraction, multiplication, and division.
*/

public class ExecutorVisitor {

    private Scanner scanner = new Scanner(System.in);

    // Auxiliary method to get an integer input from the user
    private int getUserInput() {
        return scanner.nextInt();
    }
}
