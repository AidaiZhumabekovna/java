package oop.principsOOP.interface1.interface0;

public interface Printable {


    // Inside interface all method are public and abstract
    // creating method it does not have body
    //implements - chtoby realizovat
    //with interface we can inherit neskol'ko raz
    //in interface methods only abstractly
    // Printable book2 = new Book("Aitmatov", "first teacher", 444, 1993);
    // System.out.println(book2.print());  // it is like List l = new ArrayList();
    // there we can use only print method , we cannot use everything in Book
    // with interface forbidden create object
    //In interface we do not create properties we create constants
    // Any method in interface is public abstract
    // cannot create constructor for constant
    //can create only 3 things: constants, method without body, enum
    //public static final int sample = 1; // in interface everything is  public static final automatically


    // class                    abstract class                              interface
    // --------------------------------------------------------------------------------------------------
    //instance var              instance var                               constance
    //constructor                constructor                                ------
    //method                     method                                     ------
    //                           abstract method                             abstract method(key words: public & abstract are redundant
    //                                                                       default method

    //default -> keyword -> in switch case
    //default -> key word -> interface method's
    //default -> access modifies
    // for ex: breathe(), or sound() of phones (iphone, nokia)

    //default method in interface we can change(override, overload) or no change
    // default me
    int SAMPLE = 1;

    String print();

    default int getSample(){
        return SAMPLE;
    }

    default int getSample(int SAMPLE){
        return SAMPLE;
    }

}
