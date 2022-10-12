
package com.giaolang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    //Kiểm thử tình huống cà chớn, đưa data vào cà chớn
    //thì nhận về cú tát EXCEPTION
    //hàm getFactorial() đc thiết kế để:
    //- nếu đưa vào n tử tế 0..20 -> sure phải ra 1 con n! đúng đắn
    //- nếu đưa vào n cà chớn n < 0 || n > 20
    //CHỬI CHỬI VÀ CHỬI = NÉM RA EXCEPTION/
    //Bi giờ, nếu tui đưa -5 cho hàm, tui nhận về gì??? ngoại lệ
    //thấy ngoại lệ mừng rơi nước mắt
    //THẤY NGOẠI LỆ NHƯ KÌ VỌNG Ở -5! -> VIẾT CODE ĐÚNG RỒI, MÀU XANH
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        
        //Test case #6: 
        //n = -5; -5!, hy vọng bị vả vào mặt cái EXCEPTION
        //             thực tế nó có vả mặt hay ko, đoán xem, chạy hàm đã
        //ko xài assertEquals() vì nó dùng cho các giá trị cụ thể
        //còn ngoại lệ là 1 thứ đo lường = cách mày có xuất hiện hay ko
        //mày ko là 1 giá trị kiểu 5 10 15 20
        MathUtil.getFactorial(-5); //ngoại lệ cầm chắc trong tay
        //nhưng phải đo/dòm xem mày có hiện nguyên hình hem???
    }    
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {        
        
        //Test case #4
        //n = 3; 3! hy vọng expected trả về 6, 
        //          thực tế actual là mấy, đoán xem       
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5
        //n = 4; 4! hy vọng expected trả về 24, 
        //          thực tế actual là mấy, đoán xem       
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6
        //n = 5; 5! hy vọng expected trả về 120, 
        //          thực tế actual là mấy, đoán xem       
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test  
    public void tryAssertion() {
        Assert.assertEquals(69, 69);
    }
    
    @Test  //quy tắc đặt tên hàm kiểm thử phải mang ý nghĩa của các test
    //case mình muốn test hàm - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1 - tình huống kiểm thử xài hàm getF() đầu tiên
        //n = 0, 0! hy vọng expected = 1; actual thực tế là mấy, đoán xem
        //                                gọi hàm, chạy hàm mới biết đc
        //nếu expected == actual, hàm đúng, MÀU XANH
        //nếu expectd != actual, có cái gì đó SAI SAI
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //phải so sánh 2 giá trị này!!! dùng Framework, hok xài sout()
        Assert.assertEquals(expected, actual);
        //vietsub: so sánh xem 0! có đúng là trả về 1 hay hem?
        
        //Test case #2
        //n = 1; 1! hy vọng expected trả về 1, 
        //          thực tế actual là mấy, đoán xem
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //Test case #3
        //n = 2; 2! hy vọng expected trả về 2, 
        //          thực tế actual là mấy, đoán xem       
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
    }
}

//TRONG CLASS NÀY CHỨA CÁI GÌ???
//CLASS NÀY CHỨA CÁC ĐOẠN CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN THƯ MỤC
//SOURCE PACAKAGS
//CÁC ĐOẠN CODE Ở ĐÂY SẼ DÙNG ĐỂ TEST CÁI HÀM GETFACTORIAL() COI MÀY
//CHẠY CÓ ĐÚNG KO
//VIẾT CODE ĐỂ TEST CODE
//NHỮNG ĐOẠN CODE Ở TRONG NÀY DO DEVELOPER VIẾT RA DÙNG ĐỂ TEST CHÍNH
//CÁI CODE Ở BÊN THƯ MỤC SOURCE ĐỂ ĐẢM BẢO RẰNG HÀM/CLASS VIẾT RA
//PHẢI CHẠY ĐÚNG
//ĐOẠN CODE DÙNG ĐỂ TEST CODE THÌ ĐC GỌI LÀ TEST SCRIPT

//CÁC TEST SCRIPT NÀY SẼ CÓ LỆNH CƠ BẢN: SO SÁNH GIỮA EXPECTED VÀ ACTUAL
//NHƯ BÊN HÀM MAIN() ĐÃ LÀM THỬ!!!

