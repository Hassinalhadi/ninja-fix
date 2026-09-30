package J8;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class au {
    public final F alpha;
    public final G bravo;
    public final String charlie;
    public int delta;
    public am echo;

    public au(F timeProvider, G uuidGenerator) {
        Intrinsics.echo(timeProvider, "timeProvider");
        Intrinsics.echo(uuidGenerator, "uuidGenerator");
        this.alpha = timeProvider;
        this.bravo = uuidGenerator;
        this.charlie = alpha();
        this.delta = -1;
    }

    public final String alpha() {
        this.bravo.getClass();
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.delta(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        Intrinsics.delta(uuid, "uuidGenerator.next().toString()");
        String lowerCase = kotlin.text.r.oscar(uuid, "-", "").toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
