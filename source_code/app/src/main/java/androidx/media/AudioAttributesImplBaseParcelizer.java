package androidx.media;

import y2.AbstractC3392a;

/* loaded from: classes3.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC3392a abstractC3392a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.alpha = abstractC3392a.foxtrot(audioAttributesImplBase.alpha, 1);
        audioAttributesImplBase.bravo = abstractC3392a.foxtrot(audioAttributesImplBase.bravo, 2);
        audioAttributesImplBase.charlie = abstractC3392a.foxtrot(audioAttributesImplBase.charlie, 3);
        audioAttributesImplBase.delta = abstractC3392a.foxtrot(audioAttributesImplBase.delta, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC3392a abstractC3392a) {
        abstractC3392a.getClass();
        abstractC3392a.juliet(audioAttributesImplBase.alpha, 1);
        abstractC3392a.juliet(audioAttributesImplBase.bravo, 2);
        abstractC3392a.juliet(audioAttributesImplBase.charlie, 3);
        abstractC3392a.juliet(audioAttributesImplBase.delta, 4);
    }
}
