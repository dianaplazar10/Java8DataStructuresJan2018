package com.other;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class PWDmechanism {
    
    /**
     * @param simplePWD
     * @return encrypted password 
     */
    public static String hmacDigest(String simplePWD) {
        String baseString = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678";
        String oAuthAlgo = "HmacSHA1";
        String encryptPWD = null;
        try {
            SecretKeySpec key = new SecretKeySpec((simplePWD).getBytes("UTF-8"), oAuthAlgo);
            Mac mac = Mac.getInstance(oAuthAlgo);
            mac.init(key);

            byte[] bytes = mac.doFinal(baseString.getBytes("ASCII"));

            StringBuilder hash = new StringBuilder();
            for (byte aByte : bytes) {
                String hex = Integer.toHexString(0xFF & aByte);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            encryptPWD = hash.toString();
        } catch (Exception e) {
            e.getMessage();
        }
        return encryptPWD;
    }

}
