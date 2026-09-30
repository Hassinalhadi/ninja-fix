package E0;

import B9.ab;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import fe.C1713e;
import java.text.Bidi;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public abstract class o {
    public static StaticLayout alpha(CharSequence charSequence, TextPaint textPaint, int i4, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z2, int i13, int i14, int i15, int i16) {
        if (i5 < 0) {
            J0.a.alpha("invalid start value");
        }
        int length = charSequence.length();
        if (i5 < 0 || i5 > length) {
            J0.a.alpha("invalid end value");
        }
        if (i10 < 0) {
            J0.a.alpha("invalid maxLines value");
        }
        if (i4 < 0) {
            J0.a.alpha("invalid width value");
        }
        if (i11 < 0) {
            J0.a.alpha("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i5, textPaint, i4);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i10);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i11);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z2);
        obtain.setBreakStrategy(i13);
        obtain.setHyphenationFrequency(i16);
        obtain.setIndents(null, null);
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            obtain.setJustificationMode(i12);
        }
        if (i17 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i17 >= 33) {
            c.uniform(obtain, c.india(c.azure(c.hotel(c.golf(), i14), i15)));
        }
        if (i17 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect bravo(TextPaint textPaint, CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i5, MetricAffectingSpan.class) != i5) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i5) {
                    int nextSpanTransition = spanned.nextSpanTransition(i4, i5, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Lf.h golf = x.golf(metricAffectingSpanArr);
                    while (golf.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) golf.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i5, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i5, rect3);
        return rect3;
    }

    public static final float charlie(int i4, int i5, float[] fArr) {
        return fArr[((i4 - i5) * 2) + 1];
    }

    public static final int delta(Layout layout, int i4, boolean z2) {
        if (i4 <= 0) {
            return 0;
        }
        if (i4 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i4);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i4 || lineEnd == i4) {
            if (lineStart == i4) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int echo(r rVar, Layout layout, ab abVar, int i4, RectF rectF, F0.d dVar, Ac.k kVar, boolean z2) {
        boolean z10;
        j[] jVarArr;
        int i5;
        C1713e c1713e;
        float f5;
        float charlie;
        int i10;
        j[] jVarArr2;
        boolean z11;
        int i11;
        int i12;
        int golf;
        float f10;
        float charlie2;
        int i13;
        int i14;
        int foxtrot;
        float f11;
        float charlie3;
        Bidi createLineBidi;
        boolean z12;
        boolean z13;
        int i15;
        float alpha;
        float alpha2;
        float f12;
        int lineTop = layout.getLineTop(i4);
        int lineBottom = layout.getLineBottom(i4);
        int lineStart = layout.getLineStart(i4);
        int lineEnd = layout.getLineEnd(i4);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i16 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i16];
        Layout layout2 = rVar.foxtrot;
        int lineStart2 = layout2.getLineStart(i4);
        int foxtrot2 = rVar.foxtrot(i4);
        if (i16 < (foxtrot2 - lineStart2) * 2) {
            J0.a.alpha("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        h hVar = new h(rVar);
        if (layout2.getParagraphDirection(i4) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i17 = 0;
        while (lineStart2 < foxtrot2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z10 && !isRtlCharAt) {
                z13 = z10;
                alpha = hVar.alpha(false, false, true, lineStart2);
                f12 = hVar.alpha(true, true, true, lineStart2 + 1);
                i15 = i17;
            } else {
                z13 = z10;
                if (z13 && isRtlCharAt) {
                    i15 = i17;
                    f12 = hVar.alpha(false, false, false, lineStart2);
                    alpha = hVar.alpha(true, true, false, lineStart2 + 1);
                } else {
                    i15 = i17;
                    if (isRtlCharAt) {
                        alpha2 = hVar.alpha(false, false, true, lineStart2);
                        alpha = hVar.alpha(true, true, true, lineStart2 + 1);
                    } else {
                        alpha = hVar.alpha(false, false, false, lineStart2);
                        alpha2 = hVar.alpha(true, true, false, lineStart2 + 1);
                    }
                    f12 = alpha2;
                }
            }
            fArr[i15] = alpha;
            fArr[i15 + 1] = f12;
            i17 = i15 + 2;
            lineStart2++;
            z10 = z13;
        }
        Layout layout3 = (Layout) abVar.purple;
        int lineStart3 = layout3.getLineStart(i4);
        int lineEnd2 = layout3.getLineEnd(i4);
        int emerald = abVar.emerald(lineStart3, false);
        int fuchsia = abVar.fuchsia(emerald);
        int i18 = lineStart3 - fuchsia;
        int i19 = lineEnd2 - fuchsia;
        Bidi uniform = abVar.uniform(emerald);
        if (uniform != null && (createLineBidi = uniform.createLineBidi(i18, i19)) != null) {
            int runCount = createLineBidi.getRunCount();
            jVarArr = new j[runCount];
            int i20 = 0;
            while (i20 < runCount) {
                int runStart = createLineBidi.getRunStart(i20) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i20) + lineStart3;
                int i21 = runCount;
                if (createLineBidi.getRunLevel(i20) % 2 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                jVarArr[i20] = new j(runStart, runLimit, z12);
                i20++;
                runCount = i21;
            }
            i5 = 0;
        } else {
            j jVar = new j(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3));
            i5 = 0;
            jVarArr = new j[]{jVar};
        }
        if (z2) {
            c1713e = new C1713e(i5, jVarArr.length - 1, 1);
        } else {
            c1713e = new C1713e(jVarArr.length - 1, i5, -1);
        }
        int i22 = c1713e.alpha;
        int i23 = c1713e.purple;
        int i24 = c1713e.red;
        if ((i24 <= 0 || i22 > i23) && (i24 >= 0 || i23 > i22)) {
            return -1;
        }
        while (true) {
            j jVar2 = jVarArr[i22];
            boolean z14 = jVar2.charlie;
            int i25 = jVar2.alpha;
            int i26 = jVar2.bravo;
            if (z14) {
                f5 = fArr[((i26 - 1) - lineStart) * 2];
            } else {
                f5 = fArr[(i25 - lineStart) * 2];
            }
            if (z14) {
                charlie = charlie(i25, lineStart, fArr);
            } else {
                charlie = charlie(i26 - 1, lineStart, fArr);
            }
            boolean z15 = jVar2.charlie;
            if (z2) {
                float f13 = rectF.left;
                if (charlie >= f13) {
                    i10 = i24;
                    float f14 = rectF.right;
                    if (f5 <= f14) {
                        if ((!z15 && f13 <= f5) || (z15 && f14 >= charlie)) {
                            i14 = i25;
                        } else {
                            int i27 = i25;
                            int i28 = i26;
                            while (true) {
                                i13 = i28;
                                if (i28 - i27 <= 1) {
                                    break;
                                }
                                int i29 = (i13 + i27) / 2;
                                float f15 = fArr[(i29 - lineStart) * 2];
                                if ((!z15 && f15 > rectF.left) || (z15 && f15 < rectF.right)) {
                                    i28 = i29;
                                } else {
                                    i28 = i13;
                                    i27 = i29;
                                }
                            }
                            if (z15) {
                                i14 = i13;
                            } else {
                                i14 = i27;
                            }
                        }
                        int golf2 = dVar.golf(i14);
                        if (golf2 != -1 && (foxtrot = dVar.foxtrot(golf2)) < i26) {
                            if (foxtrot >= i25) {
                                i25 = foxtrot;
                            }
                            if (golf2 > i26) {
                                golf2 = i26;
                            }
                            jVarArr2 = jVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i30 = golf2;
                            while (true) {
                                if (z15) {
                                    f11 = fArr[((i30 - 1) - lineStart) * 2];
                                } else {
                                    f11 = fArr[(i25 - lineStart) * 2];
                                }
                                rectF2.left = f11;
                                if (z15) {
                                    charlie3 = charlie(i25, lineStart, fArr);
                                } else {
                                    charlie3 = charlie(i30 - 1, lineStart, fArr);
                                }
                                rectF2.right = charlie3;
                                if (((Boolean) kVar.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                i25 = dVar.delta(i25);
                                if (i25 == -1 || i25 >= i26) {
                                    break;
                                }
                                i30 = dVar.golf(i25);
                                if (i30 > i26) {
                                    i30 = i26;
                                }
                            }
                            z11 = true;
                        }
                    }
                } else {
                    i10 = i24;
                }
                jVarArr2 = jVarArr;
                i25 = -1;
                z11 = true;
            } else {
                i10 = i24;
                jVarArr2 = jVarArr;
                float f16 = rectF.left;
                if (charlie >= f16) {
                    float f17 = rectF.right;
                    if (f5 <= f17) {
                        if ((!z15 && f17 >= charlie) || (z15 && f16 <= f5)) {
                            i12 = i26 - 1;
                        } else {
                            int i31 = i25;
                            i12 = i26;
                            for (int i32 = 1; i12 - i31 > i32; i32 = 1) {
                                int i33 = (i12 + i31) / 2;
                                float f18 = fArr[(i33 - lineStart) * 2];
                                if ((!z15 && f18 > rectF.right) || (z15 && f18 < rectF.left)) {
                                    i12 = i33;
                                } else {
                                    i31 = i33;
                                }
                            }
                            if (!z15) {
                                i12 = i31;
                            }
                        }
                        int foxtrot3 = dVar.foxtrot(i12 + 1);
                        if (foxtrot3 == -1 || (golf = dVar.golf(foxtrot3)) <= i25) {
                            i11 = -1;
                            z11 = true;
                        } else {
                            if (foxtrot3 < i25) {
                                foxtrot3 = i25;
                            }
                            if (golf <= i26) {
                                i26 = golf;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i34 = foxtrot3;
                            while (true) {
                                if (z15) {
                                    f10 = fArr[((i26 - 1) - lineStart) * 2];
                                } else {
                                    f10 = fArr[(i34 - lineStart) * 2];
                                }
                                rectF3.left = f10;
                                if (z15) {
                                    charlie2 = charlie(i34, lineStart, fArr);
                                    z11 = true;
                                } else {
                                    z11 = true;
                                    charlie2 = charlie(i26 - 1, lineStart, fArr);
                                }
                                rectF3.right = charlie2;
                                if (((Boolean) kVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i11 = i26;
                                    break;
                                }
                                i26 = dVar.echo(i26);
                                if (i26 == -1 || i26 <= i25) {
                                    break;
                                }
                                i34 = dVar.foxtrot(i26);
                                if (i34 < i25) {
                                    i34 = i25;
                                }
                            }
                            i11 = -1;
                        }
                        i25 = i11;
                    }
                }
                z11 = true;
                i11 = -1;
                i25 = i11;
            }
            if (i25 >= 0) {
                return i25;
            }
            if (i22 == i23) {
                return -1;
            }
            i22 += i10;
            i24 = i10;
            jVarArr = jVarArr2;
        }
    }

    public static final boolean foxtrot(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
