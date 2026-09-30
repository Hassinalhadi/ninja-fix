package io.ktor.client.call;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;
import pd.AbstractC2304b;
import s6.AbstractC2761r7;
import sd.m;
import sd.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "Lpd/b;", "response", "Lge/d;", "from", "to", "<init>", "(Lpd/b;Lge/d;Lge/d;)V", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    @NotNull
    private final String message;

    public NoTransformationFoundException(@NotNull AbstractC2304b response, @NotNull InterfaceC1772d from, @NotNull InterfaceC1772d to) {
        Intrinsics.echo(response, "response");
        Intrinsics.echo(from, "from");
        Intrinsics.echo(to, "to");
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(to);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(AbstractC2761r7.bravo(response).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(response.golf());
        sb2.append("`\n        Response header `ContentType: ");
        m alpha = response.alpha();
        List list = q.alpha;
        sb2.append(alpha.get(CtApi.HEADER_CONTENT_TYPE));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(AbstractC2761r7.bravo(response).alpha().get("Accept"));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = n.charlie(sb2.toString());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
