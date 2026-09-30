package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0135m2 extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ C0131l2 teal;
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135m2(boolean z2, Function1 function1, T.s sVar, boolean z10, C0131l2 c0131l2, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = function1;
        this.red = sVar;
        this.silver = z10;
        this.teal = c0131l2;
        this.white = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.white | 1);
        T.s sVar = this.red;
        boolean z2 = this.silver;
        androidx.compose.material3.a.alpha(this.alpha, this.purple, sVar, z2, this.teal, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
