package C5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s6.D0;

/* loaded from: classes3.dex */
public final class a {
    public static final String charlie;
    public static final Set delta;
    public static final a echo;
    public static final a foxtrot;
    public final String alpha;
    public final String bravo;

    static {
        String bravo = D0.bravo("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        charlie = bravo;
        String bravo2 = D0.bravo("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String bravo3 = D0.bravo("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        delta = Collections.unmodifiableSet(new HashSet(Arrays.asList(new B5.c("proto"), new B5.c("json"))));
        echo = new a(bravo, null);
        foxtrot = new a(bravo2, bravo3);
    }

    public a(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public static a alpha(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
