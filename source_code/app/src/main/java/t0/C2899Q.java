package t0;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2899Q extends Lambda implements Xd.l {
    public static final C2899Q purple = new C2899Q(2, 0);
    public static final C2899Q red = new C2899Q(2, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2899Q(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (!c0585q.magenta(intValue & 1, z2)) {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return Unit.INSTANCE;
        }
    }
}
