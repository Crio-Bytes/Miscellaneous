# Introduction
Interface is a shared boundary across which two or more separate components of a computer system exchange information. This exchange can take place between softwares,
hardwares, peripheral devices, humans or a combination of these.  
In Java, interface refers to an abstract type that is used to specify a behaviour that classes must implement. It serves as a blueprint of a class having static constants
and abstract methods. Didn't get it? Let's make things simpler for you with the help of an example:  
Do you remember the corrugated cardboard sheet which is used for preparing cardboard boxes?  
--------------------link to image-------------------  
The cardboard sheet manufacturing company prepares sheets of different densities and supplies them in some standard sizes to other companies. The boxes of pizza you 
received, box of shoes you bought, the packaging of parcel handed over to you by the delivery guy and the carton of your new AC or fridge, all of them are different 
yet they are made of more or less material of similar properties. All these companies have made cuts, folds, prints etc. on that cardboard sheet according their 
requirements so as to obtain cardboard boxes of desired shapes and sizes. Consider interfaces as those cardboard sheets already having some properties(levels of
corrugation, density, thickness etc.), which are used by the companies to make packaging boxes of different types. But packaging boxes still possess the original
characteristics of that cardboard sheet and are also having their own characteristics like prints, shape, size, brand logo etc.  
I hope things are quite clear now, Let's move on to the interesting part of this microbyte- Activities. But before that, please make sure you fulfil all the pre-requisites
mentioned.

# Pre-requisites
 * JDK 1.6 or above must be installed
 * Any Java IDE(NetBeans, IntelliJ, Eclipse etc.) must be installed, I prefer Eclipse so if you want you can download it from here:  
 ----------------------------download link--------------------------------------
 * Writing and compiling java code in Eclipse (optional)
 * It would be better, if you have a little bit knowledge of these concepts in Java (You can refer the resources provided in case you don't know about these) -
   * Classes and Objects  --------link----------
   * Inheritance  --------link----------
   * Abstraction  --------link----------
   
# Activities
 ## Activity-1 : Understanding Abstract Methods
 Are you familiar with methods in Java? If not, check this out before moving further:  
 -----------------------link----------------------------
 ### Abstract Method :
 A method without body (implementation) is called an abstract method. In Java, abstract method looks like-  
 ```Java
      //Notice that keyword 'abstract' and just the method signature is given with a semicolon in the end
      public abstract int calculateArea(int length, int breadth);
```
***Note*** :
* *The class in which abstract methods are defined should be declared as 'abstract'*
* *When a regular class inherits that abstract class, it can provide implementation for that inherited abstract method.*

### Task :
  1) You have to create a class **Area** with 'abstract' keyword and inside that class define two methods: **calculateArea()** and **display()**. Refer this code 
  and utilize the hints provided in the comments there.  
  -----------------------------link to code file---------------------------------------
  2) Next, you have to create another class(in the same package where you created class **Area**) **RectangleArea** which inherits/extends the class **Area**. Within
  this class, implement the abstract method **calculateArea()** and complete the **main()** method according to the hints provided in comments of this file-  
  -----------------------------link to code file---------------------------------------  
  3) After writing all the code, save and run the code in java file having class **RectangleArea** i.e. **RectangleArea.java**. And match your output with this:
-------------------------------------output image link--------------------------------------

### Takeaways :
Congratulations!! if you have made it so far, you have learnt-
* The concept of ***Method Overriding*** by providing implementation for abstract methods while inheriting them in another class.
* about ***Abstract classes***. Class **Area** that you defined with keyword abstract is an abstract class. An abstract class can have abstract as well as regular 
methods. In fact, it is not necessary to have an abstract method inside such class. We cannot create an object of such class but we can inherit it. You can further
read about abstract classes from here:
---------------------------link for abstract class ----------------------------------------  

 ## Activity-2 : Creating Interfaces in Java
 An interface is a collection of abstract methods (about which we have learnt in the previous activity) and static constants. The syntax of creating an interface is
 quite similar to classes in Java, it looks like-
 ```Java
     interface <interface-name>
     {
          //declare data members which are constant fields.
          //declare methods which are abstract by default
     }
```
By default, methods defined inside an interface are public and abstract. So, it is not required to use keyword **abstract** while defining a method inside
the interface. We can also declare data members in an interface which are public, static and final by default.  
***Note :***
* **Data members in an interface must be initialized** (That's why we call them constants:-) ). These constants can be used in other classes through inheritance.
* We cannot declare constructors inside interface unlike abstract classes
* It is invalid to declare interface as **final**
* Interface is designed to be inherited and it cannot be instantiated (object cannot be created) similar to abstract class.
* Similar to the classes, we have to save the Interface code file in this manner:  ```<interface-name>.java```  

### Task :
1) Create a new interface file in your IDE. Create a public interface **BasePrice**
2) Refer the code in this file; declare two constant fields of **float** type and intialize them with the values mentioned in the comments.
----------------link for code file-----------------------------
3) Create three abstract methods in the interface- **calculateShirtPrice()**, **calculateBagPrice()** and **calculateBill()**. For the description of arguments and
return type of the methods, refer the comments in the above code file.
### Takeaways :

    
