package c1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0804c extends View {
    public int[] alpha;
    public int purple;
    public Context red;
    public Z0.i silver;
    public String teal;
    public String white;
    public HashMap yellow;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(String str) {
        Context context;
        ConstraintLayout constraintLayout;
        int i4;
        Object obj;
        HashMap hashMap;
        if (str != null && str.length() != 0 && (context = this.red) != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (isInEditMode() && constraintLayout != null) {
                if (av.q.kilo(trim) && (hashMap = constraintLayout.f3034f) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f3034f.get(trim);
                } else {
                    obj = null;
                }
                if (obj instanceof Integer) {
                    i4 = ((Integer) obj).intValue();
                    if (i4 == 0 && constraintLayout != null) {
                        i4 = foxtrot(constraintLayout, trim);
                    }
                    if (i4 == 0) {
                        try {
                            i4 = AbstractC0819r.class.getField(trim).getInt(null);
                        } catch (Exception unused) {
                        }
                    }
                    if (i4 == 0) {
                        i4 = context.getResources().getIdentifier(trim, Constants.KEY_ID, context.getPackageName());
                    }
                    if (i4 == 0) {
                        this.yellow.put(Integer.valueOf(i4), trim);
                        bravo(i4);
                        return;
                    } else {
                        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                        return;
                    }
                }
            }
            i4 = 0;
            if (i4 == 0) {
                i4 = foxtrot(constraintLayout, trim);
            }
            if (i4 == 0) {
            }
            if (i4 == 0) {
            }
            if (i4 == 0) {
            }
        }
    }

    public final void bravo(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.purple + 1;
        int[] iArr = this.alpha;
        if (i5 > iArr.length) {
            this.alpha = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.alpha;
        int i10 = this.purple;
        iArr2[i10] = i4;
        this.purple = i10 + 1;
    }

    public final void charlie(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.red != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C0806e) && trim.equals(((C0806e) layoutParams).orange)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        bravo(childAt.getId());
                    }
                }
            }
        }
    }

    public final void delta(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.purple; i4++) {
            View view = (View) constraintLayout.alpha.get(this.alpha[i4]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void echo(ConstraintLayout constraintLayout) {
    }

    public final int foxtrot(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.red.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.alpha, this.purple);
    }

    public void golf(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0820s.bravo);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.teal = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.white = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void hotel(Z0.d dVar, boolean z2);

    public final void india() {
        if (this.silver != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0806e) {
                ((C0806e) layoutParams).f3466h = this.silver;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.teal;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.white;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.teal = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.purple = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                alpha(str.substring(i4));
                return;
            } else {
                alpha(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.white = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.purple = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                charlie(str.substring(i4));
                return;
            } else {
                charlie(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.teal = null;
        this.purple = 0;
        for (int i4 : iArr) {
            bravo(i4);
        }
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.teal == null) {
            bravo(i4);
        }
    }
}
