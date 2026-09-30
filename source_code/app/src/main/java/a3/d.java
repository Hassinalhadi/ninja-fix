package a3;

import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ak;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(ac acVar, Pd.c cVar) {
        b bVar;
        int i4;
        ac acVar2;
        Ref.ObjectRef objectRef;
        Throwable th;
        ak akVar;
        ak akVar2;
        if (cVar instanceof b) {
            b bVar2 = (b) cVar;
            int i5 = bVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                bVar = bVar2;
                Object obj = bVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        objectRef = bVar.purple;
                        acVar2 = bVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            akVar = (ak) objectRef.alpha;
                            if (akVar != null) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (acVar.bravo().compareTo(ab.silver) >= 0) {
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        bVar.alpha = acVar;
                        bVar.purple = objectRef2;
                        bVar.silver = 1;
                        C3207k c3207k = new C3207k(1, J6.delta(bVar));
                        c3207k.tango();
                        c cVar2 = new c(c3207k);
                        objectRef2.alpha = cVar2;
                        Intrinsics.checkNotNull(cVar2);
                        acVar.alpha(cVar2);
                        if (c3207k.sierra() == aVar) {
                            return aVar;
                        }
                        acVar2 = acVar;
                        objectRef = objectRef2;
                    } catch (Throwable th3) {
                        acVar2 = acVar;
                        objectRef = objectRef2;
                        th = th3;
                        akVar = (ak) objectRef.alpha;
                        if (akVar != null) {
                            acVar2.charlie(akVar);
                        }
                        throw th;
                    }
                }
                akVar2 = (ak) objectRef.alpha;
                if (akVar2 != null) {
                    acVar2.charlie(akVar2);
                }
                return Unit.INSTANCE;
            }
        }
        bVar = new Pd.c(cVar);
        Object obj2 = bVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.silver;
        if (i4 == 0) {
        }
        akVar2 = (ak) objectRef.alpha;
        if (akVar2 != null) {
        }
        return Unit.INSTANCE;
    }
}
