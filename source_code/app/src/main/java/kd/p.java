package kd;

import dd.C1614e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.m {
    public int alpha;
    public /* synthetic */ Object purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ e teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z2, e eVar, Nd.c cVar) {
        super(3, cVar);
        this.silver = z2;
        this.teal = eVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.silver, this.teal, (Nd.c) obj3);
        pVar.purple = (ah) obj;
        pVar.red = (C1614e) obj2;
        return pVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dd.e] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Od.a aVar = Od.a.alpha;
        ?? r12 = this.alpha;
        e eVar = this.teal;
        try {
        } catch (Throwable th) {
            th = th;
            StringBuilder sb2 = new StringBuilder();
            d dVar2 = (d) r12.beige().charlie(aa.alpha);
            aa.india(eVar, sb2, r12.delta(), th);
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            this.purple = th;
            this.red = dVar2;
            this.alpha = 2;
            if (dVar2.echo(sb3, this) != aVar) {
                dVar = dVar2;
            }
        }
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.purple;
                    ResultKt.alpha(obj);
                    throw th2;
                }
                dVar = (d) this.red;
                Throwable th3 = (Throwable) this.purple;
                ResultKt.alpha(obj);
                th = th3;
                this.purple = th;
                this.red = null;
                this.alpha = 3;
                if (dVar.bravo(this) != aVar) {
                    throw th;
                }
                return aVar;
            }
            C1614e c1614e = (C1614e) this.purple;
            ResultKt.alpha(obj);
            r12 = c1614e;
        } else {
            ResultKt.alpha(obj);
            ah ahVar = (ah) this.purple;
            C1614e c1614e2 = (C1614e) this.red;
            if (this.silver) {
                return Unit.INSTANCE;
            }
            if (eVar != e.f12929a && !c1614e2.beige().bravo(aa.bravo)) {
                this.purple = c1614e2;
                this.alpha = 1;
                obj = ahVar.alpha.delta(this);
                r12 = c1614e2;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
