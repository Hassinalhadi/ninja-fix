package Gb;

import Lb.AbstractC0220c;
import N2.ae;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.rememberme.RememberMeViewRenderer;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q0.InterfaceC2392k;
import yf.N;
import yf.av;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1371a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1373c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1374d;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ kotlin.e red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ y(N2.q qVar, String str, T.s sVar, Function1 function1, ae aeVar, T.f fVar, InterfaceC2392k interfaceC2392k, P.d dVar, int i4, int i5) {
        this.alpha = 2;
        this.yellow = qVar;
        this.white = str;
        this.f1371a = sVar;
        this.f1372b = function1;
        this.f1373c = aeVar;
        this.f1374d = fVar;
        this.purple = interfaceC2392k;
        this.red = dVar;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit a6;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                String str = (String) this.white;
                String str2 = (String) this.f1374d;
                Function0 function0 = (Function0) this.red;
                a.alpha(str, (String) this.yellow, (String) this.f1371a, (String) this.f1372b, (String) this.f1373c, str2, (Function0) this.purple, function0, (InterfaceC0581m) obj, cyan, this.teal);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                Function0 function02 = (Function0) this.f1374d;
                AbstractC0220c.alpha((HomeViewModelV2) this.white, (N) this.yellow, (av) this.f1371a, (T.s) this.f1372b, (Function0) this.purple, (Function0) this.red, (Function1) this.f1373c, function02, (InterfaceC0581m) obj, cyan2, this.teal);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.silver | 1);
                int cyan4 = C0564b.cyan(this.teal);
                N2.q qVar = (N2.q) this.yellow;
                P.d dVar = (P.d) this.red;
                N2.p.foxtrot(qVar, (String) this.white, (T.s) this.f1371a, (Function1) this.f1372b, (ae) this.f1373c, (T.f) this.f1374d, (InterfaceC2392k) this.purple, dVar, (InterfaceC0581m) obj, cyan3, cyan4);
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj2).intValue();
                RememberMeViewRenderer rememberMeViewRenderer = (RememberMeViewRenderer) this.white;
                Xd.l lVar = (Xd.l) this.f1371a;
                Xd.l lVar2 = (Xd.l) this.f1372b;
                Xd.n nVar = (Xd.n) this.f1373c;
                Xd.l lVar3 = (Xd.l) this.f1374d;
                Function0 function03 = (Function0) this.purple;
                Function0 function04 = (Function0) this.red;
                int i4 = this.silver;
                int i5 = this.teal;
                a6 = RememberMeViewRenderer.a(rememberMeViewRenderer, (T.s) this.yellow, lVar, lVar2, nVar, lVar3, function03, function04, i4, i5, (InterfaceC0581m) obj, intValue);
                return a6;
        }
    }

    public /* synthetic */ y(HomeViewModelV2 homeViewModelV2, N n5, av avVar, T.s sVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, int i4, int i5) {
        this.alpha = 1;
        this.white = homeViewModelV2;
        this.yellow = n5;
        this.f1371a = avVar;
        this.f1372b = sVar;
        this.purple = function0;
        this.red = function02;
        this.f1373c = function1;
        this.f1374d = function03;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Function0 function0, Function0 function02, int i4, int i5, int i10) {
        this.alpha = i10;
        this.white = obj;
        this.yellow = obj2;
        this.f1371a = obj3;
        this.f1372b = obj4;
        this.f1373c = obj5;
        this.f1374d = obj6;
        this.purple = function0;
        this.red = function02;
        this.silver = i4;
        this.teal = i5;
    }
}
