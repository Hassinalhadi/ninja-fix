package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b0 {
    public static final b0 alpha;
    public static final b0 purple;
    public static final b0 red;
    public static final b0 silver;
    public static final b0 teal;
    public static final b0 white;
    public static final /* synthetic */ b0[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.b0] */
    static {
        ?? r62 = new Enum("IMAGE_CAPTURE", 0);
        alpha = r62;
        ?? r72 = new Enum("PREVIEW", 1);
        purple = r72;
        ?? r82 = new Enum("IMAGE_ANALYSIS", 2);
        red = r82;
        ?? r92 = new Enum("VIDEO_CAPTURE", 3);
        silver = r92;
        ?? r10 = new Enum("STREAM_SHARING", 4);
        teal = r10;
        ?? r11 = new Enum("METERING_REPEATING", 5);
        white = r11;
        yellow = new b0[]{r62, r72, r82, r92, r10, r11};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) yellow.clone();
    }
}
