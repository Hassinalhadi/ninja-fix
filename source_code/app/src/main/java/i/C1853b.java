package i;

import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import b.ab;
import d.C1543m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.AbstractC2088a;
import s6.AbstractC2616b5;
import t6.M3;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1853b implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.e f12746a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12749d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ C1853b(T.s sVar, C1874w c1874w, M m4, Object obj, Object obj2, C1543m c1543m, boolean z2, C0704t c0704t, Function1 function1, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = sVar;
        this.red = c1874w;
        this.silver = m4;
        this.f12749d = obj;
        this.e = obj2;
        this.teal = c1543m;
        this.white = z2;
        this.yellow = c0704t;
        this.f12746a = function1;
        this.f12747b = i4;
        this.f12748c = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.f12747b | 1);
                Function1 function1 = (Function1) this.f12746a;
                AbstractC2616b5.alpha(this.purple, (C1874w) this.red, (M) this.silver, (InterfaceC0541g) this.f12749d, (T.i) this.e, (C1543m) this.teal, this.white, (C0704t) this.yellow, function1, (InterfaceC0581m) obj, cyan, this.f12748c);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.f12747b | 1);
                Function1 function12 = (Function1) this.f12746a;
                AbstractC2616b5.charlie(this.purple, (C1874w) this.red, (M) this.silver, (InterfaceC0539e) this.f12749d, (T.j) this.e, (C1543m) this.teal, this.white, (C0704t) this.yellow, function12, (InterfaceC0581m) obj, cyan2, this.f12748c);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.f12747b | 1);
                P.d dVar = (P.d) this.f12746a;
                M3.alpha((Function0) this.red, this.purple, this.white, (z.k) this.silver, (AbstractC2088a) this.f12749d, (ab) this.e, (z.h) this.teal, (L) this.yellow, dVar, (InterfaceC0581m) obj, cyan3, this.f12748c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1853b(Function0 function0, T.s sVar, boolean z2, z.k kVar, AbstractC2088a abstractC2088a, ab abVar, z.h hVar, L l10, P.d dVar, int i4, int i5) {
        this.alpha = 2;
        this.red = function0;
        this.purple = sVar;
        this.white = z2;
        this.silver = kVar;
        this.f12749d = abstractC2088a;
        this.e = abVar;
        this.teal = hVar;
        this.yellow = l10;
        this.f12746a = dVar;
        this.f12747b = i4;
        this.f12748c = i5;
    }
}
