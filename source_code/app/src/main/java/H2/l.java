package H2;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    public final Context alpha;
    public final f bravo;
    public final a charlie;
    public final f delta;
    public final f echo;

    public l(Context context, L2.c cVar) {
        f jVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "context.applicationContext");
        a aVar = new a(applicationContext, cVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.delta(applicationContext2, "context.applicationContext");
        a aVar2 = new a(applicationContext2, cVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.delta(applicationContext3, "context.applicationContext");
        String str = i.alpha;
        if (Build.VERSION.SDK_INT >= 24) {
            jVar = new h(applicationContext3, cVar);
        } else {
            jVar = new j(applicationContext3, cVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        Intrinsics.delta(applicationContext4, "context.applicationContext");
        a aVar3 = new a(applicationContext4, cVar, 2);
        this.alpha = context;
        this.bravo = aVar;
        this.charlie = aVar2;
        this.delta = jVar;
        this.echo = aVar3;
    }
}
