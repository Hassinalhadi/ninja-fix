package f1;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public abstract class r {
    public static AudioAttributes alpha(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder bravo() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder charlie(AudioAttributes.Builder builder, int i4) {
        return builder.setContentType(i4);
    }

    public static AudioAttributes.Builder delta(AudioAttributes.Builder builder, int i4) {
        return builder.setUsage(i4);
    }
}
