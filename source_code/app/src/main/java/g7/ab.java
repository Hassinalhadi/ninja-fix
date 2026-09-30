package g7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.clevertap.android.sdk.leanplum.Constants;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class ab {
    public int alpha;
    public d bravo;
    public int[][] charlie = new int[10];
    public d[] delta = new d[10];

    public static ab bravo(d dVar) {
        ab abVar = new ab();
        abVar.alpha(StateSet.WILD_CARD, dVar);
        return abVar;
    }

    public final void alpha(int[] iArr, d dVar) {
        int i4 = this.alpha;
        if (i4 == 0 || iArr.length == 0) {
            this.bravo = dVar;
        }
        int[][] iArr2 = this.charlie;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            int[][] iArr3 = new int[i5];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.charlie = iArr3;
            d[] dVarArr = new d[i5];
            System.arraycopy(this.delta, 0, dVarArr, 0, i4);
            this.delta = dVarArr;
        }
        int[][] iArr4 = this.charlie;
        int i10 = this.alpha;
        iArr4[i10] = iArr;
        this.delta[i10] = dVar;
        this.alpha = i10 + 1;
    }

    public final d charlie(int[] iArr) {
        int i4;
        int[][] iArr2 = this.charlie;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            i4 = -1;
            if (i10 < this.alpha) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.charlie;
            while (true) {
                if (i5 >= this.alpha) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            i10 = i4;
        }
        if (i10 < 0) {
            return this.bravo;
        }
        return this.delta[i10];
    }

    public final void delta(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals(Constants.IAP_ITEM_PARAM)) {
                        Resources resources = context.getResources();
                        int[] iArr = L6.a.gold;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        d delta = m.delta(obtainStyledAttributes, 5, new C1755a(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i4 = 0;
                        for (int i5 = 0; i5 < attributeCount; i5++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i10 = i4 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i4] = attributeNameResource;
                                i4 = i10;
                            }
                        }
                        alpha(StateSet.trimStateSet(iArr2, i4), delta);
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
