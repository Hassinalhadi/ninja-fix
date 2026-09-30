package com.google.mlkit.vision.barcode.internal;

import I7.a;
import I7.b;
import I7.c;
import I7.e;
import I7.j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import java.util.List;
import s6.ad;
import s6.af;
import s6.aj;
import t6.ai;

/* loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a bravo = b.bravo(zzi.class);
        bravo.alpha(j.charlie(i.class));
        bravo.foxtrot = new e() { // from class: com.google.mlkit.vision.barcode.internal.zzc
            @Override // I7.e
            public final Object create(c cVar) {
                return new zzi((i) cVar.charlie(i.class));
            }
        };
        b bravo2 = bravo.bravo();
        a bravo3 = b.bravo(zzg.class);
        bravo3.alpha(j.charlie(zzi.class));
        bravo3.alpha(j.charlie(d.class));
        bravo3.alpha(j.charlie(i.class));
        bravo3.foxtrot = new e() { // from class: com.google.mlkit.vision.barcode.internal.zzd
            @Override // I7.e
            public final Object create(c cVar) {
                return new zzg((zzi) cVar.charlie(zzi.class), (d) cVar.charlie(d.class), (i) cVar.charlie(i.class));
            }
        };
        b bravo4 = bravo3.bravo();
        ad adVar = af.purple;
        Object[] objArr = {bravo2, bravo4};
        ai.alpha(2, objArr);
        return new aj(2, objArr);
    }
}
