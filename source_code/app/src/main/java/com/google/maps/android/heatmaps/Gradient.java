package com.google.maps.android.heatmaps;

import Q0.c;
import android.graphics.Color;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    /* loaded from: classes2.dex */
    public class ColorInterval {
        private final int color1;
        private final int color2;
        private final float duration;

        public /* synthetic */ ColorInterval(Gradient gradient, int i4, int i5, float f5, int i10) {
            this(i4, i5, f5);
        }

        private ColorInterval(int i4, int i5, float f5) {
            this.color1 = i4;
            this.color2 = i5;
            this.duration = f5;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, ColorInterval> generateColorIntervals() {
        HashMap<Integer, ColorInterval> hashMap = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new ColorInterval(this, Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], 0));
        }
        for (int i4 = 1; i4 < this.mColors.length; i4++) {
            int i5 = i4 - 1;
            Integer valueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i5]));
            int[] iArr = this.mColors;
            int i10 = iArr[i5];
            int i11 = iArr[i4];
            float f5 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new ColorInterval(this, i10, i11, (fArr[i4] - fArr[i5]) * f5, 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i12 = this.mColors[length];
            hashMap.put(valueOf2, new ColorInterval(this, i12, i12, (1.0f - this.mStartPoints[length]) * this.mColorMapSize, 0));
        }
        return hashMap;
    }

    public static int interpolateColor(int i4, int i5, float f5) {
        int alpha = (int) (((Color.alpha(i5) - Color.alpha(i4)) * f5) + Color.alpha(i4));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i4), Color.green(i4), Color.blue(i4), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i5), Color.green(i5), Color.blue(i5), fArr2);
        float f10 = fArr[0];
        float f11 = fArr2[0];
        if (f10 - f11 > 180.0f) {
            fArr2[0] = f11 + 360.0f;
        } else if (f11 - f10 > 180.0f) {
            fArr[0] = f10 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            float f12 = fArr2[i10];
            float f13 = fArr[i10];
            fArr3[i10] = c.lima(f12, f13, f5, f13);
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    public int[] generateColorMap(double d4) {
        HashMap<Integer, ColorInterval> generateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = generateColorIntervals.get(0);
        int i4 = 0;
        for (int i5 = 0; i5 < this.mColorMapSize; i5++) {
            if (generateColorIntervals.containsKey(Integer.valueOf(i5))) {
                colorInterval = generateColorIntervals.get(Integer.valueOf(i5));
                i4 = i5;
            }
            iArr[i5] = interpolateColor(colorInterval.color1, colorInterval.color2, (i5 - i4) / colorInterval.duration);
        }
        if (d4 != 1.0d) {
            for (int i10 = 0; i10 < this.mColorMapSize; i10++) {
                int i11 = iArr[i10];
                iArr[i10] = Color.argb((int) (Color.alpha(i11) * d4), Color.red(i11), Color.green(i11), Color.blue(i11));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i4) {
        if (iArr.length == fArr.length) {
            if (iArr.length != 0) {
                for (int i5 = 1; i5 < fArr.length; i5++) {
                    if (fArr[i5] <= fArr[i5 - 1]) {
                        throw new IllegalArgumentException("startPoints should be in increasing order");
                    }
                }
                this.mColorMapSize = i4;
                int[] iArr2 = new int[iArr.length];
                this.mColors = iArr2;
                this.mStartPoints = new float[fArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
                return;
            }
            throw new IllegalArgumentException("No colors have been defined");
        }
        throw new IllegalArgumentException("colors and startPoints should be same length");
    }
}
