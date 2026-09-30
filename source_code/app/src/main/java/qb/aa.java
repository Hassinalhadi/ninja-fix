package qb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa {
    public final String alpha;

    public aa(String title) {
        Intrinsics.echo(title, "title");
        this.alpha = title;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aa) {
                if (!Intrinsics.areEqual(this.alpha, ((aa) obj).alpha) || !Intrinsics.areEqual("Scan the QR code at the store to receive orders", "Scan the QR code at the store to receive orders") || !Intrinsics.areEqual("Scan QR Code", "Scan QR Code")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.alpha.hashCode() * 31) + 589030002) * 31) - 1626071511;
    }

    public final String toString() {
        return P0.gold(new StringBuilder("ScanQrCardData(title="), this.alpha, ", message=Scan the QR code at the store to receive orders, buttonText=Scan QR Code)");
    }
}
