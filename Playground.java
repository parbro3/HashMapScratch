package testPackage;

public class Playground {

    public void play(){


        HashMap hashTable = new HashMap(128);

        //initialize with three values
        hashTable.put(0, 2);
        hashTable.put(2,4);
        hashTable.put(4,2);


        //test by putting same key.. different value
        //but keys are unique!
        hashTable.put(0,4);
        hashTable.put(0,3);
        hashTable.put(2,2);




    }

}