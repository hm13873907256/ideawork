package cn.com.realize;
/**
 * 绘图测试
 * */
public class test_45 {
    public void rea(){
        int n=50;
        double[] a=new double[n];
        for(int i=0;i<n;i++){
            a[i]=Math.random();
        }
        for(int i=0;i<n;i++){
            double x=1.0*i/n;
            double y=a[i]/2.0;
            double rw=0.5/n;
            double rh=a[i]/2.0;
        }
    }
}
