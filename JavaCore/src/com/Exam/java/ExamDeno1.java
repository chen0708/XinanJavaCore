package com.Exam.java;

import java.util.Scanner;

public class ExamDeno1 {


	public static void main(String[] args) {
		// 创建一个输入对象，用来接收输入行数
		Scanner inScanner = new Scanner(System.in);
		// 提示键盘输入
		System.out.println("请选择想要显示的三角形类型！"+"\n"+"1、实心等腰三角形  2、倒置实心等腰三角形 3、空心等腰三角形");
		int type = inScanner.nextInt();
		     System.out.print("请输入行数：");
		     int rank = inScanner.nextInt();
		     if(rank<=1){
		     	System.out.println("请输入大于1的行数");
		     	return;
		     }
		     System.out.print("请输入列数：");
		     int line = inScanner.nextInt();
		     if((line%2)==0){
		     	System.out.println("列数请输入奇数！");
		     	//return;
		     	}
		     if(type==1){//打印实心等腰三角形
		     
		     for (int i = 0; i < rank; i++) {
		     	int xing=i*(line-1)/(rank-1)+1;
		     	// 首先打印空格
		     
		     	for (int j =0; j <= ((line-xing)/2); j++) {
		     		System.out.print(" ");
		     	    }
		     	// 接下来打印星号
		     	while(xing>0) {
		     		System.out.print("*");
		     		xing--;
		     	    }
		     	// 最后记得在一行输入完毕后需要换行
		     	System.out.println();
		        }
		     //如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
		     if((((line-1)/(rank-1)%2)!=0)||(rank>line)||(line%2)==0){
		     	System.out.println("显示问题导致无法正常显示为等腰三角形，请重试！");
		     
	            }
		     }else if(type==2){
		    	 for (int i = 0; i < rank; i++) {
				     	int xing=line-(i*(line-1)/(rank-1));
				     	// 首先打印空格
				     	for (int j =0; j <= ((line-xing)/2); j++) {
				     		System.out.print(" ");
				     	    }
				     	// 接下来打印星号
				   while(xing>0) {
				     		System.out.print("*");
				     		xing--;
				     	    }
				     	// 最后记得在一行输入完毕后需要换行
				     	System.out.println();
				        }
				     //如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
				     if((((line-1)/(rank-1)%2)!=0)||(rank>line)||(line%2)==0){
				     	System.out.println("显示问题导致无法正常显示为等腰三角形，请重试！");
				     
			            }
		          }
				     else if(type ==3)
				     {//打印空心等腰三角形
				    	 for (int i = 0; i < rank-1; i++) {
				 	     	int xing=i*(line-1)/(rank-1)+1;
				 	     	// 首先打印空格
				 	     
				 	     	for (int j =0; j <= ((line-xing)/2)-1; j++) {
				 	     		System.out.print(" ");
				 	     	    }
				 	     	
				 	     	// 接下来打印星号
				 	     	System.out.print("*");
				 	     	for(int a=xing;a>2;a--){
				 	     		System.out.print(" ");
				 	     	}
				 	     	if(i!=0)System.out.print("*");
				 	     	// 最后记得在一行输入完毕后需要换行
				 	     	System.out.println();
				 	        }
				 	     for(int b=0;b<=line-1;b++) {
				 	    	 System.out.print("*");
				 	    	 
				 	     }
				 		System.out.println();
				 	     //如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
				 	     if((((line-1)/(rank-1)%2)!=0)||(rank>line)||(line%2)==0){
				 	     	System.out.println("显示问题导致无法正常显示为等腰三角形，请重试！");
				 	     
				            }
				    	 }
				    	 }
		     }
		
        
	
