package androidx.cardview.widget;

import J2.e;
import U8.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class CardView extends FrameLayout {
    public static final int[] white = {R.attr.colorBackground};
    public static final a yellow = new a(18);
    public boolean alpha;
    public boolean purple;
    public final Rect red;
    public final Rect silver;
    public final e teal;

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, delivery.samurai.android.R.attr.cardViewStyle);
    }

    public static /* synthetic */ void alpha(CardView cardView, int i4, int i5, int i10, int i11) {
        super.setPadding(i4, i5, i10, i11);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((bu.a) ((Drawable) this.teal.purple)).hotel;
    }

    public float getCardElevation() {
        return ((CardView) this.teal.red).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.red.bottom;
    }

    public int getContentPaddingLeft() {
        return this.red.left;
    }

    public int getContentPaddingRight() {
        return this.red.right;
    }

    public int getContentPaddingTop() {
        return this.red.top;
    }

    public float getMaxCardElevation() {
        return ((bu.a) ((Drawable) this.teal.purple)).echo;
    }

    public boolean getPreventCornerOverlap() {
        return this.purple;
    }

    public float getRadius() {
        return ((bu.a) ((Drawable) this.teal.purple)).alpha;
    }

    public boolean getUseCompatPadding() {
        return this.alpha;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    public void setCardBackgroundColor(int i4) {
        ColorStateList valueOf = ColorStateList.valueOf(i4);
        bu.a aVar = (bu.a) ((Drawable) this.teal.purple);
        if (valueOf == null) {
            aVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        aVar.hotel = valueOf;
        aVar.bravo.setColor(valueOf.getColorForState(aVar.getState(), aVar.hotel.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f5) {
        ((CardView) this.teal.red).setElevation(f5);
    }

    public void setMaxCardElevation(float f5) {
        yellow.india(this.teal, f5);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i5, int i10, int i11) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i4, int i5, int i10, int i11) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.purple) {
            this.purple = z2;
            a aVar = yellow;
            e eVar = this.teal;
            aVar.india(eVar, ((bu.a) ((Drawable) eVar.purple)).echo);
        }
    }

    public void setRadius(float f5) {
        bu.a aVar = (bu.a) ((Drawable) this.teal.purple);
        if (f5 == aVar.alpha) {
            return;
        }
        aVar.alpha = f5;
        aVar.bravo(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.alpha != z2) {
            this.alpha = z2;
            a aVar = yellow;
            e eVar = this.teal;
            aVar.india(eVar, ((bu.a) ((Drawable) eVar.purple)).echo);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.red = rect;
        this.silver = new Rect();
        e eVar = new e(this);
        this.teal = eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt.a.alpha, i4, delivery.samurai.android.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(white);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(delivery.samurai.android.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(delivery.samurai.android.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.alpha = obtainStyledAttributes.getBoolean(7, false);
        this.purple = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        a aVar = yellow;
        bu.a aVar2 = new bu.a(valueOf, dimension);
        eVar.purple = aVar2;
        setBackgroundDrawable(aVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar.india(eVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        bu.a aVar = (bu.a) ((Drawable) this.teal.purple);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.hotel = colorStateList;
        aVar.bravo.setColor(colorStateList.getColorForState(aVar.getState(), aVar.hotel.getDefaultColor()));
        aVar.invalidateSelf();
    }
}
