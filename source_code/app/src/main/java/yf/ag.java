package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class ag implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Pd.i purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* JADX WARN: Multi-variable type inference failed */
    public ag(Xd.l lVar, Ref.ObjectRef objectRef, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.purple = (Pd.i) lVar;
                this.red = objectRef;
                return;
            default:
                this.purple = (Pd.i) lVar;
                this.red = objectRef;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Type inference failed for: r6v10, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        af afVar;
        Object obj2;
        int i4;
        ag agVar;
        aj ajVar;
        Object obj3;
        int i5;
        ag agVar2;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof af) {
                    afVar = (af) cVar;
                    int i10 = afVar.red;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        afVar.red = i10 - RecyclerView.UNDEFINED_DURATION;
                        obj2 = afVar.purple;
                        Od.a aVar = Od.a.alpha;
                        i4 = afVar.red;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                obj = afVar.teal;
                                agVar = afVar.alpha;
                                ResultKt.alpha(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj2);
                            afVar.alpha = this;
                            afVar.teal = obj;
                            afVar.red = 1;
                            obj2 = this.purple.invoke(obj, afVar);
                            if (obj2 != aVar) {
                                agVar = this;
                            } else {
                                return aVar;
                            }
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        agVar.red.alpha = obj;
                        throw new AbortFlowException(agVar);
                    }
                }
                afVar = new af(this, cVar);
                obj2 = afVar.purple;
                Od.a aVar2 = Od.a.alpha;
                i4 = afVar.red;
                if (i4 == 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (cVar instanceof aj) {
                    ajVar = (aj) cVar;
                    int i11 = ajVar.red;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        ajVar.red = i11 - RecyclerView.UNDEFINED_DURATION;
                        obj3 = ajVar.purple;
                        Od.a aVar3 = Od.a.alpha;
                        i5 = ajVar.red;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                obj = ajVar.teal;
                                agVar2 = ajVar.alpha;
                                ResultKt.alpha(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj3);
                            ajVar.alpha = this;
                            ajVar.teal = obj;
                            ajVar.red = 1;
                            obj3 = this.purple.invoke(obj, ajVar);
                            if (obj3 != aVar3) {
                                agVar2 = this;
                            } else {
                                return aVar3;
                            }
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        agVar2.red.alpha = obj;
                        throw new AbortFlowException(agVar2);
                    }
                }
                ajVar = new aj(this, cVar);
                obj3 = ajVar.purple;
                Od.a aVar32 = Od.a.alpha;
                i5 = ajVar.red;
                if (i5 == 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
