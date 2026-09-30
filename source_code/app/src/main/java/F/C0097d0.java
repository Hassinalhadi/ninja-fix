package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0097d0 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0097d0(T.s sVar, float f5, long j5, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.purple = sVar;
        this.red = f5;
        this.silver = j5;
        this.teal = i4;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.teal | 1);
                T.s sVar = this.purple;
                K1.delta(sVar, this.red, this.silver, (InterfaceC0581m) obj, cyan, this.white);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.teal | 1);
                T.s sVar2 = this.purple;
                K1.echo(sVar2, this.red, this.silver, (InterfaceC0581m) obj, cyan2, this.white);
                return Unit.INSTANCE;
        }
    }
}
