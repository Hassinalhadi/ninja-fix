package kotlin;

import com.clevertap.android.sdk.db.Column;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Lkotlin/UByte;", "", "", Column.DATA, "constructor-impl", "(B)B", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UByte implements Comparable<UByte> {
    public final byte alpha;

    public /* synthetic */ UByte(byte b2) {
        this.alpha = b2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m208boximpl(byte b2) {
        return new UByte(b2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m209constructorimpl(byte b2) {
        return b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.golf(this.alpha & 255, uByte.alpha & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UByte) {
            if (this.alpha != ((UByte) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return String.valueOf(this.alpha & 255);
    }
}
