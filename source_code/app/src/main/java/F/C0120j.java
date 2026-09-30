package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0120j extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P.d f1135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.as f1136d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1138g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1139h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U0.t f1141j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1143l;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ T.p silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ Xd.l white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0120j(Function0 function0, P.d dVar, T.p pVar, P.d dVar2, Xd.l lVar, P.d dVar3, P.d dVar4, a0.as asVar, long j5, long j6, long j7, long j10, float f5, U0.t tVar, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.purple = function0;
        this.red = dVar;
        this.silver = pVar;
        this.teal = dVar2;
        this.white = lVar;
        this.yellow = dVar3;
        this.f1135c = dVar4;
        this.f1136d = asVar;
        this.e = j5;
        this.f1137f = j6;
        this.f1138g = j7;
        this.f1139h = j10;
        this.f1140i = f5;
        this.f1141j = tVar;
        this.f1142k = i4;
        this.f1143l = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.f1142k | 1);
                int cyan2 = C0564b.cyan(this.f1143l);
                AbstractC0128l.charlie(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1135c, this.f1136d, this.e, this.f1137f, this.f1138g, this.f1139h, this.f1140i, this.f1141j, interfaceC0581m, cyan, cyan2);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan3 = C0564b.cyan(this.f1142k | 1);
                K1.alpha(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1135c, this.f1136d, this.e, this.f1137f, this.f1138g, this.f1139h, this.f1140i, this.f1141j, interfaceC0581m, cyan3, this.f1143l);
                return Unit.INSTANCE;
        }
    }
}
