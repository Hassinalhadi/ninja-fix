package com.bumptech.glide;

import androidx.appcompat.widget.P0;
import av.q;
import com.google.android.gms.internal.measurement.AbstractC1295b1;
import com.google.android.gms.internal.measurement.AbstractC1328i;
import com.google.android.gms.internal.measurement.C1378u;
import com.google.android.gms.internal.measurement.InterfaceC1338k;
import com.google.android.gms.internal.measurement.InterfaceC1355o;
import com.google.android.gms.internal.measurement.r;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class c {
    public static byte[] alpha(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                int digit = Character.digit(str.charAt(i5), 16);
                int digit2 = Character.digit(str.charAt(i5 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i4] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String bravo(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i4 = b2 & 255;
            sb2.append("0123456789abcdef".charAt(i4 / 16));
            sb2.append("0123456789abcdef".charAt(i4 % 16));
        }
        return sb2.toString();
    }

    public static InterfaceC1355o charlie(InterfaceC1338k interfaceC1338k, r rVar, J2.i iVar, ArrayList arrayList) {
        String str = rVar.alpha;
        if (interfaceC1338k.delta(str)) {
            InterfaceC1355o mike = interfaceC1338k.mike(str);
            if (mike instanceof AbstractC1328i) {
                return ((AbstractC1328i) mike).charlie(iVar, arrayList);
            }
            throw new IllegalArgumentException(P0.crimson(str, " is not a function"));
        }
        if ("hasOwnProperty".equals(str)) {
            AbstractC1295b1.hotel(arrayList, 1, "hasOwnProperty");
            if (interfaceC1338k.delta(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo())) {
                return InterfaceC1355o.jade;
            }
            return InterfaceC1355o.lavender;
        }
        throw new IllegalArgumentException(q.echo("Object has no function ", str));
    }
}
