package V3;

import U3.h;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class a implements e {
    public final ImageView alpha;
    public final f purple;
    public Animatable red;
    public final /* synthetic */ int silver;

    public a(ImageView imageView, int i4) {
        this.silver = i4;
        Y3.f.charlie(imageView, "Argument must not be null");
        this.alpha = imageView;
        this.purple = new f(imageView);
    }

    @Override // R3.i
    public final void alpha() {
        Animatable animatable = this.red;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // R3.i
    public final void bravo() {
    }

    @Override // R3.i
    public final void charlie() {
        Animatable animatable = this.red;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // V3.e
    public final void delta(h hVar) {
        this.purple.bravo.remove(hVar);
    }

    @Override // V3.e
    public final void echo(U3.c cVar) {
        this.alpha.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public void foxtrot(Bitmap bitmap) {
        this.alpha.setImageBitmap(bitmap);
    }

    @Override // V3.e
    public final void golf(Object obj) {
        hotel(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.red = animatable;
            animatable.start();
            return;
        }
        this.red = null;
    }

    public void hotel(Object obj) {
        switch (this.silver) {
            case 0:
                foxtrot((Bitmap) obj);
                return;
            default:
                this.alpha.setImageDrawable((Drawable) obj);
                return;
        }
    }

    @Override // V3.e
    public final void juliet(Drawable drawable) {
        hotel(null);
        this.red = null;
        this.alpha.setImageDrawable(drawable);
    }

    @Override // V3.e
    public final void kilo(Drawable drawable) {
        hotel(null);
        this.red = null;
        this.alpha.setImageDrawable(drawable);
    }

    @Override // V3.e
    public final U3.c lima() {
        Object tag = this.alpha.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof U3.c) {
                return (U3.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // V3.e
    public final void mike(Drawable drawable) {
        f fVar = this.purple;
        ViewTreeObserver viewTreeObserver = fVar.alpha.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.charlie);
        }
        fVar.charlie = null;
        fVar.bravo.clear();
        Animatable animatable = this.red;
        if (animatable != null) {
            animatable.stop();
        }
        hotel(null);
        this.red = null;
        this.alpha.setImageDrawable(drawable);
    }

    @Override // V3.e
    public final void november(h hVar) {
        int i4;
        f fVar = this.purple;
        ImageView imageView = fVar.alpha;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i5 = 0;
        if (layoutParams != null) {
            i4 = layoutParams.width;
        } else {
            i4 = 0;
        }
        int alpha = fVar.alpha(imageView.getWidth(), i4, paddingRight);
        ImageView imageView2 = fVar.alpha;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 != null) {
            i5 = layoutParams2.height;
        }
        int alpha2 = fVar.alpha(imageView2.getHeight(), i5, paddingBottom);
        if ((alpha <= 0 && alpha != Integer.MIN_VALUE) || (alpha2 <= 0 && alpha2 != Integer.MIN_VALUE)) {
            ArrayList arrayList = fVar.bravo;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            if (fVar.charlie == null) {
                ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
                b bVar = new b(fVar);
                fVar.charlie = bVar;
                viewTreeObserver.addOnPreDrawListener(bVar);
                return;
            }
            return;
        }
        hVar.kilo(alpha, alpha2);
    }

    public final String toString() {
        return "Target for: " + this.alpha;
    }
}
