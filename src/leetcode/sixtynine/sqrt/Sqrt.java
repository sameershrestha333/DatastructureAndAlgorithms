package leetcode.sixtynine.sqrt;

public class Sqrt {
    public int mySqrt(int x) {

        long preMid = 0;

        long start = 0;
        long end = (long) x;
        while(start <= end){
            long mid = (start + end )/2;
            if(mid * mid == x){
                return (int) mid;
            }
            if(mid * mid < x){
                start = mid +1;
                preMid = mid;
            }else
                end = mid -1;

        }
        return (int) preMid;

    }
}
