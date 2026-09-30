package t6;

import android.content.res.Resources;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* renamed from: t6.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3086y3 {
    public static final String alpha(int i4, Object[] objArr, InterfaceC0581m interfaceC0581m) {
        return ((Resources) ((C0585q) interfaceC0581m).kilo(AndroidCompositionLocals_androidKt.charlie)).getString(i4, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String bravo(InterfaceC0581m interfaceC0581m, int i4) {
        return ((Resources) ((C0585q) interfaceC0581m).kilo(AndroidCompositionLocals_androidKt.charlie)).getString(i4);
    }
}
