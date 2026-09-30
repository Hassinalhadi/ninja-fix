package t6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import rb.C2514b;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public abstract class r {
    public static final void alpha(String title, T.s sVar, long j5, float f5, D0.an anVar, long j6, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        long j7;
        D0.an anVar2;
        long j10;
        boolean z2;
        C0585q c0585q;
        long j11;
        D0.an anVar3;
        long j12;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(title, "title");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1562345094);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(title)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i4 & 384) == 0) {
            if ((i5 & 4) == 0) {
                j7 = j5;
                if (c0585q2.foxtrot(j7)) {
                    i13 = Barcode.FORMAT_QR_CODE;
                    i10 |= i13;
                }
            } else {
                j7 = j5;
            }
            i13 = 128;
            i10 |= i13;
        } else {
            j7 = j5;
        }
        int i16 = i10 | 3072;
        if ((i4 & 24576) == 0) {
            if ((i5 & 16) == 0) {
                anVar2 = anVar;
                if (c0585q2.golf(anVar2)) {
                    i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i16 |= i12;
                }
            } else {
                anVar2 = anVar;
            }
            i12 = 8192;
            i16 |= i12;
        } else {
            anVar2 = anVar;
        }
        if ((196608 & i4) == 0) {
            if ((i5 & 32) == 0) {
                j10 = j6;
                if (c0585q2.foxtrot(j10)) {
                    i11 = 131072;
                    i16 |= i11;
                }
            } else {
                j10 = j6;
            }
            i11 = 65536;
            i16 |= i11;
        } else {
            j10 = j6;
        }
        if ((74899 & i16) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                if ((i5 & 4) != 0) {
                    i16 &= -897;
                }
                if ((i5 & 16) != 0) {
                    i16 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    i16 &= -458753;
                }
                f11 = f5;
            } else {
                if ((i5 & 4) != 0) {
                    j7 = ((F.O) c0585q2.kilo(F.Q.alpha)).azure;
                    i16 &= -897;
                }
                f11 = 12;
                if ((i5 & 16) != 0) {
                    anVar2 = ((F.S2) c0585q2.kilo(F.T2.alpha)).hotel;
                    i16 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    j10 = ((F.O) c0585q2.kilo(F.Q.alpha)).sierra;
                    i16 &= -458753;
                }
            }
            D0.an anVar4 = anVar2;
            c0585q2.romeo();
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q2, 54);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            float f12 = f11;
            float f13 = 1;
            int i17 = (i16 & 896) | 48;
            long j13 = j7;
            F.K1.echo(AbstractC0538d.whiskey(androidx.appcompat.widget.P0.maroon(1.0f), 0.0f, 0.0f, f12, 0.0f, 11), f13, j13, c0585q2, i17, 0);
            long j14 = j10;
            F.G2.bravo(title, null, j14, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar4, c0585q2, (i16 & 14) | ((i16 >> 9) & 896), (i16 << 6) & 3670016, 65530);
            F.K1.echo(AbstractC0538d.whiskey(androidx.appcompat.widget.P0.maroon(1.0f), f12, 0.0f, 0.0f, 0.0f, 14), f13, j13, c0585q2, i17, 0);
            c0585q = c0585q2;
            c0585q.quebec(true);
            j12 = j14;
            anVar3 = anVar4;
            f10 = f12;
            j11 = j13;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            j11 = j7;
            anVar3 = anVar2;
            j12 = j10;
            f10 = f5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2514b(title, sVar, j11, f10, anVar3, j12, i4, i5);
        }
    }

    public static SafeParcelable bravo(byte[] bArr, Parcelable.Creator creator) {
        V5.x.hotel(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
