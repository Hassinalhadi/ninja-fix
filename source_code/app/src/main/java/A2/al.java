package A2;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class al extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Worker purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al(Worker worker, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = worker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.getForegroundInfo();
            default:
                return this.purple.doWork();
        }
    }
}
