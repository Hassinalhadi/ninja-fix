package f1;

import android.app.Notification;

/* loaded from: classes3.dex */
public final class q extends t {
    public CharSequence delta;

    @Override // f1.t
    public final void alpha(J2.n nVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) nVar.purple).setBigContentTitle(null).bigText(this.delta);
        if (this.charlie) {
            bigText.setSummaryText(this.bravo);
        }
    }

    @Override // f1.t
    public final String bravo() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
