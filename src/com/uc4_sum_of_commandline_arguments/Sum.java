package com.uc4_sum_of_commandline_arguments;

public class Sum {
    public static void main(String[] args)
    {
        int sum = 0;
        int a = 0;
        for(int i = 0; i < args.length; i++) {
            try {
                a = Integer.parseInt(args[i]);
                sum+=a;
            }
            catch (Exception e){
                System.out.println(args[i]+" is not a valid integer");
            }
        }
        System.out.println("Sum of valid integer is "+sum);
    }
}
