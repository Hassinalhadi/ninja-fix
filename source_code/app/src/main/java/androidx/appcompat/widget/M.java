package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class M {
    public static final RectF lima = new RectF();
    public static final ConcurrentHashMap mike = new ConcurrentHashMap();
    public int alpha = 0;
    public boolean bravo = false;
    public float charlie = -1.0f;
    public float delta = -1.0f;
    public float echo = -1.0f;
    public int[] foxtrot = new int[0];
    public boolean golf = false;
    public TextPaint hotel;
    public final TextView india;
    public final Context juliet;
    public final I kilo;

    public M(TextView textView) {
        this.india = textView;
        this.juliet = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.kilo = new K();
        } else {
            this.kilo = new I();
        }
    }

    public static int[] bravo(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method delta(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = mike;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object echo(Object obj, Object obj2, String str) {
        try {
            return delta(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final void alpha() {
        int measuredWidth;
        if (foxtrot()) {
            if (this.bravo) {
                if (this.india.getMeasuredHeight() > 0 && this.india.getMeasuredWidth() > 0) {
                    if (this.kilo.bravo(this.india)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.india.getMeasuredWidth() - this.india.getTotalPaddingLeft()) - this.india.getTotalPaddingRight();
                    }
                    int height = (this.india.getHeight() - this.india.getCompoundPaddingBottom()) - this.india.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = lima;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float charlie = charlie(rectF);
                                if (charlie != this.india.getTextSize()) {
                                    golf(charlie, 0);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.bravo = true;
        }
    }

    public final int charlie(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.foxtrot.length;
        if (length != 0) {
            int i4 = length - 1;
            int i5 = 0;
            int i10 = 1;
            while (i10 <= i4) {
                int i11 = (i10 + i4) / 2;
                int i12 = this.foxtrot[i11];
                TextView textView = this.india;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.hotel;
                if (textPaint == null) {
                    this.hotel = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.hotel.set(textView.getPaint());
                this.hotel.setTextSize(i12);
                StaticLayout alpha = H.alpha(charSequence, (Layout.Alignment) echo(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.india, this.hotel, this.kilo);
                if ((maxLines != -1 && (alpha.getLineCount() > maxLines || alpha.getLineEnd(alpha.getLineCount() - 1) != charSequence.length())) || alpha.getHeight() > rectF.bottom) {
                    i5 = i11 - 1;
                    i4 = i5;
                } else {
                    int i13 = i11 + 1;
                    i5 = i10;
                    i10 = i13;
                }
            }
            return this.foxtrot[i5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean foxtrot() {
        if (juliet() && this.alpha != 0) {
            return true;
        }
        return false;
    }

    public final void golf(float f5, int i4) {
        Resources resources;
        Context context = this.juliet;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i4, f5, resources.getDisplayMetrics());
        TextView textView = this.india;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.bravo = false;
                try {
                    Method delta = delta("nullLayouts");
                    if (delta != null) {
                        delta.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean hotel() {
        if (juliet() && this.alpha == 1) {
            if (!this.golf || this.foxtrot.length == 0) {
                int floor = ((int) Math.floor((this.echo - this.delta) / this.charlie)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.charlie) + this.delta);
                }
                this.foxtrot = bravo(iArr);
            }
            this.bravo = true;
        } else {
            this.bravo = false;
        }
        return this.bravo;
    }

    public final boolean india() {
        boolean z2;
        if (this.foxtrot.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.golf = z2;
        if (z2) {
            this.alpha = 1;
            this.delta = r0[0];
            this.echo = r0[r1 - 1];
            this.charlie = -1.0f;
        }
        return z2;
    }

    public final boolean juliet() {
        return !(this.india instanceof C0492z);
    }

    public final void kilo(float f5, float f10, float f11) {
        if (f5 > 0.0f) {
            if (f10 > f5) {
                if (f11 > 0.0f) {
                    this.alpha = 1;
                    this.delta = f5;
                    this.echo = f10;
                    this.charlie = f11;
                    this.golf = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
    }
}
