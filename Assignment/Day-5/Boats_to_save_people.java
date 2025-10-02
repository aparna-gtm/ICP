import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[j]+people[i]<=limit){
                count++;
                i++;
                j--;
            }
            else if(people[j]<=limit){
                count++;
                j--;
            }
            
        }
        return count;
    }
}