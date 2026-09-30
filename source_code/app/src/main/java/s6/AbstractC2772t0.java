package s6;

import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.EntryPointAccessors;
import dc.C1608a;
import dc.InterfaceC1609b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2772t0;
import t0.AbstractC2913f0;

/* renamed from: s6.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2772t0 {
    public static final void alpha(final String str, final String str2, final String str3, final Integer num, final Double d4, final Double d9, final String str4, final String str5, final String str6, final Function1 distanceValueFormatter, final String str7, final String str8, final String str9, final String str10, final Function0 onAccept, final Function0 onReject, InterfaceC0581m interfaceC0581m, final int i4) {
        C0585q c0585q;
        Intrinsics.echo(distanceValueFormatter, "distanceValueFormatter");
        Intrinsics.echo(onAccept, "onAccept");
        Intrinsics.echo(onReject, "onReject");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(699151607);
        int i5 = i4 | (c0585q2.golf(str) ? 4 : 2) | (c0585q2.golf(str2) ? 32 : 16) | (c0585q2.golf(str3) ? 256 : 128);
        boolean golf = c0585q2.golf(num);
        int i10 = Barcode.FORMAT_UPC_E;
        int i11 = i5 | (golf ? 2048 : 1024) | (c0585q2.golf(d4) ? 16384 : 8192) | (c0585q2.golf(d9) ? 131072 : 65536) | (c0585q2.golf(str4) ? 1048576 : 524288) | (c0585q2.golf(str5) ? 8388608 : 4194304) | (c0585q2.golf(str6) ? 67108864 : 33554432) | (c0585q2.india(distanceValueFormatter) ? 536870912 : 268435456);
        int i12 = (c0585q2.golf(str7) ? 4 : 2) | (c0585q2.golf(str8) ? 32 : 16) | (c0585q2.golf(str9) ? 256 : 128);
        if (c0585q2.golf(str10)) {
            i10 = 2048;
        }
        int i13 = i12 | i10 | (c0585q2.india(onAccept) ? 16384 : 8192) | (c0585q2.india(onReject) ? 131072 : 65536);
        if (c0585q2.magenta(i11 & 1, ((i11 & 306783379) == 306783378 && (74899 & i13) == 74898) ? false : true)) {
            Ld.c hotel = kotlin.collections.ab.hotel();
            if (num != null) {
                c0585q = c0585q2;
                hotel.add(new Pair(String.valueOf(num.intValue()), str4));
            } else {
                c0585q = c0585q2;
            }
            if (d4 != null) {
                hotel.add(new Pair(distanceValueFormatter.invoke(Double.valueOf(d4.doubleValue())), str5));
            }
            if (d9 != null) {
                hotel.add(new Pair(distanceValueFormatter.invoke(Double.valueOf(d9.doubleValue())), str6));
            }
            int i14 = i11 & 1022;
            int i15 = i13 << 12;
            AbstractC2808x0.alpha(str, str2, str3, kotlin.collections.ab.alpha(hotel), str7, str8, str9, str10, onAccept, onReject, false, c0585q, i14 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192));
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(str, str2, str3, num, d4, d9, str4, str5, str6, distanceValueFormatter, str7, str8, str9, str10, onAccept, onReject, i4) { // from class: Bb.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f746a;
                public final /* synthetic */ String alpha;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f747b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function1 f748c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f749d;
                public final /* synthetic */ String e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f750f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f751g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function0 f752h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f753i;
                public final /* synthetic */ String purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ Integer silver;
                public final /* synthetic */ Double teal;
                public final /* synthetic */ Double white;
                public final /* synthetic */ String yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    String str11 = this.purple;
                    String str12 = this.red;
                    String str13 = this.yellow;
                    String str14 = this.f746a;
                    String str15 = this.f747b;
                    String str16 = this.f749d;
                    String str17 = this.f750f;
                    String str18 = this.f751g;
                    Function0 function0 = this.f752h;
                    Function0 function02 = this.f753i;
                    AbstractC2772t0.alpha(this.alpha, str11, str12, this.silver, this.teal, this.white, str13, str14, str15, this.f748c, str16, this.e, str17, str18, function0, function02, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean bravo(InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(466814522);
        if (((Boolean) c0585q.kilo(AbstractC2913f0.alpha)).booleanValue()) {
            c0585q.quebec(false);
            return true;
        }
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        boolean golf = c0585q.golf(context);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            Intrinsics.echo(context, "context");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.delta(applicationContext, "getApplicationContext(...)");
            jade = (C1608a) ((w9.p) ((InterfaceC1609b) EntryPointAccessors.fromApplication(applicationContext, InterfaceC1609b.class))).quebec.get();
            c0585q.f(jade);
        }
        C1608a c1608a = (C1608a) jade;
        c1608a.getClass();
        boolean booleanValue = ((Boolean) AbstractC2717m7.bravo(((N9.i) c1608a.alpha).charlie(N9.a.bravo), c0585q, 0).getValue()).booleanValue();
        c0585q.quebec(false);
        return booleanValue;
    }
}
