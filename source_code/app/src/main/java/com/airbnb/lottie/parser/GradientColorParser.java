package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientColorParser implements ValueParser<GradientColor> {
    private int colorPoints;

    public GradientColorParser(int i4) {
        this.colorPoints = i4;
    }

    private GradientColor addOpacityStopsToGradientIfNeeded(GradientColor gradientColor, List<Float> list) {
        int i4 = this.colorPoints * 4;
        if (list.size() <= i4) {
            return gradientColor;
        }
        float[] positions = gradientColor.getPositions();
        int[] colors = gradientColor.getColors();
        int size = (list.size() - i4) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i5 = 0;
        while (i4 < list.size()) {
            if (i4 % 2 == 0) {
                fArr[i5] = list.get(i4).floatValue();
            } else {
                fArr2[i5] = list.get(i4).floatValue();
                i5++;
            }
            i4++;
        }
        float[] mergeUniqueElements = mergeUniqueElements(gradientColor.getPositions(), fArr);
        int length = mergeUniqueElements.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            float f5 = mergeUniqueElements[i10];
            int binarySearch = Arrays.binarySearch(positions, f5);
            int binarySearch2 = Arrays.binarySearch(fArr, f5);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i10] = getColorInBetweenOpacityStops(f5, colors[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i10] = getColorInBetweenColorStops(f5, fArr2[binarySearch2], positions, colors);
            }
        }
        return new GradientColor(mergeUniqueElements, iArr);
    }

    private int getColorInBetweenOpacityStops(float f5, int i4, float[] fArr, float[] fArr2) {
        float lerp;
        if (fArr2.length >= 2 && f5 > fArr[0]) {
            for (int i5 = 1; i5 < fArr.length; i5++) {
                float f10 = fArr[i5];
                if (f10 >= f5 || i5 == fArr.length - 1) {
                    if (f10 <= f5) {
                        lerp = fArr2[i5];
                    } else {
                        int i10 = i5 - 1;
                        float f11 = fArr[i10];
                        lerp = MiscUtils.lerp(fArr2[i10], fArr2[i5], (f5 - f11) / (f10 - f11));
                    }
                    return Color.argb((int) (lerp * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    public static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        float f5;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f10 = Float.NaN;
            if (i5 < fArr.length) {
                f5 = fArr[i5];
            } else {
                f5 = Float.NaN;
            }
            if (i10 < fArr2.length) {
                f10 = fArr2[i10];
            }
            if (!Float.isNaN(f10) && f5 >= f10) {
                if (!Float.isNaN(f5) && f10 >= f5) {
                    fArr3[i11] = f5;
                    i5++;
                    i10++;
                    i4++;
                } else {
                    fArr3[i11] = f10;
                    i10++;
                }
            } else {
                fArr3[i11] = f5;
                i5++;
            }
        }
        if (i4 == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i4);
    }

    public int getColorInBetweenColorStops(float f5, float f10, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f5 != fArr[0]) {
            for (int i4 = 1; i4 < fArr.length; i4++) {
                float f11 = fArr[i4];
                if (f11 >= f5 || i4 == fArr.length - 1) {
                    if (i4 == fArr.length - 1 && f5 >= f11) {
                        return Color.argb((int) (f10 * 255.0f), Color.red(iArr[i4]), Color.green(iArr[i4]), Color.blue(iArr[i4]));
                    }
                    int i5 = i4 - 1;
                    float f12 = fArr[i5];
                    int evaluate = GammaEvaluator.evaluate((f5 - f12) / (f11 - f12), iArr[i5], iArr[i4]);
                    return Color.argb((int) (f10 * 255.0f), Color.red(evaluate), Color.green(evaluate), Color.blue(evaluate));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public GradientColor parse(JsonReader jsonReader, float f5) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z2 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.colorPoints = 2;
        }
        if (z2) {
            jsonReader.endArray();
        }
        if (this.colorPoints == -1) {
            this.colorPoints = arrayList.size() / 4;
        }
        int i4 = this.colorPoints;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.colorPoints * 4; i11++) {
            int i12 = i11 / 4;
            double floatValue = ((Float) arrayList.get(i11)).floatValue();
            int i13 = i11 % 4;
            if (i13 == 0) {
                if (i12 > 0) {
                    float f10 = (float) floatValue;
                    if (fArr[i12 - 1] >= f10) {
                        fArr[i12] = f10 + 0.01f;
                    }
                }
                fArr[i12] = (float) floatValue;
            } else if (i13 == 1) {
                i5 = (int) (floatValue * 255.0d);
            } else if (i13 == 2) {
                i10 = (int) (floatValue * 255.0d);
            } else if (i13 == 3) {
                iArr[i12] = Color.argb(255, i5, i10, (int) (floatValue * 255.0d));
            }
        }
        return addOpacityStopsToGradientIfNeeded(new GradientColor(fArr, iArr), arrayList);
    }
}
