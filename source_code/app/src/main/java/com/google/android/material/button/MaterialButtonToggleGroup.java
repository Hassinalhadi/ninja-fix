package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.z;
import com.google.android.material.timepicker.j;
import delivery.samurai.android.R;
import g.C1718a;
import g7.C1755a;
import g7.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l7.AbstractC2059a;
import s1.au;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f7927j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f7928d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7929f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7930g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7931h;

    /* renamed from: i, reason: collision with root package name */
    public HashSet f7932i;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083919), attributeSet);
        this.f7928d = new LinkedHashSet();
        this.e = false;
        this.f7932i = new HashSet();
        TypedArray golf = z.golf(getContext(), attributeSet, L6.a.victor, R.attr.materialButtonToggleGroupStyle, 2132083919, new int[0]);
        setSingleSelection(golf.getBoolean(7, false));
        this.f7931h = golf.getResourceId(2, -1);
        this.f7930g = golf.getBoolean(4, false);
        if (this.white == null) {
            this.white = ab.bravo(new C1755a(0.0f));
        }
        setEnabled(golf.getBoolean(0, true));
        golf.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        Class cls;
        if (this.f7929f) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && getChildAt(i5).getVisibility() != 8) {
                i4++;
            }
        }
        return i4;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.c, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        foxtrot(materialButton.getId(), materialButton.f7910h);
        au.november(materialButton, new e(0, this));
    }

    public final void foxtrot(int i4, boolean z2) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f7932i);
        if (z2 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f7929f && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i4))) {
            if (!this.f7930g || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        } else {
            return;
        }
        golf(hashSet);
    }

    public int getCheckedButtonId() {
        if (this.f7929f && !this.f7932i.isEmpty()) {
            return ((Integer) this.f7932i.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id2 = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f7932i.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public final void golf(Set set) {
        HashSet hashSet = this.f7932i;
        this.f7932i = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id2 = ((MaterialButton) getChildAt(i4)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.e = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.e = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f7928d.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).alpha();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f7931h;
        if (i4 != -1) {
            golf(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f7929f) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1718a.zulu(1, visibleButtonCount, i4).purple);
    }

    public void setSelectionRequired(boolean z2) {
        this.f7930g = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f7929f != z2) {
            this.f7929f = z2;
            golf(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
