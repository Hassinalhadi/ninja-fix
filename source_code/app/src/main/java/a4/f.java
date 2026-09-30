package a4;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class f {
    public final Uri alpha;
    public final Bitmap bravo;
    public final int charlie;
    public final int delta;
    public final boolean echo;
    public final boolean foxtrot;
    public final Exception golf;

    public f(Uri uri, Bitmap bitmap, int i4, int i5, boolean z2, boolean z10) {
        this.alpha = uri;
        this.bravo = bitmap;
        this.charlie = i4;
        this.delta = i5;
        this.echo = z2;
        this.foxtrot = z10;
        this.golf = null;
    }

    public f(Uri uri, Exception exc) {
        this.alpha = uri;
        this.bravo = null;
        this.charlie = 0;
        this.delta = 0;
        this.golf = exc;
    }
}
