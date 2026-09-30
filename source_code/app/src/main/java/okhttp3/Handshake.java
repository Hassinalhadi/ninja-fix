package okhttp3;

import Jf.f;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0013J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\b\u0019J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010$\u001a\u00020#*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lokhttp3/Handshake;", "", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "localCertificates", "", "Ljava/security/cert/Certificate;", "peerCertificatesFn", "Lkotlin/Function0;", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "()Lokhttp3/TlsVersion;", "()Lokhttp3/CipherSuite;", "()Ljava/util/List;", "peerCertificates", "peerCertificates$delegate", "Lkotlin/Lazy;", "-deprecated_tlsVersion", "-deprecated_cipherSuite", "-deprecated_peerCertificates", "peerPrincipal", "Ljava/security/Principal;", "()Ljava/security/Principal;", "-deprecated_peerPrincipal", "-deprecated_localCertificates", "localPrincipal", "-deprecated_localPrincipal", "equals", "", "other", "hashCode", "", "toString", "", "name", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Handshake {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CipherSuite cipherSuite;

    @NotNull
    private final List<Certificate> localCertificates;

    /* renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy peerCertificates;

    @NotNull
    private final TlsVersion tlsVersion;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\tJ4\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¨\u0006\u0012"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "handshake", "Lokhttp3/Handshake;", "Ljavax/net/ssl/SSLSession;", "get", "sslSession", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final List get$lambda$3(List list) {
            return list;
        }

        public static final List handshake$lambda$2(List list) {
            return list;
        }

        @c
        @NotNull
        /* renamed from: -deprecated_get */
        public final Handshake m261deprecated_get(@NotNull SSLSession sslSession) throws IOException {
            Intrinsics.echo(sslSession, "sslSession");
            return get(sslSession);
        }

        @NotNull
        public final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
            List emptyList;
            Intrinsics.echo(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                    CipherSuite forJavaName = CipherSuite.INSTANCE.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!Intrinsics.areEqual("NONE", protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.INSTANCE.forJavaName(protocol);
                            try {
                                emptyList = _UtilJvmKt.toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                emptyList = CollectionsKt.emptyList();
                            }
                            return new Handshake(forJavaName2, forJavaName, _UtilJvmKt.toImmutableList(sSLSession.getLocalCertificates()), new f(4, emptyList));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null");
                }
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            throw new IllegalStateException("cipherSuite == null");
        }

        private Companion() {
        }

        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            Intrinsics.echo(tlsVersion, "tlsVersion");
            Intrinsics.echo(cipherSuite, "cipherSuite");
            Intrinsics.echo(peerCertificates, "peerCertificates");
            Intrinsics.echo(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, _UtilJvmKt.toImmutableList(localCertificates), new f(3, _UtilJvmKt.toImmutableList(peerCertificates)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.echo(tlsVersion, "tlsVersion");
        Intrinsics.echo(cipherSuite, "cipherSuite");
        Intrinsics.echo(localCertificates, "localCertificates");
        Intrinsics.echo(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = LazyKt.lazy(new com.checkout.components.ui.country.c(peerCertificatesFn, 10));
    }

    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
        return INSTANCE.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.delta(type, "getType(...)");
        return type;
    }

    public static final List peerCertificates_delegate$lambda$0(Function0 function0) {
        try {
            return (List) function0.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return CollectionsKt.emptyList();
        }
    }

    @c
    @NotNull
    /* renamed from: -deprecated_cipherSuite, reason: from getter */
    public final CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_localCertificates */
    public final List<Certificate> m256deprecated_localCertificates() {
        return this.localCertificates;
    }

    @c
    @Nullable
    /* renamed from: -deprecated_localPrincipal */
    public final Principal m257deprecated_localPrincipal() {
        return localPrincipal();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_peerCertificates */
    public final List<Certificate> m258deprecated_peerCertificates() {
        return peerCertificates();
    }

    @c
    @Nullable
    /* renamed from: -deprecated_peerPrincipal */
    public final Principal m259deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_tlsVersion, reason: from getter */
    public final TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Handshake) {
            Handshake handshake = (Handshake) other;
            if (handshake.tlsVersion == this.tlsVersion && Intrinsics.areEqual(handshake.cipherSuite, this.cipherSuite) && Intrinsics.areEqual(handshake.peerCertificates(), peerCertificates()) && Intrinsics.areEqual(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    public final Principal localPrincipal() {
        X509Certificate x509Certificate;
        Object green = CollectionsKt.green(this.localCertificates);
        if (green instanceof X509Certificate) {
            x509Certificate = (X509Certificate) green;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @NotNull
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates.getValue();
    }

    @Nullable
    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object green = CollectionsKt.green(peerCertificates());
        if (green instanceof X509Certificate) {
            x509Certificate = (X509Certificate) green;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @NotNull
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public String toString() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<Certificate> peerCertificates = peerCertificates();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(peerCertificates, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }

    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
    }
}
