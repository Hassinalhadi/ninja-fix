package okhttp3;

import Ac.l;
import Tf.n;
import g8.d;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0003\"#$B#\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J)\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u0015H\u0000¢\u0006\u0002\b\u0017J)\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0018\"\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getPins", "()Ljava/util/Set;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "check", "", "hostname", "", "peerCertificates", "", "Ljava/security/cert/Certificate;", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "check$okhttp", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "equals", "", "other", "hashCode", "", "Pin", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CertificatePinner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();

    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final Set<Pin> pins;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\f\"\u00020\u000b¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String pattern, @NotNull String... pins) {
            Intrinsics.echo(pattern, "pattern");
            Intrinsics.echo(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.D(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "LTf/n;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)LTf/n;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            Intrinsics.echo(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).alpha();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        @NotNull
        public final n sha1Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.echo(x509Certificate, "<this>");
            n nVar = n.silver;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.delta(encoded, "getEncoded(...)");
            return d.quebec(-1234567890, encoded).charlie("SHA-1");
        }

        @NotNull
        public final n sha256Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.echo(x509Certificate, "<this>");
            n nVar = n.silver;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.delta(encoded, "getEncoded(...)");
            return d.quebec(-1234567890, encoded).charlie("SHA-256");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "LTf/n;", "hash", "LTf/n;", "getHash", "()LTf/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Pin {

        @NotNull
        private final n hash;

        @NotNull
        private final String hashAlgorithm;

        @NotNull
        private final String pattern;

        public Pin(@NotNull String pattern, @NotNull String pin) {
            Intrinsics.echo(pattern, "pattern");
            Intrinsics.echo(pin, "pin");
            if ((r.quebec(pattern, "*.", false) && StringsKt.fuchsia(pattern, "*", 1, false, 4) == -1) || ((r.quebec(pattern, "**.", false) && StringsKt.fuchsia(pattern, "*", 2, false, 4) == -1) || StringsKt.fuchsia(pattern, "*", 0, false, 6) == -1)) {
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(pattern);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (r.quebec(pin, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        n nVar = n.silver;
                        String substring = pin.substring(5);
                        Intrinsics.delta(substring, "substring(...)");
                        n lima = d.lima(substring);
                        if (lima != null) {
                            this.hash = lima;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                    }
                    if (r.quebec(pin, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        n nVar2 = n.silver;
                        String substring2 = pin.substring(7);
                        Intrinsics.delta(substring2, "substring(...)");
                        n lima2 = d.lima(substring2);
                        if (lima2 != null) {
                            this.hash = lima2;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                    }
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
                }
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            if (Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final n getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + AbstractC2327c.sierra(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(@NotNull X509Certificate certificate) {
            Intrinsics.echo(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean matchesHostname(@NotNull String hostname) {
            Intrinsics.echo(hostname, "hostname");
            if (r.quebec(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!r.lima(hostname.length() - length, 3, length, hostname, this.pattern, false) || (length2 != 0 && hostname.charAt(length2 - 1) != '.')) {
                    return false;
                }
                return true;
            }
            if (r.quebec(this.pattern, "*.", false)) {
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!r.lima(hostname.length() - length3, 1, length3, hostname, this.pattern, false) || StringsKt.ivory(hostname, '.', length4 - 1, 4) != -1) {
                }
            } else {
                return Intrinsics.areEqual(hostname, this.pattern);
            }
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.alpha();
        }
    }

    public CertificatePinner(@NotNull Set<Pin> pins, @Nullable CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.echo(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List check$lambda$1(CertificatePinner certificatePinner, List list, String str) {
        int collectionSizeOrDefault;
        List<Certificate> clean;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (clean = certificateChainCleaner.clean(list, str)) != null) {
            list = clean;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : list) {
            Intrinsics.charlie(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @NotNull
    public static final n sha1Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @NotNull
    public static final n sha256Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.echo(hostname, "hostname");
        Intrinsics.echo(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new l(this, peerCertificates, hostname, 17));
    }

    public final void check$okhttp(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.echo(hostname, "hostname");
        Intrinsics.echo(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (!findMatchingPins.isEmpty()) {
            List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : invoke) {
                n nVar = null;
                n nVar2 = null;
                for (Pin pin : findMatchingPins) {
                    String hashAlgorithm = pin.getHashAlgorithm();
                    if (Intrinsics.areEqual(hashAlgorithm, "sha256")) {
                        if (nVar == null) {
                            nVar = INSTANCE.sha256Hash(x509Certificate);
                        }
                        if (Intrinsics.areEqual(pin.getHash(), nVar)) {
                            return;
                        }
                    } else if (Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                        if (nVar2 == null) {
                            nVar2 = INSTANCE.sha1Hash(x509Certificate);
                        }
                        if (Intrinsics.areEqual(pin.getHash(), nVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : invoke) {
                sb2.append("\n    ");
                sb2.append(INSTANCE.pin(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            for (Pin pin2 : findMatchingPins) {
                sb2.append("\n    ");
                sb2.append(pin2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) other;
            if (Intrinsics.areEqual(certificatePinner.pins, this.pins) && Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String hostname) {
        Intrinsics.echo(hostname, "hostname");
        Set<Pin> set = this.pins;
        List emptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                x.bravo(emptyList);
                emptyList.add(obj);
            }
        }
        return emptyList;
    }

    @Nullable
    /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i4;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i4 = certificateChainCleaner.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.echo(certificateChainCleaner, "certificateChainCleaner");
        if (Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @c
    public final void check(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.echo(hostname, "hostname");
        Intrinsics.echo(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt.b(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i4 & 2) != 0 ? null : certificateChainCleaner);
    }
}
