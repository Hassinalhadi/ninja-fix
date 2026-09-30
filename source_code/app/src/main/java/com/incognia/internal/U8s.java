package com.incognia.internal;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class U8s {

    /* renamed from: b, reason: collision with root package name */
    public final wyZ f9696b;

    public U8s(W6 w62, wyZ wyz) {
        this.f9696b = wyz;
    }

    public final Map b(byte[] bArr) {
        char c3;
        byte[] bArr2;
        byte[] bArr3;
        P3H b2 = this.f9696b.b();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) wGk.cr.getValue(), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String) wGk.f11639O0.getValue()));
        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        String str = b2.sVU;
        String str2 = b2.PqK;
        String valueOf = String.valueOf(b2.f9379V);
        String str3 = b2.f9382f9;
        String str4 = b2.olU;
        String valueOf2 = String.valueOf(70901);
        String str5 = (String) wGk.yz.getValue();
        byte[] bArr4 = {(byte) 63350, (byte) 130558284, (byte) 1607, (byte) 324, (byte) 105683542, (byte) 200907056, (byte) 2923, (byte) 349664586, (byte) 114, (byte) 96885, (byte) 106, (byte) 1780818, (byte) 402316624, (byte) 63, (byte) 5168, (byte) 868, (byte) 227188310, (byte) 867, (byte) 15189, (byte) 294190124, (byte) 16236, (byte) 486491767, (byte) 313291592, (byte) 404583, (byte) 8350582, (byte) 1406574, (byte) 570929, (byte) 75625, (byte) 344, (byte) 133683, (byte) 487009, (byte) 1215312};
        if (bArr.length == 0) {
            bArr2 = new byte[0];
            c3 = 6;
        } else {
            c3 = 6;
            byte[] bArr5 = new byte[32];
            int i4 = 2;
            while (true) {
                bArr5[i4 - 2] = bArr[bArr.length / i4];
                if (i4 == 33) {
                    break;
                }
                i4++;
            }
            bArr2 = bArr5;
        }
        byte[] copyOf = Arrays.copyOf(bArr4, bArr2.length + 32);
        System.arraycopy(bArr2, 0, copyOf, 32, bArr2.length);
        Arrays.fill(bArr4, (byte) 0);
        iAM iam = new iAM(copyOf);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(format);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(valueOf);
        sb2.append(str3);
        String gold = androidx.appcompat.widget.P0.gold(sb2, str4, valueOf2);
        t9 t9Var = iam.f10612W;
        t9Var.getClass();
        t9Var.b(bArr.length, bArr);
        iam.f10612W.b(gold.getBytes(Charset.forName(str5)));
        byte[] bytes = gold.getBytes(Charset.forName(str5));
        if (bytes.length == 0) {
            bArr3 = new byte[0];
        } else {
            byte[] bArr6 = new byte[16];
            int i5 = 2;
            while (true) {
                bArr6[i5 - 2] = bytes[bytes.length / i5];
                if (i5 == 17) {
                    break;
                }
                i5++;
            }
            bArr3 = bArr6;
        }
        t9 t9Var2 = iam.f10612W;
        t9Var2.getClass();
        t9Var2.b(bArr3.length, bArr3);
        t9 t9Var3 = new t9();
        byte[] b4 = xFC.b(iAM.sVU, iAM.b(iam.f10613b));
        byte[] b6 = iam.f10612W.b();
        int length = b4.length;
        int i10 = length + 32;
        byte[] bArr7 = new byte[i10];
        System.arraycopy(b4, 0, bArr7, 0, length);
        System.arraycopy(b6, 0, bArr7, length, 32);
        t9Var3.b(i10, bArr7);
        Pair pair = new Pair((String) wGk.pNs.getValue(), cT.f9(3, t9Var3.b()));
        Pair pair2 = new Pair((String) wGk.f11677am.getValue(), "3");
        Pair pair3 = new Pair((String) wGk.TE.getValue(), "4");
        Pair pair4 = new Pair((String) wGk.RcJ.getValue(), format);
        Pair pair5 = new Pair((String) wGk.Rh.getValue(), str);
        Pair pair6 = new Pair((String) wGk.Ci.getValue(), str2);
        Pair pair7 = new Pair((String) wGk.sG.getValue(), valueOf);
        Pair pair8 = new Pair((String) wGk.nhe.getValue(), str3);
        Pair pair9 = new Pair((String) wGk.l2r.getValue(), str4);
        Pair pair10 = new Pair((String) wGk.vs.getValue(), valueOf2);
        Pair[] pairArr = new Pair[10];
        pairArr[0] = pair;
        pairArr[1] = pair2;
        pairArr[2] = pair3;
        pairArr[3] = pair4;
        pairArr[4] = pair5;
        pairArr[5] = pair6;
        pairArr[c3] = pair7;
        pairArr[7] = pair8;
        pairArr[8] = pair9;
        pairArr[9] = pair10;
        return kotlin.collections.y.sierra(pairArr);
    }
}
