class Animal{}//we can create empty class if we dont have any 
//variables and methods 

class Dog extends Animal{}
class Cat extends Animal{}


public class Main
{
	public static void main(String[] args) {
		Animal an=new Animal();//animal class of object 
		Cat ct=(Cat)an;//as per rule 2 valid 
		//rule1: conversion is valid or not 
		//there is a relationship between cat and animal class 
		//so conversion is valid 
		/*Dog dg=new Dog();
		Cat ct=(Cat) dg;*///this is not valid according to rule 1 
		//rule2: assignment is valid or not 
		// c must be either same or child of A 
		//Cat ct=(Dog) an;//not valid according to rule2
		//because we are converting to dog type but storing in cat so not valid 
		//rule3: the underlaying object od 'd' must be either same or child of 'c'
		
	}
}
