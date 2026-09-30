package a5;

import android.content.Context;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.AbstractC0927b;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ BottomSheetWebViewState red;
    public final /* synthetic */ Context silver;
    public final /* synthetic */ int teal;

    public /* synthetic */ x(String str, BottomSheetWebViewState bottomSheetWebViewState, Context context, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = bottomSheetWebViewState;
        this.silver = context;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return AbstractC0927b.b(this.purple, this.red, this.silver, this.teal, (InterfaceC0581m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return AbstractC0927b.a(this.purple, this.red, this.silver, this.teal, (InterfaceC0581m) obj, intValue2);
        }
    }
}
