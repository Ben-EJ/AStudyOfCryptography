/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.math.BigInteger;

/**
 *
 * @author benja
 */
//Deals with password proccessing
public class PasswordHandle {
    /*
    Calculates the password space
    returns password space as a bigInteger
     */
    public static BigInteger PwSpSizeGen(int passwordLen, BigInteger alphabetLen) {
        BigInteger PwSpSize = new BigInteger("0");
        for (int i = passwordLen; i > -1; i--) {
            PwSpSize = PwSpSize.add(alphabetLen.pow(i));
        }
        return PwSpSize;
    }

    /*
    Gets nearest prime number bigger than password space
    reuturns nearest prime as big integer
     */
    public static BigInteger findPrime(BigInteger PwSpSize) {
        while (PwSpSize.isProbablePrime(1) == false) {
            PwSpSize = PwSpSize.add(new BigInteger("1"));
        }
        System.out.println("Found Prime: " + PwSpSize);
        return PwSpSize;
    }
}
