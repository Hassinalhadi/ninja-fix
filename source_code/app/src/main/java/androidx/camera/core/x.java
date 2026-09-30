package androidx.camera.core;

import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.b0;
import bb.C0746d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import t6.AbstractC3003i;
import t6.j4;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements androidx.camera.core.impl.N {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ x(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // androidx.camera.core.impl.N
    public final void alpha(androidx.camera.core.impl.P p4) {
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                ad adVar = (ad) obj;
                if (adVar.bravo() != null) {
                    j4.alpha();
                    androidx.camera.core.impl.M m4 = adVar.tango;
                    if (m4 != null) {
                        m4.bravo();
                        adVar.tango = null;
                    }
                    J j5 = adVar.sierra;
                    if (j5 != null) {
                        j5.alpha();
                        adVar.sierra = null;
                    }
                    adVar.oscar.delta();
                    adVar.delta();
                    androidx.camera.core.impl.al alVar = (androidx.camera.core.impl.al) adVar.foxtrot;
                    C0509g c0509g = adVar.golf;
                    c0509g.getClass();
                    androidx.camera.core.impl.L azure = adVar.azure(alVar, c0509g);
                    adVar.romeo = azure;
                    Object[] objArr = {azure.charlie()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    adVar.amber(Collections.unmodifiableList(arrayList));
                    adVar.november();
                    return;
                }
                return;
            case 1:
                ao aoVar = (ao) obj;
                if (aoVar.bravo() != null) {
                    C0746d c0746d = aoVar.uniform;
                    c0746d.getClass();
                    j4.alpha();
                    c0746d.silver = true;
                    aoVar.azure(true);
                    String delta = aoVar.delta();
                    androidx.camera.core.impl.am amVar = (androidx.camera.core.impl.am) aoVar.foxtrot;
                    C0509g c0509g2 = aoVar.golf;
                    c0509g2.getClass();
                    androidx.camera.core.impl.L beige = aoVar.beige(delta, amVar, c0509g2);
                    aoVar.sierra = beige;
                    Object[] objArr2 = {beige.charlie()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    aoVar.amber(Collections.unmodifiableList(arrayList2));
                    aoVar.november();
                    C0746d c0746d2 = aoVar.uniform;
                    c0746d2.getClass();
                    j4.alpha();
                    c0746d2.silver = false;
                    c0746d2.bravo();
                    return;
                }
                return;
            case 2:
                az azVar = (az) obj;
                if (azVar.bravo() != null) {
                    azVar.black((androidx.camera.core.impl.C) azVar.foxtrot, azVar.golf);
                    azVar.november();
                    return;
                }
                return;
            case 3:
                Iterator it = ((androidx.camera.core.impl.O) obj).lima.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.N) it.next()).alpha(p4);
                }
                return;
            default:
                av.ao aoVar2 = (av.ao) obj;
                aoVar2.purple = aoVar2.papa();
                av.m mVar = (av.m) aoVar2.teal;
                if (mVar != null) {
                    av.s sVar = mVar.purple;
                    sVar.getClass();
                    try {
                        if (((Boolean) AbstractC3003i.alpha(new av.m(sVar, 2)).purple.get()).booleanValue()) {
                            av.ao aoVar3 = sVar.f3274p;
                            sVar.red.execute(new av.k(sVar, av.s.xray(aoVar3), (androidx.camera.core.impl.P) aoVar3.purple, (av.an) aoVar3.red, null, Collections.singletonList(b0.white), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
                return;
        }
    }
}
