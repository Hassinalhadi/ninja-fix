package s6;

import F.AbstractC0141o0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0842g;
import delivery.samurai.android.R;
import g0.C1726f;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class Z4 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.jade(), java.lang.Integer.valueOf(r12)) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(List items, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.i iVar;
        C2549i c2549i;
        C1726f bravo;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        Intrinsics.echo(items, "items");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1379917482);
        if (c0585q.india(items)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4 | 3072;
        if ((i12 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar = T.p.alpha;
            if (items.isEmpty()) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Sb.a(items, sVar, i4, 4);
                    return;
                }
                return;
            }
            String oscar = Q0.c.oscar(c0585q, -1044186866, R.string.order_items, c0585q, false);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(false);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            long j5 = AbstractC2210c.delta;
            float f5 = 12;
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            T.s charlie = t6.R3.charlie(AbstractC3087z.alpha(sVar, bravo2), 1, j5, bravo2);
            androidx.compose.runtime.E0 e02 = F.Q.alpha;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(charlie, ((F.O) c0585q.kilo(e02)).papa, bravo2), f5);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar2 = T.d.f2062f;
            C0554u alpha = AbstractC0553t.alpha(c0537c, iVar2, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q, alpha);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q, mike);
            C2549i c2549i4 = C2551k.golf;
            if (!c0585q.lime) {
                iVar = iVar2;
            } else {
                iVar = iVar2;
            }
            ao.ad.blue(romeo, c0585q, romeo, c2549i4);
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q, charlie2);
            T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new Cb.u(axVar, 23);
                c0585q.f(jade2);
            }
            T.s delta = androidx.compose.foundation.a.delta(charlie3, false, null, null, (Function0) jade2, 7);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(delta, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha2);
            C0564b.blue(c2549i3, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie4);
            long charlie5 = AbstractC2636d7.charlie(16);
            H0.v vVar = H0.v.f1409c;
            T.i iVar3 = iVar;
            F.G2.bravo(oscar, null, ((F.O) c0585q.kilo(e02)).quebec, charlie5, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 199680, 0, 131026);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            int romeo3 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha3);
            C0564b.blue(c2549i3, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                c2549i = c2549i4;
                ao.ad.blue(romeo3, c0585q, romeo3, c2549i);
            } else {
                c2549i = c2549i4;
            }
            C0564b.blue(c2549i5, c0585q, charlie6);
            C2549i c2549i6 = c2549i;
            T.j jVar2 = jVar;
            F.G2.bravo(items.size() + " items", null, ((F.O) c0585q.kilo(e02)).sierra, AbstractC2636d7.charlie(14), vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 199680, 0, 131026);
            if (((Boolean) axVar.getValue()).booleanValue()) {
                bravo = AbstractC2620c0.bravo();
            } else {
                bravo = Z.bravo();
            }
            if (((Boolean) axVar.getValue()).booleanValue()) {
                i10 = 605170185;
                i11 = R.string.collapse;
                z10 = false;
            } else {
                z10 = false;
                i10 = 605171431;
                i11 = R.string.expand;
            }
            T.p pVar2 = pVar;
            AbstractC0141o0.bravo(bravo, Q0.c.oscar(c0585q, i10, i11, c0585q, z10), AbstractC0538d.whiskey(pVar, 4, 0.0f, 0.0f, 0.0f, 14), 0L, c0585q, 384, 8);
            c0585q = c0585q;
            boolean z13 = true;
            c0585q.quebec(true);
            c0585q.quebec(true);
            if (((Boolean) axVar.getValue()).booleanValue()) {
                c0585q.purple(90289143);
                float f10 = 1.0f;
                T.s charlie7 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(8), iVar3, c0585q, 6);
                int romeo4 = C0564b.romeo(c0585q);
                androidx.compose.runtime.I mike4 = c0585q.mike();
                T.s charlie8 = T.a.charlie(charlie7, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha4);
                C0564b.blue(c2549i3, c0585q, mike4);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                    ao.ad.blue(romeo4, c0585q, romeo4, c2549i6);
                }
                C0564b.blue(c2549i5, c0585q, charlie8);
                c0585q.purple(503738067);
                int i13 = 0;
                for (Iterator it = items.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    C0842g c0842g = (C0842g) next;
                    if (i13 > 0) {
                        c0585q.purple(-766338758);
                        F.K1.echo(null, 0.0f, AbstractC2210c.echo, c0585q, 384, 3);
                        z12 = false;
                    } else {
                        z12 = false;
                        c0585q.purple(-770250989);
                    }
                    c0585q.quebec(z12);
                    T.s charlie9 = androidx.compose.foundation.layout.V.charlie(pVar2, f10);
                    T.j jVar3 = jVar2;
                    androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), jVar3, c0585q, 54);
                    int romeo5 = C0564b.romeo(c0585q);
                    androidx.compose.runtime.I mike5 = c0585q.mike();
                    T.s charlie10 = T.a.charlie(charlie9, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j2);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha5);
                    C0564b.blue(C2551k.echo, c0585q, mike5);
                    C2549i c2549i7 = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo5))) {
                        ao.ad.blue(romeo5, c0585q, romeo5, c2549i7);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie10);
                    String str = c0842g.bravo + "x";
                    long charlie11 = AbstractC2636d7.charlie(14);
                    H0.v vVar2 = H0.v.f1409c;
                    androidx.compose.runtime.E0 e03 = F.Q.alpha;
                    boolean z14 = z13;
                    jVar2 = jVar3;
                    C0585q c0585q2 = c0585q;
                    F.G2.bravo(str, androidx.compose.foundation.layout.V.oscar(pVar2, 32), ((F.O) c0585q.kilo(e03)).sierra, charlie11, vVar2, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 199728, 0, 131024);
                    F.G2.bravo(c0842g.alpha, null, ((F.O) c0585q2.kilo(e03)).quebec, AbstractC2636d7.charlie(14), H0.v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 199680, 0, 131026);
                    c0585q = c0585q2;
                    c0585q.quebec(z14);
                    z13 = z14;
                    i13 = i14;
                    pVar2 = pVar2;
                    f10 = f10;
                }
                z11 = z13;
                A0.z.papa(c0585q, false, z11, false);
            } else {
                z11 = true;
                c0585q.purple(86581698);
                c0585q.quebec(false);
            }
            c0585q.quebec(z11);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Sb.a(items, sVar, i4, 5);
        }
    }

    public static String bravo(Gf.i iVar, Charset charset, int i4) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.a.alpha;
        }
        Intrinsics.echo(iVar, "<this>");
        Intrinsics.echo(charset, "charset");
        if (Intrinsics.areEqual(charset, kotlin.text.a.alpha)) {
            return Gf.j.bravo(iVar);
        }
        return R4.bravo(charset.newDecoder(), iVar);
    }

    public static final byte[] charlie(String str, Charset charset) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(charset, "charset");
        Charset charset2 = kotlin.text.a.alpha;
        if (Intrinsics.areEqual(charset, charset2)) {
            int length = str.length();
            kotlin.collections.ab.charlie(0, length, str.length());
            CharsetEncoder newEncoder = charset2.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
            if (encode.hasArray() && encode.arrayOffset() == 0) {
                int remaining = encode.remaining();
                byte[] array = encode.array();
                Intrinsics.checkNotNull(array);
                if (remaining == array.length) {
                    byte[] array2 = encode.array();
                    Intrinsics.checkNotNull(array2);
                    return array2;
                }
            }
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            return bArr;
        }
        return Q4.alpha(charset.newEncoder(), str, 0, str.length());
    }
}
