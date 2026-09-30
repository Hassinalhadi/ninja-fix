package N3;

import G3.g;
import P3.e;
import P3.h;
import Y3.f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.m;

/* loaded from: classes3.dex */
public final class b implements w, t {
    public final Drawable alpha;
    public final /* synthetic */ int purple;

    public b(Drawable drawable, int i4) {
        this.purple = i4;
        f.charlie(drawable, "Argument must not be null");
        this.alpha = drawable;
    }

    private final void charlie() {
    }

    @Override // com.bumptech.glide.load.engine.t
    public void alpha() {
        switch (this.purple) {
            case 1:
                ((h) ((P3.c) this.alpha).alpha.bravo).lima.prepareToDraw();
                return;
            default:
                Drawable drawable = this.alpha;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof P3.c) {
                        ((h) ((P3.c) drawable).alpha.bravo).lima.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void bravo() {
        g gVar;
        g gVar2;
        g gVar3;
        switch (this.purple) {
            case 0:
                return;
            default:
                P3.c cVar = (P3.c) this.alpha;
                cVar.stop();
                cVar.silver = true;
                h hVar = (h) cVar.alpha.bravo;
                hVar.charlie.clear();
                Bitmap bitmap = hVar.lima;
                if (bitmap != null) {
                    hVar.echo.delta(bitmap);
                    hVar.lima = null;
                }
                hVar.foxtrot = false;
                e eVar = hVar.india;
                m mVar = hVar.delta;
                if (eVar != null) {
                    mVar.india(eVar);
                    hVar.india = null;
                }
                e eVar2 = hVar.kilo;
                if (eVar2 != null) {
                    mVar.india(eVar2);
                    hVar.kilo = null;
                }
                e eVar3 = hVar.mike;
                if (eVar3 != null) {
                    mVar.india(eVar3);
                    hVar.mike = null;
                }
                D3.d dVar = hVar.alpha;
                dVar.lima = null;
                byte[] bArr = dVar.india;
                J2.c cVar2 = dVar.charlie;
                if (bArr != null && (gVar3 = (g) cVar2.red) != null) {
                    gVar3.juliet(bArr);
                }
                int[] iArr = dVar.juliet;
                if (iArr != null && (gVar2 = (g) cVar2.red) != null) {
                    gVar2.juliet(iArr);
                }
                Bitmap bitmap2 = dVar.mike;
                if (bitmap2 != null) {
                    ((G3.b) cVar2.purple).delta(bitmap2);
                }
                dVar.mike = null;
                dVar.delta = null;
                dVar.sierra = null;
                byte[] bArr2 = dVar.echo;
                if (bArr2 != null && (gVar = (g) cVar2.red) != null) {
                    gVar.juliet(bArr2);
                }
                hVar.juliet = true;
                return;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Class delta() {
        switch (this.purple) {
            case 0:
                return this.alpha.getClass();
            default:
                return P3.c.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Object get() {
        Drawable drawable = this.alpha;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        return constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        switch (this.purple) {
            case 0:
                Drawable drawable = this.alpha;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((P3.c) this.alpha).alpha.bravo;
                D3.d dVar = hVar.alpha;
                return (dVar.juliet.length * 4) + dVar.delta.limit() + dVar.india.length + hVar.november;
        }
    }
}
