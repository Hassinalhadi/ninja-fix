package s0;

import B9.C0058p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class ak extends Lambda implements Function0 {
    public final /* synthetic */ al alpha;
    public final /* synthetic */ Ref.ObjectRef purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(al alVar, Ref.ObjectRef objectRef) {
        super(0);
        this.alpha = alVar;
        this.purple = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0058p c0058p = this.alpha.f13305x;
        if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 8) != 0) {
            for (T.r rVar = (g0) c0058p.golf; rVar != null; rVar = rVar.getParent$ui_release()) {
                if ((rVar.getKindSet$ui_release() & 8) != 0) {
                    AbstractC2556p abstractC2556p = rVar;
                    ?? r32 = 0;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof e0) {
                            e0 e0Var = (e0) abstractC2556p;
                            boolean yankee = e0Var.yankee();
                            Ref.ObjectRef objectRef = this.purple;
                            if (yankee) {
                                A0.k kVar = new A0.k();
                                objectRef.alpha = kVar;
                                kVar.silver = true;
                            }
                            if (e0Var.yellow()) {
                                ((A0.k) objectRef.alpha).red = true;
                            }
                            e0Var.india((A0.ad) objectRef.alpha);
                        } else if ((abstractC2556p.getKindSet$ui_release() & 8) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar2 = abstractC2556p.purple;
                            int i4 = 0;
                            abstractC2556p = abstractC2556p;
                            r32 = r32;
                            while (rVar2 != null) {
                                if ((rVar2.getKindSet$ui_release() & 8) != 0) {
                                    i4++;
                                    r32 = r32;
                                    if (i4 == 1) {
                                        abstractC2556p = rVar2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new J.e(new T.r[16]);
                                        }
                                        if (abstractC2556p != 0) {
                                            r32.bravo(abstractC2556p);
                                            abstractC2556p = 0;
                                        }
                                        r32.bravo(rVar2);
                                    }
                                }
                                rVar2 = rVar2.getChild$ui_release();
                                abstractC2556p = abstractC2556p;
                                r32 = r32;
                            }
                            if (i4 == 1) {
                            }
                        }
                        abstractC2556p = AbstractC2555o.bravo(r32);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
