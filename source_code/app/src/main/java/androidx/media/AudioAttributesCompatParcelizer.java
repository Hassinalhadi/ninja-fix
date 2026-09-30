package androidx.media;

import y2.AbstractC3392a;
import y2.InterfaceC3394c;

/* loaded from: classes3.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC3392a abstractC3392a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC3394c interfaceC3394c = audioAttributesCompat.alpha;
        if (abstractC3392a.echo(1)) {
            interfaceC3394c = abstractC3392a.hotel();
        }
        audioAttributesCompat.alpha = (AudioAttributesImpl) interfaceC3394c;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC3392a abstractC3392a) {
        abstractC3392a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.alpha;
        abstractC3392a.india(1);
        abstractC3392a.kilo(audioAttributesImpl);
    }
}
