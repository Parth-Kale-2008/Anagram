import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string ");
        String s1 = sc.nextLine();

        System.out.println("enter the second string ");
        String s2 = sc.nextLine();

        s1 = s1.replaceAll(" "," ").toLowerCase();
        s2 = s2.replaceAll(" "," ").toLowerCase();

        if(s1.length() !=s2.length()){
            System.out.println("the strings are not anagram");
        }else{
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);

            if(Arrays.equals(a1,a2)){
                System.out.println("the strings are anagram ");
            }else{
                System.out.println("the strings are not anagram ");
            }
        }
    }
}