package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0168v1 extends Lambda implements Xd.l {
    public final /* synthetic */ Xd.l alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1221d;
    public final /* synthetic */ Function1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.d f1222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P.d f1223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.M f1224h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1225i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1226j;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ P.d white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168v1(Xd.l lVar, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, P.d dVar5, P.d dVar6, boolean z2, float f5, Function1 function1, P.d dVar7, P.d dVar8, androidx.compose.foundation.layout.M m4, int i4, int i5) {
        super(2);
        this.alpha = lVar;
        this.purple = dVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = dVar4;
        this.white = dVar5;
        this.yellow = dVar6;
        this.f1220c = z2;
        this.f1221d = f5;
        this.e = function1;
        this.f1222f = dVar7;
        this.f1223g = dVar8;
        this.f1224h = m4;
        this.f1225i = i4;
        this.f1226j = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1225i | 1);
        int cyan2 = C0564b.cyan(this.f1226j);
        P.d dVar = this.f1222f;
        AbstractC0174x1.bravo(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1220c, this.f1221d, this.e, dVar, this.f1223g, this.f1224h, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
