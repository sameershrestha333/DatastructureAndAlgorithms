package leetcode.sixtyseven.addbinary;

public class AddBinary {

    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder builder = new StringBuilder();

        while(i >= 0 && j>=0 ){
            int aV = (a.charAt(i)=='0')? 0 : 1;
            int bV = (b.charAt(j)=='0')? 0 : 1;
            int v = aV + bV + carry;
            builder.append(v % 2);
            carry = v / 2;
            i--;
            j--;
        }
        while(i >= 0){
            int aV = (a.charAt(i)=='0')? 0 : 1;
            int v = aV + carry;
            builder.append(v % 2);
            carry = v / 2;
            i--;
        }
        while(j >= 0){
            int bV = (b.charAt(j)=='0')? 0 : 1;
            int v = bV + carry;
            builder.append(v % 2);
            carry = v / 2;
            j--;
        }
        if(carry == 1){
            builder.append(carry);
        }

        return builder.reverse().toString();


    }
}
