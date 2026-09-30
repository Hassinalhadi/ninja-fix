package B7;

import B9.ab;
import I7.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public final class h implements I7.e {
    public static final h purple = new h(0);
    public static final h red = new h(1);
    public static final h silver = new h(2);
    public static final h teal = new h(3);
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    @Override // I7.e
    public final Object create(I7.c cVar) {
        switch (this.alpha) {
            case 0:
                Object oscar = ((ab) cVar).oscar(new p(H7.a.class, Executor.class));
                Intrinsics.delta(oscar, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ad.papa((Executor) oscar);
            case 1:
                Object oscar2 = ((ab) cVar).oscar(new p(H7.c.class, Executor.class));
                Intrinsics.delta(oscar2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ad.papa((Executor) oscar2);
            case 2:
                Object oscar3 = ((ab) cVar).oscar(new p(H7.b.class, Executor.class));
                Intrinsics.delta(oscar3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ad.papa((Executor) oscar3);
            default:
                Object oscar4 = ((ab) cVar).oscar(new p(H7.d.class, Executor.class));
                Intrinsics.delta(oscar4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ad.papa((Executor) oscar4);
        }
    }
}
