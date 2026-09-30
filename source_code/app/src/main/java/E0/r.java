package E0;

import B9.ab;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.U4;

/* loaded from: classes3.dex */
public final class r {
    public final TextPaint alpha;
    public final TextUtils.TruncateAt bravo;
    public final boolean charlie;
    public final boolean delta;
    public F0.e echo;
    public final Layout foxtrot;
    public final int golf;
    public final int hotel;
    public final int india;
    public final float juliet;
    public final float kilo;
    public final boolean lima;
    public final Paint.FontMetricsInt mike;
    public final int november;
    public final G0.h[] oscar;
    public final Rect papa = new Rect();
    public ab quebec;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(CharSequence charSequence, float f5, TextPaint textPaint, int i4, TextUtils.TruncateAt truncateAt, int i5, boolean z2, int i10, int i11, int i12, int i13, int i14, int i15, l lVar) {
        Layout.Alignment alignment;
        boolean z10;
        int i16;
        int i17;
        int i18;
        Layout alpha;
        boolean z11;
        long j5;
        Paint.FontMetricsInt fontMetricsInt;
        G0.h[] hVarArr;
        long j6;
        int i19;
        Layout layout;
        int i20;
        int i21;
        boolean z12;
        int i22;
        int topPadding;
        int bottomPadding;
        Layout boringLayout;
        this.alpha = textPaint;
        this.bravo = truncateAt;
        this.charlie = z2;
        int length = charSequence.length();
        TextDirectionHeuristic alpha2 = s.alpha(i5);
        Layout.Alignment alignment2 = p.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = p.bravo;
                        }
                    } else {
                        alignment = p.alpha;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment3 = alignment;
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, G0.a.class) < length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics alpha3 = lVar.alpha();
            double d4 = f5;
            int ceil = (int) Math.ceil(d4);
            if (alpha3 != null && lVar.charlie() <= f5 && !z10) {
                this.lima = true;
                if (ceil < 0) {
                    J0.a.alpha("negative width");
                }
                if (ceil < 0) {
                    J0.a.alpha("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    boringLayout = c.kilo(charSequence, textPaint, ceil, alignment3, alpha3, z2, truncateAt, ceil);
                } else {
                    boringLayout = new BoringLayout(charSequence, textPaint, ceil, alignment3, 1.0f, 0.0f, alpha3, z2, truncateAt, ceil);
                }
                i16 = i10;
                alpha = boringLayout;
                i17 = 1;
                i18 = 33;
            } else {
                this.lima = false;
                i16 = i10;
                i17 = 1;
                i18 = 33;
                alpha = o.alpha(charSequence, textPaint, ceil, charSequence.length(), alpha2, alignment3, i16, truncateAt, (int) Math.ceil(d4), i15, z2, i11, i12, i13, i14);
                alpha2 = alpha2;
            }
            this.foxtrot = alpha;
            Trace.endSection();
            int min = Math.min(alpha.getLineCount(), i16);
            this.golf = min;
            int i23 = min - 1;
            if (min < i16 || (alpha.getEllipsisCount(i23) <= 0 && alpha.getLineEnd(i23) == charSequence.length())) {
                z11 = 0;
            } else {
                z11 = i17;
            }
            this.delta = z11;
            if (!z2) {
                if (this.lima) {
                    BoringLayout boringLayout2 = (BoringLayout) alpha;
                    if (Build.VERSION.SDK_INT >= i18) {
                        i22 = c.zulu(boringLayout2);
                        if (i22 == 0) {
                            TextPaint paint = alpha.getPaint();
                            CharSequence text = alpha.getText();
                            Rect bravo = o.bravo(paint, text, alpha.getLineStart(0), alpha.getLineEnd(0));
                            int lineAscent = alpha.getLineAscent(0);
                            int i24 = bravo.top;
                            if (i24 < lineAscent) {
                                topPadding = lineAscent - i24;
                            } else {
                                topPadding = alpha.getTopPadding();
                            }
                            bravo = min != i17 ? o.bravo(paint, text, alpha.getLineStart(i23), alpha.getLineEnd(i23)) : bravo;
                            int lineDescent = alpha.getLineDescent(i23);
                            int i25 = bravo.bottom;
                            if (i25 > lineDescent) {
                                bottomPadding = i25 - lineDescent;
                            } else {
                                bottomPadding = alpha.getBottomPadding();
                            }
                            j5 = (topPadding == 0 && bottomPadding == 0) ? j5 : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    i22 = 0;
                    if (i22 == 0) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) alpha;
                    int i26 = Build.VERSION.SDK_INT;
                    if (i26 >= i18) {
                        i22 = c.amber(staticLayout);
                    } else {
                        if (i26 >= 28) {
                            i22 = i17;
                        }
                        i22 = 0;
                    }
                    if (i22 == 0) {
                    }
                }
                fontMetricsInt = null;
                if (alpha.getText() instanceof Spanned) {
                    CharSequence text2 = alpha.getText();
                    Intrinsics.charlie(text2, "null cannot be cast to non-null type android.text.Spanned");
                    if (o.foxtrot((Spanned) text2, G0.h.class) || alpha.getText().length() <= 0) {
                        CharSequence text3 = alpha.getText();
                        Intrinsics.charlie(text3, "null cannot be cast to non-null type android.text.Spanned");
                        hVarArr = (G0.h[]) ((Spanned) text3).getSpans(0, alpha.getText().length(), G0.h.class);
                        this.oscar = hVarArr;
                        if (hVarArr != null) {
                            int i27 = 0;
                            int i28 = 0;
                            for (G0.h hVar : hVarArr) {
                                int i29 = hVar.kilo;
                                i27 = i29 < 0 ? Math.max(i27, Math.abs(i29)) : i27;
                                int i30 = hVar.lima;
                                if (i30 < 0) {
                                    i28 = Math.max(i27, Math.abs(i30));
                                }
                            }
                            if (i27 == 0 && i28 == 0) {
                                j6 = s.bravo;
                            } else {
                                j6 = (i27 << 32) | (i28 & 4294967295L);
                            }
                        } else {
                            j6 = s.bravo;
                        }
                        this.hotel = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
                        this.india = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
                        TextPaint textPaint2 = this.alpha;
                        G0.h[] hVarArr2 = this.oscar;
                        i19 = this.golf - 1;
                        layout = this.foxtrot;
                        if (layout.getLineStart(i19) == layout.getLineEnd(i19) || hVarArr2 == null || hVarArr2.length == 0) {
                            i20 = 0;
                        } else {
                            SpannableString spannableString = new SpannableString("\u200b");
                            G0.h hVar2 = (G0.h) ArraysKt.fuchsia(hVarArr2);
                            int length2 = spannableString.length();
                            if (i19 != 0 && hVar2.delta) {
                                z12 = false;
                            } else {
                                z12 = hVar2.delta;
                            }
                            spannableString.setSpan(new G0.h(hVar2.alpha, length2, z12, hVar2.delta, hVar2.echo, hVar2.foxtrot), 0, spannableString.length(), i18);
                            StaticLayout alpha4 = o.alpha(spannableString, textPaint2, LottieConstants.IterateForever, spannableString.length(), alpha2, i.alpha, LottieConstants.IterateForever, null, LottieConstants.IterateForever, 0, this.charlie, 0, 0, 0, 0);
                            fontMetricsInt = new Paint.FontMetricsInt();
                            i20 = 0;
                            fontMetricsInt.ascent = alpha4.getLineAscent(0);
                            fontMetricsInt.descent = alpha4.getLineDescent(0);
                            fontMetricsInt.top = alpha4.getLineTop(0);
                            fontMetricsInt.bottom = alpha4.getLineBottom(0);
                        }
                        if (fontMetricsInt != null) {
                            i21 = fontMetricsInt.bottom - ((int) (echo(i23) - golf(i23)));
                        } else {
                            i21 = i20;
                        }
                        this.november = i21;
                        this.mike = fontMetricsInt;
                        Layout layout2 = this.foxtrot;
                        this.juliet = U4.alpha(layout2, i23, layout2.getPaint());
                        Layout layout3 = this.foxtrot;
                        this.kilo = U4.bravo(layout3, i23, layout3.getPaint());
                    }
                }
                hVarArr = null;
                this.oscar = hVarArr;
                if (hVarArr != null) {
                }
                this.hotel = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
                this.india = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
                TextPaint textPaint22 = this.alpha;
                G0.h[] hVarArr22 = this.oscar;
                i19 = this.golf - 1;
                layout = this.foxtrot;
                if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                }
                i20 = 0;
                if (fontMetricsInt != null) {
                }
                this.november = i21;
                this.mike = fontMetricsInt;
                Layout layout22 = this.foxtrot;
                this.juliet = U4.alpha(layout22, i23, layout22.getPaint());
                Layout layout32 = this.foxtrot;
                this.kilo = U4.bravo(layout32, i23, layout32.getPaint());
            }
            j5 = s.bravo;
            fontMetricsInt = null;
            if (alpha.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.oscar = hVarArr;
            if (hVarArr != null) {
            }
            this.hotel = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
            this.india = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
            TextPaint textPaint222 = this.alpha;
            G0.h[] hVarArr222 = this.oscar;
            i19 = this.golf - 1;
            layout = this.foxtrot;
            if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
            }
            i20 = 0;
            if (fontMetricsInt != null) {
            }
            this.november = i21;
            this.mike = fontMetricsInt;
            Layout layout222 = this.foxtrot;
            this.juliet = U4.alpha(layout222, i23, layout222.getPaint());
            Layout layout322 = this.foxtrot;
            this.kilo = U4.bravo(layout322, i23, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int alpha() {
        int height;
        boolean z2 = this.delta;
        Layout layout = this.foxtrot;
        if (z2) {
            height = layout.getLineBottom(this.golf - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.hotel + this.india + this.november;
    }

    public final float bravo(int i4) {
        if (i4 == this.golf - 1) {
            return this.juliet + this.kilo;
        }
        return 0.0f;
    }

    public final ab charlie() {
        ab abVar = this.quebec;
        if (abVar == null) {
            ab abVar2 = new ab(this.foxtrot);
            this.quebec = abVar2;
            return abVar2;
        }
        Intrinsics.checkNotNull(abVar);
        return abVar;
    }

    public final float delta(int i4) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f5 = this.hotel;
        if (i4 == this.golf - 1 && (fontMetricsInt = this.mike) != null) {
            lineBaseline = golf(i4) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.foxtrot.getLineBaseline(i4);
        }
        return f5 + lineBaseline;
    }

    public final float echo(int i4) {
        int i5;
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.golf;
        int i11 = i10 - 1;
        Layout layout = this.foxtrot;
        if (i4 == i11 && (fontMetricsInt = this.mike) != null) {
            return layout.getLineBottom(i4 - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.hotel + layout.getLineBottom(i4);
        if (i4 == i10 - 1) {
            i5 = this.india;
        } else {
            i5 = 0;
        }
        return lineBottom + i5;
    }

    public final int foxtrot(int i4) {
        q qVar = s.alpha;
        Layout layout = this.foxtrot;
        if (layout.getEllipsisCount(i4) > 0 && this.bravo == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i4);
    }

    public final float golf(int i4) {
        int i5;
        float lineTop = this.foxtrot.getLineTop(i4);
        if (i4 == 0) {
            i5 = 0;
        } else {
            i5 = this.hotel;
        }
        return lineTop + i5;
    }

    public final float hotel(int i4, boolean z2) {
        return bravo(this.foxtrot.getLineForOffset(i4)) + charlie().coral(i4, true, z2);
    }

    public final float india(int i4, boolean z2) {
        return bravo(this.foxtrot.getLineForOffset(i4)) + charlie().coral(i4, false, z2);
    }

    public final F0.e juliet() {
        F0.e eVar = this.echo;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.foxtrot;
        F0.e eVar2 = new F0.e(layout.getText(), layout.getText().length(), this.alpha.getTextLocale());
        this.echo = eVar2;
        return eVar2;
    }
}
