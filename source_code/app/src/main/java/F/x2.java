package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class x2 extends Lambda implements Xd.l {
    public final /* synthetic */ Xd.l alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1255d;
    public final /* synthetic */ P.d e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.d f1256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.M f1257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1259i;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ P.d white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Xd.l lVar, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, P.d dVar5, P.d dVar6, boolean z2, float f5, P.d dVar7, P.d dVar8, androidx.compose.foundation.layout.M m4, int i4, int i5) {
        super(2);
        this.alpha = lVar;
        this.purple = dVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = dVar4;
        this.white = dVar5;
        this.yellow = dVar6;
        this.f1254c = z2;
        this.f1255d = f5;
        this.e = dVar7;
        this.f1256f = dVar8;
        this.f1257g = m4;
        this.f1258h = i4;
        this.f1259i = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1258h | 1);
        int cyan2 = C0564b.cyan(this.f1259i);
        P.d dVar = this.e;
        z2.bravo(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1254c, this.f1255d, dVar, this.f1256f, this.f1257g, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
