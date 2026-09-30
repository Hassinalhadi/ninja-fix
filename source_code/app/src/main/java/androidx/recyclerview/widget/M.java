package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class M extends ViewGroup.MarginLayoutParams {
    public f0 alpha;
    public final Rect purple;
    public boolean red;
    public boolean silver;

    public M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.purple = new Rect();
        this.red = true;
        this.silver = false;
    }

    public M(int i4, int i5) {
        super(i4, i5);
        this.purple = new Rect();
        this.red = true;
        this.silver = false;
    }

    public M(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.purple = new Rect();
        this.red = true;
        this.silver = false;
    }

    public M(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.purple = new Rect();
        this.red = true;
        this.silver = false;
    }

    public M(M m4) {
        super((ViewGroup.LayoutParams) m4);
        this.purple = new Rect();
        this.red = true;
        this.silver = false;
    }
}
