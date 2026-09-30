package P3;

import E3.m;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.w;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class d implements m {
    public final m bravo;

    public d(m mVar) {
        Y3.f.charlie(mVar, "Argument must not be null");
        this.bravo = mVar;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        this.bravo.alpha(messageDigest);
    }

    @Override // E3.m
    public final w bravo(Context context, w wVar, int i4, int i5) {
        c cVar = (c) wVar.get();
        w cVar2 = new com.bumptech.glide.load.resource.bitmap.c(com.bumptech.glide.b.alpha(context).alpha, ((h) cVar.alpha.bravo).lima);
        m mVar = this.bravo;
        w bravo = mVar.bravo(context, cVar2, i4, i5);
        if (!cVar2.equals(bravo)) {
            cVar2.bravo();
        }
        ((h) cVar.alpha.bravo).charlie(mVar, (Bitmap) bravo.get());
        return wVar;
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.bravo.equals(((d) obj).bravo);
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        return this.bravo.hashCode();
    }
}
