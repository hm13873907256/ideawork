package cn.com.demo;

public class reverseDigital {
    /**
     * @param: 倒序输出参数
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        String j="";
        while (number>0){
            int jj=number%10;
            number=number/10;
            String  numstr=String.valueOf(jj);
            j=j+numstr;
        }

        return Integer.parseInt(j);
    }
}
