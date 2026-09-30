package okhttp3.internal.tls;

import A0.z;
import Q0.c;
import com.clevertap.android.sdk.Constants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal._HostnamesCommonKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\b*\u00020\nH\u0002J\u001c\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "verify", "", "host", "", "session", "Ljavax/net/ssl/SSLSession;", "certificate", "Ljava/security/cert/X509Certificate;", "verifyIpAddress", "ipAddress", "verifyHostname", "hostname", "asciiToLowercase", "isAscii", "pattern", "allSubjectAltNames", "", "getSubjectAltNames", Constants.KEY_TYPE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @NotNull
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale US = Locale.US;
            Intrinsics.delta(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean isAscii(String str) {
        int i4;
        char c3;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j5 = 0;
                int i5 = 0;
                while (i5 < length2) {
                    char charAt = str.charAt(i5);
                    if (charAt < 128) {
                        j5++;
                    } else {
                        if (charAt < 2048) {
                            i4 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i10 = i5 + 1;
                            if (i10 < length2) {
                                c3 = str.charAt(i10);
                            } else {
                                c3 = 0;
                            }
                            if (charAt <= 56319 && c3 >= 56320 && c3 <= 57343) {
                                j5 += 4;
                                i5 += 2;
                            } else {
                                j5++;
                                i5 = i10;
                            }
                        } else {
                            i4 = 3;
                        }
                        j5 += i4;
                    }
                    i5++;
                }
                if (length != ((int) j5)) {
                    return false;
                }
                return true;
            }
            StringBuilder sierra = c.sierra(length2, "endIndex > string.length: ", " > ");
            sierra.append(str.length());
            throw new IllegalArgumentException(sierra.toString().toString());
        }
        throw new IllegalArgumentException(z.juliet("endIndex < beginIndex: ", length2, 0, " < ").toString());
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String asciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if (!(subjectAltNames != null) || !subjectAltNames.isEmpty()) {
            Iterator<T> it = subjectAltNames.iterator();
            while (it.hasNext()) {
                if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        boolean z2;
        String canonicalHost = _HostnamesCommonKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if (subjectAltNames != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !subjectAltNames.isEmpty()) {
            Iterator<T> it = subjectAltNames.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(canonicalHost, _HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate certificate) {
        Intrinsics.echo(certificate, "certificate");
        return CollectionsKt.a(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.echo(host, "host");
        Intrinsics.echo(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.charlie(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(@NotNull String host, @NotNull X509Certificate certificate) {
        Intrinsics.echo(host, "host");
        Intrinsics.echo(certificate, "certificate");
        return _HostnamesCommonKt.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        int length;
        if (hostname != null && hostname.length() != 0 && !r.quebec(hostname, ".", false) && !r.golf(hostname, "..", false) && pattern != null && pattern.length() != 0 && !r.quebec(pattern, ".", false) && !r.golf(pattern, "..", false)) {
            if (!r.golf(hostname, ".", false)) {
                hostname = hostname.concat(".");
            }
            if (!r.golf(pattern, ".", false)) {
                pattern = pattern.concat(".");
            }
            String asciiToLowercase = asciiToLowercase(pattern);
            if (!StringsKt.beige(asciiToLowercase, "*", false)) {
                return Intrinsics.areEqual(hostname, asciiToLowercase);
            }
            if (r.quebec(asciiToLowercase, "*.", false) && StringsKt.emerald(asciiToLowercase, '*', 1, 4) == -1 && hostname.length() >= asciiToLowercase.length() && !Intrinsics.areEqual("*.", asciiToLowercase)) {
                String substring = asciiToLowercase.substring(1);
                Intrinsics.delta(substring, "substring(...)");
                if (r.golf(hostname, substring, false) && ((length = hostname.length() - substring.length()) <= 0 || StringsKt.ivory(hostname, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
