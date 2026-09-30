package U0;

import io.getunleash.android.http.NetworkStatusHelper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ x(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke();
                return;
            case 1:
                this.purple.invoke();
                return;
            case 2:
                this.purple.invoke();
                return;
            case 3:
                NetworkStatusHelper.bravo(this.purple);
                return;
            case 4:
                this.purple.invoke();
                return;
            default:
                this.purple.invoke();
                return;
        }
    }
}
