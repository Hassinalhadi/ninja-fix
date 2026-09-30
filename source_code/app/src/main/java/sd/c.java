package sd;

/* loaded from: classes2.dex */
public abstract class c {
    public static final e alpha;

    static {
        String str = "multipart";
        new e(str, "*");
        new e(str, "mixed");
        new e(str, "alternative");
        new e(str, "related");
        alpha = new e(str, "form-data");
        new e(str, "signed");
        new e(str, "encrypted");
        new e(str, "byteranges");
    }
}
