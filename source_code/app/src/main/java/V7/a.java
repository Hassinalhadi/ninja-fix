package V7;

/* loaded from: classes2.dex */
public final class a {
    public static final S7.c bravo = new Object();
    public static final String charlie = alpha("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String delta = alpha("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final S7.a echo = new S7.a(5);
    public final c alpha;

    public a(c cVar) {
        this.alpha = cVar;
    }

    public static String alpha(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i4 = 0; i4 < str.length(); i4++) {
                sb2.append(str.charAt(i4));
                if (str2.length() > i4) {
                    sb2.append(str2.charAt(i4));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
