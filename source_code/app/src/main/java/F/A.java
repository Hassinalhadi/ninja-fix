package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class A extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f994c;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ kotlin.e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(boolean z2, kotlin.e eVar, T.s sVar, boolean z10, Object obj, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.purple = z2;
        this.yellow = eVar;
        this.red = sVar;
        this.silver = z10;
        this.f994c = obj;
        this.teal = i4;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.teal | 1);
                ay ayVar = (ay) this.f994c;
                boolean z2 = this.silver;
                F.alpha(this.purple, (Function1) this.yellow, this.red, z2, ayVar, (InterfaceC0581m) obj, cyan, this.white);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.teal | 1);
                H1 h1 = (H1) this.f994c;
                boolean z10 = this.silver;
                I1.alpha(this.purple, (Function0) this.yellow, this.red, z10, h1, (InterfaceC0581m) obj, cyan2, this.white);
                return Unit.INSTANCE;
        }
    }
}
