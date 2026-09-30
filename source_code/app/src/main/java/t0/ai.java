package t0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai implements ViewTranslationCallback {
    public static final ai alpha = new Object();

    public final boolean onClearTranslation(View view) {
        A0.a aVar;
        Function0 function0;
        Intrinsics.charlie(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        V.d contentCaptureManager$ui_release = ((C2946x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.white = V.a.alpha;
        bv.n delta = contentCaptureManager$ui_release.delta();
        Object[] objArr = delta.charlie;
        long[] jArr = delta.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            A0.k kVar = ((A0.t) objArr[(i4 << 3) + i10]).alpha.delta;
                            if (A0.v.delta(kVar, A0.x.beige) != null && (aVar = (A0.a) A0.v.delta(kVar, A0.j.mike)) != null && (function0 = (Function0) aVar.bravo) != null) {
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return true;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        A0.a aVar;
        Function1 function1;
        Intrinsics.charlie(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        V.d contentCaptureManager$ui_release = ((C2946x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.white = V.a.alpha;
        bv.n delta = contentCaptureManager$ui_release.delta();
        Object[] objArr = delta.charlie;
        long[] jArr = delta.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            A0.k kVar = ((A0.t) objArr[(i4 << 3) + i10]).alpha.delta;
                            if (Intrinsics.areEqual(A0.v.delta(kVar, A0.x.beige), Boolean.TRUE) && (aVar = (A0.a) A0.v.delta(kVar, A0.j.lima)) != null && (function1 = (Function1) aVar.bravo) != null) {
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return true;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        A0.a aVar;
        Function1 function1;
        Intrinsics.charlie(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        V.d contentCaptureManager$ui_release = ((C2946x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.white = V.a.purple;
        bv.n delta = contentCaptureManager$ui_release.delta();
        Object[] objArr = delta.charlie;
        long[] jArr = delta.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            A0.k kVar = ((A0.t) objArr[(i4 << 3) + i10]).alpha.delta;
                            if (Intrinsics.areEqual(A0.v.delta(kVar, A0.x.beige), Boolean.FALSE) && (aVar = (A0.a) A0.v.delta(kVar, A0.j.lima)) != null && (function1 = (Function1) aVar.bravo) != null) {
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return true;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
