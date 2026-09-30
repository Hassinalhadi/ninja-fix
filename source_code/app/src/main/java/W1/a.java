package W1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class a {
    public final IntentFilter alpha;
    public final BroadcastReceiver bravo;
    public boolean charlie;
    public boolean delta;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.alpha = intentFilter;
        this.bravo = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.bravo);
        sb2.append(" filter=");
        sb2.append(this.alpha);
        if (this.delta) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
