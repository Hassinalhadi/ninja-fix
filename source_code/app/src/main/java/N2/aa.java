package N2;

import androidx.compose.foundation.layout.InterfaceC0550p;
import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC2392k;

/* loaded from: classes3.dex */
public final class aa implements InterfaceC0550p {
    public final InterfaceC0550p alpha;
    public final n bravo;
    public final String charlie;
    public final T.f delta;
    public final InterfaceC2392k echo;

    public aa(InterfaceC0550p interfaceC0550p, n nVar, String str, T.f fVar, InterfaceC2392k interfaceC2392k) {
        this.alpha = interfaceC0550p;
        this.bravo = nVar;
        this.charlie = str;
        this.delta = fVar;
        this.echo = interfaceC2392k;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0550p
    public final T.s alpha(T.s sVar, T.k kVar) {
        return this.alpha.alpha(sVar, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aa) {
            aa aaVar = (aa) obj;
            if (Intrinsics.areEqual(this.alpha, aaVar.alpha) && Intrinsics.areEqual(this.bravo, aaVar.bravo) && Intrinsics.areEqual(this.charlie, aaVar.charlie) && Intrinsics.areEqual(this.delta, aaVar.delta) && Intrinsics.areEqual(this.echo, aaVar.echo) && Float.compare(1.0f, 1.0f) == 0 && Intrinsics.areEqual(null, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((Float.floatToIntBits(1.0f) + ((this.echo.hashCode() + ((this.delta.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 961) + 1231;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.alpha + ", painter=" + this.bravo + ", contentDescription=" + this.charlie + ", alignment=" + this.delta + ", contentScale=" + this.echo + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
