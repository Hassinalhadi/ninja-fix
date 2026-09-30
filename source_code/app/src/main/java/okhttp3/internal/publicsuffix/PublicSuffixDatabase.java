package okhttp3.internal.publicsuffix;

import Tf.n;
import g8.d;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", "", "domain", "splitDomain", "", "findMatchingRule", "domainLabels", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final char EXCEPTION_MARKER = '!';

    @NotNull
    private static final List<String> PREVAILING_RULE;

    @NotNull
    private static final n WILDCARD_LABEL;

    @NotNull
    private static final PublicSuffixDatabase instance;

    @NotNull
    private final PublicSuffixList publicSuffixList;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "LTf/n;", "", "labels", "", "labelIndex", "", "binarySearch", "(LTf/n;[LTf/n;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "WILDCARD_LABEL", "LTf/n;", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(n nVar, n[] nVarArr, int i4) {
            int i5;
            int and;
            boolean z2;
            int and2;
            int delta = nVar.delta();
            int i10 = 0;
            while (i10 < delta) {
                int i11 = (i10 + delta) / 2;
                while (i11 > -1 && nVar.india(i11) != 10) {
                    i11--;
                }
                int i12 = i11 + 1;
                int i13 = 1;
                while (true) {
                    i5 = i12 + i13;
                    if (nVar.india(i5) == 10) {
                        break;
                    }
                    i13++;
                }
                int i14 = i5 - i12;
                int i15 = i4;
                boolean z10 = false;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (z10) {
                        and = 46;
                        z2 = false;
                    } else {
                        boolean z11 = z10;
                        and = _UtilCommonKt.and(nVarArr[i15].india(i16), 255);
                        z2 = z11;
                    }
                    and2 = and - _UtilCommonKt.and(nVar.india(i12 + i17), 255);
                    if (and2 != 0) {
                        break;
                    }
                    i17++;
                    i16++;
                    if (i17 == i14) {
                        break;
                    }
                    if (nVarArr[i15].delta() == i16) {
                        if (i15 == nVarArr.length - 1) {
                            break;
                        }
                        i15++;
                        z10 = true;
                        i16 = -1;
                    } else {
                        z10 = z2;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i18 = i14 - i17;
                        int delta2 = nVarArr[i15].delta() - i16;
                        int length = nVarArr.length;
                        for (int i19 = i15 + 1; i19 < length; i19++) {
                            delta2 += nVarArr[i19].delta();
                        }
                        if (delta2 >= i18) {
                            if (delta2 <= i18) {
                                return nVar.oscar(i12, i14 + i12).november(a.alpha);
                            }
                        }
                    }
                    i10 = i5 + 1;
                }
                delta = i11;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    static {
        n nVar = n.silver;
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        Intrinsics.delta(copyOf, "copyOf(...)");
        WILDCARD_LABEL = new n(copyOf);
        PREVAILING_RULE = ab.juliet("*");
        instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
    }

    public PublicSuffixDatabase(@NotNull PublicSuffixList publicSuffixList) {
        Intrinsics.echo(publicSuffixList, "publicSuffixList");
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String str2;
        String str3;
        List<String> emptyList;
        List<String> emptyList2;
        this.publicSuffixList.ensureLoaded();
        int size = domainLabels.size();
        n[] nVarArr = new n[size];
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = n.silver;
            nVarArr[i4] = d.oscar(domainLabels.get(i4));
        }
        int i5 = 0;
        while (true) {
            str = null;
            if (i5 < size) {
                str2 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), nVarArr, i5);
                if (str2 != null) {
                    break;
                }
                i5++;
            } else {
                str2 = null;
                break;
            }
        }
        if (size > 1) {
            n[] nVarArr2 = (n[]) nVarArr.clone();
            int length = nVarArr2.length - 1;
            for (int i10 = 0; i10 < length; i10++) {
                nVarArr2[i10] = WILDCARD_LABEL;
                str3 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), nVarArr2, i10);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i11 = size - 1;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                String binarySearch = INSTANCE.binarySearch(this.publicSuffixList.getExceptionBytes(), nVarArr, i12);
                if (binarySearch != null) {
                    str = binarySearch;
                    break;
                }
                i12++;
            }
        }
        if (str != null) {
            return StringsKt.navy("!".concat(str), new char[]{'.'});
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 != null) {
            emptyList = StringsKt.navy(str2, new char[]{'.'});
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (str3 != null) {
            emptyList2 = StringsKt.navy(str3, new char[]{'.'});
        } else {
            emptyList2 = CollectionsKt.emptyList();
        }
        if (emptyList.size() > emptyList2.size()) {
            return emptyList;
        }
        return emptyList2;
    }

    private final List<String> splitDomain(String domain) {
        List<String> navy = StringsKt.navy(domain, new char[]{'.'});
        if (Intrinsics.areEqual(CollectionsKt.ochre(navy), "")) {
            return CollectionsKt.cyan(navy);
        }
        return navy;
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.echo(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        int i4 = 0;
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        InterfaceC2358h foxtrot = AbstractC2360j.foxtrot(CollectionsKt.beige(splitDomain(domain)), size - size2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : foxtrot) {
            i4++;
            if (i4 > 1) {
                sb2.append((CharSequence) ".");
            }
            kotlin.text.n.bravo(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }
}
