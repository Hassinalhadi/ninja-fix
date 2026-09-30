package t6;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bd.ScheduledExecutorServiceC0750c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: t6.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3071v3 {
    public static final long alpha(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        Resources resources = (Resources) c0585q.kilo(AndroidCompositionLocals_androidKt.charlie);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = i1.k.alpha;
        return a0.ao.charlie(resources.getColor(i4, theme));
    }

    public static V0.k bravo(List list, bd.h hVar, ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(be.h.delta(((androidx.camera.core.impl.ah) it.next()).charlie()));
        }
        return AbstractC3003i.alpha(new A2.p(AbstractC3003i.alpha(new F8.h(new be.k(new ArrayList(arrayList), false, tg.k.bravo()), scheduledExecutorServiceC0750c, 5000L)), hVar, list, 10));
    }
}
