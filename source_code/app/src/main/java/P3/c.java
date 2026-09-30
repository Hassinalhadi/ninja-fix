package P3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1896a;
    public final b alpha;

    /* renamed from: b, reason: collision with root package name */
    public Paint f1897b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f1898c;
    public boolean purple;
    public boolean red;
    public boolean silver;
    public int white;
    public boolean teal = true;
    public final int yellow = -1;

    public c(b bVar) {
        this.alpha = bVar;
    }

    public final void alpha() {
        Y3.f.alpha("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.silver);
        h hVar = (h) this.alpha.bravo;
        if (hVar.alpha.lima.charlie == 1) {
            invalidateSelf();
            return;
        }
        if (!this.purple) {
            this.purple = true;
            if (!hVar.juliet) {
                ArrayList arrayList = hVar.charlie;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !hVar.foxtrot) {
                        hVar.foxtrot = true;
                        hVar.juliet = false;
                        hVar.alpha();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.silver) {
            return;
        }
        if (this.f1896a) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f1898c == null) {
                this.f1898c = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f1898c);
            this.f1896a = false;
        }
        h hVar = (h) this.alpha.bravo;
        e eVar = hVar.india;
        if (eVar != null) {
            bitmap = eVar.yellow;
        } else {
            bitmap = hVar.lima;
        }
        if (this.f1898c == null) {
            this.f1898c = new Rect();
        }
        Rect rect = this.f1898c;
        if (this.f1897b == null) {
            this.f1897b = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f1897b);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((h) this.alpha.bravo).papa;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((h) this.alpha.bravo).oscar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.purple;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1896a = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f1897b == null) {
            this.f1897b = new Paint(2);
        }
        this.f1897b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1897b == null) {
            this.f1897b = new Paint(2);
        }
        this.f1897b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Y3.f.alpha("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.silver);
        this.teal = z2;
        if (!z2) {
            this.purple = false;
            h hVar = (h) this.alpha.bravo;
            ArrayList arrayList = hVar.charlie;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.foxtrot = false;
            }
        } else if (this.red) {
            alpha();
        }
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.red = true;
        this.white = 0;
        if (this.teal) {
            alpha();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.red = false;
        this.purple = false;
        h hVar = (h) this.alpha.bravo;
        ArrayList arrayList = hVar.charlie;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.foxtrot = false;
        }
    }
}
