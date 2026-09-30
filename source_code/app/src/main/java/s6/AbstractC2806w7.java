package s6;

import a0.C0346af;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import qb.AbstractC2441h;
import qb.C2442i;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3087z;

/* renamed from: s6.w7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2806w7 {
    public static final void alpha(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, Function0 onButtonClick, boolean z2) {
        boolean z10;
        Function0 function0;
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(30748889);
        int i5 = 1794048 | i4;
        if ((599187 & i5) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            T.p pVar2 = T.p.alpha;
            function0 = onButtonClick;
            bravo(new C2442i("Book Shift", "You don’t have booked shifts, go book a shift to start\nreceive orders.", "Book Shift"), function0, pVar2, true, c0585q, 28080, 0);
            pVar = pVar2;
            z2 = true;
        } else {
            function0 = onButtonClick;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Uc.a(function0, pVar, z2, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(C2442i c2442i, Function0 onButtonClick, T.s sVar, boolean z2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        androidx.compose.runtime.Q uniform;
        Object[] objArr;
        boolean z13;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1993802945);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(c2442i)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onButtonClick)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        int i16 = i5 & 8;
        if (i16 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            z10 = z2;
            if (c0585q.hotel(z10)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            if ((i5 & 16) == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                if (c0585q.golf(null)) {
                    i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            if ((i10 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!c0585q.magenta(i10 & 1, z11)) {
                T.p pVar = T.p.alpha;
                if (i16 != 0) {
                    objArr = 32;
                    z13 = true;
                } else {
                    objArr = 32;
                    z13 = z10;
                }
                Object[] objArr2 = objArr;
                T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), C0366t.juliet, a0.ao.alpha), 8, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7);
                T.i iVar = T.d.f2063g;
                C0537c c0537c = AbstractC0542h.charlie;
                C0554u alpha = AbstractC0553t.alpha(c0537c, iVar, c0585q, 48);
                long j5 = c0585q.magenta;
                int i17 = (int) (j5 ^ (j5 >>> (objArr2 == true ? 1L : 0L)));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie = T.a.charlie(whiskey, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C2549i c2549i = C2551k.foxtrot;
                C0564b.blue(c2549i, c0585q, alpha);
                C2549i c2549i2 = C2551k.echo;
                C0564b.blue(c2549i2, c0585q, mike);
                C2549i c2549i3 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                    ao.ad.blue(i17, c0585q, i17, c2549i3);
                }
                C2549i c2549i4 = C2551k.delta;
                C0564b.blue(c2549i4, c0585q, charlie);
                float f5 = 16;
                boolean z14 = z13;
                T.s victor = AbstractC0538d.victor(t6.R3.charlie(androidx.compose.foundation.a.bravo(t6.ac.alpha(com.google.android.material.datepicker.j.hotel(pVar, 22, c0585q, pVar, 1.0f), 44, AbstractC2094g.bravo(f5), Db.c.gray, Db.c.gold, 4), Db.c.emerald, AbstractC2094g.bravo(f5)), 1, Db.c.fuchsia, AbstractC2094g.bravo(f5)), f5, f5, f5, f5);
                C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 48);
                long j6 = c0585q.magenta;
                int i18 = (int) (j6 ^ (j6 >>> (objArr2 == true ? 1L : 0L)));
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie2 = T.a.charlie(victor, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, alpha2);
                C0564b.blue(c2549i2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                    ao.ad.blue(i18, c0585q, i18, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie2);
                z.s.alpha(AbstractC3076w3.charlie(R.drawable.time_calender, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(pVar, 56), C0366t.kilo, c0585q, 3504, 0);
                float f10 = 4;
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f10), c0585q);
                F.G2.bravo(c2442i.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), AbstractC2636d7.charlie(22), new H0.v(700), null, null, 0L, 3, 0L, 0, 16744440), c0585q, 0, 0, 65534);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f10), c0585q);
                F.G2.bravo(c2442i.bravo, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Db.c.blue, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, null, 0L, 3, 0L, 0, 16744440), c0585q, 0, 0, 65534);
                c0585q = c0585q;
                charlie((i10 & 57344) | (i10 & 112) | 384 | (i10 & 7168), com.google.android.material.datepicker.j.hotel(pVar, f5, c0585q, pVar, 1.0f), c0585q, c2442i.charlie, null, onButtonClick, z14);
                c0585q.quebec(true);
                c0585q.quebec(true);
                z12 = z14;
            } else {
                c0585q.ochre();
                z12 = z10;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new androidx.compose.foundation.layout.r(c2442i, onButtonClick, sVar, z12, i4, i5);
                return;
            }
            return;
        }
        z10 = z2;
        if ((i5 & 16) == 0) {
        }
        if ((i10 & 9363) == 9362) {
        }
        if (!c0585q.magenta(i10 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 function0, boolean z2) {
        int i5;
        boolean z10;
        boolean z11;
        C0346af papa;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1083942009);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(str2)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        if ((i5 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            T.p pVar = T.p.alpha;
            C2093f bravo = AbstractC2094g.bravo(12);
            long j5 = Db.c.bronze;
            C0346af papa2 = g8.d.papa(CollectionsKt.listOf(new C0366t(j5), new C0366t(j5)));
            T.s alpha = AbstractC3087z.alpha(t6.ac.alpha(androidx.compose.foundation.layout.V.echo(sVar, 55), AbstractC2441h.alpha, bravo, 0L, 0L, 24), bravo);
            if (z2) {
                papa = papa2;
                z11 = false;
            } else {
                z11 = false;
                long j6 = Db.c.yankee;
                papa = g8.d.papa(CollectionsKt.listOf(new C0366t(j6), new C0366t(j6)));
            }
            T.s echo = androidx.compose.foundation.a.echo(12, androidx.compose.foundation.a.alpha(alpha, papa), str2, function0, z2);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, z11);
            long j7 = c0585q.magenta;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(echo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q, 54);
            long j10 = c0585q.magenta;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            t6.W3.alpha(AbstractC3076w3.charlie(R.drawable.time_calender_now, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(AbstractC0538d.sierra(pVar, 1), 24), null, C2391j.echo, 0.0f, null, c0585q, 25008, 104);
            F.G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Db.c.emerald, AbstractC2636d7.charlie(16), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, i5 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.e(str, function0, sVar, z2, str2, i4);
        }
    }

    public static void delta(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(androidx.appcompat.widget.P0.bronze(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                echo(cls, e);
                throw null;
            } catch (InstantiationException e4) {
                echo(cls, e4);
                throw null;
            } catch (NoSuchMethodException e5) {
                echo(cls, e5);
                throw null;
            } catch (InvocationTargetException e10) {
                echo(cls, e10);
                throw null;
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    public static void echo(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(androidx.appcompat.widget.P0.blue(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
