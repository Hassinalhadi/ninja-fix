package s6;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import da.InterfaceC1599e;
import dagger.hilt.android.EntryPointAccessors;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3016k2;
import z3.C3462a;

/* renamed from: s6.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2754r0 {
    public static final void alpha(String str, String str2, Function0 onAccept, Function0 onReject, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        Intrinsics.echo(onAccept, "onAccept");
        Intrinsics.echo(onReject, "onReject");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1906993737);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q2.golf(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q2.india(onAccept)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q2.india(onReject)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            float f5 = 12;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q2, 6);
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
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            float f10 = 55;
            T.s bravo = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), f10), a0.ao.delta(4280756010L), AbstractC2094g.bravo(f5));
            if ((i16 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                jade = new Bb.a(onAccept, 0);
                c0585q2.f(jade);
            }
            float f11 = 16;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.delta(bravo, false, null, null, (Function0) jade, 7), f11);
            J1.e eVar = AbstractC0542h.echo;
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar, c0585q2, 54);
            int romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q2, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            z.ak.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(a0.ao.delta(4294967295L), AbstractC2636d7.charlie(16), H0.v.f1409c, null, null, 0L, 3, 0L, 0, 16744440), c0585q2, i16 & 14, 0, 65534);
            c0585q2.quebec(true);
            T.s bravo2 = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), f10), a0.ao.delta(4294967295L), AbstractC2094g.bravo(f5));
            if ((i16 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade2 = c0585q2.jade();
            if (z11 || jade2 == asVar) {
                jade2 = new Bb.a(onReject, 1);
                c0585q2.f(jade2);
            }
            T.s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.delta(bravo2, false, null, null, (Function0) jade2, 7), f11);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar, c0585q2, 54);
            int romeo3 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(sierra2, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q2, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie4);
            z.ak.bravo(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(a0.ao.delta(4280756010L), AbstractC2636d7.charlie(16), H0.v.f1407a, null, null, 0L, 3, 0L, 0, 16744440), c0585q2, (i16 >> 3) & 14, 0, 65534);
            c0585q = c0585q2;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(str, str2, onAccept, onReject, i4, 2);
        }
    }

    public static final void bravo(String str) {
        Unit unit;
        AndroidApp androidApp = AndroidApp.yellow;
        Context applicationContext = t6.V2.delta().getApplicationContext();
        try {
            C3462a.alpha("SessionTerminator", 12, "invalidate() called | reason=" + str, null);
            boolean z2 = CaptainLocationMonitoringService.f12066D;
            Intrinsics.checkNotNull(applicationContext);
            AbstractC3016k2.delta(applicationContext, false);
            try {
                Result.Companion companion = Result.INSTANCE;
                ca.n nVar = ca.n.crimson;
                if (nVar != null) {
                    nVar.lima();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m206constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            yf.N n5 = CaptainLocationMonitoringService.f12067E;
            p3.ah ahVar = (p3.ah) n5.getValue();
            p3.ah ahVar2 = p3.ah.red;
            n5.getClass();
            n5.juliet(null, ahVar2);
            Log.i("LocationFlow", "STOMP_STATE_CHANGE from=" + ahVar + " to=NOT_CONNECTED timestamp=" + System.currentTimeMillis());
            C3462a.alpha("LocationFlow", 12, "STOMP_STATE_CHANGE from=" + ahVar + " to=NOT_CONNECTED timestamp=" + System.currentTimeMillis(), null);
            try {
                Result.m206constructorimpl(Boolean.valueOf(applicationContext.stopService(new Intent(applicationContext, (Class<?>) CaptainLocationMonitoringService.class))));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            try {
                N9.m mVar = (N9.m) ((w9.p) ((InterfaceC1599e) EntryPointAccessors.fromApplication(applicationContext, InterfaceC1599e.class))).papa.get();
                mVar.getClass();
                Log.d("UnleashContext", "clearContext → user logged out");
                mVar.alpha.bravo();
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th3));
            }
            L9.d.golf(applicationContext);
            Intent intent = new Intent("com.app.base.ACTION_SESSION_INVALIDATED");
            if (str != null) {
                intent.putExtra("session_invalidated_reason", str);
            }
            W1.b.alpha(applicationContext).charlie(intent);
            C3462a.alpha("SessionTerminator", 12, "invalidate() completed | broadcast sent", null);
        } catch (Exception e) {
            C3462a.alpha("SessionTerminator", 12, "invalidate() error: " + e.getMessage(), null);
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                L9.d.golf(applicationContext);
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th4));
            }
            try {
                W1.b alpha = W1.b.alpha(applicationContext);
                Intent intent2 = new Intent("com.app.base.ACTION_SESSION_INVALIDATED");
                if (str != null) {
                    intent2.putExtra("session_invalidated_reason", str);
                }
                Result.m206constructorimpl(Boolean.valueOf(alpha.charlie(intent2)));
            } catch (Throwable th5) {
                Result.Companion companion7 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th5));
            }
        }
    }
}
