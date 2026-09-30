package q0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: q0.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2373I extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ Xd.l purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2373I(T.s sVar, Xd.l lVar, int i4, int i5) {
        super(2);
        this.alpha = sVar;
        this.purple = lVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.red | 1);
        Xd.l lVar = this.purple;
        int i4 = this.silver;
        AbstractC2375K.alpha(this.alpha, lVar, (InterfaceC0581m) obj, cyan, i4);
        return Unit.INSTANCE;
    }
}
