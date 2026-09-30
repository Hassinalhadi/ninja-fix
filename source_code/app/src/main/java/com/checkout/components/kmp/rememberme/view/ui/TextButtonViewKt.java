package com.checkout.components.kmp.rememberme.view.ui;

import A0.h;
import Bb.e;
import O0.l;
import T.p;
import T.s;
import X4.a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", Constants.KEY_TEXT, "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "LT/s;", "modifier", "Lkotlin/Function0;", "", "onClick", "TextButtonView", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;LT/s;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "font", "La0/t;", Constants.KEY_COLOR, "LO0/l;", "textDecoration", "TextButtonView-FU0evQE", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;JLO0/l;LT/s;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "buttonTextViewModifier", "(LT/s;Lkotlin/jvm/functions/Function0;)LT/s;", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextButtonViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButtonView(@NotNull String text, @NotNull DesignTokens designTokens, @Nullable s sVar, @NotNull Function0<Unit> onClick, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        Q uniform;
        s sVar3;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(681713803);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) == 0) {
                if (c0585q.india(onClick)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i10 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                if (i15 != 0) {
                    sVar3 = p.alpha;
                } else {
                    sVar3 = sVar2;
                }
                TextViewKt.m126TextView7O2jLU0(buttonTextViewModifier(sVar3, onClick), ExtensionsKt.actionColor(designTokens), designTokens.getFonts().getLabel(), text, 0, (l) null, c0585q, (i10 << 9) & 7168, 48);
                sVar2 = sVar3;
            } else {
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new e(text, designTokens, sVar2, onClick, i4, i5, 2);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) == 0) {
        }
        if ((i10 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit TextButtonView$lambda$0(String str, DesignTokens designTokens, s sVar, Function0 function0, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        TextButtonView(str, designTokens, sVar, function0, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* renamed from: TextButtonView-FU0evQE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m124TextButtonViewFU0evQE(@NotNull String text, @NotNull Font font, long j5, @NotNull l textDecoration, @Nullable s sVar, @NotNull Function0<Unit> onClick, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        s sVar3;
        Q uniform;
        s sVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(font, "font");
        Intrinsics.echo(textDecoration, "textDecoration");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-771745652);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(font)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.foxtrot(j5)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(textDecoration)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        int i17 = i5 & 16;
        if (i17 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
            if ((196608 & i4) == 0) {
                if (c0585q.india(onClick)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i10 |= i12;
            }
            if ((74899 & i10) == 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                if (i17 != 0) {
                    sVar4 = p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                int i18 = i10;
                TextViewKt.m126TextView7O2jLU0(buttonTextViewModifier(sVar4, onClick), j5, font, text, 0, textDecoration, c0585q, ((i18 >> 3) & 112) | ((i18 << 3) & 896) | ((i18 << 9) & 7168) | ((i18 << 6) & 458752), 16);
                sVar3 = sVar4;
            } else {
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new a(text, font, j5, textDecoration, sVar3, onClick, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((196608 & i4) == 0) {
        }
        if ((74899 & i10) == 74898) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit TextButtonView_FU0evQE$lambda$1(String str, Font font, long j5, l lVar, s sVar, Function0 function0, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m124TextButtonViewFU0evQE(str, font, j5, lVar, sVar, function0, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    private static final s buttonTextViewModifier(s sVar, Function0<Unit> function0) {
        return AbstractC0538d.tango(androidx.compose.foundation.a.delta(sVar, false, null, new h(0), function0, 3), 8, 2);
    }
}
