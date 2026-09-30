package s6;

import a0.C0366t;
import g0.C1725e;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2665h0 {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Phone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(6.62f, 10.79f);
        bVar.echo(1.44f, 2.83f, 3.76f, 5.14f, 6.59f, 6.59f);
        bVar.india(2.2f, -2.2f);
        bVar.echo(0.27f, -0.27f, 0.67f, -0.36f, 1.02f, -0.24f);
        bVar.echo(1.12f, 0.37f, 2.33f, 0.57f, 3.57f, 0.57f);
        bVar.echo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bVar.mike(20.0f);
        bVar.echo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        bVar.echo(-9.39f, 0.0f, -17.0f, -7.61f, -17.0f, -17.0f);
        bVar.echo(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        bVar.golf(3.5f);
        bVar.echo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bVar.echo(0.0f, 1.25f, 0.2f, 2.45f, 0.57f, 3.57f);
        bVar.echo(0.11f, 0.35f, 0.03f, 0.74f, -0.25f, 1.02f);
        bVar.india(-2.2f, 2.2f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public abstract Object bravo();
}
