package a5;

import Y1.ag;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ DiComponent red;

    public /* synthetic */ l(ag agVar, DiComponent diComponent, int i4) {
        this.alpha = i4;
        this.purple = agVar;
        this.red = diComponent;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4 = this.alpha;
        Y1.l lVar = (Y1.l) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i4) {
            case 0:
                return R0.a(this.purple, this.red, lVar, interfaceC0581m, intValue);
            default:
                return AbstractC0979s0.a(this.purple, this.red, lVar, interfaceC0581m, intValue);
        }
    }
}
