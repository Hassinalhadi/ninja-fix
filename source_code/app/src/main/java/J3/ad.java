package J3;

import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class ad implements s, ae {
    public final /* synthetic */ int alpha;
    public final ContentResolver purple;

    public /* synthetic */ ad(ContentResolver contentResolver, int i4) {
        this.alpha = i4;
        this.purple = contentResolver;
    }

    @Override // J3.ae
    public final com.bumptech.glide.load.data.e alpha(Uri uri) {
        switch (this.alpha) {
            case 0:
                return new com.bumptech.glide.load.data.a(this.purple, uri, 0);
            default:
                return new com.bumptech.glide.load.data.b(1, uri, this.purple);
        }
    }

    @Override // J3.s
    public final r sierra(x xVar) {
        switch (this.alpha) {
            case 0:
                return new af(this);
            default:
                return new af(this);
        }
    }
}
