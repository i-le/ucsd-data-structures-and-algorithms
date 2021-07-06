package cse41321.homework;
import cse41321.containers.SinglyLinkedList;


//#1

public class Homework2 {
    static void appendTerm(SinglyLinkedList<Double> polynomial, Double coefficient) {
        if (coefficient == null) {
            throw new IllegalArgumentException("Argument 'coefficient' must not be null");
        }
        if (polynomial == null) {
            throw new IllegalArgumentException("Argument 'polynomial' must not be null");
        }
        // method to inserting an element to the tail has been written already
        // use the method directly to insert coefficient to polynomial as tail element
        polynomial.insertTail(coefficient);
    }


    //#2
    // method to display given polynomial
    static void display(SinglyLinkedList<Double> polynomial) {
        if (polynomial.isEmpty()) {
            throw new IllegalArgumentException("Argument 'polynomial' must not be null");
        } else {
            // looping thru the linkedlist polynomial
            // getting first value from the linkedlist from head to head.next to null
            SinglyLinkedList<Double>.Element ele = polynomial.getHead();
            while (ele != null) {
                // get size on ele will be presented as x^?
                // if size = 4, the highest x^exponent will be x^3 = x^?(size - 1)
                // everytime the loop ends, size of the linkedlist will -1
                // ele.getSize() will be exponent
                // ele.getData() will be coefficient
                System.out.println(ele.getData() + "x" + "^" + polynomial.getSize());
                ele = ele.getNext();
            }
        }
    }

    //#3
    // method to evaluate polynomial for given x value
    static Double evaluate(SinglyLinkedList<Double> polynomial, Double x) {
        // method will be return to a value called result
        // loop thru the linkedlist, get coefficient
        double result = 0;
        // 1, 2, 3, 4 size = 4, i -> 0 = 1
        //                      i -> 1 = 2
        // ..
        //                      i -> 3 = 4
        if (polynomial == null) {
            throw new IllegalArgumentException("Argument 'polynomial' must not be null");
        } else {
            for (int i = 0; i < polynomial.getSize(); i++) {
                SinglyLinkedList<Double>.Element ele = polynomial.getHead();
                // result = coefficient(getData()) * (x^y)
                // pow(double x, double y) = x^y, x = Double x, y = exponent = i
                result = ele.getData() * Math.pow(x, i) + result;
            }
        }
        return result;
    }

    //#4
    public static void main(Double[] args) {
        // init a new singly linked list called polynomial
        // apply method appendTerm to insert elements into the empty linked list
        // display the linked list
        // evaluate by given x value into the linked list
        SinglyLinkedList<Double> polynomial = new SinglyLinkedList<Double>();
        appendTerm(polynomial, 6.0);
        appendTerm(polynomial, 0.0);
        appendTerm(polynomial, -5.3);
        appendTerm(polynomial, 3.1);
        display(polynomial);
        evaluate(polynomial, 7.0);
        // init a new singly linked list called polynomial1
        // apply method appendTerm to insert elements into the empty linked list
        // display the linked list
        // evaluate by given x value into the linked list
        SinglyLinkedList<Double> polynomial1 = new SinglyLinkedList<Double>();
        appendTerm(polynomial1, 1.0);
        appendTerm(polynomial1, 1.0);
        display(polynomial1);
        evaluate(polynomial1, 1.0);
        // init a new singly linked list called polynomial2
        // apply method appendTerm to insert elements into the empty linked list
        // display the linked list
        // evaluate by given x value into the linked list
        SinglyLinkedList<Double> polynomial2 = new SinglyLinkedList<Double>();
        appendTerm(polynomial2, 1.0);
        appendTerm(polynomial2, 1.0);
        display(polynomial2);
        evaluate(polynomial2, 2.03);
        // init a new singly linked list called polynomial3
        // apply method appendTerm to insert elements into the empty linked list
        // display the linked list
        // evaluate by given x value into the linked list
        SinglyLinkedList<Double> polynomial3 = new SinglyLinkedList<Double>();
        appendTerm(polynomial3, -3.0);
        appendTerm(polynomial3, 0.5);
        appendTerm(polynomial3, -2.0);
        display(polynomial3);
        evaluate(polynomial3, 05.0);
        // init a new singly linked list called polynomial4
        // apply method appendTerm to insert elements into the empty linked list
        // display the linked list
        // evaluate by given x value into the linked list
        SinglyLinkedList<Double> polynomial4 = new SinglyLinkedList<Double>();
        appendTerm(polynomial4, -0.3125);
        appendTerm(polynomial4, -9.915);
        appendTerm(polynomial4, -7.75);
        appendTerm(polynomial4, -40.0);
        display(polynomial4);
        evaluate(polynomial4, 123.45);
    }
}



