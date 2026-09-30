package P3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class b extends Drawable.ConstantState {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.alpha) {
            case 2:
                return ((Drawable.ConstantState) this.bravo).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.alpha) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return ((Drawable.ConstantState) this.bravo).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.alpha) {
            case 0:
                return new c(this);
            case 1:
                return (X6.a) this.bravo;
            default:
                androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.bravo).newDrawable();
                eVar.alpha = newDrawable;
                newDrawable.setCallback(eVar.white);
                return eVar;
        }
    }

    public b(X6.a aVar) {
        this.alpha = 1;
        this.bravo = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.alpha) {
            case 0:
                return new c(this);
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.bravo).newDrawable(resources);
                eVar.alpha = newDrawable;
                newDrawable.setCallback(eVar.white);
                return eVar;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.alpha) {
            case 2:
                androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.bravo).newDrawable(resources, theme);
                eVar.alpha = newDrawable;
                newDrawable.setCallback(eVar.white);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
