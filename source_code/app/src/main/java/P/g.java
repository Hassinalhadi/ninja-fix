package P;

import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0563a0;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g implements InterfaceC0563a0 {
    public final Set alpha;
    public final J.e purple = new J.e(new C0565b0[16]);

    public g(Set set) {
        this.alpha = set;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        J.e eVar = this.purple;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            InterfaceC0563a0 interfaceC0563a0 = ((C0565b0) objArr[i5]).alpha;
            this.alpha.remove(interfaceC0563a0);
            interfaceC0563a0.delta();
        }
    }
}
