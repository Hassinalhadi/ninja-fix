package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2726n7;

/* renamed from: t6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3043q {
    public static final void alpha(int i4, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 function0) {
        boolean z2;
        Function0 function02;
        String str3;
        boolean z10;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1148358317);
        int i5 = i4 | 384;
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.d.alpha);
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(Db.f.delta), iVar, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            F.G2.bravo(str, null, Db.c.delta, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, ((F.S2) c0585q.kilo(F.T2.alpha)).juliet, c0585q, 390, 0, 65018);
            c0585q = c0585q;
            if (function0 == null) {
                str3 = "Retry";
                z10 = false;
                function02 = function0;
                c0585q.purple(-1794006183);
            } else {
                c0585q.purple(-1792455129);
                T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                str3 = "Retry";
                function02 = function0;
                AbstractC2726n7.alpha(str3, function02, false, charlie2, null, c0585q, 3126, 20);
                z10 = false;
            }
            c0585q.quebec(z10);
            c0585q.quebec(true);
        } else {
            function02 = function0;
            c0585q.ochre();
            str3 = str2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.b0(str, function02, str3, i4);
        }
    }

    public static void bravo(Parcel parcel, int i4, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeBundle(bundle);
        romeo(parcel, quebec);
    }

    public static void charlie(Parcel parcel, int i4, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeByteArray(bArr);
        romeo(parcel, quebec);
    }

    public static void delta(Parcel parcel, float[] fArr) {
        if (fArr == null) {
            return;
        }
        int quebec = quebec(parcel, 1);
        parcel.writeFloatArray(fArr);
        romeo(parcel, quebec);
    }

    public static void echo(Parcel parcel, int i4, Float f5) {
        if (f5 == null) {
            return;
        }
        sierra(parcel, i4, 4);
        parcel.writeFloat(f5.floatValue());
    }

    public static void foxtrot(Parcel parcel, int i4, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeStrongBinder(iBinder);
        romeo(parcel, quebec);
    }

    public static void golf(Parcel parcel, int i4, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeIntArray(iArr);
        romeo(parcel, quebec);
    }

    public static void hotel(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(((Integer) list.get(i5)).intValue());
        }
        romeo(parcel, quebec);
    }

    public static void india(Parcel parcel, int i4, Integer num) {
        if (num == null) {
            return;
        }
        sierra(parcel, i4, 4);
        parcel.writeInt(num.intValue());
    }

    public static void juliet(Parcel parcel, int i4, Long l10) {
        if (l10 == null) {
            return;
        }
        sierra(parcel, i4, 8);
        parcel.writeLong(l10.longValue());
    }

    public static void kilo(Parcel parcel, int i4, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcelable.writeToParcel(parcel, i5);
        romeo(parcel, quebec);
    }

    public static void lima(Parcel parcel, int i4, String str) {
        if (str == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeString(str);
        romeo(parcel, quebec);
    }

    public static void mike(Parcel parcel, int i4, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeStringArray(strArr);
        romeo(parcel, quebec);
    }

    public static void november(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeStringList(list);
        romeo(parcel, quebec);
    }

    public static void oscar(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        romeo(parcel, quebec);
    }

    public static void papa(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int quebec = quebec(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        romeo(parcel, quebec);
    }

    public static int quebec(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void romeo(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void sierra(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }
}
