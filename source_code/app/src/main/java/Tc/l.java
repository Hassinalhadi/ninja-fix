package Tc;

import com.app.network.network.models.Wallet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends m {
    public final Wallet alpha;
    public final List bravo;
    public final boolean charlie;
    public final Float delta;

    public l(Wallet wallet, List transactions, boolean z2, Float f5) {
        Intrinsics.echo(wallet, "wallet");
        Intrinsics.echo(transactions, "transactions");
        this.alpha = wallet;
        this.bravo = transactions;
        this.charlie = z2;
        this.delta = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Intrinsics.areEqual(this.alpha, lVar.alpha) && Intrinsics.areEqual(this.bravo, lVar.bravo) && this.charlie == lVar.charlie && Intrinsics.areEqual(this.delta, lVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int golf = com.google.android.material.datepicker.j.golf(this.alpha.hashCode() * 31, 31, this.bravo);
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (golf + i4) * 31;
        Float f5 = this.delta;
        if (f5 == null) {
            hashCode = 0;
        } else {
            hashCode = f5.hashCode();
        }
        return i5 + hashCode;
    }

    public final String toString() {
        return "Success(wallet=" + this.alpha + ", transactions=" + this.bravo + ", hasMore=" + this.charlie + ", unsettledAmount=" + this.delta + ")";
    }
}
