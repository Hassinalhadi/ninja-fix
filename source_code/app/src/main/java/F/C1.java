package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class C1 extends Lambda implements Xd.l {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ float yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Function0 function0, T.s sVar, long j5, float f5, long j6, int i4, float f10, int i5) {
        super(2);
        this.alpha = function0;
        this.purple = sVar;
        this.red = j5;
        this.silver = f5;
        this.teal = j6;
        this.white = i4;
        this.yellow = f10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(28081);
        float f5 = this.silver;
        long j5 = this.teal;
        G1.alpha(this.alpha, this.purple, this.red, f5, j5, this.white, this.yellow, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
