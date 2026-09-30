package s6;

import F.AbstractC0141o0;
import a0.C0366t;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ActionType;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class S6 {
    public static final void alpha(ActionType actionType, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        boolean z10;
        float f5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-240212167);
        if (c0585q.india(actionType)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f hotel = AbstractC0542h.hotel(0, T.d.f2062f);
            T.j jVar = T.d.f2061d;
            T.p pVar = T.p.alpha;
            T.s echo = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 60);
            float f10 = 1;
            long delta = a0.ao.delta(4294243573L);
            a0.an anVar = a0.ao.alpha;
            T.s bravo = androidx.compose.foundation.a.bravo(t6.R3.charlie(echo, f10, delta, anVar), a0.ao.delta(4294967295L), anVar);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 17);
                c0585q.f(jade);
            }
            float f11 = 16;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), f11, f11, f11, f11);
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(hotel, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            T.k kVar = T.d.teal;
            float f12 = 4;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(t6.R3.charlie(androidx.compose.foundation.layout.V.kilo(pVar, 28), f10, a0.ao.delta(4293190887L), AbstractC2094g.bravo(f12)), a0.ao.delta(4294967295L), AbstractC2094g.bravo(f12)), f12);
            q0.ap delta2 = AbstractC0547m.delta(kVar, false);
            long j6 = c0585q.magenta;
            int i14 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ticket, c0585q, 6), null, androidx.compose.foundation.layout.V.charlie, a0.ao.delta(4280756010L), c0585q, 3504, 0);
            c0585q.quebec(true);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, 12), c0585q);
            String title = actionType.getTitle();
            if (title == null) {
                title = "";
            }
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            F.G2.bravo(title, new LayoutWeightElement(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(a0.ao.delta(4280756010L), AbstractC2636d7.charlie(16), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65532);
            c0585q = c0585q;
            if (((Q0.n) c0585q.kilo(AbstractC2901T.november)) == Q0.n.purple) {
                f5 = -1.0f;
            } else {
                f5 = 1.0f;
            }
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.forward, c0585q, 6), null, t6.ab.charlie(androidx.compose.foundation.layout.V.kilo(pVar, f11), f5), a0.ao.delta(4287532691L), c0585q, 3120, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 10, actionType, function0);
        }
    }

    public static final void bravo(List types, Function1 onTypeClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        boolean z10;
        Intrinsics.echo(types, "types");
        Intrinsics.echo(onTypeClick, "onTypeClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1520523383);
        if (c0585q.india(types)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q.india(onTypeClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar = T.p.alpha;
            FillElement fillElement = androidx.compose.foundation.layout.V.charlie;
            long delta = a0.ao.delta(4294243573L);
            a0.an anVar = a0.ao.alpha;
            T.s bravo = androidx.compose.foundation.a.bravo(fillElement, delta, anVar);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(bravo, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            float f5 = 12;
            F.G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.tickets_selection_msg), AbstractC0538d.tango(pVar, 16, f5), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Db.c.maroon, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, Pc.c.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 48, 0, 65532);
            c0585q = c0585q;
            T.s bravo2 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(fillElement, AbstractC2094g.bravo(f5)), C0366t.echo, anVar);
            boolean india = c0585q.india(types);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = india | z10;
            Object jade = c0585q.jade();
            if (z11 || jade == C0580l.alpha) {
                jade = new Ic.a(types, onTypeClick, 2);
                c0585q.f(jade);
            }
            AbstractC2616b5.alpha(bravo2, null, null, null, null, null, false, null, (Function1) jade, c0585q, 0, 510);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ic.b(types, onTypeClick, i4, 1);
        }
    }

    public static final Bundle charlie(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.first;
            Object obj = pair.second;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
