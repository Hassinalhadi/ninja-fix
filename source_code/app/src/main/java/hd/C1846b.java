package hd;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: hd.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1846b extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Dd.f red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ Xd.m teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1846b(Xd.m mVar, Nd.c cVar, int i4) {
        super(3, cVar);
        this.alpha = i4;
        this.teal = mVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Dd.f fVar = (Dd.f) obj;
        Nd.c cVar = (Nd.c) obj3;
        switch (this.alpha) {
            case 0:
                C1846b c1846b = new C1846b(this.teal, cVar, 0);
                c1846b.red = fVar;
                c1846b.silver = obj2;
                return c1846b.invokeSuspend(Unit.INSTANCE);
            default:
                C1846b c1846b2 = new C1846b(this.teal, cVar, 1);
                c1846b2.red = fVar;
                c1846b2.silver = obj2;
                return c1846b2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Dd.f fVar;
        Dd.f fVar2;
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                int i4 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    fVar = this.red;
                    Object obj2 = this.silver;
                    if (!(obj2 instanceof vd.e)) {
                        return Unit.INSTANCE;
                    }
                    Object obj3 = fVar.alpha;
                    this.red = fVar;
                    this.purple = 1;
                    obj = this.teal.invoke(obj3, obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                vd.e eVar = (vd.e) obj;
                if (eVar == null) {
                    return Unit.INSTANCE;
                }
                this.red = null;
                this.purple = 2;
                if (fVar.echo(this, eVar) == aVar) {
                    return aVar;
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar2 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar2 = this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    fVar2 = this.red;
                    Object obj4 = this.silver;
                    Object obj5 = fVar2.alpha;
                    this.red = fVar2;
                    this.purple = 1;
                    obj = this.teal.invoke(obj5, obj4, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                vd.e eVar2 = (vd.e) obj;
                if (eVar2 != null) {
                    this.red = null;
                    this.purple = 2;
                    if (fVar2.echo(this, eVar2) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
