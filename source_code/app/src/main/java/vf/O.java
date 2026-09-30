package vf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;

/* loaded from: classes2.dex */
public final class O extends Pd.h implements Xd.l {
    public T purple;
    public Af.j red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ P white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Nd.c cVar, P p4) {
        super(2, cVar);
        this.white = p4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        O o5 = new O(cVar, this.white);
        o5.teal = obj;
        return o5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0069 -> B:6:0x007e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        T foxtrot;
        T t5;
        Af.j jVar;
        C2359i c2359i;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    jVar = this.red;
                    t5 = this.purple;
                    c2359i = (C2359i) this.teal;
                    ResultKt.alpha(obj);
                    jVar = jVar.golf();
                    if (!Intrinsics.areEqual(jVar, t5)) {
                        if (jVar instanceof C3211o) {
                            this.teal = c2359i;
                            this.purple = t5;
                            this.red = jVar;
                            this.silver = 2;
                            c2359i.bravo(this, ((C3211o) jVar).teal);
                            Od.a aVar2 = Od.a.alpha;
                            return aVar;
                        }
                        jVar = jVar.golf();
                        if (!Intrinsics.areEqual(jVar, t5)) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            C2359i c2359i2 = (C2359i) this.teal;
            P p4 = this.white;
            p4.getClass();
            Object obj2 = P.alpha.get(p4);
            if (obj2 instanceof C3211o) {
                P p5 = ((C3211o) obj2).teal;
                this.silver = 1;
                c2359i2.bravo(this, p5);
                return aVar;
            }
            if ((obj2 instanceof D) && (foxtrot = ((D) obj2).foxtrot()) != null) {
                Object obj3 = Af.j.alpha.get(foxtrot);
                Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                Af.j jVar2 = (Af.j) obj3;
                t5 = foxtrot;
                jVar = jVar2;
                c2359i = c2359i2;
                if (!Intrinsics.areEqual(jVar, t5)) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
