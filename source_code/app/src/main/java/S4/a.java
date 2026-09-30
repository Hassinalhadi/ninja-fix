package S4;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.preview.OTPViewPreviewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;

    public /* synthetic */ a(int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = i4;
        this.red = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                return OTPViewPreviewKt.charlie(this.purple, this.red, interfaceC0581m, intValue);
            default:
                return OTPViewKt.echo(this.purple, this.red, interfaceC0581m, intValue);
        }
    }
}
