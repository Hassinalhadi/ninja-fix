package com.airbnb.lottie.model.content;

import androidx.appcompat.widget.P0;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    private void copyFrom(GradientColor gradientColor) {
        int i4 = 0;
        while (true) {
            int[] iArr = gradientColor.colors;
            if (i4 < iArr.length) {
                this.positions[i4] = gradientColor.positions[i4];
                this.colors[i4] = iArr[i4];
                i4++;
            } else {
                return;
            }
        }
    }

    private int getColorForPosition(float f5) {
        int binarySearch = Arrays.binarySearch(this.positions, f5);
        if (binarySearch >= 0) {
            return this.colors[binarySearch];
        }
        int i4 = -(binarySearch + 1);
        if (i4 == 0) {
            return this.colors[0];
        }
        int[] iArr = this.colors;
        if (i4 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.positions;
        int i5 = i4 - 1;
        float f10 = fArr[i5];
        return GammaEvaluator.evaluate((f5 - f10) / (fArr[i4] - f10), iArr[i5], iArr[i4]);
    }

    public GradientColor copyWithPositions(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            iArr[i4] = getColorForPosition(fArr[i4]);
        }
        return new GradientColor(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GradientColor gradientColor = (GradientColor) obj;
            if (Arrays.equals(this.positions, gradientColor.positions) && Arrays.equals(this.colors, gradientColor.colors)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.colors) + (Arrays.hashCode(this.positions) * 31);
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f5) {
        int[] iArr;
        if (gradientColor.equals(gradientColor2)) {
            copyFrom(gradientColor);
            return;
        }
        if (f5 <= 0.0f) {
            copyFrom(gradientColor);
            return;
        }
        if (f5 >= 1.0f) {
            copyFrom(gradientColor2);
            return;
        }
        if (gradientColor.colors.length == gradientColor2.colors.length) {
            int i4 = 0;
            while (true) {
                iArr = gradientColor.colors;
                if (i4 >= iArr.length) {
                    break;
                }
                this.positions[i4] = MiscUtils.lerp(gradientColor.positions[i4], gradientColor2.positions[i4], f5);
                this.colors[i4] = GammaEvaluator.evaluate(f5, gradientColor.colors[i4], gradientColor2.colors[i4]);
                i4++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.positions;
                if (length < fArr.length) {
                    int[] iArr2 = gradientColor.colors;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.colors;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(gradientColor.colors.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(P0.cyan(sb2, gradientColor2.colors.length, ")"));
        }
    }
}
