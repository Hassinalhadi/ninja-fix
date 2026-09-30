package q0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: q0.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2374J extends Lambda implements Xd.l {
    public final /* synthetic */ C2379O alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ Xd.l red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374J(C2379O c2379o, T.s sVar, Xd.l lVar, int i4) {
        super(2);
        this.alpha = c2379o;
        this.purple = sVar;
        this.red = lVar;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.silver | 1);
        Xd.l lVar = this.red;
        AbstractC2375K.bravo(this.alpha, this.purple, lVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
