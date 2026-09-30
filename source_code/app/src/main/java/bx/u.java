package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import bz.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class u extends Lambda implements Xd.l {
    public final /* synthetic */ a0 alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3429c;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ ax silver;
    public final /* synthetic */ az teal;
    public final /* synthetic */ Xd.l white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, Function1 function1, T.s sVar, ax axVar, az azVar, Xd.l lVar, P.d dVar, int i4) {
        super(2);
        this.alpha = a0Var;
        this.purple = function1;
        this.red = sVar;
        this.silver = axVar;
        this.teal = azVar;
        this.white = lVar;
        this.yellow = dVar;
        this.f3429c = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f3429c | 1);
        P.d dVar = this.yellow;
        az azVar = this.teal;
        Xd.l lVar = this.white;
        androidx.compose.animation.b.alpha(this.alpha, this.purple, this.red, this.silver, azVar, lVar, dVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
