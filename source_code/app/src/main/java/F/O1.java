package F;

import androidx.compose.foundation.layout.C0535a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class O1 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0535a f1043d;
    public final /* synthetic */ P.d e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1045g;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(T.s sVar, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, int i4, long j5, long j6, C0535a c0535a, P.d dVar5, int i5, int i10) {
        super(2);
        this.alpha = sVar;
        this.purple = dVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = dVar4;
        this.white = i4;
        this.yellow = j5;
        this.f1042c = j6;
        this.f1043d = c0535a;
        this.e = dVar5;
        this.f1044f = i5;
        this.f1045g = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1044f | 1);
        P.d dVar = this.e;
        long j5 = this.f1042c;
        int i4 = this.f1045g;
        Q1.alpha(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, j5, this.f1043d, dVar, (InterfaceC0581m) obj, cyan, i4);
        return Unit.INSTANCE;
    }
}
