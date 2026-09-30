package k5;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import g0.C1726f;
import kotlin.Unit;

/* renamed from: k5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2013f implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ TopAppBarViewStyle red;
    public final /* synthetic */ C1726f silver;

    public /* synthetic */ C2013f(String str, TopAppBarViewStyle topAppBarViewStyle, C1726f c1726f, int i4) {
        this.alpha = i4;
        this.purple = str;
        this.red = topAppBarViewStyle;
        this.silver = c1726f;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit ScreenHeaderView$lambda$7$lambda$6$lambda$5;
        Unit ScreenHeaderView$lambda$10$lambda$9$lambda$8;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                ScreenHeaderView$lambda$7$lambda$6$lambda$5 = ScreenHeaderViewKt.ScreenHeaderView$lambda$7$lambda$6$lambda$5(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return ScreenHeaderView$lambda$7$lambda$6$lambda$5;
            default:
                ScreenHeaderView$lambda$10$lambda$9$lambda$8 = ScreenHeaderViewKt.ScreenHeaderView$lambda$10$lambda$9$lambda$8(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return ScreenHeaderView$lambda$10$lambda$9$lambda$8;
        }
    }
}
