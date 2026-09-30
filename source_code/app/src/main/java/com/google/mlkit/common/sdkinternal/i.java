package com.google.mlkit.common.sdkinternal;

import V5.x;
import android.content.Context;
import bd.ExecutorC0753f;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i {
    public static final Object bravo = new Object();
    public static i charlie;
    public I7.g alpha;

    public static i charlie() {
        boolean z2;
        i iVar;
        synchronized (bravo) {
            if (charlie != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            x.juliet("MlKitContext has not been initialized", z2);
            iVar = charlie;
            x.hotel(iVar);
        }
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.mlkit.common.sdkinternal.i] */
    public static i delta(Context context, ExecutorC0753f executorC0753f) {
        boolean z2;
        i iVar;
        synchronized (bravo) {
            if (charlie == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            x.juliet("MlKitContext is already initialized", z2);
            ?? obj = new Object();
            charlie = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList hotel = new J2.l(context, new D8.c(17, MlKitComponentDiscoveryService.class)).hotel();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            A8.a aVar = I7.f.bravo;
            arrayList.addAll(hotel);
            arrayList2.add(I7.b.charlie(context, Context.class, new Class[0]));
            arrayList2.add(I7.b.charlie(obj, i.class, new Class[0]));
            I7.g gVar = new I7.g(executorC0753f, arrayList, arrayList2, aVar);
            obj.alpha = gVar;
            gVar.bravo(true);
            iVar = charlie;
        }
        return iVar;
    }

    public final Object alpha(Class cls) {
        boolean z2;
        if (charlie == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.juliet("MlKitContext has been deleted", z2);
        x.hotel(this.alpha);
        return this.alpha.charlie(cls);
    }

    public final Context bravo() {
        return (Context) alpha(Context.class);
    }
}
