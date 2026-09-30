package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class V0 extends Lambda implements Xd.l {
    public final /* synthetic */ Function0 alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1081d;
    public final /* synthetic */ P.d e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N0 f1082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0126k1 f1083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P.d f1084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1085i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1086j;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ C0103e2 red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ a0.as teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Function0 function0, T.s sVar, C0103e2 c0103e2, float f5, a0.as asVar, long j5, long j6, float f10, long j7, P.d dVar, N0 n02, C0126k1 c0126k1, P.d dVar2, int i4, int i5) {
        super(2);
        this.alpha = function0;
        this.purple = sVar;
        this.red = c0103e2;
        this.silver = f5;
        this.teal = asVar;
        this.white = j5;
        this.yellow = j6;
        this.f1080c = f10;
        this.f1081d = j7;
        this.e = dVar;
        this.f1082f = n02;
        this.f1083g = c0126k1;
        this.f1084h = dVar2;
        this.f1085i = i4;
        this.f1086j = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1085i | 1);
        P.d dVar = this.f1084h;
        N0 n02 = this.f1082f;
        int i4 = this.f1086j;
        AbstractC0122j1.alpha(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1080c, this.f1081d, this.e, n02, this.f1083g, dVar, (InterfaceC0581m) obj, cyan, i4);
        return Unit.INSTANCE;
    }
}
