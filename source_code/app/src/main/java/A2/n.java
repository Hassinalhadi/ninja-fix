package A2;

import android.app.Notification;

/* loaded from: classes3.dex */
public final class n {
    public final int alpha;
    public final int bravo;
    public final Notification charlie;

    public n(int i4, Notification notification, int i5) {
        this.alpha = i4;
        this.charlie = notification;
        this.bravo = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.alpha != nVar.alpha || this.bravo != nVar.bravo) {
            return false;
        }
        return this.charlie.equals(nVar.charlie);
    }

    public final int hashCode() {
        return this.charlie.hashCode() + (((this.alpha * 31) + this.bravo) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.alpha + ", mForegroundServiceType=" + this.bravo + ", mNotification=" + this.charlie + '}';
    }
}
