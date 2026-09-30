package k4;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.CardComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CardComponent purple;
    public final /* synthetic */ int red;

    public /* synthetic */ b(CardComponent cardComponent, int i4, int i5) {
        this.alpha = i5;
        this.purple = cardComponent;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                return CardComponent.juliet(this.purple, this.red, interfaceC0581m, intValue);
            default:
                return CardComponent.india(this.purple, this.red, interfaceC0581m, intValue);
        }
    }
}
