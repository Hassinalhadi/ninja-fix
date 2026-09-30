package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class u2 extends Lambda implements Xd.m {
    public final /* synthetic */ String alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P.d f1214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1215d;
    public final /* synthetic */ Xd.l e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.as f1216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0143o2 f1217g;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ A8.a silver;
    public final /* synthetic */ InterfaceC1673j teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(String str, boolean z2, boolean z10, A8.a aVar, InterfaceC1673j interfaceC1673j, boolean z11, P.d dVar, P.d dVar2, Xd.l lVar, Xd.l lVar2, a0.as asVar, C0143o2 c0143o2) {
        super(3);
        this.alpha = str;
        this.purple = z2;
        this.red = z10;
        this.silver = aVar;
        this.teal = interfaceC1673j;
        this.white = z11;
        this.yellow = dVar;
        this.f1214c = dVar2;
        this.f1215d = lVar;
        this.e = lVar2;
        this.f1216f = asVar;
        this.f1217g = c0143o2;
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
        int i5 = intValue;
        C0143o2 c0143o2 = this.f1217g;
        C0162t2.alpha.bravo(this.alpha, lVar, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1214c, this.f1215d, this.e, this.f1216f, c0143o2, null, null, interfaceC0581m, (i5 << 3) & 112);
        return Unit.INSTANCE;
    }
}
