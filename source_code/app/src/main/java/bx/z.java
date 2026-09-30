package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import bz.a0;
import bz.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class z extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, T.s sVar, f0 f0Var, Function1 function1, P.d dVar, int i4) {
        super(2);
        this.alpha = 2;
        this.silver = a0Var;
        this.white = sVar;
        this.yellow = f0Var;
        this.teal = function1;
        this.purple = dVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.red | 1);
                P.d dVar = this.purple;
                Function1 function1 = (Function1) this.teal;
                ax axVar = (ax) this.white;
                androidx.compose.animation.b.echo((a0) this.silver, function1, axVar, (az) this.yellow, dVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.red | 1);
                P.d dVar2 = this.purple;
                Boolean bool = (Boolean) this.silver;
                f0 f0Var = (f0) this.white;
                A2.ai.bravo(bool, (T.p) this.teal, f0Var, (String) this.yellow, dVar2, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan3 = C0564b.cyan(this.red | 1);
                P.d dVar3 = this.purple;
                A2.ai.alpha((a0) this.silver, (T.s) this.white, (f0) this.yellow, (Function1) this.teal, dVar3, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, P.d dVar, int i4, int i5) {
        super(2);
        this.alpha = i5;
        this.silver = obj;
        this.teal = obj2;
        this.white = obj3;
        this.yellow = obj4;
        this.purple = dVar;
        this.red = i4;
    }
}
