package y5;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import t6.B3;

/* loaded from: classes3.dex */
public final class j extends AppCompatImageView {
    public final o alpha;
    public ImageView.ScaleType purple;

    public j(Context context) {
        super(context, null, 0);
        this.alpha = new o(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.purple;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.purple = null;
        }
    }

    public o getAttacher() {
        return this.alpha;
    }

    public RectF getDisplayRect() {
        o oVar = this.alpha;
        oVar.bravo();
        Matrix charlie = oVar.charlie();
        if (oVar.f14139a.getDrawable() != null) {
            RectF rectF = oVar.f14144g;
            rectF.set(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
            charlie.mapRect(rectF);
            return rectF;
        }
        return null;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.alpha.e;
    }

    public float getMaximumScale() {
        return this.alpha.teal;
    }

    public float getMediumScale() {
        return this.alpha.silver;
    }

    public float getMinimumScale() {
        return this.alpha.red;
    }

    public float getScale() {
        return this.alpha.delta();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.alpha.f14152o;
    }

    public void setAllowParentInterceptOnEdge(boolean z2) {
        this.alpha.white = z2;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i10, int i11) {
        boolean frame = super.setFrame(i4, i5, i10, i11);
        if (frame) {
            this.alpha.foxtrot();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o oVar = this.alpha;
        if (oVar != null) {
            oVar.foxtrot();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        super.setImageResource(i4);
        o oVar = this.alpha;
        if (oVar != null) {
            oVar.foxtrot();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.alpha;
        if (oVar != null) {
            oVar.foxtrot();
        }
    }

    public void setMaximumScale(float f5) {
        o oVar = this.alpha;
        B3.alpha(oVar.red, oVar.silver, f5);
        oVar.teal = f5;
    }

    public void setMediumScale(float f5) {
        o oVar = this.alpha;
        B3.alpha(oVar.red, f5, oVar.teal);
        oVar.silver = f5;
    }

    public void setMinimumScale(float f5) {
        o oVar = this.alpha;
        B3.alpha(f5, oVar.silver, oVar.teal);
        oVar.red = f5;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.alpha.f14146i = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.alpha.f14140b.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.alpha.f14147j = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.alpha.getClass();
    }

    public void setOnOutsidePhotoTapListener(d dVar) {
        this.alpha.getClass();
    }

    public void setOnPhotoTapListener(e eVar) {
        this.alpha.getClass();
    }

    public void setOnScaleChangeListener(f fVar) {
        this.alpha.getClass();
    }

    public void setOnSingleFlingListener(g gVar) {
        this.alpha.getClass();
    }

    public void setOnViewDragListener(h hVar) {
        this.alpha.f14148k = hVar;
    }

    public void setOnViewTapListener(i iVar) {
        this.alpha.getClass();
    }

    public void setRotationBy(float f5) {
        o oVar = this.alpha;
        oVar.f14143f.postRotate(f5 % 360.0f);
        oVar.alpha();
    }

    public void setRotationTo(float f5) {
        o oVar = this.alpha;
        oVar.f14143f.setRotate(f5 % 360.0f);
        oVar.alpha();
    }

    public void setScale(float f5) {
        o oVar = this.alpha;
        j jVar = oVar.f14139a;
        oVar.echo(f5, jVar.getRight() / 2, jVar.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.alpha;
        if (oVar == null) {
            this.purple = scaleType;
            return;
        }
        oVar.getClass();
        if (scaleType != null) {
            if (p.alpha[scaleType.ordinal()] != 1) {
                if (scaleType != oVar.f14152o) {
                    oVar.f14152o = scaleType;
                    oVar.foxtrot();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Matrix scale type is not supported");
        }
    }

    public void setZoomTransitionDuration(int i4) {
        this.alpha.purple = i4;
    }

    public void setZoomable(boolean z2) {
        o oVar = this.alpha;
        oVar.f14151n = z2;
        oVar.foxtrot();
    }
}
