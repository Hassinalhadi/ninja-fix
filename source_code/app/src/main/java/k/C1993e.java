package k;

import Pd.i;
import Xd.l;
import a2.C0393r;
import d.C1527e;
import d.C1535i;
import fe.C1715g;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qa.j;
import s0.L;
import s6.J4;
import s6.J6;
import vf.C3207k;
import vf.ab;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1993e extends i implements l {
    public int alpha;
    public final /* synthetic */ h purple;
    public final /* synthetic */ L red;
    public final /* synthetic */ j silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993e(h hVar, L l10, j jVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
        this.red = l10;
        this.silver = jVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1993e(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1993e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            h hVar = this.purple;
            C1535i c1535i = hVar.alpha;
            C1992d c1992d = new C1992d(hVar, this.red, this.silver);
            this.alpha = 1;
            c1535i.getClass();
            Z.c cVar = (Z.c) c1992d.invoke();
            if (cVar != null && !c1535i.d(cVar, c1535i.f12001a)) {
                C3207k c3207k = new C3207k(1, J6.delta(this));
                c3207k.tango();
                C1527e c1527e = new C1527e(c1992d, c3207k);
                androidx.compose.foundation.lazy.layout.i iVar = c1535i.silver;
                iVar.getClass();
                Z.c cVar2 = (Z.c) c1992d.invoke();
                if (cVar2 == null) {
                    Result.Companion companion = Result.INSTANCE;
                    c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                } else {
                    c3207k.victor(new C0393r(21, iVar, c1527e));
                    J.e eVar = iVar.alpha;
                    C1715g hotel = J4.hotel(0, eVar.red);
                    int i5 = hotel.alpha;
                    int i10 = hotel.purple;
                    if (i5 <= i10) {
                        while (true) {
                            Z.c cVar3 = (Z.c) ((C1527e) eVar.alpha[i10]).alpha.invoke();
                            if (cVar3 != null) {
                                Z.c delta = cVar2.delta(cVar3);
                                if (Intrinsics.areEqual(delta, cVar2)) {
                                    eVar.alpha(i10 + 1, c1527e);
                                    break;
                                }
                                if (!Intrinsics.areEqual(delta, cVar3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i11 = eVar.red - 1;
                                    if (i11 <= i10) {
                                        while (true) {
                                            ((C1527e) eVar.alpha[i10]).bravo.delta(cancellationException);
                                            if (i11 == i10) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (i10 == i5) {
                                break;
                            }
                            i10--;
                        }
                    }
                    eVar.alpha(0, c1527e);
                    if (!c1535i.f12002b) {
                        c1535i.e();
                    }
                }
                obj2 = c3207k.sierra();
                if (obj2 != Od.a.alpha) {
                    obj2 = Unit.INSTANCE;
                }
            } else {
                obj2 = Unit.INSTANCE;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
