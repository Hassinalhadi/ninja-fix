package com.checkout.components.kmp.rememberme.view.ui;

import D0.g;
import F.G2;
import H0.k;
import H0.r;
import O0.l;
import T.p;
import T.s;
import X4.b;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.Extensions_androidKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"LT/s;", "modifier", "La0/t;", Constants.KEY_COLOR, "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "font", "", Constants.KEY_TEXT, "LO0/k;", "textAlign", "LO0/l;", "textDecoration", "", "TextView-7O2jLU0", "(LT/s;JLcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Ljava/lang/String;ILO0/l;Landroidx/compose/runtime/m;II)V", "TextView", "LD0/g;", "(LT/s;JLcom/checkout/components/kmp/rememberme/shared/model/customization/Font;LD0/g;ILO0/l;Landroidx/compose/runtime/m;II)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextViewKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2  */
    /* renamed from: TextView-7O2jLU0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m126TextView7O2jLU0(@Nullable s sVar, long j5, @NotNull Font font, @NotNull String text, int i4, @Nullable l lVar, @Nullable InterfaceC0581m interfaceC0581m, int i5, int i10) {
        int i11;
        int i12;
        l lVar2;
        s sVar2;
        int i13;
        C0585q c0585q;
        l lVar3;
        Q uniform;
        int i14;
        int i15;
        l lVar4;
        s sVar3;
        int i16;
        Intrinsics.echo(font, "font");
        Intrinsics.echo(text, "text");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1922641398);
        int i17 = i10 & 1;
        if (i17 != 0) {
            i11 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i11 = (c0585q2.golf(sVar) ? 4 : 2) | i5;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= c0585q2.foxtrot(j5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0585q2.golf(font) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= c0585q2.golf(text) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i5 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                i12 = i4;
                if (c0585q2.echo(i12)) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i11 |= i16;
                }
            } else {
                i12 = i4;
            }
            i16 = 8192;
            i11 |= i16;
        } else {
            i12 = i4;
        }
        int i18 = i10 & 32;
        if (i18 != 0) {
            i11 |= 196608;
        } else if ((196608 & i5) == 0) {
            lVar2 = lVar;
            i11 |= c0585q2.golf(lVar2) ? 131072 : 65536;
            if (!c0585q2.magenta(i11 & 1, (74899 & i11) == 74898)) {
                c0585q2.orange();
                if ((i5 & 1) == 0 || c0585q2.beige()) {
                    if (i17 != 0) {
                        sVar = p.alpha;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        i14 = 5;
                    } else {
                        i14 = i12;
                    }
                    if (i18 != 0) {
                        i15 = i14;
                        lVar4 = l.bravo;
                    } else {
                        i15 = i14;
                        lVar4 = lVar2;
                    }
                    sVar3 = sVar;
                } else {
                    c0585q2.ochre();
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                    }
                    sVar3 = sVar;
                    i15 = i12;
                    lVar4 = lVar2;
                }
                c0585q2.romeo();
                m125TextView7O2jLU0(sVar3, j5, font, new g(text), i15, lVar4, c0585q2, i11 & 517118, 0);
                sVar2 = sVar3;
                c0585q = c0585q2;
                lVar3 = lVar4;
                i13 = i15;
            } else {
                c0585q2.ochre();
                sVar2 = sVar;
                i13 = i12;
                c0585q = c0585q2;
                lVar3 = lVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new b(sVar2, j5, font, text, i13, lVar3, i5, i10, 0);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if (!c0585q2.magenta(i11 & 1, (74899 & i11) == 74898)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit TextView_7O2jLU0$lambda$0(s sVar, long j5, Font font, String str, int i4, l lVar, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        m126TextView7O2jLU0(sVar, j5, font, str, i4, lVar, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }

    public static final Unit TextView_7O2jLU0$lambda$1(s sVar, long j5, Font font, g gVar, int i4, l lVar, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        m125TextView7O2jLU0(sVar, j5, font, gVar, i4, lVar, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* renamed from: TextView-7O2jLU0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m125TextView7O2jLU0(@Nullable s sVar, long j5, @NotNull Font font, @NotNull g text, int i4, @Nullable l lVar, @Nullable InterfaceC0581m interfaceC0581m, int i5, int i10) {
        s sVar2;
        int i11;
        long j6;
        int i12;
        l lVar2;
        C0585q c0585q;
        s sVar3;
        int i13;
        l lVar3;
        Q uniform;
        int i14;
        l lVar4;
        s sVar4;
        int i15;
        int i16;
        Intrinsics.echo(font, "font");
        Intrinsics.echo(text, "text");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1978274092);
        int i17 = i10 & 1;
        if (i17 != 0) {
            i11 = i5 | 6;
            sVar2 = sVar;
        } else if ((i5 & 6) == 0) {
            sVar2 = sVar;
            i11 = (c0585q2.golf(sVar2) ? 4 : 2) | i5;
        } else {
            sVar2 = sVar;
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            j6 = j5;
            i11 |= c0585q2.foxtrot(j6) ? 32 : 16;
        } else {
            j6 = j5;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0585q2.golf(font) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= c0585q2.golf(text) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i5 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                i12 = i4;
                if (c0585q2.echo(i12)) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i11 |= i16;
                }
            } else {
                i12 = i4;
            }
            i16 = 8192;
            i11 |= i16;
        } else {
            i12 = i4;
        }
        int i18 = i10 & 32;
        if (i18 != 0) {
            i11 |= 196608;
        } else if ((196608 & i5) == 0) {
            lVar2 = lVar;
            i11 |= c0585q2.golf(lVar2) ? 131072 : 65536;
            if (!c0585q2.magenta(i11 & 1, (74899 & i11) == 74898)) {
                c0585q2.orange();
                if ((i5 & 1) != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                    }
                    int i19 = i11;
                    sVar4 = sVar2;
                    i14 = i19;
                    i15 = i12;
                    lVar4 = lVar2;
                } else {
                    s sVar5 = i17 != 0 ? p.alpha : sVar2;
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        i12 = 5;
                    }
                    if (i18 != 0) {
                        lVar4 = l.bravo;
                        i14 = i11;
                    } else {
                        i14 = i11;
                        lVar4 = lVar2;
                    }
                    sVar4 = sVar5;
                    i15 = i12;
                }
                c0585q2.romeo();
                k composeFontFamily = Extensions_androidKt.toComposeFontFamily(font.getFontFamily());
                int i20 = i14 << 3;
                c0585q = c0585q2;
                G2.charlie(text, sVar4, j6, AbstractC2636d7.charlie(font.getFontSize()), new r(ExtensionsKt.toComposeFontStyle(font.getFontStyle())), ExtensionsKt.toComposeFontWeight(font.getFontWeight()), composeFontFamily, ExtensionsKt.toLetterSpacing(font.getLetterSpacing()), lVar4, new O0.k(i15), ExtensionsKt.toComposeLineHeight(font.getLineHeight(), font.getFontSize()), 0, false, 0, 0, null, null, null, c0585q, (i20 & 896) | ((i14 >> 9) & 14) | (i20 & 112) | ((i14 << 9) & 234881024) | ((i14 << 15) & 1879048192), 260096);
                sVar3 = sVar4;
                lVar3 = lVar4;
                i13 = i15;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                sVar3 = sVar2;
                i13 = i12;
                lVar3 = lVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new b(sVar3, j5, font, text, i13, lVar3, i5, i10, 1);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if (!c0585q2.magenta(i11 & 1, (74899 & i11) == 74898)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
