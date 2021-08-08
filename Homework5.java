package cse41321.homework;
import cse41321.containers.ChainedHashTable;


// a)
public class Homework5 {
    public ChainedHashTable<K, V>

    {
        int buckets;
        double maxLoadFactor;
        double resizeMultiplier;
        int h;
        int size;
        int match;
        if (resizeMultiplier <= 0.0) {
            return -1;
        } else {
            this.h = h;
            this.size = size;
            this.match = match;
            this.buckets = buckets;
            this.maxLoadFactor = maxLoadFactor;
            this.resizeMultiplier = resizeMultiplier;

            HashEntry[] table;

            HashMap() {
                table = new HashEntry[DEFAULT_TABLE_SIZE];
                for (int i = 0; i < DEFAULT_TABLE_SIZE; i++)
                    table[i] = null;
            }
            // save previous state
            void setThreshold ( float threshold){
                this.threshold = threshold;
                maxSize = (int) (table.length * threshold);
            }
            // update current state
            public int get ( int key){
                int hash = (key % table.length);
                int initialHash = -1;
                while (hash != initialHash
                        && (table[hash] == DeletedEntry.getUniqueDeletedEntry()
                        || table[hash] != null
                        && table[hash].getKey() != key)) {
                    if (initialHash == -1)
                        initialHash = hash;
                    hash = (hash + 1) % table.length;
                }
                if (table[hash] == null || hash == initialHash)
                    return -1;
                else
                    return table[hash].getValue();
            }
            /* Do nothing if the data is already in the table. */
            /* Insert the data into the bucket. */

            // Adds a key value pair to hash
            public void add (K key, V value)
            {
                // Find head of chain for given key
                int bucketIndex = getBucketIndex(key);
                int hashCode = hashCode(key);
                HashNode<K, V> head = bucketArray.get(bucketIndex);

                // Check if key is already present
                while (head != null) {
                    if (head.key.equals(key) && head.hashCode == hashCode) {
                        head.value = value;
                        return;
                    }
                    head = head.next;
                }

                // Insert key in chain
                size++;
                head = bucketArray.get(bucketIndex);
                HashNode<K, V> newNode
                        = new HashNode<K, V>(key, value, hashCode);
                newNode.next = head;
                bucketArray.set(bucketIndex, newNode);

                // If load factor goes beyond threshold, then
                // double hash table size
                if ((1.0 * size) / numBuckets >= 0.7) {
                    ArrayList<HashNode<K, V>> temp = bucketArray;
                    bucketArray = new ArrayList<>();
                    numBuckets = 2 * numBuckets;
                    size = 0;
                    for (int i = 0; i < numBuckets; i++)
                        bucketArray.add(null);

                    for (HashNode<K, V> headNode : temp) {
                        while (headNode != null) {
                            add(headNode.key, headNode.value);
                            headNode = headNode.next;
                        }
                    }
                }
            }
// b)
            // Driver method to test Map class
            public static void main (String[]args)
            {
                Map<String, Integer> map = new Map<>();
                map.add("this", 1);
                map.add("coder", 2);
                map.add("this", 4);
                map.add("hi", 5);
                System.out.println(map.size());
                System.out.println(map.remove("this"));
                System.out.println(map.remove("this"));
                System.out.println(map.size());
                System.out.println(map.isEmpty());
            }
        }
    }
}

// c)
// 1.What is the Big-O execution performance of an insert now that auto-resizing can take place?
A: ChainedHashTable auto-growing does not affect complexity of the hash table's operation, auto-growing is done at once and will
not keep looping downward, which takes O(n) time to complete the whole operating, n is the number of entries of the hash table.

// 2.Why do you think you were required to change the hash table to use the multiplication method
// instead of the division method to map hash codes to buckets?
A: It was required to change the hash table to use the multiplication method because the Bucket from hash table does not needed prime.

