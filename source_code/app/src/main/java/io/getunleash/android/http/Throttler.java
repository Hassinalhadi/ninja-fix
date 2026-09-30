package io.getunleash.android.http;

import Q0.c;
import io.getunleash.android.util.UnleashLogger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bJ6\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lio/getunleash/android/http/Throttler;", "", "", "intervalLengthInSeconds", "longestAcceptableIntervalSeconds", "", "target", "<init>", "(JJLjava/lang/String;)V", "", "increaseSkipCount", "()V", "maximizeSkips", "decrementFailureCountAndResetSkips$unleashandroidsdk_release", "decrementFailureCountAndResetSkips", "T", "Lkotlin/Function1;", "LNd/c;", "block", "runIfAllowed", "(Lkotlin/jvm/functions/Function1;LNd/c;)Ljava/lang/Object;", "", "responseCode", "handleHttpErrorCodes$unleashandroidsdk_release", "(I)V", "handleHttpErrorCodes", "getSkips$unleashandroidsdk_release", "()J", "getSkips", "getFailures$unleashandroidsdk_release", "getFailures", "statusCode", "handle", "J", "Ljava/lang/String;", "maxSkips", "Ljava/util/concurrent/atomic/AtomicLong;", "skips", "Ljava/util/concurrent/atomic/AtomicLong;", "failures", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Throttler {

    @NotNull
    private static final String TAG = "Throttler";

    @NotNull
    private final AtomicLong failures;
    private final long intervalLengthInSeconds;
    private final long maxSkips;

    @NotNull
    private final AtomicLong skips;

    @NotNull
    private final String target;

    public Throttler(long j5, long j6, @NotNull String target) {
        Intrinsics.echo(target, "target");
        this.intervalLengthInSeconds = j5;
        this.target = target;
        this.maxSkips = Math.max(j6 / Math.max(j5, 1L), 1L);
        this.skips = new AtomicLong(0L);
        this.failures = new AtomicLong(0L);
    }

    private final void increaseSkipCount() {
        this.skips.set(Math.min(this.failures.incrementAndGet(), this.maxSkips));
    }

    private final void maximizeSkips() {
        this.skips.set(this.maxSkips);
        this.failures.incrementAndGet();
    }

    public final void decrementFailureCountAndResetSkips$unleashandroidsdk_release() {
        if (this.failures.get() > 0) {
            this.skips.set(Math.max(this.failures.decrementAndGet(), 0L));
        }
    }

    public final long getFailures$unleashandroidsdk_release() {
        return this.failures.get();
    }

    public final long getSkips$unleashandroidsdk_release() {
        return this.skips.get();
    }

    public final void handle(int statusCode) {
        if (200 <= statusCode && statusCode < 400) {
            decrementFailureCountAndResetSkips$unleashandroidsdk_release();
        }
        if (statusCode >= 400) {
            handleHttpErrorCodes$unleashandroidsdk_release(statusCode);
        }
    }

    public final void handleHttpErrorCodes$unleashandroidsdk_release(int responseCode) {
        if (responseCode == 401 || responseCode == 403) {
            maximizeSkips();
            UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Client was not authorized to talk to the Unleash API at ");
            sb2.append(this.target);
            sb2.append(". Backing off to ");
            sb2.append(this.maxSkips);
            sb2.append(" times our poll interval (of ");
            UnleashLogger.e$default(unleashLogger, TAG, c.mike(this.intervalLengthInSeconds, " seconds) to avoid overloading server", sb2), null, 4, null);
        }
        if (responseCode == 404) {
            maximizeSkips();
            UnleashLogger unleashLogger2 = UnleashLogger.INSTANCE;
            StringBuilder sb3 = new StringBuilder("Server said that the endpoint at ");
            sb3.append(this.target);
            sb3.append(" does not exist. Backing off to ");
            sb3.append(this.maxSkips);
            sb3.append(" times our poll interval (of ");
            UnleashLogger.e$default(unleashLogger2, TAG, c.mike(this.intervalLengthInSeconds, " seconds) to avoid overloading server", sb3), null, 4, null);
            return;
        }
        if (responseCode == 429) {
            increaseSkipCount();
            UnleashLogger unleashLogger3 = UnleashLogger.INSTANCE;
            StringBuilder sb4 = new StringBuilder("RATE LIMITED for the ");
            sb4.append(this.failures.get());
            sb4.append(". time. Further backing off. Current backoff at ");
            sb4.append(this.skips.get());
            sb4.append(" times our interval (of ");
            UnleashLogger.i$default(unleashLogger3, TAG, c.mike(this.intervalLengthInSeconds, " seconds)", sb4), null, 4, null);
            return;
        }
        if (responseCode >= 500) {
            increaseSkipCount();
            UnleashLogger unleashLogger4 = UnleashLogger.INSTANCE;
            StringBuilder sierra = c.sierra(responseCode, "Server failed with a ", " status code. Backing off. Current backoff at ");
            sierra.append(this.skips.get());
            sierra.append(" times our poll interval (of ");
            UnleashLogger.i$default(unleashLogger4, TAG, c.mike(this.intervalLengthInSeconds, " seconds)", sierra), null, 4, null);
        }
    }

    @Nullable
    public final <T> Object runIfAllowed(@NotNull Function1<? super Nd.c<? super T>, ? extends Object> function1, @NotNull Nd.c<? super T> cVar) {
        if (this.skips.get() <= 0) {
            return function1.invoke(cVar);
        }
        this.skips.decrementAndGet();
        return null;
    }
}
