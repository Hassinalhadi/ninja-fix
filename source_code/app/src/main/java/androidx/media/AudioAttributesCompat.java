package androidx.media;

import android.util.SparseIntArray;
import y2.InterfaceC3394c;

/* loaded from: classes3.dex */
public class AudioAttributesCompat implements InterfaceC3394c {
    public static final /* synthetic */ int bravo = 0;
    public AudioAttributesImpl alpha;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.alpha;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.alpha != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
