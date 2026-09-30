package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0157s1 extends Lambda implements Xd.m {
    public final /* synthetic */ String alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1182d;
    public final /* synthetic */ Xd.l e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.d f1183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0143o2 f1184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0.as f1185h;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ I0.aj silver;
    public final /* synthetic */ InterfaceC1673j teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ Xd.l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157s1(String str, boolean z2, boolean z10, I0.aj ajVar, InterfaceC1673j interfaceC1673j, boolean z11, Xd.l lVar, Xd.l lVar2, Xd.l lVar3, Xd.l lVar4, P.d dVar, C0143o2 c0143o2, a0.as asVar) {
        super(3);
        this.alpha = str;
        this.purple = z2;
        this.red = z10;
        this.silver = ajVar;
        this.teal = interfaceC1673j;
        this.white = z11;
        this.yellow = lVar;
        this.f1181c = lVar2;
        this.f1182d = lVar3;
        this.e = lVar4;
        this.f1183f = dVar;
        this.f1184g = c0143o2;
        this.f1185h = asVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        Xd.l lVar = (Xd.l) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).india(lVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        C0150q1 c0150q1 = C0150q1.alpha;
        C0143o2 c0143o2 = this.f1184g;
        a0.as asVar = this.f1185h;
        boolean z2 = this.purple;
        boolean z10 = this.white;
        InterfaceC1673j interfaceC1673j = this.teal;
        c0150q1.bravo(this.alpha, lVar, z2, this.red, this.silver, interfaceC1673j, z10, this.yellow, this.f1181c, this.f1182d, this.e, this.f1183f, c0143o2, null, P.e.echo(2108828640, new C0153r1(z2, z10, interfaceC1673j, c0143o2, asVar, 0), interfaceC0581m), interfaceC0581m, (intValue << 3) & 112, 14155776, 32768);
        return Unit.INSTANCE;
    }
}
