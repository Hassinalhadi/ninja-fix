package com.checkout.components.core.ui.views;

import Bb.e;
import D0.an;
import F.G2;
import F4.g;
import T.p;
import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", Constants.KEY_TEXT, "LT/s;", "modifier", "LD0/an;", "textStyle", "testTag", "", "InternalTextLabelView", "(Ljava/lang/String;LT/s;LD0/an;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "InternalTextLabelViewPreview", "(Landroidx/compose/runtime/m;I)V", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalTextLabelViewKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalTextLabelView(@NotNull String text, @Nullable s sVar, @Nullable an anVar, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z2;
        C0585q c0585q;
        s sVar3;
        String str3;
        Q uniform;
        s sVar4;
        String str4;
        an anVar2;
        int i14;
        int i15;
        Intrinsics.echo(text, "text");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1918014291);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                if (c0585q2.golf(anVar)) {
                    i14 = Barcode.FORMAT_QR_CODE;
                } else {
                    i14 = 128;
                }
                i10 |= i14;
            }
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                str2 = str;
                if (c0585q2.golf(str2)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                if ((i10 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q2.magenta(i10 & 1, z2)) {
                    if (i16 != 0) {
                        sVar4 = p.alpha;
                    } else {
                        sVar4 = sVar2;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    s optionalTestTag = ModifierExtensionsKt.optionalTestTag(sVar4, str4);
                    if (anVar == null) {
                        anVar2 = new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215);
                    } else {
                        anVar2 = anVar;
                    }
                    c0585q = c0585q2;
                    G2.bravo(text, optionalTestTag, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q, i10 & 14, 0, 65532);
                    str3 = str4;
                    sVar3 = sVar4;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    sVar3 = sVar2;
                    str3 = str2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new e(text, sVar3, anVar, str3, i4, i5);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i10 & 1171) != 1170) {
            }
            if (c0585q2.magenta(i10 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        if ((i4 & 384) == 0) {
        }
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        str2 = str;
        if ((i10 & 1171) != 1170) {
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void InternalTextLabelViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2067561100);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            InternalTextLabelView("Hello World", p.alpha, new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215), null, c0585q, 438, 8);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 4);
        }
    }

    public static final Unit a(String str, s sVar, an anVar, String str2, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InternalTextLabelView(str, sVar, anVar, str2, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InternalTextLabelViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
