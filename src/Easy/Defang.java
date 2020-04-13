package Easy;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"


Constraints:

The given address is a valid IPv4 address.
 */

class Defang {

    public static void main(String args[]){
        System.out.println(dfangIPaddy("255.100.50.0")); //takes an IP address as string
        System.out.println(numberOfSteps(8)); //takes any int
    }

    private static String dfangIPaddy(String address) {
        String newAddress = "";
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                newAddress += "[.]";
            }
            else {
                newAddress += address.charAt(i);
            }
        }
        return newAddress;
    }

    /*
    Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     */

    private static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0){
            ++steps;
            if (num % 2 == 0){
                num /= 2;
            } else num -= 1;
        }

        return steps;
    }

    
}