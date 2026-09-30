package T0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s6.E7;

/* loaded from: classes3.dex */
public final class m extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ kotlin.e silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function0 function0, U0.t tVar, P.d dVar, int i4, int i5) {
        super(2);
        this.silver = function0;
        this.teal = tVar;
        this.white = dVar;
        this.purple = i4;
        this.red = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.purple | 1);
                Function1 function1 = (Function1) this.silver;
                androidx.compose.ui.viewinterop.a.alpha(function1, (T.s) this.white, (Function1) this.teal, (InterfaceC0581m) obj, cyan, this.red);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.purple | 1);
                P.d dVar = (P.d) this.white;
                Function0 function0 = (Function0) this.silver;
                E7.alpha(function0, (U0.t) this.teal, dVar, (InterfaceC0581m) obj, cyan2, this.red);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function1 function1, T.s sVar, Function1 function12, int i4, int i5) {
        super(2);
        this.silver = function1;
        this.white = sVar;
        this.teal = function12;
        this.purple = i4;
        this.red = i5;
    }
}
