package com.checkout.components.core.ui.views;

import H4.a;
import a0.C0360n;
import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3076w3;
import t6.W3;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "drawableResourceId", "", "contentDescription", "La0/t;", "imageTint", "", "InternalImageView-gKt5lHk", "(ILjava/lang/String;La0/t;Landroidx/compose/runtime/m;II)V", "InternalImageView", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalImageViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* renamed from: InternalImageView-gKt5lHk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m98InternalImageViewgKt5lHk(int i4, @Nullable String str, @Nullable C0366t c0366t, @Nullable InterfaceC0581m interfaceC0581m, int i5, int i10) {
        int i11;
        C0366t c0366t2;
        int i12;
        boolean z2;
        Q uniform;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-190780255);
        if ((i5 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i5;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.golf(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        int i15 = i10 & 4;
        if (i15 != 0) {
            i11 |= 384;
        } else if ((i5 & 384) == 0) {
            c0366t2 = c0366t;
            if (c0585q.golf(c0366t2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i11 |= i12;
            if ((i11 & 147) == 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i11 & 1, z2)) {
                C0360n c0360n = null;
                if (i15 != 0) {
                    c0366t2 = null;
                }
                AbstractC1680b charlie = AbstractC3076w3.charlie(i4, c0585q, i11 & 14);
                if (c0366t2 != null) {
                    c0360n = new C0360n(c0366t2.alpha, 5);
                }
                W3.alpha(charlie, str, null, null, null, 0.0f, c0360n, c0585q, i11 & 112, 60);
            } else {
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new a(i4, str, c0366t2, i5, i10);
                return;
            }
            return;
        }
        c0366t2 = c0366t;
        if ((i11 & 147) == 146) {
        }
        if (!c0585q.magenta(i11 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(int i4, String str, C0366t c0366t, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        m98InternalImageViewgKt5lHk(i4, str, c0366t, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }
}
