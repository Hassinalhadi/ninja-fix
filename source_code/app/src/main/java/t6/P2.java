package t6;

import F.AbstractC0141o0;
import a0.C0366t;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2213f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.P2;
import w2.AbstractC3235a;

/* loaded from: classes2.dex */
public abstract class P2 {
    public static long alpha;
    public static Method bravo;
    public static Method charlie;
    public static Method delta;
    public static Method echo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public static final void alpha(final Function0 onClick, final Za.c cVar, final int i4, final int i5, final boolean z2, final T.s sVar, final boolean z10, final boolean z11, final String str, final boolean z12, InterfaceC0581m interfaceC0581m, final int i10, final int i11) {
        int i12;
        int i13;
        C0585q c0585q;
        boolean z13;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z14;
        String str3;
        long j5;
        long j6;
        float f5;
        long j7;
        long bravo2;
        C2549i c2549i;
        C0585q c0585q2;
        T.p pVar;
        long j10;
        String str4;
        boolean z15;
        T.s sVar2;
        T.s sVar3;
        ?? r72;
        String str5;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-841450883);
        if ((i10 & 6) == 0) {
            i12 = (c0585q3.india(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0585q3.echo(cVar.ordinal()) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0585q3.echo(i4) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0585q3.echo(i5) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0585q3.hotel(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0585q3.golf(sVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0585q3.hotel(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c0585q3.hotel(z11) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c0585q3.golf(str) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c0585q3.hotel(z12) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0585q3.golf(null) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0585q3.golf(null) ? 32 : 16;
        }
        int i18 = i13;
        if (c0585q3.magenta(i12 & 1, ((306783379 & i12) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            T.p pVar2 = T.p.alpha;
            C2093f bravo3 = AbstractC2094g.bravo(AbstractC2213f.delta);
            String azure = androidx.appcompat.widget.P0.azure(i4, i5, "(", "/", ")");
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                z13 = false;
                i14 = -1180414553;
                i15 = R.string.task_type_pick_up;
            } else if (ordinal == 1) {
                z13 = false;
                i14 = -1180411928;
                i15 = R.string.task_type_delivery;
            } else {
                if (ordinal != 2) {
                    throw ao.ad.black(c0585q3, -1180416152, false);
                }
                i14 = -1180409338;
                i15 = R.string.task_type_return;
                z13 = false;
            }
            String oscar = Q0.c.oscar(c0585q3, i14, i15, c0585q3, z13);
            if (z11) {
                c0585q3.purple(-1180406285);
                if (str == null) {
                    str5 = Q0.c.oscar(c0585q3, -1180404737, R.string.cancelled, c0585q3, false);
                } else {
                    c0585q3.purple(-1180405295);
                    c0585q3.quebec(false);
                    str5 = str;
                }
                oscar = oscar + " " + azure + " - " + str5;
                z13 = false;
                c0585q3.quebec(false);
            } else {
                c0585q3.purple(-1180403060);
                c0585q3.quebec(z13);
            }
            String str6 = oscar;
            String str7 = z11 ? "" : azure;
            if (z2) {
                i16 = -1180399106;
                str2 = "";
                i17 = R.string.collapse;
            } else {
                str2 = "";
                i16 = -1180397860;
                i17 = R.string.expand;
            }
            String oscar2 = Q0.c.oscar(c0585q3, i16, i17, c0585q3, z13);
            if (z11) {
                c0585q3.purple(-1180395035);
                str3 = AbstractC3086y3.bravo(c0585q3, R.string.cancelled) + " ";
                c0585q3.quebec(false);
                z14 = false;
            } else if (z10) {
                c0585q3.purple(-1180392987);
                str3 = AbstractC3086y3.bravo(c0585q3, R.string.completed) + " ";
                z14 = false;
                c0585q3.quebec(false);
            } else {
                z14 = false;
                c0585q3.purple(2062578433);
                c0585q3.quebec(false);
                str3 = str2;
            }
            Integer valueOf = Integer.valueOf(i4);
            Integer valueOf2 = Integer.valueOf(i5);
            boolean z16 = z14;
            Object[] objArr = new Object[2];
            objArr[z16 ? 1 : 0] = valueOf;
            objArr[1] = valueOf2;
            String str8 = str7;
            String alpha2 = AbstractC3086y3.alpha(R.string.step_of_format, objArr, c0585q3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oscar2);
            sb2.append(" ");
            sb2.append(str3);
            sb2.append(str6);
            sb2.append(" (");
            String gold = androidx.appcompat.widget.P0.gold(sb2, alpha2, ")");
            boolean z17 = z11 || z10;
            if (z17) {
                j5 = Db.c.amber;
            } else {
                j5 = AbstractC2213f.alpha;
            }
            if (!z17 && z2) {
                j6 = Db.c.beige;
            } else {
                j6 = AbstractC2213f.bravo;
            }
            if (!z17 && z2) {
                f5 = AbstractC2213f.papa;
            } else {
                f5 = AbstractC2213f.charlie;
            }
            if (z17) {
                j7 = Db.c.black;
            } else {
                j7 = AbstractC2213f.mike;
            }
            long j11 = j7;
            if (z12) {
                bravo2 = AbstractC2213f.lima;
            } else {
                bravo2 = C0366t.bravo(0.5f, AbstractC2213f.lima);
            }
            long j12 = bravo2;
            T.s tango = AbstractC0538d.tango(R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), bravo3), j5, bravo3), f5, j6, bravo3), AbstractC2213f.echo, AbstractC2213f.foxtrot);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q3, 0);
            int romeo = C0564b.romeo(c0585q3);
            androidx.compose.runtime.I mike = c0585q3.mike();
            T.s charlie2 = T.a.charlie(tango, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q3, alpha3);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q3, mike);
            C2549i c2549i4 = C2551k.golf;
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q3, romeo, c2549i4);
            }
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q3, charlie2);
            T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
            if (z12) {
                c2549i = c2549i5;
                pVar = pVar2;
                j10 = j12;
                str4 = gold;
                c0585q2 = c0585q3;
                z15 = false;
                sVar2 = charlie3;
                sVar3 = androidx.compose.foundation.a.delta(pVar, false, str4, new A0.h(0), onClick, 1);
            } else {
                c2549i = c2549i5;
                c0585q2 = c0585q3;
                pVar = pVar2;
                j10 = j12;
                str4 = gold;
                z15 = false;
                sVar2 = charlie3;
                sVar3 = pVar;
            }
            T.s then = sVar2.then(sVar3);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, z15);
            int romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            C0585q c0585q4 = c0585q2;
            T.s charlie4 = T.a.charlie(then, c0585q4);
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i2, c0585q4, delta2);
            C0564b.blue(c2549i3, c0585q4, mike2);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q4, romeo2, c2549i4);
            }
            C0564b.blue(c2549i, c0585q4, charlie4);
            T.s alpha4 = C0551q.alpha.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), T.d.silver);
            C0540f golf = AbstractC0542h.golf(AbstractC2213f.hotel);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(golf, jVar, c0585q4, 54);
            int romeo3 = C0564b.romeo(c0585q4);
            androidx.compose.runtime.I mike3 = c0585q4.mike();
            T.s charlie5 = T.a.charlie(alpha4, c0585q4);
            c0585q4.white();
            String str9 = str4;
            if (c0585q4.lime) {
                c0585q4.lima(c2550j);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i2, c0585q4, alpha5);
            C0564b.blue(c2549i3, c0585q4, mike3);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q4, romeo3, c2549i4);
            }
            C0564b.blue(c2549i, c0585q4, charlie5);
            if (z11) {
                c0585q4.purple(1392551157);
                AbstractC0141o0.bravo(AbstractC2056a.alpha(), null, androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2213f.golf), AbstractC2213f.kilo, c0585q4, ((i18 << 3) & 112) | 3456, 0);
                c0585q4.quebec(false);
            } else if (z10) {
                c0585q4.purple(1392561283);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_check, c0585q4, 0), null, androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2213f.golf), AbstractC2213f.juliet, c0585q4, ((i18 << 3) & 112) | 3456, 0);
                c0585q4.quebec(false);
            } else {
                c0585q4.purple(1392571952);
                T.s alpha6 = AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2213f.quebec), AbstractC2094g.alpha);
                long j13 = Db.c.blue;
                T.s bravo4 = androidx.compose.foundation.a.bravo(alpha6, C0366t.bravo(0.12f, j13), a0.ao.alpha);
                q0.ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                int romeo4 = C0564b.romeo(c0585q4);
                androidx.compose.runtime.I mike4 = c0585q4.mike();
                T.s charlie6 = T.a.charlie(bravo4, c0585q4);
                c0585q4.white();
                if (c0585q4.lime) {
                    c0585q4.lima(c2550j);
                } else {
                    c0585q4.i();
                }
                C0564b.blue(c2549i2, c0585q4, delta3);
                C0564b.blue(c2549i3, c0585q4, mike4);
                if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo4))) {
                    ao.ad.blue(romeo4, c0585q4, romeo4, c2549i4);
                }
                C0564b.blue(c2549i, c0585q4, charlie6);
                F.G2.bravo(String.valueOf(i4), null, j13, AbstractC2213f.romeo, H0.v.f1408b, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, 199680, 0, 131026);
                c0585q4.quebec(true);
                c0585q4.quebec(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            androidx.compose.foundation.layout.S alpha7 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(AbstractC2213f.india), jVar, c0585q4, 54);
            int romeo5 = C0564b.romeo(c0585q4);
            androidx.compose.runtime.I mike5 = c0585q4.mike();
            T.s charlie7 = T.a.charlie(layoutWeightElement, c0585q4);
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i2, c0585q4, alpha7);
            C0564b.blue(c2549i3, c0585q4, mike5);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo5))) {
                ao.ad.blue(romeo5, c0585q4, romeo5, c2549i4);
            }
            C0564b.blue(c2549i, c0585q4, charlie7);
            long j14 = AbstractC2213f.november;
            H0.v vVar = AbstractC2213f.oscar;
            F.G2.bravo(str6, null, j11, j14, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, 199680, 0, 131026);
            if (str8.length() > 0) {
                c0585q4.purple(-1079574627);
                F.G2.bravo(str8, null, j11, j14, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, 199680, 0, 131026);
                r72 = 0;
            } else {
                r72 = 0;
                c0585q4.purple(-1086806679);
            }
            c0585q4.quebec(r72);
            c0585q4.quebec(true);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_down_arrow, c0585q4, r72), str9, aa.bravo(androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2213f.golf), z2 ? 180.0f : 0.0f), j10, c0585q4, 0, 0);
            A0.z.papa(c0585q4, true, true, true);
            c0585q = c0585q4;
        } else {
            C0585q c0585q5 = c0585q3;
            c0585q5.ochre();
            c0585q = c0585q5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Za.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i10 | 1);
                    int cyan2 = C0564b.cyan(i11);
                    c cVar2 = cVar;
                    String str10 = str;
                    boolean z18 = z12;
                    P2.alpha(Function0.this, cVar2, i4, i5, z2, sVar, z10, z11, str10, z18, (InterfaceC0581m) obj, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bravo(final Function0 onClick, final Za.c cVar, final int i4, final int i5, final boolean z2, final T.s sVar, final boolean z10, final boolean z11, final String str, final boolean z12, InterfaceC0581m interfaceC0581m, final int i10) {
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(297533280);
        if ((i10 & 6) == 0) {
            if (c0585q.india(onClick)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i11 = i22 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c0585q.echo(cVar.ordinal())) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i11 |= i21;
        }
        if ((i10 & 384) == 0) {
            i12 = i4;
            if (c0585q.echo(i12)) {
                i20 = Barcode.FORMAT_QR_CODE;
            } else {
                i20 = 128;
            }
            i11 |= i20;
        } else {
            i12 = i4;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q.echo(i5)) {
                i19 = 2048;
            } else {
                i19 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i19;
        }
        if ((i10 & 24576) == 0) {
            if (c0585q.hotel(z2)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i11 |= i18;
        }
        if ((196608 & i10) == 0) {
            if (c0585q.golf(sVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i11 |= i17;
        }
        if ((1572864 & i10) == 0) {
            if (c0585q.hotel(z10)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i11 |= i16;
        }
        if ((12582912 & i10) == 0) {
            if (c0585q.hotel(z11)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i11 |= i15;
        }
        if ((100663296 & i10) == 0) {
            if (c0585q.golf(str)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i11 |= i14;
        }
        if ((805306368 & i10) == 0) {
            z13 = z12;
            if (c0585q.hotel(z13)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        } else {
            z13 = z12;
        }
        if ((306783379 & i11) == 306783378) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (c0585q.magenta(i11 & 1, z14)) {
            alpha(onClick, cVar, i12, i5, z2, sVar, z10, z11, str, z13, c0585q, 2147483646 & i11, 54);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Za.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i10 | 1);
                    c cVar2 = cVar;
                    String str2 = str;
                    boolean z15 = z12;
                    P2.bravo(Function0.this, cVar2, i4, i5, z2, sVar, z10, z11, str2, z15, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void charlie(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean delta() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3235a.charlie();
        }
        try {
            if (bravo == null) {
                alpha = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                bravo = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) bravo.invoke(null, Long.valueOf(alpha))).booleanValue();
        } catch (Exception e) {
            charlie("isTagEnabled", e);
            return false;
        }
    }

    public static void echo(int i4, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3235a.delta(i4, foxtrot(str));
            return;
        }
        String foxtrot = foxtrot(str);
        try {
            if (echo == null) {
                echo = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            echo.invoke(null, Long.valueOf(alpha), foxtrot, Integer.valueOf(i4));
        } catch (Exception e) {
            charlie("traceCounter", e);
        }
    }

    public static String foxtrot(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }
}
