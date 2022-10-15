/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author giao.lang
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file is built based on ANT in co-operating with JUnit");
        System.out.println("More over, this message comes from a US-BUILT'S JAR FILE");
        tryTDDFirst();
    }
    
    //hàm này dùng để demo/minh hoạ cách TDD đc triển khai thế nào
    //viết code song song với viết test
    //Test         Driven          Development
    //kiểm thử     hướng về        viết code 
    public static void tryTDDFirst() {
        
        //Test case #1: (tình huống xài hàm số #1)
        //input n = 0; ta muốn thử tính 0! coi hàm chạy ra sao
        //expected = 1; //ta muốn 0! hàm phải trả về 1!!!
        //thực tế actual = ? mấy, chạy thử hàm mới biết đc
        long expected = 1;  //mình muốn 0! trả về 1
        long actual = MathUtil.getFactorial(0);
        //kiểm thử pm là so sánh giữa expected và actual để luận đúng sai
        System.out.println("0! Status | expected: " + expected +
                                      " | actual: " + actual);
        
        //Test case #2
        //kiểm tra hàm có chạy đúng với 2!, hy vọng nhận về số 2
        //input n = 2;
        //gọi hàm getFactorial(2) 
        //expected nhận về phải là 2
        //thực tế là mấy??? chạy mới biết
        System.out.println("2! Status | expected: 2" +
                                      " | actual: " + MathUtil.getFactorial(2));
        
        //Test case #3:
        //n = 5, 5! hy vọng trả về 120
        System.out.println("5! Status | expected: 120" +
                                      " | actual: " + MathUtil.getFactorial(5));
        
        //Test case #4:
        //n = -5, -5!, hy vọng bị đập vào mặt câu, CÀ CHỚN, N KO HỢP LỆ
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN" +
//                                      " | actual: " + MathUtil.getFactorial(-5));
//        System.out.println("-5! Status | expected: NGOẠI LỆ XUẤT HIỆN" +
//                                      " | actual: "); 
//        MathUtil.getFactorial(-5); 
                                      
    }
    
}

//TỔNG KẾT:
//TEST CASE LÀ GÌ??? TÌNH HUỐNG KIỂM THỬ
//LÀ NHỮNG TÌNH HUỐNG XÀI APP/KIỂM THỬ APP XEM APP CHẠY ĐÚNG HAY KO
//TEST CASE BAO GỒM
//- DATA ĐƯA VÀO HÀM/APP, VÍ DỤ 5 ĐƯA VÀO HÀM GIAI THỪA
//- GỌI HÀM ĐỂ XỬ LÍ DATA ĐƯA VÀO, GETFACTORIAL(5)
//- GIÁ TRỊ KÌ VỌNG HÀM SẼ TRẢ VỀ EXPECTED VALUE == 120???
//- STATUS: HÀM CHẠY ĐÚNG HAY SAI

//MỘT TEST CASE LÀ 1 TÌNH HUỐNG XÀI APP/KIỂM THỬ APP ĐÚNG HAY SAI SO VỚI
//KÌ VỌNG KHI TA ĐƯA DATA CỤ THỂ NÀO ĐÓ VÀO APP/VÀO HÀM
