package androidx.navigation.internal;

import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ q alpha;
    public final /* synthetic */ q purple;
    public final /* synthetic */ g red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ l teal;

    public /* synthetic */ e(q qVar, q qVar2, g gVar, boolean z2, l lVar) {
        this.alpha = qVar;
        this.purple = qVar2;
        this.red = gVar;
        this.silver = z2;
        this.teal = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Y1.l entry = (Y1.l) obj;
        Intrinsics.echo(entry, "entry");
        this.alpha.alpha = true;
        this.purple.alpha = true;
        this.red.november(entry, this.silver, this.teal);
        return Unit.INSTANCE;
    }
}
