package f1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import s6.R5;

/* loaded from: classes3.dex */
public final class p extends t {
    public IconCompat delta;
    public IconCompat echo;
    public boolean foxtrot;
    public String golf;

    @Override // f1.t
    public final void alpha(J2.n nVar) {
        Bitmap alpha;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) nVar.purple).setBigContentTitle(null);
        IconCompat iconCompat = this.delta;
        Context context = (Context) nVar.alpha;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                o.alpha(bigContentTitle, iconCompat.echo(context));
            } else {
                int i4 = iconCompat.alpha;
                if (i4 == -1) {
                    i4 = R5.charlie(iconCompat.bravo);
                }
                if (i4 == 1) {
                    IconCompat iconCompat2 = this.delta;
                    int i5 = iconCompat2.alpha;
                    if (i5 == -1) {
                        Object obj = iconCompat2.bravo;
                        if (obj instanceof Bitmap) {
                            alpha = (Bitmap) obj;
                        } else {
                            alpha = null;
                        }
                    } else if (i5 == 1) {
                        alpha = (Bitmap) iconCompat2.bravo;
                    } else if (i5 == 5) {
                        alpha = IconCompat.alpha((Bitmap) iconCompat2.bravo, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(alpha);
                }
            }
        }
        if (this.foxtrot) {
            IconCompat iconCompat3 = this.echo;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                n.alpha(bigContentTitle, iconCompat3.echo(context));
            }
        }
        if (this.charlie) {
            bigContentTitle.setSummaryText(this.bravo);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            o.charlie(bigContentTitle, false);
            o.bravo(bigContentTitle, this.golf);
        }
    }

    @Override // f1.t
    public final String bravo() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void charlie(Icon icon) {
        IconCompat bravo;
        PorterDuff.Mode mode = IconCompat.kilo;
        icon.getClass();
        int charlie = R5.charlie(icon);
        if (charlie != 2) {
            if (charlie != 4) {
                if (charlie != 6) {
                    bravo = new IconCompat(-1);
                    bravo.bravo = icon;
                } else {
                    Uri delta = R5.delta(icon);
                    delta.getClass();
                    String uri = delta.toString();
                    uri.getClass();
                    bravo = new IconCompat(6);
                    bravo.bravo = uri;
                }
            } else {
                Uri delta2 = R5.delta(icon);
                delta2.getClass();
                String uri2 = delta2.toString();
                uri2.getClass();
                bravo = new IconCompat(4);
                bravo.bravo = uri2;
            }
        } else {
            bravo = IconCompat.bravo(R5.alpha(icon), R5.bravo(icon));
        }
        this.delta = bravo;
    }
}
