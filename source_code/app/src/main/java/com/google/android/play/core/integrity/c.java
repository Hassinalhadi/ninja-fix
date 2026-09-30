package com.google.android.play.core.integrity;

import B9.C0058p;
import T.r;
import V5.x;
import android.app.PendingIntent;
import android.os.Parcel;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzb;
import com.google.android.material.internal.s;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dd.C1614e;
import io.ktor.utils.io.ak;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import p6.ab;
import p6.q;
import p6.y;
import pd.AbstractC2304b;
import pd.C2307e;
import pd.C2308f;
import qd.AbstractC2463a;
import qe.C2474j;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.InterfaceC2559t;
import s0.ag;
import s0.al;
import s6.AbstractC2763s0;
import s6.AbstractC2790v0;
import vf.H;
import vf.J;
import vg.aq;

/* loaded from: classes2.dex */
public class c implements p7.l, kd.g, T5.m, vg.g, ActivityRetainedComponentBuilder {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public Object red;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void charlie(al alVar) {
        if (alVar.f13281H > 0) {
            if (alVar.f13306y.delta == ag.teal && !alVar.quebec() && !alVar.romeo() && !alVar.f13282I && alVar.emerald()) {
                C0058p c0058p = alVar.f13305x;
                if ((((r) c0058p.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_QR_CODE) != 0) {
                    for (r rVar = (r) c0058p.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                        if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_QR_CODE) != 0) {
                            AbstractC2556p abstractC2556p = rVar;
                            ?? r5 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof InterfaceC2559t) {
                                    InterfaceC2559t interfaceC2559t = (InterfaceC2559t) abstractC2556p;
                                    interfaceC2559t.hotel(AbstractC2555o.echo(interfaceC2559t, Barcode.FORMAT_QR_CODE));
                                } else if ((abstractC2556p.getKindSet$ui_release() & Barcode.FORMAT_QR_CODE) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    r rVar2 = abstractC2556p.purple;
                                    int i4 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r5 = r5;
                                    while (rVar2 != null) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_QR_CODE) != 0) {
                                            i4++;
                                            r5 = r5;
                                            if (i4 == 1) {
                                                abstractC2556p = rVar2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new J.e(new r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r5.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r5.bravo(rVar2);
                                            }
                                        }
                                        rVar2 = rVar2.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r5 = r5;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r5);
                            }
                        }
                        if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_QR_CODE) == 0) {
                            break;
                        }
                    }
                }
            }
            alVar.f13280G = false;
            J.e zulu = alVar.zulu();
            Object[] objArr = zulu.alpha;
            int i5 = zulu.red;
            for (int i10 = 0; i10 < i5; i10++) {
                charlie((al) objArr[i10]);
            }
        }
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        switch (this.alpha) {
            case 6:
                G6.p pVar = new G6.p(hVar);
                zzb zzbVar = (zzb) this.purple;
                PendingIntent pendingIntent = (PendingIntent) this.red;
                x.india(pendingIntent, "PendingIntent must be specified.");
                T5.n nVar = new T5.n(pVar);
                ab abVar = (ab) ((y) obj).tango();
                Parcel ivory = abVar.ivory();
                p6.e.bravo(ivory, zzbVar);
                p6.e.bravo(ivory, pendingIntent);
                ivory.writeStrongBinder(nVar);
                abVar.lavender(ivory, 70);
                return;
            default:
                q qVar = (q) obj;
                boolean black = qVar.black(com.google.android.gms.location.n.golf);
                GeofencingRequest geofencingRequest = (GeofencingRequest) this.purple;
                PendingIntent pendingIntent2 = (PendingIntent) this.red;
                if (black) {
                    ab abVar2 = (ab) qVar.tango();
                    p6.l lVar = new p6.l(null, hVar);
                    Parcel ivory2 = abVar2.ivory();
                    p6.e.bravo(ivory2, geofencingRequest);
                    p6.e.bravo(ivory2, pendingIntent2);
                    ivory2.writeStrongBinder(lVar);
                    abVar2.lavender(ivory2, 97);
                    return;
                }
                ab abVar3 = (ab) qVar.tango();
                p6.j jVar = new p6.j(1, hVar);
                Parcel ivory3 = abVar3.ivory();
                p6.e.bravo(ivory3, geofencingRequest);
                p6.e.bravo(ivory3, pendingIntent2);
                ivory3.writeStrongBinder(jVar);
                abVar3.lavender(ivory3, 57);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object alpha(AbstractC2304b abstractC2304b, Pd.c cVar) {
        C2307e c2307e;
        int i4;
        if (cVar instanceof C2307e) {
            c2307e = (C2307e) cVar;
            int i5 = c2307e.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2307e.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2307e.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2307e.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Nd.f fVar = abstractC2304b.charlie().get(H.alpha);
                    Intrinsics.checkNotNull(fVar);
                    J j5 = (J) ((vf.r) fVar);
                    j5.yellow();
                    try {
                        ak.bravo(abstractC2304b.delta());
                    } catch (Throwable unused) {
                    }
                    c2307e.red = 1;
                    if (j5.gray(c2307e) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c2307e = new C2307e(this, cVar);
        Object obj2 = c2307e.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2307e.red;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // p7.m
    public /* bridge */ /* synthetic */ Object bravo() {
        return new b((i) ((p7.k) this.purple).bravo(), (n) ((p7.k) this.red).bravo());
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public ActivityRetainedComponent build() {
        AbstractC2763s0.bravo(SavedStateHandleHolder.class, (SavedStateHandleHolder) this.red);
        return new w9.l((w9.p) this.purple);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object delta(Nd.c cVar) {
        C2308f c2308f;
        Object obj;
        Object obj2;
        int i4;
        C1614e c1614e;
        AbstractC2304b echo;
        try {
            if (cVar instanceof C2308f) {
                c2308f = (C2308f) cVar;
                int i5 = c2308f.silver;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c2308f.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                    obj = c2308f.purple;
                    obj2 = Od.a.alpha;
                    i4 = c2308f.silver;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    AbstractC2304b abstractC2304b = (AbstractC2304b) c2308f.alpha;
                                    ResultKt.alpha(obj);
                                    return abstractC2304b;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1614e = (C1614e) c2308f.alpha;
                            ResultKt.alpha(obj);
                            AbstractC2304b echo2 = ((C1614e) obj).echo();
                            echo = c1614e.echo();
                            c2308f.alpha = echo2;
                            c2308f.silver = 3;
                            if (alpha(echo, c2308f) == obj2) {
                                return obj2;
                            }
                            return echo2;
                        }
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        C2226c c2226c = new C2226c();
                        c2226c.bravo((C2226c) this.purple);
                        cd.c cVar2 = (cd.c) this.red;
                        c2308f.silver = 1;
                        obj = cVar2.echo(c2226c, c2308f);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    c1614e = (C1614e) obj;
                    c2308f.alpha = c1614e;
                    c2308f.silver = 2;
                    obj = AbstractC2790v0.bravo(c1614e, c2308f);
                    if (obj == obj2) {
                        return obj2;
                    }
                    AbstractC2304b echo22 = ((C1614e) obj).echo();
                    echo = c1614e.echo();
                    c2308f.alpha = echo22;
                    c2308f.silver = 3;
                    if (alpha(echo, c2308f) == obj2) {
                    }
                }
            }
            if (i4 == 0) {
            }
            c1614e = (C1614e) obj;
            c2308f.alpha = c1614e;
            c2308f.silver = 2;
            obj = AbstractC2790v0.bravo(c1614e, c2308f);
            if (obj == obj2) {
            }
            AbstractC2304b echo222 = ((C1614e) obj).echo();
            echo = c1614e.echo();
            c2308f.alpha = echo222;
            c2308f.silver = 3;
            if (alpha(echo, c2308f) == obj2) {
            }
        } catch (CancellationException e) {
            throw AbstractC2463a.alpha(e);
        }
        c2308f = new C2308f(this, cVar);
        obj = c2308f.purple;
        obj2 = Od.a.alpha;
        i4 = c2308f.silver;
    }

    @Override // kd.g
    public void log(String message) {
        Intrinsics.echo(message, "message");
        s sVar = (s) this.purple;
        Method method = (Method) this.red;
        if (method == null) {
            sVar.log(message);
            return;
        }
        try {
            method.invoke(null, "Ktor Client", message);
        } catch (Throwable unused) {
            sVar.log(message);
        }
    }

    @Override // vg.g
    public void onFailure(vg.d dVar, Throwable th) {
        ((vg.n) this.red).alpha.execute(new A2.s(this, (vg.g) this.purple, th, 29));
    }

    @Override // vg.g
    public void onResponse(vg.d dVar, aq aqVar) {
        ((vg.n) this.red).alpha.execute(new A2.s(this, (vg.g) this.purple, aqVar, 28));
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
        savedStateHandleHolder.getClass();
        this.red = savedStateHandleHolder;
        return this;
    }

    public String toString() {
        switch (this.alpha) {
            case 8:
                return "HttpStatement[" + ((C2226c) this.purple).alpha + ']';
            default:
                return super.toString();
        }
    }

    public c(Object obj) {
        this.alpha = 1;
        this.purple = obj;
        this.red = Thread.currentThread();
    }

    public c() {
        this.alpha = 9;
        this.purple = new J.e(new al[16]);
    }

    public c(C2474j c2474j) {
        this.alpha = 11;
        this.purple = null;
        this.red = null;
    }

    public c(C2226c c2226c, cd.c client) {
        this.alpha = 8;
        Intrinsics.echo(client, "client");
        this.purple = c2226c;
        this.red = client;
    }

    public c(Class cls, s sVar) {
        Method method;
        this.alpha = 3;
        this.purple = sVar;
        try {
            method = cls.getDeclaredMethod("i", String.class, String.class);
        } catch (Throwable unused) {
            method = null;
        }
        this.red = method;
    }

    public c(vg.n nVar, vg.g gVar) {
        this.alpha = 12;
        this.red = nVar;
        this.purple = gVar;
    }

    public c(List list, List directExpectedByDependencies) {
        this.alpha = 10;
        Intrinsics.echo(directExpectedByDependencies, "directExpectedByDependencies");
        this.purple = list;
        this.red = directExpectedByDependencies;
    }

    public c(w9.p pVar) {
        this.alpha = 13;
        this.purple = pVar;
    }
}
