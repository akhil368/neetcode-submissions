class Solution {
    public int numRescueBoats(int[] people, int limit) {
        

        Arrays.sort(people);
        int counter=0;
        int i=0;
        int j=people.length-1;

        while(i<=j) {
            if(i==j) {
                counter++;
                i++;
                j--;
                return counter;
            }
            int sum=people[i]+people[j];
            if(sum<=limit) {
                counter++;
                i++;
                j--;
            } else if(sum> limit) {
                int t=sum-people[i];
                if(t<=limit) {
                    counter++;
                    j--;
                }
            }
        }
        return counter;
    }
}