package s6;

import a0.C0366t;
import g0.C1725e;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Y {
    public static C1726f alpha;

    public static void alpha(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(ao.ad.zulu(i5, "at index "));
            }
        }
    }

    public static final C1726f bravo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Inventory2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(20.0f, 2.0f);
        bVar.foxtrot(4.0f);
        bVar.delta(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        bVar.november(3.01f);
        bVar.delta(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
        bVar.mike(20.0f);
        bVar.echo(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
        bVar.golf(14.0f);
        bVar.echo(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bVar.mike(8.7f);
        bVar.echo(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
        bVar.mike(4.0f);
        bVar.delta(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
        bVar.charlie();
        bVar.juliet(15.0f, 14.0f);
        bVar.foxtrot(9.0f);
        bVar.november(-2.0f);
        bVar.golf(6.0f);
        bVar.mike(14.0f);
        bVar.charlie();
        bVar.juliet(20.0f, 7.0f);
        bVar.foxtrot(4.0f);
        bVar.mike(4.0f);
        bVar.golf(16.0f);
        bVar.mike(7.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }
}
