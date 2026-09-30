package t6;

import Yb.C0331t0;
import android.content.Context;
import android.content.Intent;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p.C2263a;
import s0.AbstractC2557q;
import s0.InterfaceC2554n;
import t.C2877c;
import z3.C3462a;

/* renamed from: t6.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3016k2 {
    public static final q.c alpha(InterfaceC2554n interfaceC2554n) {
        q.f fVar;
        C2263a c2263a = new C2263a();
        AbstractC2557q.papa(interfaceC2554n, C2877c.alpha, new n.Y(new n.Y(16, c2263a), new C0331t0(1, c2263a, C2263a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 19)));
        bv.ah ahVar = new bv.ah();
        bv.ah ahVar2 = c2263a.alpha;
        Object[] objArr = ahVar2.alpha;
        int i4 = ahVar2.bravo;
        Object obj = null;
        boolean z2 = true;
        int i5 = 0;
        q.b bVar = null;
        while (true) {
            fVar = q.f.bravo;
            if (i5 >= i4) {
                break;
            }
            q.b bVar2 = (q.b) objArr[i5];
            if (!z2 || bVar2 != fVar) {
                if (bVar2 != fVar || bVar != fVar) {
                    if (bVar2 != fVar) {
                        bv.ah ahVar3 = c2263a.bravo;
                        Object[] objArr2 = ahVar3.alpha;
                        int i10 = ahVar3.bravo;
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (((Boolean) ((Function1) objArr2[i11]).invoke(bVar2)).booleanValue()) {
                            }
                        }
                    }
                    ahVar.golf(bVar2);
                    z2 = false;
                    bVar = bVar2;
                }
                z2 = false;
                break;
            }
            i5++;
        }
        if (!ahVar.delta()) {
            obj = ahVar.alpha[ahVar.bravo - 1];
        }
        if (((q.b) obj) == fVar) {
            ahVar.kilo(ahVar.bravo - 1);
        }
        J.b bVar3 = ahVar.charlie;
        if (bVar3 == null) {
            bVar3 = new J.b(ahVar);
            ahVar.charlie = bVar3;
        }
        return new q.c(bVar3);
    }

    public static boolean bravo(Context context) {
        Intrinsics.echo(context, "context");
        return context.getSharedPreferences("LocationServicePrefs", 0).getBoolean("enabled", true);
    }

    public static void charlie(Context context) {
        if (CaptainLocationMonitoringService.f12066D && CaptainLocationMonitoringService.f12069G.get() && CaptainLocationMonitoringService.f12067E.getValue() != p3.ah.purple) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - CaptainLocationMonitoringService.C >= 5000) {
                CaptainLocationMonitoringService.C = currentTimeMillis;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m206constructorimpl(context.startService(new Intent(context, (Class<?>) CaptainLocationMonitoringService.class).setAction("delivery.samurai.android.action.STOMP_RECONNECT")));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
    }

    public static void delta(Context context, boolean z2) {
        Intrinsics.echo(context, "context");
        context.getSharedPreferences("LocationServicePrefs", 0).edit().putBoolean("enabled", z2).apply();
        C3462a.alpha("LocationFlow", 12, "setServiceEnabled(" + z2 + ")", null);
        if (z2) {
            AbstractC3031n2.bravo(context);
        } else {
            AbstractC3036o2.charlie(context);
            AbstractC3031n2.alpha(context);
        }
        try {
            K7.b.alpha().bravo("setServiceEnabled: " + z2);
        } catch (Exception unused) {
        }
    }
}
