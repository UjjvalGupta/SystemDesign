public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 1<<4; //left shift 4 times = 16
    private static final int MAX_CAPACITY = 1<<30;
    private Entry[] entries;

    MyHashMap(){
        entries = new Entry[DEFAULT_SIZE];
    }

    MyHashMap(int capacity){
        int size = getSize(capacity);
        entries = new Entry[size];
    }

    private int getSize(int capacity) {
        int n = capacity - 1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;
        return n<0 ? 1 : n>= MAX_CAPACITY ? MAX_CAPACITY : n+1;
    }

    void put(K key, V value){
        int hashCode = key.hashCode() % entries.length;
        Entry entry = entries[hashCode];
        if(entry == null){
            Entry newEntry = new Entry(key, value);
            entries[hashCode] = newEntry;
        } else {
            Entry previousEntry = entry;
            while(entry != null){
                if(entry.key == key){
                    entry.setValue(value);
                    return;
                }
                previousEntry = entry;
                entry = entry.next;
            }
            Entry newEntry = new Entry(key, value);
            previousEntry.next = newEntry;
        }
    }

    V get(K key){
        int hashCode = key.hashCode()%entries.length;
        Entry entry = entries[hashCode];
        while(entry!=null){
            if(entry.getKey() == key){
                return (V) entry.getValue();
            }
            entry = entry.next;
        }
        return null;

    }


}
