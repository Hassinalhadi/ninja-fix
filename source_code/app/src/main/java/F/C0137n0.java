package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f0.AbstractC1680b;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0137n0 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0137n0(Object obj, String str, T.s sVar, long j5, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.yellow = obj;
        this.purple = str;
        this.red = sVar;
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
                String str = this.purple;
                AbstractC0141o0.bravo((C1726f) this.yellow, str, this.red, this.silver, (InterfaceC0581m) obj, cyan, this.white);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.teal | 1);
                String str2 = this.purple;
                AbstractC0141o0.alpha((AbstractC1680b) this.yellow, str2, this.red, this.silver, (InterfaceC0581m) obj, cyan2, this.white);
                return Unit.INSTANCE;
        }
    }
}
