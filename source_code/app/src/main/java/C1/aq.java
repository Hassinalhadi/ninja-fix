package C1;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aq extends B {
    public final Throwable bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(Throwable finalException) {
        super(LottieConstants.IterateForever);
        Intrinsics.echo(finalException, "finalException");
        this.bravo = finalException;
    }
}
