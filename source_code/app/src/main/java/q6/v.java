package q6;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class v extends r {
    public final transient Object silver;

    public v(Object obj) {
        this.silver = obj;
    }

    @Override // q6.n
    public final int alpha(Object[] objArr) {
        objArr[0] = this.silver;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.silver.equals(obj);
    }

    @Override // q6.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.silver.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new s(this.silver);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ao.ad.gray(Constants.AES_PREFIX, this.silver.toString(), Constants.AES_SUFFIX);
    }
}
