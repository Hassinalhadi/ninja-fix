package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RoutePlanner;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lokhttp3/internal/connection/SequentialExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "routePlanner", "Lokhttp3/internal/connection/RoutePlanner;", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;)V", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "find", "Lokhttp3/internal/connection/RealConnection;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {

    @NotNull
    private final RoutePlanner routePlanner;

    public SequentialExchangeFinder(@NotNull RoutePlanner routePlanner) {
        Intrinsics.echo(routePlanner, "routePlanner");
        this.routePlanner = routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @NotNull
    public RealConnection find() {
        RoutePlanner.Plan plan;
        IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                plan = getRoutePlanner().plan();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC2689j6.charlie(iOException, e);
                }
                if (!a.alpha(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!plan.getIsReady()) {
                RoutePlanner.ConnectResult result = plan.getResult();
                if (result.isSuccess()) {
                    result = plan.mo360connectTlsEtc();
                }
                RoutePlanner.Plan nextPlan = result.getNextPlan();
                Throwable throwable = result.getThrowable();
                if (throwable == null) {
                    if (nextPlan != null) {
                        getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                    }
                } else {
                    throw throwable;
                }
            }
            return plan.mo356handleSuccess();
        }
        throw new IOException("Canceled");
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @NotNull
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}
