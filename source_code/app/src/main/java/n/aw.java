package n;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aw {
    public static final aw delta;
    public final int alpha;
    public final int bravo;
    public final int charlie;

    static {
        int i4 = 0;
        delta = new aw(i4, i4, 127);
    }

    public /* synthetic */ aw(int i4, int i5, int i10) {
        this(-1, (i10 & 4) != 0 ? 0 : i4, (i10 & 8) != 0 ? -1 : i5, 0);
    }

    public static aw alpha(aw awVar, int i4, int i5, int i10) {
        int i11 = awVar.alpha;
        awVar.getClass();
        if ((i10 & 4) != 0) {
            i4 = awVar.bravo;
        }
        if ((i10 & 8) != 0) {
            i5 = awVar.charlie;
        }
        awVar.getClass();
        awVar.getClass();
        return new aw(i11, i4, i5, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aw) {
                aw awVar = (aw) obj;
                if (this.alpha == awVar.alpha && Intrinsics.areEqual(null, null) && this.bravo == awVar.bravo && this.charlie == awVar.charlie && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.alpha * 961) + this.bravo) * 31) + this.charlie) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) I0.m.alpha(this.alpha)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) I0.n.alpha(this.bravo)) + ", imeAction=" + ((Object) I0.k.alpha(this.charlie)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public aw(int i4, int i5, int i10, int i11) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = i10;
    }
}
