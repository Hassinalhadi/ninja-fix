package bz;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import bx.AbstractC0764b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;
import u3.InterfaceC3142e;

/* renamed from: bz.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0796v implements InterfaceC0783h {
    public final long alpha;
    public final Object bravo;
    public final Object charlie;
    public final Object delta;
    public Object echo;
    public Object foxtrot;
    public Object golf;
    public Object hotel;

    public C0796v(Context context, InterfaceC3142e interfaceC3142e) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.bravo = context;
        this.charlie = interfaceC3142e;
        this.delta = handler;
        this.alpha = 10000L;
    }

    @Override // bz.InterfaceC0783h
    public boolean alpha() {
        return false;
    }

    @Override // bz.InterfaceC0783h
    public long bravo() {
        return this.alpha;
    }

    @Override // bz.InterfaceC0783h
    public g0 charlie() {
        return (g0) this.charlie;
    }

    @Override // bz.InterfaceC0783h
    public r delta(long j5) {
        if (!ao.ad.charlie(this, j5)) {
            return ((com.google.firebase.messaging.o) this.bravo).mike(j5, (r) this.foxtrot, (r) this.golf);
        }
        return (r) this.hotel;
    }

    @Override // bz.InterfaceC0783h
    public /* synthetic */ boolean echo(long j5) {
        return ao.ad.charlie(this, j5);
    }

    @Override // bz.InterfaceC0783h
    public Object foxtrot(long j5) {
        float f5;
        if (!ao.ad.charlie(this, j5)) {
            Function1 function1 = ((g0) this.charlie).bravo;
            com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.bravo;
            r rVar = (r) oVar.bravo;
            r rVar2 = (r) this.foxtrot;
            if (rVar == null) {
                oVar.bravo = rVar2.charlie();
            }
            r rVar3 = (r) oVar.bravo;
            String str = "valueVector";
            if (rVar3 != null) {
                int bravo = rVar3.bravo();
                int i4 = 0;
                while (i4 < bravo) {
                    r rVar4 = (r) oVar.bravo;
                    if (rVar4 != null) {
                        float alpha = rVar2.alpha(i4);
                        long j6 = j5 / 1000000;
                        bx.C alpha2 = ((G.a) ((androidx.core.widget.f) oVar.alpha).purple).alpha(((r) this.golf).alpha(i4));
                        String str2 = str;
                        long j7 = alpha2.charlie;
                        if (j7 > 0) {
                            f5 = ((float) j6) / ((float) j7);
                        } else {
                            f5 = 1.0f;
                        }
                        rVar4.echo((Math.signum(alpha2.alpha) * alpha2.bravo * AbstractC0764b.alpha(f5).alpha) + alpha, i4);
                        i4++;
                        str = str2;
                    } else {
                        Intrinsics.lima(str);
                        throw null;
                    }
                }
                String str3 = str;
                r rVar5 = (r) oVar.bravo;
                if (rVar5 != null) {
                    return function1.invoke(rVar5);
                }
                Intrinsics.lima(str3);
                throw null;
            }
            Intrinsics.lima("valueVector");
            throw null;
        }
        return this.echo;
    }

    @Override // bz.InterfaceC0783h
    public Object golf() {
        return this.echo;
    }

    public boolean hotel() {
        LocationManager locationManager = (LocationManager) this.foxtrot;
        if (locationManager == null) {
            return false;
        }
        try {
            if (!locationManager.isProviderEnabled("gps")) {
                if (!locationManager.isProviderEnabled("network")) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void india(p3.w handler) {
        Intrinsics.echo(handler, "handler");
        F6.b bVar = (F6.b) this.golf;
        Handler handler2 = (Handler) this.delta;
        if (bVar != null) {
            handler2.removeCallbacks(bVar);
        }
        LocationManager locationManager = null;
        this.golf = null;
        this.foxtrot = null;
        this.hotel = null;
        this.echo = handler;
        Object systemService = ((Context) this.bravo).getSystemService("location");
        if (systemService instanceof LocationManager) {
            locationManager = (LocationManager) systemService;
        }
        this.foxtrot = locationManager;
        if (locationManager == null) {
            ((InterfaceC3142e) this.charlie).alpha("LocationFlow", "[SystemLocationStateObserver] LocationManager not available");
            return;
        }
        this.hotel = Boolean.valueOf(hotel());
        F6.b bVar2 = new F6.b(28, this);
        this.golf = bVar2;
        Intrinsics.checkNotNull(bVar2);
        handler2.post(bVar2);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.firebase.messaging.o] */
    public C0796v(C0797w c0797w, g0 g0Var, Object obj, r rVar) {
        androidx.core.widget.f fVar = c0797w.alpha;
        ?? obj2 = new Object();
        obj2.alpha = fVar;
        this.bravo = obj2;
        this.charlie = g0Var;
        this.delta = obj;
        r rVar2 = (r) g0Var.alpha.invoke(obj);
        this.foxtrot = rVar2;
        this.golf = AbstractC0779d.echo(rVar);
        if (((r) obj2.delta) == null) {
            obj2.delta = rVar2.charlie();
        }
        r rVar3 = (r) obj2.delta;
        if (rVar3 != null) {
            int bravo = rVar3.bravo();
            int i4 = 0;
            while (i4 < bravo) {
                r rVar4 = (r) obj2.delta;
                if (rVar4 == null) {
                    Intrinsics.lima("targetVector");
                    throw null;
                }
                float alpha = rVar2.alpha(i4);
                float alpha2 = rVar.alpha(i4);
                G.a aVar = (G.a) ((androidx.core.widget.f) obj2.alpha).purple;
                double bravo2 = aVar.bravo(alpha2);
                double d4 = bx.D.alpha;
                float f5 = aVar.alpha * aVar.bravo;
                int i5 = i4;
                rVar4.echo((Math.signum(alpha2) * ((float) (Math.exp((d4 / (d4 - 1.0d)) * bravo2) * f5))) + alpha, i5);
                i4 = i5 + 1;
            }
            r rVar5 = (r) obj2.delta;
            if (rVar5 != null) {
                this.echo = g0Var.bravo.invoke(rVar5);
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.bravo;
                r rVar6 = (r) this.foxtrot;
                if (((r) oVar.charlie) == null) {
                    oVar.charlie = rVar6.charlie();
                }
                r rVar7 = (r) oVar.charlie;
                if (rVar7 != null) {
                    int bravo3 = rVar7.bravo();
                    long j5 = 0;
                    for (int i10 = 0; i10 < bravo3; i10++) {
                        rVar6.getClass();
                        j5 = Math.max(j5, ((long) (Math.exp(((G.a) ((androidx.core.widget.f) oVar.alpha).purple).bravo(rVar.alpha(i10)) / (bx.D.alpha - 1.0d)) * 1000.0d)) * 1000000);
                    }
                    this.alpha = j5;
                    r echo = AbstractC0779d.echo(((com.google.firebase.messaging.o) this.bravo).mike(j5, (r) this.foxtrot, rVar));
                    this.hotel = echo;
                    int bravo4 = echo.bravo();
                    for (int i11 = 0; i11 < bravo4; i11++) {
                        r rVar8 = (r) this.hotel;
                        float alpha3 = rVar8.alpha(i11);
                        ((com.google.firebase.messaging.o) this.bravo).getClass();
                        ((com.google.firebase.messaging.o) this.bravo).getClass();
                        rVar8.echo(J4.charlie(alpha3, -0.0f, 0.0f), i11);
                    }
                    return;
                }
                Intrinsics.lima("velocityVector");
                throw null;
            }
            Intrinsics.lima("targetVector");
            throw null;
        }
        Intrinsics.lima("targetVector");
        throw null;
    }
}
