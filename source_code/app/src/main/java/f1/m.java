package f1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import s6.R5;

/* loaded from: classes3.dex */
public final class m {
    public final Bundle alpha;
    public IconCompat bravo;
    public final boolean charlie;
    public final boolean delta;
    public final int echo;
    public final CharSequence foxtrot;
    public final PendingIntent golf;

    public m(int i4, String str, PendingIntent pendingIntent) {
        IconCompat bravo;
        if (i4 == 0) {
            bravo = null;
        } else {
            bravo = IconCompat.bravo(i4, "");
        }
        Bundle bundle = new Bundle();
        this.delta = true;
        this.bravo = bravo;
        if (bravo != null) {
            int i5 = bravo.alpha;
            if ((i5 == -1 ? R5.charlie(bravo.bravo) : i5) == 2) {
                this.echo = bravo.charlie();
            }
        }
        this.foxtrot = s.bravo(str);
        this.golf = pendingIntent;
        this.alpha = bundle;
        this.charlie = true;
        this.delta = true;
    }
}
