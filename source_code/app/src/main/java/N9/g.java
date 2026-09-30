package N9;

import Cb.ab;
import Cb.ad;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import yf.at;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 bravo;

    public /* synthetic */ g(int i4, Function1 function1) {
        this.alpha = i4;
        this.bravo = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.alpha) {
            case 0:
                return (at) ((ad) this.bravo).invoke(obj);
            case 1:
                return CTExecutorFactory.bravo((Ya.c) this.bravo, obj);
            default:
                return CTExecutorFactory.echo((ab) this.bravo, obj);
        }
    }
}
