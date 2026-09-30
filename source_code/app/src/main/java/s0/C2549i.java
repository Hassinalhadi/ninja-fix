package s0;

import B9.C0058p;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0592y;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import t0.AbstractC2901T;
import t0.C0;

/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2549i extends Lambda implements Xd.l {
    public static final C2549i purple = new C2549i(2, 0);
    public static final C2549i red = new C2549i(2, 1);
    public static final C2549i silver = new C2549i(2, 2);
    public static final C2549i teal = new C2549i(2, 3);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2549i(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [J.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [J.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC2552l) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((al) ((InterfaceC2552l) obj)).silver((q0.ap) obj2);
                return Unit.INSTANCE;
            case 2:
                ((al) ((InterfaceC2552l) obj)).teal((T.s) obj2);
                return Unit.INSTANCE;
            default:
                InterfaceC0592y interfaceC0592y = (InterfaceC0592y) obj2;
                al alVar = (al) ((InterfaceC2552l) obj);
                alVar.f13301t = interfaceC0592y;
                E0 e02 = AbstractC2901T.hotel;
                P.i iVar = (P.i) interfaceC0592y;
                iVar.getClass();
                alVar.plum((Q0.d) C0564b.azure(iVar, e02));
                Q0.n nVar = (Q0.n) C0564b.azure(iVar, AbstractC2901T.november);
                Q0.n nVar2 = alVar.f13299r;
                C0058p c0058p = alVar.f13305x;
                if (nVar2 != nVar) {
                    alVar.f13299r = nVar;
                    alVar.blue();
                    al victor = alVar.victor();
                    if (victor != null) {
                        victor.beige();
                    }
                    alVar.black();
                    for (T.r rVar = (T.r) c0058p.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                        rVar.onLayoutDirectionChange();
                    }
                }
                alVar.white((C0) C0564b.azure(iVar, AbstractC2901T.sierra));
                if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 32768) != 0) {
                    for (T.r rVar2 = (T.r) c0058p.delta; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                        if ((rVar2.getKindSet$ui_release() & 32768) != 0) {
                            AbstractC2556p abstractC2556p = rVar2;
                            ?? r22 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof InterfaceC2553m) {
                                    T.r node = ((T.r) ((InterfaceC2553m) abstractC2556p)).getNode();
                                    if (node.isAttached()) {
                                        M.delta(node);
                                    } else {
                                        node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                                    }
                                } else if ((abstractC2556p.getKindSet$ui_release() & 32768) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar3 = abstractC2556p.purple;
                                    int i4 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r22 = r22;
                                    while (rVar3 != null) {
                                        if ((rVar3.getKindSet$ui_release() & 32768) != 0) {
                                            i4++;
                                            r22 = r22;
                                            if (i4 == 1) {
                                                abstractC2556p = rVar3;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r22.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r22.bravo(rVar3);
                                            }
                                        }
                                        rVar3 = rVar3.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r22 = r22;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r22);
                            }
                        }
                        if ((rVar2.getAggregateChildKindSet$ui_release() & 32768) != 0) {
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
