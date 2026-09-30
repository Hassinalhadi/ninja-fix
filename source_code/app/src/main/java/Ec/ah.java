package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ShiftSummary;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ah implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftSummary purple;

    public /* synthetic */ ah(ShiftSummary shiftSummary, int i4, int i5) {
        this.alpha = i5;
        this.purple = shiftSummary;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                ap.mike(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ap.bravo(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                ap.papa(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 3:
                ap.charlie(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                ap.november(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }
}
