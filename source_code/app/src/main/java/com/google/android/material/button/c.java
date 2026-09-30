package com.google.android.material.button;

import A0.ae;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import av.ah;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g7.C1755a;
import g7.ab;
import g7.ac;
import g7.ad;
import g7.af;
import g7.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import l7.AbstractC2059a;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f7933a;
    public final ArrayList alpha;

    /* renamed from: b, reason: collision with root package name */
    public af f7934b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7935c;
    public final ArrayList purple;
    public final ah red;
    public final ae silver;
    public Integer[] teal;
    public ab white;
    public ad yellow;

    /* JADX WARN: Type inference failed for: r0v25, types: [g7.af, java.lang.Object] */
    public c(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        ab bravo;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        af afVar;
        this.alpha = new ArrayList();
        this.purple = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.red = new ah(23, materialButtonToggleGroup);
        this.silver = new ae(3, materialButtonToggleGroup);
        this.f7935c = true;
        Context context2 = getContext();
        TypedArray golf = z.golf(context2, attributeSet, L6.a.uniform, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (golf.hasValue(2)) {
            int resourceId = golf.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        obj = new Object();
                        obj.charlie = new int[10];
                        obj.delta = new s[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 == 2) {
                    if (xml.getName().equals("selector")) {
                        obj.alpha(context2, xml, asAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    afVar = obj;
                    this.f7934b = afVar;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            afVar = null;
            this.f7934b = afVar;
        }
        if (golf.hasValue(4)) {
            ad bravo2 = ad.bravo(context2, golf, 4);
            this.yellow = bravo2;
            if (bravo2 == null) {
                ac acVar = new ac(m.alpha(context2, golf.getResourceId(4, 0), golf.getResourceId(5, 0)).alpha());
                this.yellow = acVar.alpha != 0 ? new ad(acVar) : null;
            }
        }
        if (golf.hasValue(3)) {
            C1755a c1755a = new C1755a(0.0f);
            int resourceId2 = golf.getResourceId(3, 0);
            if (resourceId2 == 0) {
                bravo = ab.bravo(m.delta(golf, 3, c1755a));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                bravo = ab.bravo(m.delta(golf, 3, c1755a));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        bravo = new ab();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                bravo.delta(context2, xml2, asAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    bravo = ab.bravo(c1755a);
                }
            }
            this.white = bravo;
        }
        this.f7933a = golf.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(golf.getBoolean(0, true));
        golf.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (charlie(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (charlie(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        delta();
        this.f7935c = true;
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.red);
        this.alpha.add(materialButton.getShapeAppearanceModel());
        this.purple.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void alpha() {
        int i4;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i5);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i5 - 1);
                if (this.f7933a <= 0) {
                    i4 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i4 = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.f7933a - i4);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.f7933a - i4;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    public final void bravo() {
        int i4;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.f7934b != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i5 = LottieConstants.IterateForever;
            for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
                if (charlie(i10)) {
                    int i11 = 0;
                    if (charlie(i10) && this.f7934b != null) {
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i10);
                        af afVar = this.f7934b;
                        int width = materialButton3.getWidth();
                        int i12 = -width;
                        for (int i13 = 0; i13 < afVar.alpha; i13++) {
                            g7.ae aeVar = (g7.ae) afVar.delta[i13].purple;
                            int i14 = aeVar.alpha;
                            float f5 = aeVar.bravo;
                            if (i14 == 2) {
                                max = Math.max(i12, f5);
                            } else if (i14 == 1) {
                                max = Math.max(i12, width * f5);
                            }
                            i12 = (int) max;
                        }
                        int max2 = Math.max(0, i12);
                        int i15 = i10 - 1;
                        while (true) {
                            materialButton = null;
                            if (i15 >= 0) {
                                if (charlie(i15)) {
                                    materialButton2 = (MaterialButton) getChildAt(i15);
                                    break;
                                }
                                i15--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i16 = i10 + 1;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            if (charlie(i16)) {
                                materialButton = (MaterialButton) getChildAt(i16);
                                break;
                            }
                            i16++;
                        }
                        if (materialButton != null) {
                            i11 = materialButton.getAllowedWidthDecrease();
                        }
                        i11 = Math.min(max2, allowedWidthDecrease + i11);
                    }
                    if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                        i11 /= 2;
                    }
                    i5 = Math.min(i5, i11);
                }
            }
            for (int i17 = firstVisibleChildIndex; i17 <= lastVisibleChildIndex; i17++) {
                if (charlie(i17)) {
                    ((MaterialButton) getChildAt(i17)).setSizeChange(this.f7934b);
                    MaterialButton materialButton4 = (MaterialButton) getChildAt(i17);
                    if (i17 != firstVisibleChildIndex && i17 != lastVisibleChildIndex) {
                        i4 = i5 * 2;
                    } else {
                        i4 = i5;
                    }
                    materialButton4.setWidthChangeMax(i4);
                }
            }
        }
    }

    public final boolean charlie(int i4) {
        if (getChildAt(i4).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void delta() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = materialButton.f7917o;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f7917o = null;
                materialButton.f7914l = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.silver);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.teal = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [g7.ac, java.lang.Object] */
    public final void echo() {
        boolean z2;
        boolean z10;
        ac acVar;
        boolean z11;
        boolean z12;
        int i4;
        ad adVar;
        if ((this.white != null || this.yellow != null) && this.f7935c) {
            this.f7935c = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i5 = 0; i5 < childCount; i5++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i5);
                if (materialButton.getVisibility() != 8) {
                    if (i5 == firstVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i5 == lastVisibleChildIndex) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ad adVar2 = this.yellow;
                    if (adVar2 == null || (!z2 && !z10)) {
                        adVar2 = (ad) this.purple.get(i5);
                    }
                    if (adVar2 == null) {
                        acVar = new ac((m) this.alpha.get(i5));
                    } else {
                        ?? obj = new Object();
                        int i10 = adVar2.alpha;
                        obj.alpha = i10;
                        obj.bravo = adVar2.bravo;
                        int[][] iArr = adVar2.charlie;
                        int[][] iArr2 = new int[iArr.length];
                        obj.charlie = iArr2;
                        m[] mVarArr = adVar2.delta;
                        obj.delta = new m[mVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i10);
                        System.arraycopy(mVarArr, 0, obj.delta, 0, obj.alpha);
                        obj.echo = adVar2.echo;
                        obj.foxtrot = adVar2.foxtrot;
                        obj.golf = adVar2.golf;
                        obj.hotel = adVar2.hotel;
                        acVar = obj;
                    }
                    if (getOrientation() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        if (z2) {
                            i4 = 5;
                        } else {
                            i4 = 0;
                        }
                        if (z10) {
                            i4 |= 10;
                        }
                        if (z12) {
                            i4 = ((i4 & 10) >> 1) | ((i4 & 5) << 1);
                        }
                    } else {
                        if (z2) {
                            i4 = 3;
                        } else {
                            i4 = 0;
                        }
                        if (z10) {
                            i4 |= 12;
                        }
                    }
                    int i11 = ~i4;
                    ab abVar = this.white;
                    if ((i11 | 1) == i11) {
                        acVar.echo = abVar;
                    }
                    if ((i11 | 2) == i11) {
                        acVar.foxtrot = abVar;
                    }
                    if ((i11 | 4) == i11) {
                        acVar.golf = abVar;
                    }
                    if ((i11 | 8) == i11) {
                        acVar.hotel = abVar;
                    }
                    if (acVar.alpha == 0) {
                        adVar = null;
                    } else {
                        adVar = new ad(acVar);
                    }
                    if (adVar.delta()) {
                        materialButton.setStateListShapeAppearanceModel(adVar);
                    } else {
                        materialButton.setShapeAppearanceModel(adVar.charlie());
                    }
                }
            }
        }
    }

    public af getButtonSizeChange() {
        return this.f7934b;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.teal;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i5;
    }

    public g7.d getInnerCornerSize() {
        return this.white.bravo;
    }

    public ab getInnerCornerSizeStateList() {
        return this.white;
    }

    public m getShapeAppearance() {
        ad adVar = this.yellow;
        if (adVar == null) {
            return null;
        }
        return adVar.charlie();
    }

    public int getSpacing() {
        return this.f7933a;
    }

    public ad getStateListShapeAppearance() {
        return this.yellow;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        if (z2) {
            delta();
            bravo();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        echo();
        alpha();
        super.onMeasure(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.alpha.remove(indexOfChild);
            this.purple.remove(indexOfChild);
        }
        this.f7935c = true;
        echo();
        delta();
        alpha();
    }

    public void setButtonSizeChange(af afVar) {
        if (this.f7934b != afVar) {
            this.f7934b = afVar;
            bravo();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(g7.d dVar) {
        this.white = ab.bravo(dVar);
        this.f7935c = true;
        echo();
        invalidate();
    }

    public void setInnerCornerSizeStateList(ab abVar) {
        this.white = abVar;
        this.f7935c = true;
        echo();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (getOrientation() != i4) {
            this.f7935c = true;
        }
        super.setOrientation(i4);
    }

    public void setShapeAppearance(m mVar) {
        ad adVar;
        ac acVar = new ac(mVar);
        if (acVar.alpha == 0) {
            adVar = null;
        } else {
            adVar = new ad(acVar);
        }
        this.yellow = adVar;
        this.f7935c = true;
        echo();
        invalidate();
    }

    public void setSpacing(int i4) {
        this.f7933a = i4;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(ad adVar) {
        this.yellow = adVar;
        this.f7935c = true;
        echo();
        invalidate();
    }
}
