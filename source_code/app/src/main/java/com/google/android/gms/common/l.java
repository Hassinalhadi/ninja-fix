package com.google.android.gms.common;

import V5.x;
import e6.AbstractC1630b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Callable {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ o red;

    public /* synthetic */ l(boolean z2, String str, o oVar) {
        this.alpha = z2;
        this.purple = str;
        this.red = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        o oVar = this.red;
        boolean z2 = this.alpha;
        String str2 = this.purple;
        if (!z2 && q.bravo(str2, oVar, true, false).alpha) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        int i4 = 0;
        while (true) {
            if (i4 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
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
        x.hotel(messageDigest);
        byte[] digest = messageDigest.digest(oVar.juliet);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i5 = 0;
        for (byte b2 : digest) {
            char[] cArr2 = AbstractC1630b.bravo;
            cArr[i5] = cArr2[(b2 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b2 & 15];
            i5 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z2 + ", ver=12451000.false";
    }
}
