class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int one = event2[0].compareTo(event1[1]);
        int four = event2[1].compareTo(event1[0]);
        // conflict || overlap --> true
        // no-conflict || noOverlap --> false

        // compareTo return negative, 0, positive value
        
        // if second starts after first end
        // and in scenarios where second end before first 
        // then there is no overlap
        return one <= 0 && four >=0;

    }
}

