package m0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2095a implements o {
    public final int bravo;

    public C2095a(int i4) {
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(C2095a.class, cls)) {
                Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.bravo != ((C2095a) obj).bravo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo;
    }

    public final String toString() {
        return Q0.c.quebec(new StringBuilder("AndroidPointerIcon(type="), this.bravo, ')');
    }
}
