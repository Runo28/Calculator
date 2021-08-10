package org.example;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {

    @Test
    public void kata1 (){
        int res1 = StringCalculator.add(null);
        Assert.assertEquals(0,res1);
        int res2 = StringCalculator.add("");
        Assert.assertEquals(0,res2);
        int res3 = StringCalculator.add("1");
        Assert.assertEquals(1,res3);
        int res4 = StringCalculator.add("1,2");
        Assert.assertEquals(3,res4);
        int res5 = StringCalculator.add("4,");
        Assert.assertEquals(4,res5);
    }
    @Test
    public void kata2 (){
        int res1 = StringCalculator.add("1,2,3,4");
        Assert.assertEquals(10,res1);
        int res2 = StringCalculator.add("1,1,1,1");
        Assert.assertEquals(4,res2);
        int res3 = StringCalculator.add("1,2 ");
        Assert.assertEquals(3,res3);
        int res4 = StringCalculator.add("11,22,33");
        Assert.assertEquals(66,res4);
    }

    @Test
    public void kata3 (){
        int res1 = StringCalculator.add("1 \n2,3");
        Assert.assertEquals(6,res1);
        int res2 = StringCalculator.add("4\n5\n6");
        Assert.assertEquals(15,res2);
        int res3 = StringCalculator.add("77\n");
        Assert.assertEquals(77,res3);
    }

    @Test
    public void kata4 (){
        int res1 = StringCalculator.add("1, 1001");
        Assert.assertEquals(1,res1);
        int res2 = StringCalculator.add("1002 \n 2");
        Assert.assertEquals(2,res2);
        int res3 = StringCalculator.add("1, 1000");
        Assert.assertEquals(1001,res3);
        int res4 = StringCalculator.add("1000, 1000");
        Assert.assertEquals(2000,res4);
        int res5 = StringCalculator.add("1001\n1001");
        Assert.assertEquals(0,res5);
    }

    @Test
    public void kata5 (){
        int res1 = StringCalculator.add("//;\n1; 2");
        Assert.assertEquals(3,res1);
        int res2 = StringCalculator.add("//*\n2,3");
        Assert.assertEquals(5,res2);
        int res3 = StringCalculator.add("//#\n3# 4");
        Assert.assertEquals(7,res3);
    }

    @Test
    public void kata6 (){
        int res1 = StringCalculator.add("//[***]\n1 *** 2 *** 3");
        Assert.assertEquals(6,res1);
        int res2 = StringCalculator.add("//[xy]\n3xy4xy5xy8");
        Assert.assertEquals(20,res2);
    }

    @Test
    public void kata7 (){
        int res1 = StringCalculator.add("//[*][%]\n1*2%3");
        Assert.assertEquals(6,res1);
        int res2 = StringCalculator.add("//[&&][|||]\n3|||2&&3");
        Assert.assertEquals(8,res2);
    }

    @Test
    public void kata8 (){
//        int res1 = StringCalculator.add("//[#$\n1#$2 #$ 3", "//[$$][|||]\n3 |||2 &&3");
//        Assert.assertEquals(14,res1);
//        int res2 = StringCalculator.add("1","1,2","1\n2,3");
//        Assert.assertEquals(10,res2);
    }

    @Test
    public void kata10 () {
        long timeStart = System.currentTimeMillis();
        int res1 = StringCalculator.add("//[*] [%]\n1 * 2% 3");
        Assert.assertEquals(6, res1);
        int res2 = StringCalculator.add("//[$$][|||]\n3 |||2&&3");
        Assert.assertEquals(8, res2);
        int res3 = StringCalculator.add("//[//]\n 1//2//4");
        Assert.assertEquals(7, res3);
        int res4 = StringCalculator.add("999, 999");
        Assert.assertEquals(1998, res4);
        int res5 = StringCalculator.add("3,1001");
        Assert.assertEquals(3, res5);
        int res6 = StringCalculator.add("//[*][%][]\n1 * 2% 3");
        Assert.assertEquals(6, res6);
        long timeFinish = System.currentTimeMillis()-timeStart;
        if (timeFinish>30) {System.out.println("error");}
    }

    @Test
    public void kata11 (){
        int res1 = StringCalculator.add("2^, 2");
        Assert.assertEquals(6,res1);
        int res2 = StringCalculator.add("3^\n1");
        Assert.assertEquals(10,res2);
        int res3 = StringCalculator.add("2^2, 2^2");
        Assert.assertEquals(8,res3);
    }

    @Test
    public void kata12 (){
        int res1 = StringCalculator.add("2^3, 2");
        Assert.assertEquals(10,res1);
        int res2 = StringCalculator.add("3^3\n2^2");
        Assert.assertEquals(31,res2);
        int res3 = StringCalculator.add("//;\n1; 2^8");
        Assert.assertEquals(257,res3);
    }

}
