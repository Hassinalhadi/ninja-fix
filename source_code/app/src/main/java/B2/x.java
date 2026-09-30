package B2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.i implements Xd.p {
    public static final x alpha = new kotlin.jvm.internal.i(6, y.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // Xd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p02 = (Context) obj;
        A2.a p12 = (A2.a) obj2;
        L2.a p22 = (L2.a) obj3;
        WorkDatabase p32 = (WorkDatabase) obj4;
        H2.l p4 = (H2.l) obj5;
        f p5 = (f) obj6;
        Intrinsics.echo(p02, "p0");
        Intrinsics.echo(p12, "p1");
        Intrinsics.echo(p22, "p2");
        Intrinsics.echo(p32, "p3");
        Intrinsics.echo(p4, "p4");
        Intrinsics.echo(p5, "p5");
        String str = k.alpha;
        E2.c cVar = new E2.c(p02, p32, p12);
        K2.g.alpha(p02, SystemJobService.class, true);
        A2.z.echo().alpha(k.alpha, "Created SystemJobScheduler and enabled SystemJobService");
        return CollectionsKt.listOf(cVar, new C2.c(p02, p12, p4, p5, new J2.e(p5, p22), p22));
    }
}
