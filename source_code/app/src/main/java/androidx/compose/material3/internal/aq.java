package androidx.compose.material3.internal;

import F.C0143o2;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aq extends Lambda implements Xd.l {
    public final /* synthetic */ au alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Xd.l f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P.d f2981d;
    public final /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1673j f2984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f2985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0143o2 f2986j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P.d f2987k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2989m;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Xd.l red;
    public final /* synthetic */ I0.aj silver;
    public final /* synthetic */ Xd.l teal;
    public final /* synthetic */ Xd.l white;
    public final /* synthetic */ Xd.l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(au auVar, String str, Xd.l lVar, I0.aj ajVar, Xd.l lVar2, Xd.l lVar3, Xd.l lVar4, Xd.l lVar5, P.d dVar, boolean z2, boolean z10, boolean z11, InterfaceC1673j interfaceC1673j, M m4, C0143o2 c0143o2, P.d dVar2, int i4, int i5) {
        super(2);
        this.alpha = auVar;
        this.purple = str;
        this.red = lVar;
        this.silver = ajVar;
        this.teal = lVar2;
        this.white = lVar3;
        this.yellow = lVar4;
        this.f2980c = lVar5;
        this.f2981d = dVar;
        this.e = z2;
        this.f2982f = z10;
        this.f2983g = z11;
        this.f2984h = interfaceC1673j;
        this.f2985i = m4;
        this.f2986j = c0143o2;
        this.f2987k = dVar2;
        this.f2988l = i4;
        this.f2989m = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f2988l | 1);
        int cyan2 = C0564b.cyan(this.f2989m);
        au auVar = this.alpha;
        InterfaceC1673j interfaceC1673j = this.f2984h;
        M m4 = this.f2985i;
        at.alpha(auVar, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f2980c, this.f2981d, this.e, this.f2982f, this.f2983g, interfaceC1673j, m4, this.f2986j, this.f2987k, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
