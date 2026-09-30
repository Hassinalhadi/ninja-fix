package F;

import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aa extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0541g f1088d;
    public final /* synthetic */ InterfaceC0539e e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P.d f1091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P.d f1092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1093j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1094k;
    public final /* synthetic */ S1 purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ P.d white;
    public final /* synthetic */ D0.an yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(T.s sVar, S1 s12, long j5, long j6, long j7, P.d dVar, D0.an anVar, float f5, InterfaceC0541g interfaceC0541g, InterfaceC0539e interfaceC0539e, int i4, boolean z2, P.d dVar2, P.d dVar3, int i5, int i10) {
        super(2);
        this.alpha = sVar;
        this.purple = s12;
        this.red = j5;
        this.silver = j6;
        this.teal = j7;
        this.white = dVar;
        this.yellow = anVar;
        this.f1087c = f5;
        this.f1088d = interfaceC0541g;
        this.e = interfaceC0539e;
        this.f1089f = i4;
        this.f1090g = z2;
        this.f1091h = dVar2;
        this.f1092i = dVar3;
        this.f1093j = i5;
        this.f1094k = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1093j | 1);
        int cyan2 = C0564b.cyan(this.f1094k);
        P.d dVar = this.f1091h;
        P.d dVar2 = this.f1092i;
        P.d dVar3 = this.white;
        int i4 = this.f1089f;
        boolean z2 = this.f1090g;
        ag.foxtrot(this.alpha, this.purple, this.red, this.silver, this.teal, dVar3, this.yellow, this.f1087c, this.f1088d, this.e, i4, z2, dVar, dVar2, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
