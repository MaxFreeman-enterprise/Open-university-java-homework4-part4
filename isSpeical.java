
/**
 * Write a description of howmework_part4 here:
 *
 * the isSpecial method
 * checks whether a given number is special 
 * a number considered to be special iff it is a natural number which isn't deleted at any "deleting round" 
 * through the i round every i-y number is deleted (i starts from 2).
 * @param n - a given number to be checked
 * @return true - iff the given number is special
 *
 * @author Max Freeman
 * @version 15.01.22
 */
public class isSpeical
{
    
    public static boolean isSpecial(int n){

        if (n <1){//special number must be natural
            return false;
        }
        return isSpecial(n, 2);// start from erasing i=2
    }

    private static boolean isSpecial(int n, int i){
        if ((n % i) == 0){//checks whether the given number is deleted due the i-y deleting round 
            return false;
        }

        if (n < i){//in that case the given number is "safe" from deleting
            return true;
        }

        return isSpecial(n -n /i, i +1);
    }
}
