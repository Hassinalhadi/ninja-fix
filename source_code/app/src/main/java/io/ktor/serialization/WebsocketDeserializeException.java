package io.ktor.serialization;

import Jd.a;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/serialization/WebsocketDeserializeException;", "Lio/ktor/serialization/WebsocketContentConvertException;", "", Constants.KEY_MESSAGE, "", "cause", "LJd/a;", "frame", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;LJd/a;)V", "LJd/a;", "getFrame", "()LJd/a;", "ktor-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebsocketDeserializeException extends WebsocketContentConvertException {

    @NotNull
    private final a frame;

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th, a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : th, aVar);
    }

    @NotNull
    public final a getFrame() {
        return this.frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(@NotNull String message, @Nullable Throwable th, @NotNull a frame) {
        super(message, th);
        Intrinsics.echo(message, "message");
        Intrinsics.echo(frame, "frame");
        this.frame = frame;
    }
}
