package com.example.oops.demo;

public class NotATightlyEncapsulatedClass {

}

// Note :-  If a class have data member and all data member[s] declared as private then that class is said to be Tightly Encapsulated Class
// In this example Class A has variable `a` is of type int and access modifier of this variable is not private so this class is not a Tightly Encapsulated Class.
// Since base class[ class A ] is not a Tightly Encapsulated Class then it's corresponding all Child classes also cannot be Tightly Encapsulated Class even though child classes have private data members or not
// Thus Class B and Class C are not Tightly Encapsulated Classess.


class A {
	int a =10;
}

class B extends A
{
	private int b=5;
}

class C extends A
{
	private int b=5;
}
