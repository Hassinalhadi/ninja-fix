package N2;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.AbstractC2088a;
import q0.InterfaceC2392k;
import q0.av;
import sb.AbstractC2845d;
import ub.AbstractC3150c;
import yb.AbstractC3410a;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1853a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1855c;
    public final /* synthetic */ String purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ a(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4, int i5, int i10) {
        this.alpha = i10;
        this.teal = obj;
        this.purple = str;
        this.white = obj2;
        this.yellow = obj3;
        this.f1853a = obj4;
        this.f1854b = obj5;
        this.f1855c = obj6;
        this.red = i4;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                int cyan2 = C0564b.cyan(this.silver);
                q qVar = (q) this.teal;
                T.f fVar = (T.f) this.f1854b;
                InterfaceC2392k interfaceC2392k = (InterfaceC2392k) this.f1855c;
                p.alpha(qVar, this.purple, (T.s) this.white, (Function1) this.yellow, (ae) this.f1853a, fVar, interfaceC2392k, (InterfaceC0581m) obj, cyan, cyan2);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.red | 1);
                P.d dVar = (P.d) this.f1855c;
                AbstractC2845d.charlie((Function0) this.teal, this.purple, (String) this.white, (String) this.yellow, (String) this.f1853a, (Function0) this.f1854b, dVar, (InterfaceC0581m) obj, cyan3, this.silver);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(this.red | 1);
                AbstractC2088a abstractC2088a = (AbstractC2088a) this.f1855c;
                AbstractC3150c.alpha(this.purple, (String) this.teal, (T.s) this.white, (P.d) this.yellow, (P.d) this.f1853a, (av) this.f1854b, abstractC2088a, (InterfaceC0581m) obj, cyan4, this.silver);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan5 = C0564b.cyan(this.red | 1);
                Function0 function0 = (Function0) this.f1855c;
                AbstractC3410a.alpha(this.purple, (T.s) this.white, (String) this.teal, (String) this.yellow, (P.d) this.f1853a, (P.d) this.f1854b, function0, (InterfaceC0581m) obj, cyan5, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(String str, T.s sVar, String str2, String str3, P.d dVar, P.d dVar2, Function0 function0, int i4, int i5) {
        this.alpha = 3;
        this.purple = str;
        this.white = sVar;
        this.teal = str2;
        this.yellow = str3;
        this.f1853a = dVar;
        this.f1854b = dVar2;
        this.f1855c = function0;
        this.red = i4;
        this.silver = i5;
    }

    public /* synthetic */ a(String str, String str2, T.s sVar, P.d dVar, P.d dVar2, av avVar, AbstractC2088a abstractC2088a, int i4, int i5) {
        this.alpha = 2;
        this.purple = str;
        this.teal = str2;
        this.white = sVar;
        this.yellow = dVar;
        this.f1853a = dVar2;
        this.f1854b = avVar;
        this.f1855c = abstractC2088a;
        this.red = i4;
        this.silver = i5;
    }
}
