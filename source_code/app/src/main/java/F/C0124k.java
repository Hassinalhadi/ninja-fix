package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0124k extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Xd.l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124k(U0.ac acVar, Function0 function0, U0.ad adVar, P.d dVar, int i4, int i5) {
        super(2);
        this.alpha = 2;
        this.teal = acVar;
        this.silver = function0;
        this.white = adVar;
        this.yellow = dVar;
        this.purple = i4;
        this.red = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.purple | 1);
                P.d dVar = (P.d) this.yellow;
                T.p pVar = (T.p) this.teal;
                AbstractC0128l.delta((Function0) this.silver, pVar, (U0.t) this.white, dVar, (InterfaceC0581m) obj, cyan, this.red);
                return Unit.INSTANCE;
            case 1:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.purple | 1);
                Y1 y12 = (Y1) this.teal;
                AbstractC0149q0.alpha((O) this.silver, y12, (S2) this.white, this.yellow, (InterfaceC0581m) obj, cyan2, this.red);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan3 = C0564b.cyan(this.purple | 1);
                P.d dVar2 = (P.d) this.yellow;
                Function0 function0 = (Function0) this.silver;
                U0.l.alpha((U0.ac) this.teal, function0, (U0.ad) this.white, dVar2, (InterfaceC0581m) obj, cyan3, this.red);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0124k(Object obj, Object obj2, Object obj3, Xd.l lVar, int i4, int i5, int i10) {
        super(2);
        this.alpha = i10;
        this.silver = obj;
        this.teal = obj2;
        this.white = obj3;
        this.yellow = lVar;
        this.purple = i4;
        this.red = i5;
    }
}
