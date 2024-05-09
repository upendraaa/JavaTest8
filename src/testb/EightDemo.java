package testb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class EightDemo {
        public static void main(String[] args) {




            Integer[] array = new Integer[100];
            for(int i=0;i<100;i++){
                array[i] = i;
            }

            //1,2,3 = (1+4+9) + (1+8+27)
            Integer sum = Arrays.stream(array).map(n -> n*n + n*n*n).reduce(0,(a, b)->a+b);
            System.out.println(sum);

            List<Integer> list = Arrays.stream(array).filter(i->isPrime(i)).collect(Collectors.toList());

            System.out.println(list);



        }

        public static  boolean isPrime(int n){

            if(n==1){
                return  false;
            }

            if(n==2){
                return true;
            }

            if(n%2 == 0){
                return false;
            }

            for(int i=2; i< n/2;i++){
                if(n%i==0){
                    return false;
                }
            }

            return true;
        }


    }
