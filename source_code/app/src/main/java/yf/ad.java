package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class ad implements InterfaceC3440j {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ InterfaceC3440j purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: Multi-variable type inference failed */
    public ad(InterfaceC3440j interfaceC3440j, Xd.l lVar) {
        this.purple = interfaceC3440j;
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v10, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r9v2, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        ac acVar;
        int i4;
        boolean z2;
        Object obj2;
        Object obj3;
        ad adVar;
        ap apVar;
        Od.a aVar;
        int i5;
        Object obj4;
        InterfaceC3440j interfaceC3440j;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof ac) {
                    acVar = (ac) cVar;
                    int i10 = acVar.red;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        acVar.red = i10 - RecyclerView.UNDEFINED_DURATION;
                        Object obj5 = acVar.purple;
                        Od.a aVar2 = Od.a.alpha;
                        i4 = acVar.red;
                        z2 = true;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    adVar = acVar.alpha;
                                    ResultKt.alpha(obj5);
                                    if (z2) {
                                        return Unit.INSTANCE;
                                    }
                                    throw new AbortFlowException(adVar);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj6 = acVar.teal;
                            ad adVar2 = acVar.alpha;
                            ResultKt.alpha(obj5);
                            obj3 = obj6;
                            adVar = adVar2;
                            obj2 = obj5;
                        } else {
                            ResultKt.alpha(obj5);
                            acVar.alpha = this;
                            acVar.teal = obj;
                            acVar.red = 1;
                            Object invoke = this.red.invoke(obj, acVar);
                            if (invoke != aVar2) {
                                obj2 = invoke;
                                obj3 = obj;
                                adVar = this;
                            } else {
                                return aVar2;
                            }
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            InterfaceC3440j interfaceC3440j2 = adVar.purple;
                            acVar.alpha = adVar;
                            acVar.teal = null;
                            acVar.red = 2;
                            if (interfaceC3440j2.emit(obj3, acVar) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                    }
                }
                acVar = new ac(this, cVar);
                Object obj52 = acVar.purple;
                Od.a aVar22 = Od.a.alpha;
                i4 = acVar.red;
                z2 = true;
                if (i4 == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
            default:
                if (cVar instanceof ap) {
                    apVar = (ap) cVar;
                    int i11 = apVar.purple;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        apVar.purple = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj7 = apVar.alpha;
                        aVar = Od.a.alpha;
                        i5 = apVar.purple;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    ResultKt.alpha(obj7);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3440j = apVar.teal;
                            obj4 = apVar.silver;
                            ResultKt.alpha(obj7);
                        } else {
                            ResultKt.alpha(obj7);
                            apVar.silver = obj;
                            InterfaceC3440j interfaceC3440j3 = this.purple;
                            apVar.teal = interfaceC3440j3;
                            apVar.purple = 1;
                            if (this.red.invoke(obj, apVar) != aVar) {
                                obj4 = obj;
                                interfaceC3440j = interfaceC3440j3;
                            } else {
                                return aVar;
                            }
                        }
                        apVar.silver = null;
                        apVar.teal = null;
                        apVar.purple = 2;
                        if (interfaceC3440j.emit(obj4, apVar) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                }
                apVar = new ap(this, cVar);
                Object obj72 = apVar.alpha;
                aVar = Od.a.alpha;
                i5 = apVar.purple;
                if (i5 == 0) {
                }
                apVar.silver = null;
                apVar.teal = null;
                apVar.purple = 2;
                if (interfaceC3440j.emit(obj4, apVar) == aVar) {
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ad(Xd.l lVar, InterfaceC3440j interfaceC3440j) {
        this.red = (Pd.i) lVar;
        this.purple = interfaceC3440j;
    }
}
