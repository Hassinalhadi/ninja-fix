package bz;

import androidx.compose.runtime.D0;
import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class T implements D0 {
    public final X alpha;
    public Lambda purple;
    public Lambda red;
    public final /* synthetic */ U silver;

    /* JADX WARN: Multi-variable type inference failed */
    public T(U u4, X x4, Function1 function1, Function1 function12) {
        this.silver = u4;
        this.alpha = x4;
        this.purple = (Lambda) function1;
        this.red = (Lambda) function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void alpha(V v4) {
        Object invoke = this.red.invoke(v4.charlie());
        boolean hotel = this.silver.charlie.hotel();
        X x4 = this.alpha;
        if (hotel) {
            x4.hotel(this.red.invoke(v4.alpha()), invoke, (aa) this.purple.invoke(v4));
        } else {
            x4.india(invoke, (aa) this.purple.invoke(v4));
        }
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        alpha(this.silver.charlie.foxtrot());
        return ((t0) this.alpha.f3449c).getValue();
    }
}
