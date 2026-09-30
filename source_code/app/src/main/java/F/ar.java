package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ar extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.ab f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.M f1111d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Xd.m f1113g;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ a0.as teal;
    public final /* synthetic */ ak white;
    public final /* synthetic */ ap yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar(Function0 function0, T.s sVar, boolean z2, a0.as asVar, ak akVar, ap apVar, b.ab abVar, androidx.compose.foundation.layout.M m4, Xd.m mVar, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
        this.teal = asVar;
        this.white = akVar;
        this.yellow = apVar;
        this.f1110c = abVar;
        this.f1111d = m4;
        this.f1113g = mVar;
        this.e = i4;
        this.f1112f = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.e | 1);
                androidx.compose.foundation.layout.M m4 = this.f1111d;
                K1.bravo(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1110c, m4, this.f1113g, (InterfaceC0581m) obj, cyan, this.f1112f);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.e | 1);
                P.d dVar = (P.d) this.f1113g;
                ak akVar = this.white;
                b.ab abVar = this.f1110c;
                androidx.compose.foundation.layout.M m5 = this.f1111d;
                K1.hotel(this.purple, this.red, this.silver, this.teal, akVar, this.yellow, abVar, m5, dVar, (InterfaceC0581m) obj, cyan2, this.f1112f);
                return Unit.INSTANCE;
        }
    }
}
