package androidx.compose.runtime;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class M implements K, ax {
    public final /* synthetic */ ax alpha;
    public final Nd.h purple;

    public M(ax axVar, Nd.h hVar) {
        this.alpha = axVar;
        this.purple = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(com.checkout.components.ui.utils.extensions.c cVar, Pd.c cVar2) {
        L l10;
        int i4;
        try {
            if (cVar2 instanceof L) {
                l10 = (L) cVar2;
                int i5 = l10.silver;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    l10.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = l10.purple;
                    Od.a aVar = Od.a.alpha;
                    i4 = l10.silver;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Function0 function0 = l10.alpha;
                        ResultKt.alpha(obj);
                        cVar = function0;
                    } else {
                        ResultKt.alpha(obj);
                        l10.alpha = cVar;
                        l10.silver = 1;
                        C3207k c3207k = new C3207k(1, J6.delta(l10));
                        c3207k.tango();
                        cVar = cVar;
                        if (c3207k.sierra() == aVar) {
                            return;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i4 == 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            cVar.invoke();
            throw th;
        }
        l10 = new L(this, cVar2);
        Object obj2 = l10.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = l10.silver;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.purple;
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return this.alpha.getValue();
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        this.alpha.setValue(obj);
    }
}
