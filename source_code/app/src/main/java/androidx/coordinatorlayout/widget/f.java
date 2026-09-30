package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class f extends ViewGroup.MarginLayoutParams {
    public c alpha;
    public boolean bravo;
    public final int charlie;
    public final int delta;
    public final int echo;
    public final int foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public int juliet;
    public View kilo;
    public View lima;
    public boolean mike;
    public boolean november;
    public boolean oscar;
    public boolean papa;
    public final Rect quebec;
    public Object romeo;

    public f() {
        super(-2, -2);
        this.bravo = false;
        this.charlie = 0;
        this.delta = 0;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = 0;
        this.hotel = 0;
        this.quebec = new Rect();
    }

    public final boolean alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return this.oscar;
        }
        return this.november;
    }

    public final void bravo(c cVar) {
        c cVar2 = this.alpha;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.onDetachedFromLayoutParams();
            }
            this.alpha = cVar;
            this.romeo = null;
            this.bravo = true;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bravo = false;
        this.charlie = 0;
        this.delta = 0;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = 0;
        this.hotel = 0;
        this.quebec = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d1.a.bravo);
        this.charlie = obtainStyledAttributes.getInteger(0, 0);
        this.foxtrot = obtainStyledAttributes.getResourceId(1, -1);
        this.delta = obtainStyledAttributes.getInteger(2, 0);
        this.echo = obtainStyledAttributes.getInteger(6, -1);
        this.golf = obtainStyledAttributes.getInt(5, 0);
        this.hotel = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.bravo = hasValue;
        if (hasValue) {
            this.alpha = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        c cVar = this.alpha;
        if (cVar != null) {
            cVar.onAttachedToLayoutParams(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.bravo = false;
        this.charlie = 0;
        this.delta = 0;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = 0;
        this.hotel = 0;
        this.quebec = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.bravo = false;
        this.charlie = 0;
        this.delta = 0;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = 0;
        this.hotel = 0;
        this.quebec = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.bravo = false;
        this.charlie = 0;
        this.delta = 0;
        this.echo = -1;
        this.foxtrot = -1;
        this.golf = 0;
        this.hotel = 0;
        this.quebec = new Rect();
    }
}
