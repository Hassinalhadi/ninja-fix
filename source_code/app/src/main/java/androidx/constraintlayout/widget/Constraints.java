package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC0804c;
import c1.AbstractC0820s;
import c1.C0802a;
import c1.C0806e;
import c1.C0810i;
import c1.C0811j;
import c1.C0815n;
import c1.C0816o;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Constraints extends ViewGroup {
    public C0815n alpha;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.o, android.view.ViewGroup$LayoutParams, c1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? c0806e = new C0806e();
        c0806e.f3474i = 1.0f;
        c0806e.f3475j = false;
        c0806e.f3476k = 0.0f;
        c0806e.f3477l = 0.0f;
        c0806e.f3478m = 0.0f;
        c0806e.f3479n = 0.0f;
        c0806e.f3480o = 1.0f;
        c0806e.f3481p = 1.0f;
        c0806e.f3482q = 0.0f;
        c0806e.f3483r = 0.0f;
        c0806e.f3484s = 0.0f;
        c0806e.f3485t = 0.0f;
        c0806e.f3486u = 0.0f;
        return c0806e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.o, android.view.ViewGroup$LayoutParams, c1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? c0806e = new C0806e(context, attributeSet);
        c0806e.f3474i = 1.0f;
        c0806e.f3475j = false;
        c0806e.f3476k = 0.0f;
        c0806e.f3477l = 0.0f;
        c0806e.f3478m = 0.0f;
        c0806e.f3479n = 0.0f;
        c0806e.f3480o = 1.0f;
        c0806e.f3481p = 1.0f;
        c0806e.f3482q = 0.0f;
        c0806e.f3483r = 0.0f;
        c0806e.f3484s = 0.0f;
        c0806e.f3485t = 0.0f;
        c0806e.f3486u = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.delta);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 15) {
                c0806e.f3474i = obtainStyledAttributes.getFloat(index, c0806e.f3474i);
            } else if (index == 28) {
                c0806e.f3476k = obtainStyledAttributes.getFloat(index, c0806e.f3476k);
                c0806e.f3475j = true;
            } else if (index == 23) {
                c0806e.f3478m = obtainStyledAttributes.getFloat(index, c0806e.f3478m);
            } else if (index == 24) {
                c0806e.f3479n = obtainStyledAttributes.getFloat(index, c0806e.f3479n);
            } else if (index == 22) {
                c0806e.f3477l = obtainStyledAttributes.getFloat(index, c0806e.f3477l);
            } else if (index == 20) {
                c0806e.f3480o = obtainStyledAttributes.getFloat(index, c0806e.f3480o);
            } else if (index == 21) {
                c0806e.f3481p = obtainStyledAttributes.getFloat(index, c0806e.f3481p);
            } else if (index == 16) {
                c0806e.f3482q = obtainStyledAttributes.getFloat(index, c0806e.f3482q);
            } else if (index == 17) {
                c0806e.f3483r = obtainStyledAttributes.getFloat(index, c0806e.f3483r);
            } else if (index == 18) {
                c0806e.f3484s = obtainStyledAttributes.getFloat(index, c0806e.f3484s);
            } else if (index == 19) {
                c0806e.f3485t = obtainStyledAttributes.getFloat(index, c0806e.f3485t);
            } else if (index == 27) {
                c0806e.f3486u = obtainStyledAttributes.getFloat(index, c0806e.f3486u);
            }
        }
        obtainStyledAttributes.recycle();
        return c0806e;
    }

    public C0815n getConstraintSet() {
        if (this.alpha == null) {
            this.alpha = new C0815n();
        }
        C0815n c0815n = this.alpha;
        c0815n.getClass();
        int childCount = getChildCount();
        HashMap hashMap = c0815n.charlie;
        hashMap.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0816o c0816o = (C0816o) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c0815n.bravo && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new C0810i());
            }
            C0810i c0810i = (C0810i) hashMap.get(Integer.valueOf(id2));
            if (c0810i != null) {
                if (childAt instanceof AbstractC0804c) {
                    AbstractC0804c abstractC0804c = (AbstractC0804c) childAt;
                    c0810i.charlie(id2, c0816o);
                    if (abstractC0804c instanceof C0802a) {
                        C0811j c0811j = c0810i.delta;
                        c0811j.yellow = 1;
                        C0802a c0802a = (C0802a) abstractC0804c;
                        c0811j.teal = c0802a.getType();
                        c0811j.f3468a = c0802a.getReferencedIds();
                        c0811j.white = c0802a.getMargin();
                    }
                }
                c0810i.charlie(id2, c0816o);
            }
        }
        return this.alpha;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0806e(layoutParams);
    }
}
