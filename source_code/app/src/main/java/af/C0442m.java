package af;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import t6.AbstractC3022l3;

/* renamed from: af.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0442m extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Xd.l purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442m(boolean z2, Xd.l lVar, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = lVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.red | 1);
        AbstractC3022l3.alpha(this.alpha, this.purple, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
