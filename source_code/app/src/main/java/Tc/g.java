package Tc;

import androidx.appcompat.widget.P0;
import com.app.network.network.models.PaymentSession;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class g extends i {
    public final long alpha;
    public final PaymentSession bravo;
    public final String charlie;
    public final String delta;

    public g(long j5, PaymentSession paymentSession, String str, String str2) {
        Intrinsics.echo(paymentSession, "paymentSession");
        this.alpha = j5;
        this.bravo = paymentSession;
        this.charlie = str;
        this.delta = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.alpha == gVar.alpha && Intrinsics.areEqual(this.bravo, gVar.bravo) && Intrinsics.areEqual(this.charlie, gVar.charlie) && Intrinsics.areEqual(this.delta, gVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return this.delta.hashCode() + AbstractC2327c.sierra((this.bravo.hashCode() + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31, 31, this.charlie);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentReady(settlementId=");
        sb2.append(this.alpha);
        sb2.append(", paymentSession=");
        sb2.append(this.bravo);
        sb2.append(", outstandingAmount=");
        sb2.append(this.charlie);
        sb2.append(", currencySymbol=");
        return P0.gold(sb2, this.delta, ")");
    }
}
