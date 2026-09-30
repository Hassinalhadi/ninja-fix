package g7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.clevertap.android.sdk.leanplum.Constants;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class af {
    public int alpha;
    public com.google.android.material.internal.s bravo;
    public int[][] charlie;
    public com.google.android.material.internal.s[] delta;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        ae aeVar;
        int attributeCount;
        int i4;
        int i5;
        int[][] iArr;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals(Constants.IAP_ITEM_PARAM)) {
                        Resources resources = context.getResources();
                        int[] iArr2 = L6.a.ivory;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr2);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                        }
                        TypedValue peekValue = obtainStyledAttributes.peekValue(0);
                        if (peekValue != null) {
                            int i10 = peekValue.type;
                            if (i10 == 5) {
                                aeVar = new ae(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()));
                            } else if (i10 == 6) {
                                aeVar = new ae(1, peekValue.getFraction(1.0f, 1.0f));
                            }
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr3 = new int[attributeCount];
                            int i11 = 0;
                            for (i4 = 0; i4 < attributeCount; i4++) {
                                int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                                if (attributeNameResource != R.attr.widthChange) {
                                    int i12 = i11 + 1;
                                    if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr3[i11] = attributeNameResource;
                                    i11 = i12;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr3, i11);
                            com.google.android.material.internal.s sVar = new com.google.android.material.internal.s(10, false);
                            sVar.purple = aeVar;
                            i5 = this.alpha;
                            if (i5 != 0 || trimStateSet.length == 0) {
                                this.bravo = sVar;
                            }
                            iArr = this.charlie;
                            if (i5 >= iArr.length) {
                                int i13 = i5 + 10;
                                int[][] iArr4 = new int[i13];
                                System.arraycopy(iArr, 0, iArr4, 0, i5);
                                this.charlie = iArr4;
                                com.google.android.material.internal.s[] sVarArr = new com.google.android.material.internal.s[i13];
                                System.arraycopy(this.delta, 0, sVarArr, 0, i5);
                                this.delta = sVarArr;
                            }
                            int[][] iArr5 = this.charlie;
                            int i14 = this.alpha;
                            iArr5[i14] = trimStateSet;
                            this.delta[i14] = sVar;
                            this.alpha = i14 + 1;
                        }
                        aeVar = null;
                        obtainStyledAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr32 = new int[attributeCount];
                        int i112 = 0;
                        while (i4 < attributeCount) {
                        }
                        int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i112);
                        com.google.android.material.internal.s sVar2 = new com.google.android.material.internal.s(10, false);
                        sVar2.purple = aeVar;
                        i5 = this.alpha;
                        if (i5 != 0) {
                        }
                        this.bravo = sVar2;
                        iArr = this.charlie;
                        if (i5 >= iArr.length) {
                        }
                        int[][] iArr52 = this.charlie;
                        int i142 = this.alpha;
                        iArr52[i142] = trimStateSet2;
                        this.delta[i142] = sVar2;
                        this.alpha = i142 + 1;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
