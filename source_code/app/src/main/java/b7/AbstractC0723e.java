package b7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import delivery.samurai.android.R;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;

/* renamed from: b7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0723e {
    public int alpha;
    public int bravo;
    public float charlie;
    public boolean delta;
    public int[] echo;
    public int foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public int juliet;
    public int kilo;
    public int lima;
    public int mike;
    public float november;

    public AbstractC0723e(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.echo = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = L6.a.delta;
        com.google.android.material.internal.z.alpha(context, attributeSet, i4, i5);
        com.google.android.material.internal.z.bravo(context, attributeSet, iArr, i4, i5, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        this.alpha = AbstractC2719n0.charlie(context, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i10 = peekValue.type;
            if (i10 == 5) {
                this.bravo = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.alpha / 2);
                this.delta = false;
            } else if (i10 == 6) {
                this.charlie = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.delta = true;
            }
        }
        this.golf = obtainStyledAttributes.getInt(6, 0);
        this.hotel = obtainStyledAttributes.getInt(1, 0);
        this.india = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.juliet = Math.abs(obtainStyledAttributes.getDimensionPixelSize(14, abs));
        this.kilo = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, abs));
        this.lima = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.mike = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.november = obtainStyledAttributes.getFloat(2, 1.0f);
        if (!obtainStyledAttributes.hasValue(3)) {
            this.echo = new int[]{AbstractC2815x7.delta(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            this.echo = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            this.echo = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.foxtrot = obtainStyledAttributes.getColor(8, -1);
        } else {
            this.foxtrot = this.echo[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f5 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.foxtrot = AbstractC2815x7.bravo(this.foxtrot, (int) (f5 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public final int alpha() {
        if (this.delta) {
            return (int) (this.alpha * this.charlie);
        }
        return this.bravo;
    }

    public final boolean bravo(boolean z2) {
        if (this.lima > 0) {
            if (z2 || this.kilo <= 0) {
                if (z2 && this.juliet > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean charlie() {
        if (this.delta && this.charlie == 0.5f) {
            return true;
        }
        return false;
    }

    public void delta() {
        if (this.india >= 0) {
        } else {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
