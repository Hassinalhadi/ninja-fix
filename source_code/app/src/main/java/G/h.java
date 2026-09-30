package G;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class h extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1346c;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ v silver;
    public final /* synthetic */ T.k teal;
    public final /* synthetic */ Xd.m white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z2, Function0 function0, T.s sVar, v vVar, T.k kVar, Xd.m mVar, P.d dVar, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = function0;
        this.red = sVar;
        this.silver = vVar;
        this.teal = kVar;
        this.white = mVar;
        this.yellow = dVar;
        this.f1346c = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1346c | 1);
        P.d dVar = this.yellow;
        v vVar = this.silver;
        T.k kVar = this.teal;
        l.alpha(this.alpha, this.purple, this.red, vVar, kVar, this.white, dVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
