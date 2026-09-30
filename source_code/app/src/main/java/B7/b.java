package B7;

import Y1.r;
import a0.C0366t;
import a0.au;
import androidx.fragment.app.ai;
import g0.C1725e;
import g0.C1726f;
import g0.C1730j;
import g0.ah;
import g0.m;
import g0.n;
import g0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {
    public static C1726f alpha;

    public static final r alpha(ai aiVar) {
        Intrinsics.echo(aiVar, "<this>");
        return J2.f.alpha(aiVar);
    }

    public static final C1726f bravo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(8.59f, 16.59f));
        arrayList.add(new m(13.17f, 12.0f));
        arrayList.add(new m(8.59f, 7.41f));
        arrayList.add(new m(10.0f, 6.0f));
        arrayList.add(new u(6.0f, 6.0f));
        arrayList.add(new u(-6.0f, 6.0f));
        arrayList.add(new u(-1.41f, -1.41f));
        arrayList.add(C1730j.charlie);
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", arrayList);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }
}
