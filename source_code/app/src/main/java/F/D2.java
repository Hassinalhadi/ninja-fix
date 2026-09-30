package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class D2 extends Lambda implements Xd.l {
    public final /* synthetic */ String alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0.k f1004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1005d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1008h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f1009i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D0.an f1010j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1011k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1013m;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ H0.v teal;
    public final /* synthetic */ H0.k white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(String str, T.s sVar, long j5, long j6, H0.v vVar, H0.k kVar, long j7, O0.k kVar2, long j10, int i4, boolean z2, int i5, int i10, Function1 function1, D0.an anVar, int i11, int i12, int i13) {
        super(2);
        this.alpha = str;
        this.purple = sVar;
        this.red = j5;
        this.silver = j6;
        this.teal = vVar;
        this.white = kVar;
        this.yellow = j7;
        this.f1004c = kVar2;
        this.f1005d = j10;
        this.e = i4;
        this.f1006f = z2;
        this.f1007g = i5;
        this.f1008h = i10;
        this.f1009i = function1;
        this.f1010j = anVar;
        this.f1011k = i11;
        this.f1012l = i12;
        this.f1013m = i13;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1011k | 1);
        int cyan2 = C0564b.cyan(this.f1012l);
        int i4 = this.f1008h;
        int i5 = this.f1013m;
        G2.bravo(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1004c, this.f1005d, this.e, this.f1006f, this.f1007g, i4, this.f1009i, this.f1010j, (InterfaceC0581m) obj, cyan, cyan2, i5);
        return Unit.INSTANCE;
    }
}
