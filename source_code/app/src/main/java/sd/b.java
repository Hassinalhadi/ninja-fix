package sd;

/* loaded from: classes2.dex */
public abstract class b {
    public static final e alpha;
    public static final e bravo;

    static {
        new e("application", "*");
        new e("application", "atom+xml");
        new e("application", "cbor");
        alpha = new e("application", "json");
        new e("application", "hal+json");
        new e("application", "javascript");
        bravo = new e("application", "octet-stream");
        new e("application", "rss+xml");
        new e("application", "soap+xml");
        new e("application", "xml");
        new e("application", "xml-dtd");
        new e("application", "yaml");
        new e("application", "zip");
        new e("application", "gzip");
        new e("application", "x-www-form-urlencoded");
        new e("application", "pdf");
        new e("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        new e("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        new e("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        new e("application", "protobuf");
        new e("application", "wasm");
        new e("application", "problem+json");
        new e("application", "problem+xml");
    }
}
