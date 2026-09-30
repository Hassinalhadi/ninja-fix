package R2;

import Jb.C0201i;
import O2.q;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.p;
import java.nio.ByteBuffer;
import t6.AbstractC2977c3;

/* loaded from: classes3.dex */
public final class c implements g {
    public final /* synthetic */ int alpha;
    public final X2.k bravo;
    public final Object charlie;

    public /* synthetic */ c(Object obj, X2.k kVar, int i4) {
        this.alpha = i4;
        this.charlie = obj;
        this.bravo = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Tf.m, Tf.k, java.lang.Object] */
    @Override // R2.g
    public final Object alpha(Nd.c cVar) {
        X2.k kVar = this.bravo;
        boolean z2 = false;
        Object obj = this.charlie;
        switch (this.alpha) {
            case 0:
                return new d(new BitmapDrawable(kVar.alpha.getResources(), (Bitmap) obj), false, O2.f.purple);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    return new m(new q(obj2, new C0201i(kVar.alpha, 3), null), null, O2.f.purple);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = a3.h.alpha;
                if ((drawable instanceof VectorDrawable) || (drawable instanceof p)) {
                    z2 = true;
                }
                if (z2) {
                    drawable = new BitmapDrawable(kVar.alpha.getResources(), AbstractC2977c3.bravo(drawable, kVar.bravo, kVar.delta, kVar.echo, kVar.foxtrot));
                }
                return new d(drawable, z2, O2.f.purple);
        }
    }
}
