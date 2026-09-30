package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class M extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1 f1035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W1 f1036d;
    public final /* synthetic */ b.ab e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f1037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.M f1038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1040i;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ D0.an white;
    public final /* synthetic */ a0.as yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(boolean z2, T.p pVar, Function0 function0, boolean z10, P.d dVar, D0.an anVar, a0.as asVar, T1 t12, W1 w12, b.ab abVar, float f5, androidx.compose.foundation.layout.M m4, int i4, int i5) {
        super(2);
        this.alpha = z2;
        this.purple = pVar;
        this.red = function0;
        this.silver = z10;
        this.teal = dVar;
        this.white = anVar;
        this.yellow = asVar;
        this.f1035c = t12;
        this.f1036d = w12;
        this.e = abVar;
        this.f1037f = f5;
        this.f1038g = m4;
        this.f1039h = i4;
        this.f1040i = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1039h | 1);
        int cyan2 = C0564b.cyan(this.f1040i);
        P.d dVar = this.teal;
        T1 t12 = this.f1035c;
        b.ab abVar = this.e;
        float f5 = this.f1037f;
        N.bravo(this.alpha, this.purple, this.red, this.silver, dVar, this.white, this.yellow, t12, this.f1036d, abVar, f5, this.f1038g, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
