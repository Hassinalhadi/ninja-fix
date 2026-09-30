package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class n extends Drawable.ConstantState {
    public int alpha;
    public m bravo;
    public ColorStateList charlie;
    public PorterDuff.Mode delta;
    public boolean echo;
    public Bitmap foxtrot;
    public ColorStateList golf;
    public PorterDuff.Mode hotel;
    public int india;
    public boolean juliet;
    public boolean kilo;
    public Paint lima;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.alpha;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
