package cse41321.homework;
import cse41321.algorithms.QuickSort;

import java.util.Comparator;


// a)
//Implement	a	comparator called CompareCarsByMakeThenModel that	can	be	passed
//as	an	argument	to	the	quicksort method from	the	lecture	notes.
//CompareCarsByMakeThenModel should	return	a	value	that	will	cause	quicksort		to	sort	an
//array	of	cars	in	ascending	order (from	smallest	to	largest) by	make and, when	two	cars	have	the
//same	make,	in	ascending	order	by	model.
public class Homework3 {
    class Car {
        public String make;
        public String model;
        public int mpg; // miles per gallon
    }

    // compare two cars using make and model
    public class CompareCarsByMakeThenModel implements Comparator<Car> {
        public int compare(Car c1, Car c2) {
            // int makeCompare is dynamic compare car's makes first
            // sort makes from smallest to largest
            int makeCompare = c1.make.compareTo(c2.make);
            // > 0 and returns 1 represents in ascending order
            if (makeCompare > 0) {
                return 1;
            }
            if (makeCompare < 0) {
                return -1;
            }
            // after compare car's make, compare cars model
            // sort model frm smallest to largest
            int modelCompare = c1.model.compareTo(c2.model);
            // > 0 and returns 1 represents in ascending order
            if (modelCompare > 0) {
                return 1;
            }
            if (modelCompare < 0)
                return -1;
            return 0;
        }
    }


// b)
// Implement	a	comparator called	CompareCarsByDescendingMPG that	can	be	passed
//as	an	argument	to	the	quicksort method from	the	lecture	notes.
//CompareCarsByDescendingMPG should	return	a	value	that	will	cause	quicksort		to	sort	an
//array	of	cars	in	descending	order	(from	largest	to	smallest)	by	mpg.

    public class CompareCarsByDescendingMPG implements Comparator<Car> {
        public int compare(Car c1, Car c2) {
            // descending order if c1's mpg - c2's mpg have a return of positive
            // c1's mpg will have lager than c2's mpg, if negative will be smaller than
            int mpgCompare = c1.mpg - c2.mpg;
            if (mpgCompare < 0) {
                return 1;
            }
            if (mpgCompare > 0) {
                return -1;
            }
            return 0;
        }
    }

// c)
// Implement	a	comparator called	CompareCarsByMakeThenDescendingMPG that	can
//be	passed	as	an	argument	to	the	quicksort method	from	the	lecture	notes.
//CompareCarsByMakeThenDescendingMPG should	return	a	value	that	will	cause	quicksort
//to	sort	an	array	of	cars	in	ascending	order	by	make and, when	two	cars	have	the	same	make,	in
//descending	order	by	mpg.

    public class CompareCarsByMakeThenDescendingMPG implements Comparator<Car> {
        public int compare(Car c1, Car c2) {
            // int makeCompare is dynamic compare car's makes first
            // sort makes from smallest to largest
            int makeCompare = c1.make.compareTo(c2.make);
            // > 0 and returns 1 represents in ascending order
            if (makeCompare > 0) {
                return 1;
            }
            if (makeCompare < 0) {
                return -1;
            }
            // descending order if c1's mpg - c2's mpg have a return of positive
            // c1's mpg will have lager than c2's mpg, if negative will be smaller than
            int mpgCompare = c1.mpg - c2.mpg;
            if (mpgCompare < 0) {
                return 1;
            }
            if (mpgCompare > 0) {
                return -1;
            }
            return 0;
        }
    }


// d)
// Write	a	main method	that	tests	your	methods from	parts	a-c	with	the	following
//array	of	cars:
    // firstable need a display method to call to printin all cars make model and mpgs
    // creating an new array conteins all cars
    public static void printCars(Car[] cars) {
        int length = cars.length;
        System.out.printf("make model mpg\n\n");
        for (int i = 0; i < length; i++) {
            System.out.printf("%. %. %5d\n", cars[i].make, cars[i].model, cars[i].mpg);
        }
    }
    // main to test a-c parts
    public static void main(String[] args) {
        Car cars[] = {
                { "Toyota", "Camry", 33 },
                { "Ford", "Focus", 40 },
                { "Honda", "Accord", 34 },
                { "Ford", "Mustang", 31 },
                { "Honda", "Civic", 39 },
                { "Toyota", "Prius", 48 },
                { "Honda", "Fit", 35 },
                { "Toyota", "Corolla", 35 },
                { "Ford", "Taurus", 28 }
        };

    }
}



Toyota,  Camry,   33}
        {Ford,    Focus,   40}
        {Honda,   Accord,  34}
        {Ford,    Mustang, 31}
        {Honda,   Civic,   39}
        {Toyota,  Prius,   48}
        {Honda,   Fit,     35}
        {Toyota,  Corolla, 35}
        {Ford,    Taurus,  28}

        {Ford,    Focus,   40}
        {Ford,    Mustang, 31}
        {Ford,    Taurus,  28}
        {Honda,   Accord,  34}
        {Honda,   Civic,   39}
        {Honda,   Fit,     35}
        {Toyota,  Camry,   33}
        {Toyota,  Corolla, 35}
        {Toyota,  Prius,   48}

        {Toyota,  Prius,   48}
        {Ford,    Focus,   40}
        {Honda,   Civic,   39}
        {Honda,   Fit,     35}
        {Toyota,  Corolla, 35}
        {Honda,   Accord,  34}
        {Toyota,  Camry,   33}
        {Ford,    Mustang, 31}
        {Ford,    Taurus,  28}

        {Ford,    Focus,   40}
        {Ford,    Mustang, 31}
        {Ford,    Taurus,  28}
        {Honda,   Civic,   39}
        {Honda,   Fit,     35}
        {Honda,   Accord,  34}
        {Toyota,  Prius,   48}
        {Toyota,  Corolla, 35}
        {Toyota,  Camry,   33}