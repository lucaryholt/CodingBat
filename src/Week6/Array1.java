package Week6;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6){
            return true;
        } else return nums[(nums.length - 1)] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[(nums.length - 1)] == nums[0];
    }

    public int[] makePi() {
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 1;
        a[2] = 4;
        return a;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

}
