package cn.com.realize;
/**
 * 欧几里得算法
 *
 * */
public class test_1 {
    public static int gcd(int p ,int q){
        if(q==0)
            return p;
        int r=p%q;
        return gcd(q,r);
    }
}
