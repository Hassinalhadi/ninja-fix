package M;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class a implements Map.Entry, Yd.a {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        switch (this.alpha) {
            case 0:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry != null && Intrinsics.areEqual(entry.getKey(), this.purple) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.alpha) {
            case 0:
                return this.red;
            default:
                return this.red;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i4;
        switch (this.alpha) {
            case 0:
                int i5 = 0;
                Object obj = this.purple;
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i5 = value.hashCode();
                }
                return i5 ^ i4;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.purple);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
