package D0;

import a0.AbstractC0349c;
import a0.AbstractC0362p;
import a0.InterfaceC0364r;
import a0.ar;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final class a {
    public final L0.d alpha;
    public final int bravo;
    public final long charlie;
    public final E0.r delta;
    public final CharSequence echo;
    public final List foxtrot;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(L0.d dVar, int i4, int i5, long j5) {
        boolean z2;
        int i10;
        int i11;
        CharSequence charSequence;
        int i12;
        int i13;
        an anVar;
        int i14;
        an anVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        char c3;
        int i24;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        E0.r alpha;
        int i25;
        a aVar;
        int i26;
        E0.r rVar;
        N0.b[] bVarArr;
        CharSequence charSequence2;
        List list;
        boolean z10;
        boolean z11;
        boolean z12;
        Z.c cVar;
        O0.j jVar;
        float hotel;
        int i27;
        int i28;
        Layout layout;
        int i29;
        Spannable spannable;
        this.alpha = dVar;
        this.bravo = i4;
        this.charlie = j5;
        if (Q0.a.india(j5) != 0 || Q0.a.juliet(j5) != 0) {
            J0.a.alpha("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i4 < 1) {
            J0.a.alpha("maxLines should be greater than 0");
        }
        if (i5 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        an anVar3 = dVar.purple;
        CharSequence charSequence3 = dVar.f1700a;
        if (z2) {
            i10 = 1;
            i11 = 0;
            charSequence = charSequence3;
            if (!Q0.p.alpha(anVar3.alpha.hotel, AbstractC2636d7.charlie(0))) {
                charSequence = charSequence3;
                if (!Q0.p.alpha(anVar3.alpha.hotel, Q0.p.charlie)) {
                    int i30 = anVar3.bravo.alpha;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i30 != Integer.MIN_VALUE && i30 != 5 && i30 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            if (charSequence3 instanceof Spannable) {
                                spannable = (Spannable) charSequence3;
                            } else {
                                spannable = null;
                            }
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean foxtrot = E0.o.foxtrot(spannableString, G0.c.class);
                            charSequence = spannableString;
                            if (!foxtrot) {
                                spannableString.setSpan(new Object(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i10 = 1;
            i11 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.echo = charSequence4;
        t tVar = anVar3.bravo;
        int i31 = tVar.alpha;
        if (i31 == i10) {
            i12 = 3;
        } else if (i31 == 2) {
            i12 = 4;
        } else if (i31 == 3) {
            i12 = 2;
        } else if (i31 != 5 && i31 == 6) {
            i12 = 1;
        } else {
            i12 = i11;
        }
        if (i31 == 4) {
            i13 = 1;
        } else {
            i13 = i11;
        }
        if (tVar.hotel == 2) {
            if (Build.VERSION.SDK_INT <= 32) {
                anVar = anVar3;
                i14 = 2;
            } else {
                anVar = anVar3;
                i14 = 4;
            }
        } else {
            anVar = anVar3;
            i14 = i11;
        }
        int i32 = tVar.golf;
        int i33 = i32 & 255;
        if (i33 != 1) {
            if (i33 == 2) {
                anVar2 = anVar;
                i15 = 1;
            } else if (i33 == 3) {
                anVar2 = anVar;
                i15 = 2;
            }
            i16 = (i32 >> 8) & 255;
            if (i16 != 1) {
                if (i16 == 2) {
                    i17 = 1;
                } else if (i16 == 3) {
                    i17 = 2;
                } else if (i16 == 4) {
                    i17 = 3;
                }
                i18 = (i32 >> 16) & 255;
                if (i18 == 1) {
                    i19 = 2;
                } else {
                    i19 = 2;
                    if (i18 == 2) {
                        i20 = 1;
                        if (i5 != i19) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i5 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else if (i5 == 4) {
                            truncateAt2 = TextUtils.TruncateAt.START;
                        } else {
                            int i34 = i17;
                            i21 = 5;
                            i22 = i34;
                            i23 = 4;
                            c3 = ' ';
                            i24 = i20;
                            truncateAt = null;
                            alpha = alpha(i12, i13, truncateAt, i4, i14, i15, i22, i24, charSequence4);
                            if (Build.VERSION.SDK_INT < 35 && dVar.yellow.getLetterSpacing() != 0.0f && (i5 == i23 || i5 == i21)) {
                                layout = alpha.foxtrot;
                                i29 = i11;
                                if (layout.getEllipsisCount(i29) > 0) {
                                    int ellipsisStart = layout.getEllipsisStart(i29);
                                    int ellipsisCount = layout.getEllipsisCount(i29) + ellipsisStart;
                                    CharSequence subSequence = charSequence4.subSequence(i29, ellipsisStart);
                                    CharSequence subSequence2 = charSequence4.subSequence(ellipsisCount, charSequence4.length());
                                    CharSequence[] charSequenceArr = new CharSequence[3];
                                    charSequenceArr[i29] = subSequence;
                                    charSequenceArr[1] = "…";
                                    i25 = 2;
                                    charSequenceArr[2] = subSequence2;
                                    aVar = this;
                                    i26 = i4;
                                    alpha = aVar.alpha(i12, i13, truncateAt, i26, i14, i15, i22, i24, TextUtils.concat(charSequenceArr));
                                    if (i5 != i25 && alpha.alpha() > Q0.a.golf(j5) && i26 > 1) {
                                        int golf = Q0.a.golf(j5);
                                        int i35 = 0;
                                        while (true) {
                                            i27 = alpha.golf;
                                            if (i35 >= i27) {
                                                break;
                                            }
                                            if (alpha.echo(i35) > golf) {
                                                i27 = i35;
                                                break;
                                            }
                                            i35++;
                                        }
                                        if (i27 >= 0 && i27 != aVar.bravo) {
                                            if (i27 < 1) {
                                                i28 = 1;
                                            } else {
                                                i28 = i27;
                                            }
                                            alpha = aVar.alpha(i12, i13, truncateAt, i28, i14, i15, i22, i24, aVar.echo);
                                        }
                                        aVar.delta = alpha;
                                    } else {
                                        aVar.delta = alpha;
                                    }
                                    L0.d dVar2 = aVar.alpha;
                                    af afVar = anVar2.alpha;
                                    AbstractC0362p echo = afVar.alpha.echo();
                                    float delta = aVar.delta();
                                    float bravo = aVar.bravo();
                                    dVar2.yellow.charlie(echo, (Float.floatToRawIntBits(bravo) & 4294967295L) | (Float.floatToRawIntBits(delta) << c3), afVar.alpha.alpha());
                                    rVar = aVar.delta;
                                    if (rVar.foxtrot.getText() instanceof Spanned) {
                                        Layout layout2 = rVar.foxtrot;
                                        CharSequence text = layout2.getText();
                                        Intrinsics.charlie(text, "null cannot be cast to non-null type android.text.Spanned");
                                        Spanned spanned = (Spanned) text;
                                        if (spanned.nextSpanTransition(-1, spanned.length(), N0.b.class) != spanned.length()) {
                                            CharSequence text2 = layout2.getText();
                                            Intrinsics.charlie(text2, "null cannot be cast to non-null type android.text.Spanned");
                                            bVarArr = (N0.b[]) ((Spanned) text2).getSpans(0, layout2.getText().length(), N0.b.class);
                                            if (bVarArr != null) {
                                                Lf.h golf2 = kotlin.jvm.internal.x.golf(bVarArr);
                                                while (golf2.hasNext()) {
                                                    N0.b bVar = (N0.b) golf2.next();
                                                    float delta2 = aVar.delta();
                                                    float bravo2 = aVar.bravo();
                                                    ((t0) bVar.red).setValue(new Z.e((Float.floatToRawIntBits(bravo2) & 4294967295L) | (Float.floatToRawIntBits(delta2) << c3)));
                                                }
                                            }
                                            charSequence2 = aVar.echo;
                                            if (!(charSequence2 instanceof Spanned)) {
                                                list = CollectionsKt.emptyList();
                                            } else {
                                                Spanned spanned2 = (Spanned) charSequence2;
                                                Object[] spans = spanned2.getSpans(0, charSequence2.length(), G0.i.class);
                                                ArrayList arrayList = new ArrayList(spans.length);
                                                for (Object obj : spans) {
                                                    G0.i iVar = (G0.i) obj;
                                                    int spanStart = spanned2.getSpanStart(iVar);
                                                    int spanEnd = spanned2.getSpanEnd(iVar);
                                                    int lineForOffset = aVar.delta.foxtrot.getLineForOffset(spanStart);
                                                    if (lineForOffset >= aVar.bravo) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (aVar.delta.foxtrot.getEllipsisCount(lineForOffset) > 0 && spanEnd > aVar.delta.foxtrot.getEllipsisStart(lineForOffset)) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (spanEnd > aVar.delta.foxtrot(lineForOffset)) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (!z11 && !z12 && !z10) {
                                                        if (aVar.delta.foxtrot.isRtlCharAt(spanStart)) {
                                                            jVar = O0.j.purple;
                                                        } else {
                                                            jVar = O0.j.alpha;
                                                        }
                                                        int ordinal = jVar.ordinal();
                                                        if (ordinal != 0) {
                                                            if (ordinal == 1) {
                                                                float hotel2 = aVar.delta.hotel(spanStart, false);
                                                                if (!iVar.silver) {
                                                                    J0.a.bravo("PlaceholderSpan is not laid out yet.");
                                                                }
                                                                hotel = hotel2 - iVar.purple;
                                                            } else {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        } else {
                                                            hotel = aVar.delta.hotel(spanStart, false);
                                                        }
                                                        if (!iVar.silver) {
                                                            J0.a.bravo("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        float delta3 = aVar.delta.delta(lineForOffset) - iVar.bravo();
                                                        cVar = new Z.c(hotel, delta3, iVar.purple + hotel, iVar.bravo() + delta3);
                                                    } else {
                                                        cVar = null;
                                                    }
                                                    arrayList.add(cVar);
                                                }
                                                list = arrayList;
                                            }
                                            aVar.foxtrot = list;
                                        }
                                    }
                                    bVarArr = null;
                                    if (bVarArr != null) {
                                    }
                                    charSequence2 = aVar.echo;
                                    if (!(charSequence2 instanceof Spanned)) {
                                    }
                                    aVar.foxtrot = list;
                                }
                            }
                            i25 = 2;
                            aVar = this;
                            i26 = i4;
                            if (i5 != i25) {
                            }
                            aVar.delta = alpha;
                            L0.d dVar22 = aVar.alpha;
                            af afVar2 = anVar2.alpha;
                            AbstractC0362p echo2 = afVar2.alpha.echo();
                            float delta4 = aVar.delta();
                            float bravo3 = aVar.bravo();
                            dVar22.yellow.charlie(echo2, (Float.floatToRawIntBits(bravo3) & 4294967295L) | (Float.floatToRawIntBits(delta4) << c3), afVar2.alpha.alpha());
                            rVar = aVar.delta;
                            if (rVar.foxtrot.getText() instanceof Spanned) {
                            }
                            bVarArr = null;
                            if (bVarArr != null) {
                            }
                            charSequence2 = aVar.echo;
                            if (!(charSequence2 instanceof Spanned)) {
                            }
                            aVar.foxtrot = list;
                        }
                        i24 = i20;
                        truncateAt = truncateAt2;
                        i23 = 4;
                        int i36 = i17;
                        i21 = 5;
                        i22 = i36;
                        c3 = ' ';
                        alpha = alpha(i12, i13, truncateAt, i4, i14, i15, i22, i24, charSequence4);
                        if (Build.VERSION.SDK_INT < 35) {
                            layout = alpha.foxtrot;
                            i29 = i11;
                            if (layout.getEllipsisCount(i29) > 0) {
                            }
                        }
                        i25 = 2;
                        aVar = this;
                        i26 = i4;
                        if (i5 != i25) {
                        }
                        aVar.delta = alpha;
                        L0.d dVar222 = aVar.alpha;
                        af afVar22 = anVar2.alpha;
                        AbstractC0362p echo22 = afVar22.alpha.echo();
                        float delta42 = aVar.delta();
                        float bravo32 = aVar.bravo();
                        dVar222.yellow.charlie(echo22, (Float.floatToRawIntBits(bravo32) & 4294967295L) | (Float.floatToRawIntBits(delta42) << c3), afVar22.alpha.alpha());
                        rVar = aVar.delta;
                        if (rVar.foxtrot.getText() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = aVar.echo;
                        if (!(charSequence2 instanceof Spanned)) {
                        }
                        aVar.foxtrot = list;
                    }
                }
                i20 = i11;
                if (i5 != i19) {
                }
                i24 = i20;
                truncateAt = truncateAt2;
                i23 = 4;
                int i362 = i17;
                i21 = 5;
                i22 = i362;
                c3 = ' ';
                alpha = alpha(i12, i13, truncateAt, i4, i14, i15, i22, i24, charSequence4);
                if (Build.VERSION.SDK_INT < 35) {
                }
                i25 = 2;
                aVar = this;
                i26 = i4;
                if (i5 != i25) {
                }
                aVar.delta = alpha;
                L0.d dVar2222 = aVar.alpha;
                af afVar222 = anVar2.alpha;
                AbstractC0362p echo222 = afVar222.alpha.echo();
                float delta422 = aVar.delta();
                float bravo322 = aVar.bravo();
                dVar2222.yellow.charlie(echo222, (Float.floatToRawIntBits(bravo322) & 4294967295L) | (Float.floatToRawIntBits(delta422) << c3), afVar222.alpha.alpha());
                rVar = aVar.delta;
                if (rVar.foxtrot.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = aVar.echo;
                if (!(charSequence2 instanceof Spanned)) {
                }
                aVar.foxtrot = list;
            }
            i17 = i11;
            i18 = (i32 >> 16) & 255;
            if (i18 == 1) {
            }
            i20 = i11;
            if (i5 != i19) {
            }
            i24 = i20;
            truncateAt = truncateAt2;
            i23 = 4;
            int i3622 = i17;
            i21 = 5;
            i22 = i3622;
            c3 = ' ';
            alpha = alpha(i12, i13, truncateAt, i4, i14, i15, i22, i24, charSequence4);
            if (Build.VERSION.SDK_INT < 35) {
            }
            i25 = 2;
            aVar = this;
            i26 = i4;
            if (i5 != i25) {
            }
            aVar.delta = alpha;
            L0.d dVar22222 = aVar.alpha;
            af afVar2222 = anVar2.alpha;
            AbstractC0362p echo2222 = afVar2222.alpha.echo();
            float delta4222 = aVar.delta();
            float bravo3222 = aVar.bravo();
            dVar22222.yellow.charlie(echo2222, (Float.floatToRawIntBits(bravo3222) & 4294967295L) | (Float.floatToRawIntBits(delta4222) << c3), afVar2222.alpha.alpha());
            rVar = aVar.delta;
            if (rVar.foxtrot.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence2 = aVar.echo;
            if (!(charSequence2 instanceof Spanned)) {
            }
            aVar.foxtrot = list;
        }
        anVar2 = anVar;
        i15 = i11;
        i16 = (i32 >> 8) & 255;
        if (i16 != 1) {
        }
        i17 = i11;
        i18 = (i32 >> 16) & 255;
        if (i18 == 1) {
        }
        i20 = i11;
        if (i5 != i19) {
        }
        i24 = i20;
        truncateAt = truncateAt2;
        i23 = 4;
        int i36222 = i17;
        i21 = 5;
        i22 = i36222;
        c3 = ' ';
        alpha = alpha(i12, i13, truncateAt, i4, i14, i15, i22, i24, charSequence4);
        if (Build.VERSION.SDK_INT < 35) {
        }
        i25 = 2;
        aVar = this;
        i26 = i4;
        if (i5 != i25) {
        }
        aVar.delta = alpha;
        L0.d dVar222222 = aVar.alpha;
        af afVar22222 = anVar2.alpha;
        AbstractC0362p echo22222 = afVar22222.alpha.echo();
        float delta42222 = aVar.delta();
        float bravo32222 = aVar.bravo();
        dVar222222.yellow.charlie(echo22222, (Float.floatToRawIntBits(bravo32222) & 4294967295L) | (Float.floatToRawIntBits(delta42222) << c3), afVar22222.alpha.alpha());
        rVar = aVar.delta;
        if (rVar.foxtrot.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = aVar.echo;
        if (!(charSequence2 instanceof Spanned)) {
        }
        aVar.foxtrot = list;
    }

    public final E0.r alpha(int i4, int i5, TextUtils.TruncateAt truncateAt, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence) {
        boolean z2;
        v vVar;
        float delta = delta();
        L0.d dVar = this.alpha;
        L0.a aVar = L0.b.alpha;
        x xVar = dVar.purple.charlie;
        if (xVar != null && (vVar = xVar.bravo) != null) {
            z2 = vVar.alpha;
        } else {
            z2 = false;
        }
        return new E0.r(charSequence, delta, dVar.yellow, i4, truncateAt, dVar.e, z2, i10, i12, i13, i14, i11, i5, dVar.f1701b);
    }

    public final float bravo() {
        return this.delta.alpha();
    }

    /* JADX WARN: Type inference failed for: r13v25, types: [E0.b] */
    public final long charlie(Z.c cVar, int i4, A8.a aVar) {
        boolean z2;
        F0.d cVar2;
        F0.d dVar;
        int i5;
        int[] iArr;
        SegmentFinder oscar;
        RectF amber = a0.ao.amber(cVar);
        if (i4 != 0 && i4 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        final Ac.k kVar = new Ac.k(3, aVar);
        int i10 = Build.VERSION.SDK_INT;
        E0.r rVar = this.delta;
        TextPaint textPaint = rVar.alpha;
        Layout layout = rVar.foxtrot;
        if (i10 >= 34) {
            if (z2) {
                oscar = new F0.a(new J2.c(4, layout.getText(), rVar.juliet()));
            } else {
                E0.a.tango();
                oscar = E0.a.oscar(E0.a.november(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(amber, oscar, new Layout.TextInclusionStrategy() { // from class: E0.b
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) Ac.k.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            B9.ab charlie = rVar.charlie();
            if (z2) {
                dVar = new J2.c(4, layout.getText(), rVar.juliet());
            } else {
                CharSequence text = layout.getText();
                if (i10 >= 29) {
                    cVar2 = new F0.b(text, textPaint);
                } else {
                    cVar2 = new F0.c(text);
                }
                dVar = cVar2;
            }
            F0.d dVar2 = dVar;
            int lineForVertical = layout.getLineForVertical((int) amber.top);
            if (amber.top <= rVar.echo(lineForVertical) || (lineForVertical = lineForVertical + 1) < rVar.golf) {
                int i11 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) amber.bottom);
                if (lineForVertical2 != 0 || amber.bottom >= rVar.golf(0)) {
                    int echo = E0.o.echo(rVar, layout, charlie, i11, amber, dVar2, kVar, true);
                    while (true) {
                        i5 = i11;
                        if (echo != -1 || i5 >= lineForVertical2) {
                            break;
                        }
                        i11 = i5 + 1;
                        echo = E0.o.echo(rVar, layout, charlie, i11, amber, dVar2, kVar, true);
                    }
                    if (echo != -1) {
                        int i12 = lineForVertical2;
                        int echo2 = E0.o.echo(rVar, layout, charlie, i12, amber, dVar2, kVar, false);
                        while (echo2 == -1 && i5 < i12) {
                            i12--;
                            echo2 = E0.o.echo(rVar, layout, charlie, i12, amber, dVar2, kVar, false);
                        }
                        if (echo2 != -1) {
                            iArr = new int[]{dVar2.foxtrot(echo + 1), dVar2.golf(echo2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return am.bravo;
        }
        return ae.bravo(iArr[0], iArr[1]);
    }

    public final float delta() {
        return Q0.a.hotel(this.charlie);
    }

    public final void echo(InterfaceC0364r interfaceC0364r) {
        Canvas alpha = AbstractC0349c.alpha(interfaceC0364r);
        E0.r rVar = this.delta;
        if (rVar.delta) {
            alpha.save();
            alpha.clipRect(0.0f, 0.0f, delta(), bravo());
        }
        if (alpha.getClipBounds(rVar.papa)) {
            int i4 = rVar.hotel;
            if (i4 != 0) {
                alpha.translate(0.0f, i4);
            }
            E0.q qVar = E0.s.alpha;
            qVar.alpha = alpha;
            rVar.foxtrot.draw(qVar);
            if (i4 != 0) {
                alpha.translate(0.0f, (-1) * i4);
            }
        }
        if (rVar.delta) {
            alpha.restore();
        }
    }

    public final void foxtrot(InterfaceC0364r interfaceC0364r, long j5, ar arVar, O0.l lVar, c0.e eVar) {
        L0.f fVar = this.alpha.yellow;
        int i4 = fVar.charlie;
        fVar.delta(j5);
        fVar.foxtrot(arVar);
        fVar.golf(lVar);
        fVar.echo(eVar);
        fVar.bravo(3);
        echo(interfaceC0364r);
        fVar.bravo(i4);
    }

    public final void golf(InterfaceC0364r interfaceC0364r, AbstractC0362p abstractC0362p, float f5, ar arVar, O0.l lVar, c0.e eVar) {
        L0.f fVar = this.alpha.yellow;
        int i4 = fVar.charlie;
        float delta = delta();
        float bravo = bravo();
        fVar.charlie(abstractC0362p, (Float.floatToRawIntBits(bravo) & 4294967295L) | (Float.floatToRawIntBits(delta) << 32), f5);
        fVar.foxtrot(arVar);
        fVar.golf(lVar);
        fVar.echo(eVar);
        fVar.bravo(3);
        echo(interfaceC0364r);
        fVar.bravo(i4);
    }
}
