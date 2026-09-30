package na;

import androidx.compose.runtime.P;
import com.app.network.network.models.Order;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n.Y;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Function {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ j(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.alpha) {
            case 0:
                return (Order) ((Y) this.purple).purple;
            case 1:
                return (SingleSource) ((Y) this.purple).invoke(obj);
            default:
                return (Unit) ((P) this.purple).invoke(obj);
        }
    }
}
