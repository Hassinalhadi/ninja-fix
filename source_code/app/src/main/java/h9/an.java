package h9;

import com.checkout.components.wallet.wrapper.GooglePayViewModel;
import com.incognia.internal.fVX;
import com.incognia.internal.toy;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class an implements toy, ah.a {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ an(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    @Override // com.incognia.internal.toy
    public void b(String str) {
        fVX.b((fVX) this.alpha, (Function1) this.purple, str);
    }

    @Override // ah.a
    public void charlie(Object obj) {
        GooglePayViewModel.alpha((GooglePayViewModel) this.alpha, (Xd.l) this.purple, (J6.a) obj);
    }
}
