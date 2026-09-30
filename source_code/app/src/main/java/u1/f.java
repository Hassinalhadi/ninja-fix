package u1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes3.dex */
public final class f implements g {
    public final InputContentInfo alpha;

    public f(Object obj) {
        this.alpha = (InputContentInfo) obj;
    }

    @Override // u1.g
    public final ClipDescription alpha() {
        return this.alpha.getDescription();
    }

    @Override // u1.g
    public final Uri delta() {
        return this.alpha.getContentUri();
    }

    @Override // u1.g
    public final void foxtrot() {
        this.alpha.requestPermission();
    }

    @Override // u1.g
    public final Uri juliet() {
        return this.alpha.getLinkUri();
    }

    @Override // u1.g
    public final Object oscar() {
        return this.alpha;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.alpha = new InputContentInfo(uri, clipDescription, uri2);
    }
}
