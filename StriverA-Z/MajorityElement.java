public class MajorityElement {
    // find the majority element if it occurs in the given array more n/2 times
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,2,2,3,3,1,2,2,1,1,1,1};
        System.out.println(getMajorityElement(arr));
    }
    public static int getMajorityElement(int [] arr) {
        int count = 0;
        int element = 0;
        for (int j : arr) {
            if (count == 0) {
                count = 1;
                element = j;
            } else if (element != j) {
                count--;
            } else {
                count++;
            }
            if(count > arr.length/2) return element;
        }
        count = 0;
        for(int x : arr) {
            if(element == x) count++;
        }
        return  count > arr.length/2 ? element : -1;
    }
}
