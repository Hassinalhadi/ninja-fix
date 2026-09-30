package J8;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s6.K4;

/* loaded from: classes2.dex */
public final class r extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return K4.bravo(this.purple, ae.bravo);
            default:
                return K4.bravo(this.purple, ae.alpha);
        }
    }
}
