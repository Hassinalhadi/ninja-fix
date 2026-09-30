package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.Gravity;
import java.text.Bidi;

/* loaded from: classes.dex */
public class PromptUtils {
    private PromptUtils() {
    }

    public static float calculateMaxTextWidth(Layout layout) {
        float f5 = 0.0f;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            for (int i4 = 0; i4 < lineCount; i4++) {
                f5 = Math.max(f5, layout.getLineWidth(i4));
            }
        }
        return f5;
    }

    public static float calculateMaxWidth(float f5, Rect rect, int i4, float f10) {
        if (rect != null) {
            i4 = rect.right - rect.left;
        }
        return Math.max(80.0f, Math.min(f5, i4 - (f10 * 2.0f)));
    }

    public static boolean containsInset(Rect rect, int i4, int i5, int i10) {
        if (i5 > rect.left + i4 && i5 < rect.right - i4 && i10 > rect.top + i4 && i10 < rect.bottom - i4) {
            return true;
        }
        return false;
    }

    public static StaticLayout createStaticTextLayout(CharSequence charSequence, TextPaint textPaint, int i4, Layout.Alignment alignment, float f5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new AlphaSpan(f5), 0, spannableStringBuilder.length(), 18);
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(spannableStringBuilder, 0, charSequence.length(), textPaint, i4);
        obtain.setAlignment(alignment);
        return obtain.build();
    }

    @SuppressLint({"RtlHardcoded"})
    public static Layout.Alignment getTextAlignment(Resources resources, int i4, CharSequence charSequence) {
        int layoutDirection = resources.getConfiguration().getLayoutDirection();
        if (charSequence != null && layoutDirection == 1 && new Bidi(charSequence.toString(), -2).isRightToLeft()) {
            if (i4 == 8388611) {
                i4 = 8388613;
            } else if (i4 == 8388613) {
                i4 = 8388611;
            }
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, layoutDirection);
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public static boolean isPointInCircle(float f5, float f10, PointF pointF, float f11) {
        if (Math.pow(f10 - pointF.y, 2.0d) + Math.pow(f5 - pointF.x, 2.0d) < Math.pow(f11, 2.0d)) {
            return true;
        }
        return false;
    }

    public static boolean isRtlText(Layout layout, Resources resources) {
        boolean z2;
        boolean z10;
        if (layout == null) {
            return false;
        }
        Layout.Alignment alignment = layout.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
        if (alignment == alignment2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(0);
        if (((z2 && isRtlCharAt) || (!z2 && !isRtlCharAt)) && !isRtlCharAt) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && layout.getAlignment() == Layout.Alignment.ALIGN_NORMAL) {
            if (resources.getConfiguration().getLayoutDirection() != 1) {
                return false;
            }
            return true;
        }
        if (layout.getAlignment() == alignment2 && isRtlCharAt) {
            return false;
        }
        return z10;
    }

    public static PorterDuff.Mode parseTintMode(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.valueOf("ADD");
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void scale(PointF pointF, RectF rectF, RectF rectF2, float f5, boolean z2) {
        if (f5 == 1.0f) {
            rectF2.set(rectF);
            return;
        }
        float centerX = rectF.centerX() - rectF.left;
        float centerY = rectF.centerY();
        float f10 = rectF.top;
        float f11 = centerY - f10;
        if (z2 && f5 > 1.0f) {
            float min = Math.min((centerX * f5) - centerX, (f5 * f11) - f11);
            rectF2.left = rectF.left - min;
            rectF2.top = rectF.top - min;
            rectF2.right = rectF.right + min;
            rectF2.bottom = rectF.bottom + min;
            return;
        }
        float f12 = pointF.x;
        float f13 = centerX * f5;
        rectF2.left = f12 - (((f12 - rectF.left) / centerX) * f13);
        float f14 = pointF.y;
        float f15 = f5 * f11;
        rectF2.top = f14 - (((f14 - f10) / f11) * f15);
        rectF2.right = (((rectF.right - f12) / centerX) * f13) + f12;
        rectF2.bottom = (((rectF.bottom - f14) / f11) * f15) + f14;
    }

    public static void setTypeface(TextPaint textPaint, Typeface typeface, int i4) {
        Typeface create;
        int i5;
        float f5;
        if (i4 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i4);
            } else {
                create = Typeface.create(typeface, i4);
            }
            textPaint.setTypeface(create);
            boolean z2 = false;
            if (create != null) {
                i5 = create.getStyle();
            } else {
                i5 = 0;
            }
            int i10 = (~i5) & i4;
            if ((i10 & 1) != 0) {
                z2 = true;
            }
            textPaint.setFakeBoldText(z2);
            if ((i10 & 2) != 0) {
                f5 = -0.25f;
            } else {
                f5 = 0.0f;
            }
            textPaint.setTextSkewX(f5);
            return;
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        } else {
            textPaint.setTypeface(Typeface.defaultFromStyle(i4));
        }
    }

    public static Typeface setTypefaceFromAttrs(String str, int i4, int i5) {
        Typeface typeface;
        Typeface create;
        if (str != null && (create = Typeface.create(str, i5)) != null) {
            return create;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    typeface = Typeface.DEFAULT;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        return Typeface.create(typeface, i5);
    }
}
