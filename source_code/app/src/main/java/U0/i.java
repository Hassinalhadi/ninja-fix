package U0;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import t0.C2889G;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ z red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, Nd.c cVar) {
        super(2, cVar);
        this.red = zVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.red, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                abVar = (vf.ab) this.purple;
                ResultKt.alpha(obj);
                z zVar = this.red;
                int[] iArr = zVar.f2117t;
                int i5 = iArr[0];
                int i10 = iArr[1];
                zVar.e.getLocationOnScreen(iArr);
                if (i5 == iArr[0] || i10 != iArr[1]) {
                    zVar.lima();
                }
                if (vf.ad.xray(abVar)) {
                    this.purple = abVar;
                    this.alpha = 1;
                    if (getContext().get(C2889G.silver) == null) {
                        if (C0564b.sierra(getContext()).blue(c.red, this) == aVar) {
                            return aVar;
                        }
                        z zVar2 = this.red;
                        int[] iArr2 = zVar2.f2117t;
                        int i52 = iArr2[0];
                        int i102 = iArr2[1];
                        zVar2.e.getLocationOnScreen(iArr2);
                        if (i52 == iArr2[0]) {
                        }
                        zVar2.lima();
                        if (vf.ad.xray(abVar)) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            abVar = (vf.ab) this.purple;
            if (vf.ad.xray(abVar)) {
            }
        }
    }
}
