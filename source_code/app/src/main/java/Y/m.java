package Y;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class m extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i4, int i5) {
        super(1);
        this.alpha = i5;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(((aa) obj).f(this.purple));
            case 1:
                return Boolean.valueOf(((aa) obj).f(this.purple));
            default:
                if (((View) obj).getId() == this.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
