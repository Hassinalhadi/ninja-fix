package okhttp3.internal.ws;

import Tf.n;
import g8.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LTf/n;", "EMPTY_DEFLATE_BLOCK", "LTf/n;", "", "LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION", "I", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageDeflaterKt {

    @NotNull
    private static final n EMPTY_DEFLATE_BLOCK;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
        n nVar = n.silver;
        EMPTY_DEFLATE_BLOCK = d.mike("000000ffff");
    }
}
