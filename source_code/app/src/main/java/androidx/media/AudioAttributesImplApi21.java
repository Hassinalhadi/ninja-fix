package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes3.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes alpha;
    public int bravo = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.alpha.equals(((AudioAttributesImplApi21) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.alpha;
    }
}