//NHỮNG ĐOẠN CODE NÀY KO DÙNG LỆNH SOUT() TRUYỀN THỐNG MÀ DÙNG NHỮNG 
//THƯ VIỆN ĐẶC BIỆT ĐỂ
//Khi hàm sai, khi expected ko giống như actual, thì nó NÉM RA MÀU ĐỎ
//Khi hàm chạy đúng, tức là expected == actual, thì nó NÉM RA MÀU XANH
//Các thư viện giúp thảy ra màu xanh đỏ, tự so sánh giùm expected 
//và actual để kết luận hàm đúng sai, mắt lúc này chỉ cần nhìn đúng
//2 MÀU XANH ĐỎ, KO CẦN XEM CHI TIẾT CÁC DÒNG SO SÁNH BÊN BÊN MAIN()
//BỘ THƯ VIỆN NÀY CÒN GỌI LÀ UNIT TEST FRAMEWORK
//MỖI NGÔN NGỮ LẬP TRÌNH ĐỀU CÓ VÀI BỘ THƯ VIỆN THẢY RA MÀU XANH ĐỎ
//GIÚP CÁC DEV TEST HÀM CỦA MÌNH
//VÍ DỤ:
//Java: JUnit, TestNG
//C#  : xUnit, NUnit, MSTest
//PHP : phpUnit
//JavaScript: ...
//Python: 
//Google gõ: Unit Test framework for ... NNLT ra tên...

//@Test đc gọi là 1 flag/cờ đánh dấu - ANNOTATION 
//báo hiệu cho thư viện JUnit biết cần GENERATE HÀM ĐI KÈM @TEST
//BIẾN HÀM NÀY THÀNH HÀM MAIN() VÀ GỬI MAIN() NÀY CHO JVM - JAVA
//VIRTUAL MACHINE BIẾT ĐỂ CHẠY, KHI CHẠY THÌ SO SÁNH 2 ĐỨA
//EXPECTED VÀ ACTUAL, COI NẾU CHÚNG == NHAU, THẢY MÀU XANH
//                        NẾU CHÚNG != NHAU, THẢY MÀU ĐỎ
//NẾU KO CÓ @TEST, CHẢ CÓ HÀM MAIN() NÀO ĐC GENERATE, NO RUNNABLE TEST METHOD
//VIỆC XÀI THƯ VIỆN MÀ BỊ ÉP PHẢI LÀM NHỮNG GÌ ĐÓ, THEO QUY TẮC NÀO ĐÓ
//GỌI LÀ FRAMEWORK


//CHỐT DEAL XANH ĐỎ
//NẾU VIỆC CHẠY BỘ TEST CASE RA MÀU XANH, KHI VÀ CHỈ KHI TẤT CẢ ĐỀU XANH
//XANH: KHI TẤT CẢ CÁC TEST CASE CÙNG XANH
//XANH: KHI TẤT CẢ CÁC VIỆC SO SÁNH EXPECTED ĐỀU == ACTUAL

//ĐỎ: CHỈ CẦN 1 THẰNG TRONG ĐÁM TEST CASE MÀU ĐỎ, TẤT CẢ MÀU ĐỎ
//ĐỎ: CHỈ CẦN 1 VIỆC SO SÁNH EXPECTED != ACTUAL XUẤT HIỆN, MÀU ĐỎ FOR ALL

//LOGIC: HÀM NẾU ĐÃ ĐÚNG, THÌ PHẢI ĐÚNG VỚI TẤT CẢ CÁC CASE ĐÃ ĐC LIỆT
//KÊ RA
//HÀM NGON VỚI CÁC CASE ĐÃ TEST
//CỐ GẮNG LIỆT KÊ ĐC ĐỦ CASE LÀ TỐT NHẤT!!!
//NGUYÊN LÝ SỐ 2

//CHỐT DEAL 2:
//KHI RA MÀU XANH TỔNG, HÀM ỔN VỚI CÁC TEST CASE
//KHI RA MÀU ĐỎ, NGHĨA LÀ CÓ ÍT NHẤT 1 VIỆC SO SÁNH EXPECTED != ACTUAL
//MÀU ĐỎ VÌ LÍ DO GÌ PHÍA SAU
//- DO ACTUAL TRẢ VỀ KO ĐÚNG NHƯ KÌ VỌNG -> BUG
//- DO EXPECTED TÍNH TOÁN KO ĐÚNG LUÔN!!! QC BỊ NGÁO


