package n;

import a0.InterfaceC0368v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2139n implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13066a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f13069d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ Function1 silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C2139n(CharSequence charSequence, T.s sVar, D0.an anVar, Function1 function1, int i4, boolean z2, int i5, int i10, Object obj, int i11, int i12, int i13) {
        this.alpha = i13;
        this.f13069d = charSequence;
        this.purple = sVar;
        this.red = anVar;
        this.silver = function1;
        this.teal = i4;
        this.white = z2;
        this.yellow = i5;
        this.f13066a = i10;
        this.e = obj;
        this.f13067b = i11;
        this.f13068c = i12;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.f13067b | 1);
                InterfaceC0368v interfaceC0368v = (InterfaceC0368v) this.e;
                at.charlie((String) this.f13069d, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f13066a, interfaceC0368v, (InterfaceC0581m) obj, cyan, this.f13068c);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.f13067b | 1);
                kotlin.collections.t tVar = (kotlin.collections.t) this.e;
                at.alpha((D0.g) this.f13069d, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f13066a, tVar, (InterfaceC0581m) obj, cyan2, this.f13068c);
                return Unit.INSTANCE;
        }
    }
}
