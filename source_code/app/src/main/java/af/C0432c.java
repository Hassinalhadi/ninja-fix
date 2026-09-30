package af;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t6.AbstractC3017k3;

/* renamed from: af.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0432c extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Function0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0432c(boolean z2, Function0 function0, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(1);
        AbstractC3017k3.alpha(this.alpha, this.purple, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
