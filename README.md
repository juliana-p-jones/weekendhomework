//public class Chapter9Notes {
//    Objects are born and objects die, when they "die" they are abandoned and the Garbage Collecteor (gc) reclaims the memory that the object was using
//
//        Things live in two places: the stack and the Heap
//    The heap is where all objects live. AKA the "Garbage Collectible Heap"
//    The stack is where method invocations and local variables live.
//    Methods are stacked on top of the "Call Stack"
//    the new thing that is pushed onto the stack is the "frame"
//    The method on top of the stack is the one running
//
//
//    Thinking about how much room is needed when creating things...
//        A byte will always hold from 0 and 255 or between -127 and 127 - that means regardless of what number we assign to the byte, it will take up a specific and unchanging amount of space in memory.
//    if cell phone is constructed with an antenna, the cell phone object doesn't house a whole antenna.
//    intead it houses a "remote" that is the reference variable.
//
//
//        EasyStuffWeAlreadyWentOver
//
//    Everyobject has a default constructor- a constructor that takes no arguments
//            We can create many constructors for the same objects, by creating overloaded constructors
//            We can use overloaded constructors cleverly to achieve tasks... for example
//                say we wanted a default duck that comes in the size 35. but we also want to give
//                developers the chance to put in their own size too, in the parameters.
//                    What we can do: is create a default constructor, then put that the size is always 35 if a new duck is made without a size being passed in the parameters
//                    OTHERWISE the developer can pass in the parameters and create a new duck of ~any size~. How smart!
//
//    Ok and to backtrack a bit, that default constructor is ONLY made when you don't make any constructor at all. Otherwise it won't exist, you'll have to manually create a default without arguments
//
//    child class cannot exist before parent class, duh.
//
//            Other Important notes not necessarily from CH 9 reading...
//    Maps have key value pairs. A key, and a value that are mapped to eachother so that one can reference the other.
//    In the collections interface, we have Set and List. Set is none repeating, so if there are any duplicates added to a set... no there aren't. Lists are can contain repetition.
//
//
//}
