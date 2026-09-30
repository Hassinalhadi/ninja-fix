package okhttp3;

import com.clevertap.android.sdk.Constants;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._HostnamesCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "<init>", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "-deprecated_proxy", "-deprecated_socketAddress", "requiresTunnel", "", "equals", "other", "hashCode", "", "toString", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Route {

    @NotNull
    private final Address address;

    @NotNull
    private final Proxy proxy;

    @NotNull
    private final InetSocketAddress socketAddress;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.echo(address, "address");
        Intrinsics.echo(proxy, "proxy");
        Intrinsics.echo(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_address, reason: not valid java name and from getter */
    public final Address getAddress() {
        return this.address;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public final Address address() {
        return this.address;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Route) {
            Route route = (Route) other;
            if (Intrinsics.areEqual(route.address, this.address) && Intrinsics.areEqual(route.proxy, this.proxy) && Intrinsics.areEqual(route.socketAddress, this.socketAddress)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        if (this.address.sslSocketFactory() == null && !this.address.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public String toString() {
        String str;
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String host = this.address.url().host();
        InetAddress address = this.socketAddress.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            str = _HostnamesCommonKt.toCanonicalHost(hostAddress);
        } else {
            str = null;
        }
        if (StringsKt.black(host, ':')) {
            sb2.append(Constants.AES_PREFIX);
            sb2.append(host);
            sb2.append(Constants.AES_SUFFIX);
        } else {
            sb2.append(host);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || Intrinsics.areEqual(host, str)) {
            sb2.append(":");
            sb2.append(this.address.url().port());
        }
        if (!Intrinsics.areEqual(host, str)) {
            if (Intrinsics.areEqual(this.proxy, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (str == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.black(str, ':')) {
                sb2.append(Constants.AES_PREFIX);
                sb2.append(str);
                sb2.append(Constants.AES_SUFFIX);
            } else {
                sb2.append(str);
            }
            sb2.append(":");
            sb2.append(this.socketAddress.getPort());
        }
        return sb2.toString();
    }
}
