package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "<init>", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "verifySignature", "", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "minIntermediates", "", "hashCode", "equals", "other", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    private static final int MAX_SIGNERS = 9;

    @NotNull
    private final TrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(@NotNull TrustRootIndex trustRootIndex) {
        Intrinsics.echo(trustRootIndex, "trustRootIndex");
        this.trustRootIndex = trustRootIndex;
    }

    private final boolean verifySignature(X509Certificate toVerify, X509Certificate signingCert, int minIntermediates) {
        if (!Intrinsics.areEqual(toVerify.getIssuerDN(), signingCert.getSubjectDN()) || signingCert.getBasicConstraints() < minIntermediates) {
            return false;
        }
        try {
            toVerify.verify(signingCert.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @NotNull
    public List<Certificate> clean(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.echo(chain, "chain");
        Intrinsics.echo(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.delta(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z2 = false;
        for (int i4 = 0; i4 < 9; i4++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Intrinsics.charlie(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !Intrinsics.areEqual(x509Certificate, findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (!verifySignature(findByIssuerAndSignature, findByIssuerAndSignature, arrayList.size() - 2)) {
                    z2 = true;
                } else {
                    return arrayList;
                }
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.delta(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.charlie(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (verifySignature(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicCertificateChainCleaner) && Intrinsics.areEqual(((BasicCertificateChainCleaner) other).trustRootIndex, this.trustRootIndex)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
