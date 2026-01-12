package org.example.ex01_RA_Basics;

public class APITesting004_Build_design_pattern {

    public APITesting004_Build_design_pattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITesting004_Build_design_pattern step2(){
        System.out.println("Step 2");
        return this;
    }
    public APITesting004_Build_design_pattern step3(String karthik){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting004_Build_design_pattern np = new APITesting004_Build_design_pattern();
        np.step1().step2().step3("karthik");
    }



}
