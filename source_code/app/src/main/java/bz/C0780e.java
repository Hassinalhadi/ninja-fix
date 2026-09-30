package bz;

import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bz.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0780e extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ C0778c red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;
    public final /* synthetic */ androidx.compose.runtime.ax teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780e(Object obj, C0778c c0778c, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.purple = obj;
        this.red = c0778c;
        this.silver = axVar;
        this.teal = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0780e(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0780e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C0780e c0780e;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C0778c c0778c = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                c0780e = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (!Intrinsics.areEqual(this.purple, ((t0) c0778c.echo).getValue())) {
                I i5 = AbstractC0782g.alpha;
                InterfaceC0787l interfaceC0787l = (InterfaceC0787l) this.silver.getValue();
                this.alpha = 1;
                c0780e = this;
                if (C0778c.charlie(this.red, this.purple, interfaceC0787l, null, c0780e, 12) == aVar) {
                    return aVar;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        I i10 = AbstractC0782g.alpha;
        Function1 function1 = (Function1) c0780e.teal.getValue();
        if (function1 != null) {
            function1.invoke(c0778c.delta());
        }
        return Unit.INSTANCE;
    }
}
