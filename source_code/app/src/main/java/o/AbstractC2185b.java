package o;

import D0.am;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bv.ah;
import java.util.List;
import kd.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p.C2263a;
import q.d;
import q.f;
import q.g;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2185b {
    public static final l alpha = new l(25);
    public static final C2184a bravo = new Object();

    public static final void alpha(C2263a c2263a, Context context, final boolean z2, final String str, final long j5) {
        C2263a c2263a2 = c2263a;
        if (!am.charlie(j5) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            final Context context2 = context;
            List list = (List) alpha.invoke(context2);
            if (!list.isEmpty()) {
                f fVar = f.bravo;
                c2263a2.alpha.golf(fVar);
                int size = list.size();
                int i4 = 0;
                while (true) {
                    ah ahVar = c2263a2.alpha;
                    if (i4 < size) {
                        final ResolveInfo resolveInfo = (ResolveInfo) list.get(i4);
                        ahVar.golf(new d(new q.a(i4), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: o.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                C2184a c2184a = AbstractC2185b.bravo;
                                Boolean valueOf = Boolean.valueOf(z2);
                                am amVar = new am(j5);
                                c2184a.golf(context2, resolveInfo, valueOf, str, amVar);
                                ((g) obj).close();
                                return Unit.INSTANCE;
                            }
                        }));
                        i4++;
                        c2263a2 = c2263a;
                        context2 = context;
                    } else {
                        ahVar.golf(fVar);
                        return;
                    }
                }
            }
        }
    }
}
