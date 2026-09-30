package G;

import androidx.compose.material3.internal.at;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ long purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ kotlin.e silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j5, Xd.l lVar, int i4) {
        super(2);
        this.purple = j5;
        this.silver = lVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                l.bravo((Function0) this.silver, this.purple, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
            default:
                at.charlie(this.purple, (Xd.l) this.silver, interfaceC0581m, C0564b.cyan(this.red | 1));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function0 function0, long j5, int i4) {
        super(2);
        this.silver = function0;
        this.purple = j5;
        this.red = i4;
    }
}
