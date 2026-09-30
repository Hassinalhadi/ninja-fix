package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class ac extends ImageButton {
    public final C0480t alpha;
    public final ad purple;
    public boolean red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        T0.alpha(context);
        this.red = false;
        S0.alpha(getContext(), this);
        C0480t c0480t = new C0480t(this);
        this.alpha = c0480t;
        c0480t.delta(attributeSet, i4);
        ad adVar = new ad(this);
        this.purple = adVar;
        adVar.bravo(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.alpha();
        }
        ad adVar = this.purple;
        if (adVar != null) {
            adVar.alpha();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        U0 u02;
        ad adVar = this.purple;
        if (adVar == null || (u02 = adVar.bravo) == null) {
            return null;
        }
        return u02.alpha;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        U0 u02;
        ad adVar = this.purple;
        if (adVar == null || (u02 = adVar.bravo) == null) {
            return null;
        }
        return u02.bravo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(this.purple.alpha.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ad adVar = this.purple;
        if (adVar != null) {
            adVar.alpha();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ad adVar = this.purple;
        if (adVar != null && drawable != null && !this.red) {
            adVar.charlie = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (adVar != null) {
            adVar.alpha();
            if (!this.red) {
                ImageView imageView = adVar.alpha;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(adVar.charlie);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.red = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.purple.charlie(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ad adVar = this.purple;
        if (adVar != null) {
            adVar.alpha();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.alpha;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        ad adVar = this.purple;
        if (adVar != null) {
            if (adVar.bravo == null) {
                adVar.bravo = new Object();
            }
            U0 u02 = adVar.bravo;
            u02.alpha = colorStateList;
            u02.delta = true;
            adVar.alpha();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.appcompat.widget.U0] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ad adVar = this.purple;
        if (adVar != null) {
            if (adVar.bravo == null) {
                adVar.bravo = new Object();
            }
            U0 u02 = adVar.bravo;
            u02.bravo = mode;
            u02.charlie = true;
            adVar.alpha();
        }
    }
}
