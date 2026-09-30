package com.zendesk.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class DigestUtils {
    private static final String MD5 = "MD5";
    private static final String SHA1 = "SHA-1";
    private static final String SHA256 = "SHA-256";
    private static final String SHA384 = "SHA-384";
    private static final String SHA512 = "SHA-512";

    private static byte[] digest(String str, String str2) {
        if (StringUtils.hasLength(str) && StringUtils.hasLength(str2)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(str2.getBytes());
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                return new byte[0];
            }
        }
        return new byte[0];
    }

    private static String hexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb2.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb2.toString();
    }

    public static String md5(String str) {
        if (StringUtils.hasLength(str)) {
            return hexString(digest(MD5, str));
        }
        return "";
    }

    public static String sha1(String str) {
        if (StringUtils.hasLength(str)) {
            return hexString(digest(SHA1, str));
        }
        return "";
    }

    public static String sha256(String str) {
        if (StringUtils.hasLength(str)) {
            return hexString(digest(SHA256, str));
        }
        return "";
    }

    public static String sha384(String str) {
        if (StringUtils.hasLength(str)) {
            return hexString(digest(SHA384, str));
        }
        return "";
    }

    public static String sha512(String str) {
        if (StringUtils.hasLength(str)) {
            return hexString(digest(SHA512, str));
        }
        return "";
    }
}
