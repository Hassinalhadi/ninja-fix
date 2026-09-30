package androidx.media;

import android.media.AudioAttributes;
import y2.AbstractC3392a;
import y2.C3393b;

/* loaded from: classes3.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC3392a abstractC3392a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.alpha = (AudioAttributes) abstractC3392a.golf(audioAttributesImplApi21.alpha, 1);
        audioAttributesImplApi21.bravo = abstractC3392a.foxtrot(audioAttributesImplApi21.bravo, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC3392a abstractC3392a) {
        abstractC3392a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.alpha;
        abstractC3392a.india(1);
        ((C3393b) abstractC3392a).echo.writeParcelable(audioAttributes, 0);
        abstractC3392a.juliet(audioAttributesImplApi21.bravo, 2);
    }
}
