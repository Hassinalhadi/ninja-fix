package a5;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.K1;
import com.checkout.components.ui.model.TextLabelViewItem;
import kotlin.Unit;
import xb.AbstractC3318b;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ b(long j5, Object obj, int i4, int i5) {
        this.alpha = i5;
        this.purple = j5;
        this.silver = obj;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return K1.a(this.purple, (TextLabelViewItem) this.silver, this.red, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                AbstractC3318b.hotel(C0564b.cyan(this.red | 1), this.purple, (T.s) this.silver, (InterfaceC0581m) obj);
                return Unit.INSTANCE;
        }
    }
}
