package androidx.compose.foundation.lazy.layout;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class d implements q0.aw {
    public boolean alpha;
    public final ArrayList purple = new ArrayList();

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(Pd.c cVar) {
        c cVar2;
        int i4;
        Ref.ObjectRef objectRef;
        Throwable th;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i5 = cVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                cVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = cVar2.purple;
                Od.a aVar = Od.a.alpha;
                i4 = cVar2.silver;
                ArrayList arrayList = this.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        objectRef = cVar2.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            kotlin.jvm.internal.x.alpha(arrayList).remove(objectRef.alpha);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!this.alpha) {
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        try {
                            cVar2.alpha = objectRef2;
                            cVar2.silver = 1;
                            C3207k c3207k = new C3207k(1, J6.delta(cVar2));
                            c3207k.tango();
                            objectRef2.alpha = c3207k;
                            arrayList.add(c3207k);
                            if (c3207k.sierra() == aVar) {
                                return aVar;
                            }
                            objectRef = objectRef2;
                        } catch (Throwable th3) {
                            objectRef = objectRef2;
                            th = th3;
                            kotlin.jvm.internal.x.alpha(arrayList).remove(objectRef.alpha);
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
                kotlin.jvm.internal.x.alpha(arrayList).remove(objectRef.alpha);
                return Unit.INSTANCE;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = cVar2.silver;
        ArrayList arrayList2 = this.purple;
        if (i4 == 0) {
        }
        kotlin.jvm.internal.x.alpha(arrayList2).remove(objectRef.alpha);
        return Unit.INSTANCE;
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
