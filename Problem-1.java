class MyHashSet {

    int PRIME = 997;
    List<Integer>[] buckets;
    int hash(int key) {
        return (31 * key + 17) % PRIME;
    }
    public MyHashSet() {
        buckets = new List[PRIME];
    }
    
    public void add(int key) {
        int hsh = hash(key);
        if(buckets[hsh] == null)
            buckets[hsh] = new ArrayList<>();
        if(!buckets[hsh].contains(key))
            buckets[hsh].add(key);

    }
    
    public void remove(int key) {
        int hsh = hash(key);
        if(contains(key))
            buckets[hsh].remove((Integer) key);        
    }
    
    public boolean contains(int key) {
        int hsh = hash(key);
        if(!(buckets[hsh] == null)){
            if(buckets[hsh].contains(key))
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
