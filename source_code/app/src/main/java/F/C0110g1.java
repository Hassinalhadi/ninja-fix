package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0110g1 extends Lambda implements Xd.l {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0110g1(long j5, Function0 function0, boolean z2, int i4) {
        super(2);
        this.alpha = j5;
        this.purple = function0;
        this.red = z2;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.silver | 1);
        Function0 function0 = this.purple;
        boolean z2 = this.red;
        AbstractC0122j1.charlie(this.alpha, function0, z2, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
