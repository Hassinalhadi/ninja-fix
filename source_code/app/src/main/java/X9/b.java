package X9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final b alpha;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final /* synthetic */ b[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X9.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, X9.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, X9.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, X9.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, X9.b] */
    static {
        Enum r12 = new Enum("OfficialSigner", 0);
        Enum r13 = new Enum("NotAllowlistedSigner", 1);
        Enum r14 = new Enum("BlocklistedSigner", 2);
        Enum r15 = new Enum("MissingSigningInfo", 3);
        Enum r92 = new Enum("ErrorReadingSignature", 4);
        Enum r82 = new Enum("SuspiciousNativePayload", 5);
        Enum r72 = new Enum("SuspiciousLoadedNativeLibrary", 6);
        ?? r62 = new Enum("SuspiciousInjectedClasses", 7);
        alpha = r62;
        ?? r5 = new Enum("ApplicationClassHijacked", 8);
        purple = r5;
        ?? r4 = new Enum("PackedDexDetected", 9);
        red = r4;
        ?? r32 = new Enum("DiskSignerMismatch", 10);
        silver = r32;
        ?? r22 = new Enum("NotEnforcedForBuild", 11);
        teal = r22;
        b[] bVarArr = {r12, r13, r14, r15, r92, r82, r72, r62, r5, r4, r32, r22};
        white = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) white.clone();
    }
}
