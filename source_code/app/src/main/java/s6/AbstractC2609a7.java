package s6;

import android.view.View;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC2196f;

/* renamed from: s6.a7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2609a7 {
    public static final InterfaceC2196f alpha(View view) {
        InterfaceC2196f interfaceC2196f;
        Intrinsics.echo(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof InterfaceC2196f) {
                interfaceC2196f = (InterfaceC2196f) tag;
            } else {
                interfaceC2196f = null;
            }
            if (interfaceC2196f != null) {
                return interfaceC2196f;
            }
            Object charlie = t6.B2.charlie(view);
            if (charlie instanceof View) {
                view = (View) charlie;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final long bravo(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) + ((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long charlie(long j5) {
        return (Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j5 >> 32))) << 32);
    }

    public static final void delta(View view, InterfaceC2196f interfaceC2196f) {
        Intrinsics.echo(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC2196f);
    }
}
