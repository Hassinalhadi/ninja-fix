package J3;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class z implements s, Q3.a {
    public final Resources alpha;

    public /* synthetic */ z(Resources resources) {
        this.alpha = resources;
    }

    @Override // Q3.a
    public com.bumptech.glide.load.engine.w alpha(com.bumptech.glide.load.engine.w wVar, E3.i iVar) {
        if (wVar == null) {
            return null;
        }
        return new com.bumptech.glide.load.resource.bitmap.c(this.alpha, wVar);
    }

    @Override // J3.s
    public r sierra(x xVar) {
        return new b(this.alpha, xVar.bravo(Uri.class, InputStream.class));
    }
}
