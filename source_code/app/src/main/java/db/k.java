package db;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends Lambda implements Xd.n {
    public final /* synthetic */ List alpha;
    public final /* synthetic */ C1602b purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, C1602b c1602b, boolean z2, int i4) {
        super(4);
        this.alpha = list;
        this.purple = c1602b;
        this.red = z2;
        this.silver = i4;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        String str;
        int i5;
        int i10;
        InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
        int intValue = ((Number) obj2).intValue();
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | intValue2;
        } else {
            i4 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((C0585q) interfaceC0581m).echo(intValue)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 147) == 146) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        C1603c c1603c = (C1603c) this.alpha.get(intValue);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.purple(-71372727);
        if (this.red) {
            str = (intValue + 1) + ExpiryDateConstantsKt.EXPIRY_DATE_SEPARATOR + this.silver;
        } else {
            str = null;
        }
        l.alpha(c1603c, this.purple, str, c0585q2, 0, 0);
        c0585q2.quebec(false);
        return Unit.INSTANCE;
    }
}
