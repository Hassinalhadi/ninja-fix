package F2;

import A2.z;
import C1.t;
import V5.x;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.internal.identity.zzem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p6.q;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes3.dex */
public final class n implements T5.m {
    public List alpha;

    public n(H2.l trackers) {
        h hVar;
        Intrinsics.echo(trackers, "trackers");
        G2.d dVar = new G2.d(trackers.bravo, 0);
        G2.d dVar2 = new G2.d(trackers.charlie);
        G2.d dVar3 = new G2.d(trackers.echo, 4);
        H2.f fVar = trackers.delta;
        G2.d dVar4 = new G2.d(fVar, 2);
        G2.d dVar5 = new G2.d(fVar, 3);
        G2.g gVar = new G2.g(fVar);
        G2.f fVar2 = new G2.f(fVar);
        if (Build.VERSION.SDK_INT >= 28) {
            String str = p.alpha;
            Context context = trackers.alpha;
            Intrinsics.echo(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            hVar = new h((ConnectivityManager) systemService);
        } else {
            hVar = null;
        }
        List controllers = CollectionsKt.peach(dVar, dVar2, dVar3, dVar4, dVar5, gVar, fVar2, hVar);
        Intrinsics.echo(controllers, "controllers");
        this.alpha = controllers;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        List list = this.alpha;
        x.india(list, "geofence can't be null.");
        x.alpha("Geofences must contains at least one id.", !list.isEmpty());
        ((q) obj).beige(new zzem(list, null, ""), (G6.h) obj2);
    }

    public boolean alpha(J2.p pVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.alpha) {
            if (((G2.e) obj).alpha(pVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            z.echo().alpha(p.alpha, "Work " + pVar.alpha + " constrained by " + CollectionsKt.maroon(arrayList, null, null, null, l.alpha, 31));
        }
        return arrayList.isEmpty();
    }

    public InterfaceC3439i bravo(J2.p spec) {
        int collectionSizeOrDefault;
        Intrinsics.echo(spec, "spec");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.alpha) {
            if (((G2.e) obj).charlie(spec)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G2.e) it.next()).bravo(spec.juliet));
        }
        return AbstractC3428A.lima(new t(1, (InterfaceC3439i[]) CollectionsKt.z(arrayList2).toArray(new InterfaceC3439i[0])));
    }
}
