package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.db.Column;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Lkotlin/UInt;", "", "", Column.DATA, "constructor-impl", "(I)I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UInt implements Comparable<UInt> {
    public final int alpha;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m210constructorimpl(int i4) {
        return i4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UInt uInt) {
        return Intrinsics.golf(this.alpha ^ RecyclerView.UNDEFINED_DURATION, uInt.alpha ^ RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UInt) {
            if (this.alpha != ((UInt) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getAlpha() {
        return this.alpha;
    }

    public final String toString() {
        return String.valueOf(this.alpha & 4294967295L);
    }
}
