package com.neo.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
        //Đổi hàm tính theo đệ quy
        long result = 1;

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 adn 20");
        }
        if(n==0 || n==1){
            return 1; //Điểm dừng đệ quy
        }

        //Tới đây là retủrn được n!=(n-1)!x n
        return n * getFactorial(n-1);
    }
}
// Code chính, Code base, Code dân dev phải làm