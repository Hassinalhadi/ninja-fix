package e6;

import V5.x;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import g6.C1754b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1630b {
    public static final char[] alpha = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] bravo = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    public static Boolean charlie;
    public static Boolean delta;
    public static Boolean echo;
    public static Boolean foxtrot;
    public static String golf;
    public static int hotel;
    public static Boolean india;

    public static String alpha(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i4 = 0; i4 < length; i4++) {
            char[] cArr = alpha;
            sb2.append(cArr[(bArr[i4] & 240) >>> 4]);
            sb2.append(cArr[bArr[i4] & 15]);
        }
        return sb2.toString();
    }

    public static String bravo() {
        BufferedReader bufferedReader;
        String processName;
        if (golf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                golf = processName;
            } else {
                int i4 = hotel;
                if (i4 == 0) {
                    i4 = Process.myPid();
                    hotel = i4;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                str = null;
                try {
                    if (i4 > 0) {
                        try {
                            String str2 = "/proc/" + i4 + "/cmdline";
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(str2));
                                try {
                                    String readLine = bufferedReader.readLine();
                                    x.hotel(readLine);
                                    str = readLine.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    golf = str;
                                    return golf;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } finally {
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused4) {
                }
                golf = str;
            }
        }
        return golf;
    }

    public static byte[] charlie(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo charlie2 = C1754b.alpha(context).charlie(64, str);
        Signature[] signatureArr = charlie2.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i4 = 0;
            while (true) {
                if (i4 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i4++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(charlie2.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean delta() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean echo(Context context, int i4) {
        if (golf(context, i4, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                com.google.android.gms.common.f bravo2 = com.google.android.gms.common.f.bravo(context);
                bravo2.getClass();
                if (packageInfo != null) {
                    if (!com.google.android.gms.common.f.echo(packageInfo, false)) {
                        if (com.google.android.gms.common.f.echo(packageInfo, true)) {
                            if (!com.google.android.gms.common.e.honorsDebugCertificates((Context) bravo2.purple)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean foxtrot(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (charlie == null) {
            charlie = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!charlie.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (delta == null) {
                delta = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (delta.booleanValue()) {
                if (!delta() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean golf(Context context, int i4, String str) {
        H0.a alpha2 = C1754b.alpha(context);
        alpha2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) alpha2.purple.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i4, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void hotel(StringBuilder sb2, HashMap hashMap) {
        sb2.append("{");
        boolean z2 = true;
        for (String str : hashMap.keySet()) {
            if (!z2) {
                sb2.append(Constants.SEPARATOR_COMMA);
            }
            String str2 = (String) hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z2 = false;
        }
        sb2.append("}");
    }
}
