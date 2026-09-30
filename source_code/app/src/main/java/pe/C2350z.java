package pe;

import java.util.ArrayList;

/* renamed from: pe.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2350z extends au {
    public final ArrayList alpha;

    public C2350z(ArrayList arrayList) {
        this.alpha = arrayList;
        if (kotlin.collections.y.yankee(arrayList).size() == arrayList.size()) {
        } else {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.alpha + ')';
    }
}
