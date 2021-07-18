package leetcode;

public class Reverse {
    public int reverse(int x) {
        StringBuffer sbf=new StringBuffer();
        String string=String.valueOf(x);
        //System.out.println(string);
        if (x<0){
            sbf.append("-");
            x=-x;
            for (int i=string.length()-1;i>0;i--)
            {
                sbf.append(string.charAt(i));
            }
        }else {
            for (int i=string.length()-1;i>=0;i--)
            {
                sbf.append(string.charAt(i));
            }
        }

        String s=sbf.toString();
        int result=Integer.parseInt(s);
        return result;
    }
}
