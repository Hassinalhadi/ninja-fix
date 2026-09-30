package a5;

import Y1.ag;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import bx.InterfaceC0775m;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Xd.n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ j(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return R0.a((DiComponent) this.purple, (ag) this.red, (InterfaceC0775m) obj, (Y1.l) obj2, (InterfaceC0581m) obj3, ((Integer) obj4).intValue());
            case 1:
                N2.aa SubcomposeAsyncImage = (N2.aa) obj;
                N2.e it = (N2.e) obj2;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
                int intValue = ((Integer) obj4).intValue();
                Intrinsics.echo(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.echo(it, "it");
                if ((intValue & 129) != 128) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    ax axVar = (ax) this.red;
                    boolean golf = c0585q.golf(axVar);
                    String str = (String) this.purple;
                    boolean golf2 = golf | c0585q.golf(str);
                    Object jade = c0585q.jade();
                    if (golf2 || jade == C0580l.alpha) {
                        jade = new cc.n(str, axVar, null);
                        c0585q.f(jade);
                    }
                    C0564b.foxtrot((Xd.l) jade, c0585q, str);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                return com.checkout.address.ui.navigation.a.a((ag) this.red, (AddressEditViewModel) this.purple, (InterfaceC0775m) obj, (Y1.l) obj2, (InterfaceC0581m) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ j(ag agVar, AddressEditViewModel addressEditViewModel) {
        this.alpha = 2;
        this.red = agVar;
        this.purple = addressEditViewModel;
    }
}
