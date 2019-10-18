package testPackage;

public class HashMap {

    int tableSize;

    LinkedList[] hashTable;

    public HashMap(int size) {
        tableSize = size;

        //the hash table is an array of linked lists...
        hashTable = new LinkedList[size];

        //set all to null
        for(LinkedList list: hashTable){
            list = null;
        }
    }

    //return value given a key
    public int get(int key){
        return hashTable[computeHash(key)].get(0).getValue();
    }

    //store a hash entry in the table
    public void put(int key, int value){

        //create the hash entry
        HashEntry hashEntry = new HashEntry(key, value);

        if(hashTable[computeHash(key)] == null){
            //create a new linkedlist???
            //yeah let's try that for fun
            LinkedList linkedList = new LinkedList();
            linkedList.add(hashEntry);
            hashTable[computeHash(key)] = linkedList;
        } else {
            hashTable[computeHash(key)].add(hashEntry);
        }

    }

    public int computeHash(int key){
        return key % tableSize;
    }

}
