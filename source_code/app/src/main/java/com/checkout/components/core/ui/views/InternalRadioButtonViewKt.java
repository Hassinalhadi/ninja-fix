package com.checkout.components.core.ui.views;

import F.I1;
import F.K1;
import F4.g;
import Xd.l;
import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.core.ui.views.InternalRadioButtonViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a9\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "La0/t;", "selectedColor", "unselectedColor", "InternalRadioButtonView-eaDK9VM", "(ZLkotlin/jvm/functions/Function0;JJLandroidx/compose/runtime/m;II)V", "InternalRadioButtonView", "InternalRadioButtonViewPreview", "(Landroidx/compose/runtime/m;I)V", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalRadioButtonViewKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* renamed from: InternalRadioButtonView-eaDK9VM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m99InternalRadioButtonVieweaDK9VM(final boolean z2, @Nullable Function0<Unit> function0, final long j5, final long j6, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        final Function0<Unit> function02;
        int i11;
        boolean z10;
        Q uniform;
        Function0<Unit> function03;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1898138278);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                if (c0585q.foxtrot(j5)) {
                    i13 = Barcode.FORMAT_QR_CODE;
                } else {
                    i13 = 128;
                }
                i10 |= i13;
            }
            if ((i4 & 3072) == 0) {
                if (c0585q.foxtrot(j6)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i10 & 1171) == 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!c0585q.magenta(i10 & 1, z10)) {
                if (i15 != 0) {
                    function03 = null;
                } else {
                    function03 = function02;
                }
                I1.alpha(z2, function03, null, false, K1.papa(j5, j6, c0585q), c0585q, i10 & 126, 44);
                function02 = function03;
            } else {
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new l() { // from class: H4.b
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit a6;
                        int intValue = ((Integer) obj2).intValue();
                        int i16 = i4;
                        int i17 = i5;
                        a6 = InternalRadioButtonViewKt.a(z2, function02, j5, j6, i16, i17, (InterfaceC0581m) obj, intValue);
                        return a6;
                    }
                };
                return;
            }
            return;
        }
        function02 = function0;
        if ((i4 & 384) == 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        if ((i10 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i10 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void InternalRadioButtonViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-173040000);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            m99InternalRadioButtonVieweaDK9VM(true, null, C0366t.hotel, C0366t.charlie, c0585q, 3462, 2);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 3);
        }
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InternalRadioButtonViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z2, Function0 function0, long j5, long j6, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m99InternalRadioButtonVieweaDK9VM(z2, function0, j5, j6, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
