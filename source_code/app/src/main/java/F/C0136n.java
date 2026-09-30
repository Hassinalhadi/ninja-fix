package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0136n extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1150d;
    public final /* synthetic */ float e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.d f1151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1153h;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ b.g0 teal;
    public final /* synthetic */ U0.ad white;
    public final /* synthetic */ a0.as yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136n(boolean z2, Function0 function0, T.s sVar, long j5, b.g0 g0Var, U0.ad adVar, a0.as asVar, long j6, float f5, float f10, P.d dVar, int i4, int i5) {
        super(2);
        this.alpha = z2;
        this.purple = function0;
        this.red = sVar;
        this.silver = j5;
        this.teal = g0Var;
        this.white = adVar;
        this.yellow = asVar;
        this.f1149c = j6;
        this.f1150d = f5;
        this.e = f10;
        this.f1151f = dVar;
        this.f1152g = i4;
        this.f1153h = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1152g | 1);
        P.d dVar = this.f1151f;
        float f5 = this.e;
        int i4 = this.f1153h;
        AbstractC0148q.alpha(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1149c, this.f1150d, f5, dVar, (InterfaceC0581m) obj, cyan, i4);
        return Unit.INSTANCE;
    }
}
