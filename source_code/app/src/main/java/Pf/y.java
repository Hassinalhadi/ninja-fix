package Pf;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class y extends Pd.h implements Xd.m {
    public int purple;
    public /* synthetic */ kotlin.b red;
    public final /* synthetic */ Fe.d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Fe.d dVar, Nd.c cVar) {
        super(3, cVar);
        this.silver = dVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = new y(this.silver, (Nd.c) obj3);
        yVar.red = (kotlin.b) obj;
        return yVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            kotlin.b bVar = this.red;
            Fe.d dVar = this.silver;
            a aVar2 = (a) dVar.charlie;
            byte whiskey = aVar2.whiskey();
            if (whiskey == 1) {
                return dVar.foxtrot(true);
            }
            if (whiskey == 0) {
                return dVar.foxtrot(false);
            }
            if (whiskey == 6) {
                this.purple = 1;
                obj = Fe.d.charlie(dVar, bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (whiskey == 8) {
                    return dVar.echo();
                }
                a.romeo(aVar2, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (Of.n) obj;
    }
}
