package k5;

import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.view.RotateIconViewKt;
import kotlin.Unit;
import s.AbstractC2534m;

/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2012e implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ int silver;

    public /* synthetic */ C2012e(int i4, int i5, int i10, long j5) {
        this.alpha = i10;
        this.purple = i4;
        this.red = j5;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                long j5 = this.red;
                int i4 = this.silver;
                return RotateIconViewKt.bravo(this.purple, j5, i4, (InterfaceC0581m) obj, intValue);
            case 1:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                AbstractC2534m.bravo(this.purple, this.red, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                AbstractC2534m.bravo(this.purple, this.red, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
