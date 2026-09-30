package b0;

/* loaded from: classes3.dex */
public final class d {
    public static final float[] alpha;
    public static final float[] bravo;
    public static final r charlie;
    public static final r delta;
    public static final q echo;
    public static final q foxtrot;
    public static final q golf;
    public static final q hotel;
    public static final q india;
    public static final q juliet;
    public static final q kilo;
    public static final q lima;
    public static final q mike;
    public static final q november;
    public static final q oscar;
    public static final q papa;
    public static final q quebec;
    public static final q romeo;
    public static final k sierra;
    public static final k tango;
    public static final q uniform;
    public static final q victor;
    public static final q whiskey;
    public static final l xray;
    public static final AbstractC0713c[] yankee;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [b0.l, b0.c] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        alpha = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        bravo = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        charlie = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        delta = rVar4;
        s sVar = j.delta;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        echo = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        foxtrot = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new S7.a(14), new S7.a(15), -0.799f, 2.399f, rVar, 2);
        golf = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        hotel = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        india = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        juliet = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        kilo = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        lima = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.alpha, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        mike = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        november = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        oscar = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.bravo, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        papa = qVar12;
        s sVar2 = j.charlie;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        quebec = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        romeo = qVar14;
        k kVar = new k("Generic XYZ", AbstractC0712b.bravo, 14, 1);
        sierra = kVar;
        long j5 = AbstractC0712b.charlie;
        k kVar2 = new k("Generic L*a*b*", j5, 15, 0);
        tango = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        uniform = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new S7.a(16), new S7.a(17), 0.0f, 1.0f, rVar3, 17);
        victor = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new S7.a(18), new S7.a(19), 0.0f, 1.0f, rVar4, 18);
        whiskey = qVar17;
        ?? abstractC0713c = new AbstractC0713c(19, j5, "Oklab");
        xray = abstractC0713c;
        yankee = new AbstractC0713c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, abstractC0713c};
    }

    public static double alpha(r rVar, double d4) {
        double d9;
        double exp;
        if (d4 < 0.0d) {
            d9 = -1.0d;
        } else {
            d9 = 1.0d;
        }
        double d10 = d4 * d9;
        double d11 = rVar.bravo;
        double d12 = rVar.golf + 1.0d;
        double d13 = d11 * d10;
        if (d13 <= 1.0d) {
            exp = Math.pow(d13, rVar.charlie);
        } else {
            exp = Math.exp((d10 - rVar.foxtrot) * rVar.delta) + rVar.echo;
        }
        return d12 * d9 * exp;
    }

    public static double bravo(r rVar, double d4) {
        double d9;
        double log;
        if (d4 < 0.0d) {
            d9 = -1.0d;
        } else {
            d9 = 1.0d;
        }
        double d10 = 1.0d / rVar.bravo;
        double d11 = 1.0d / rVar.charlie;
        double d12 = 1.0d / rVar.delta;
        double d13 = (d4 * d9) / (rVar.golf + 1.0d);
        if (d13 <= 1.0d) {
            log = Math.pow(d13, d11) * d10;
        } else {
            log = (Math.log(d13 - rVar.echo) * d12) + rVar.foxtrot;
        }
        return d9 * log;
    }

    public static double charlie(r rVar, double d4) {
        double d9;
        double d10 = 0.0d;
        if (d4 < 0.0d) {
            d9 = -1.0d;
        } else {
            d9 = 1.0d;
        }
        double d11 = d4 * d9;
        double d12 = rVar.bravo;
        double d13 = rVar.delta;
        double pow = (Math.pow(d11, d13) * rVar.charlie) + d12;
        if (pow >= 0.0d) {
            d10 = pow;
        }
        return Math.pow(d10 / ((Math.pow(d11, d13) * rVar.foxtrot) + rVar.echo), rVar.golf) * d9;
    }

    public static double delta(r rVar, double d4) {
        double d9;
        if (d4 < 0.0d) {
            d9 = -1.0d;
        } else {
            d9 = 1.0d;
        }
        double d10 = d4 * d9;
        double d11 = -rVar.bravo;
        double d12 = 1.0d / rVar.golf;
        return Math.pow(Math.max((Math.pow(d10, d12) * rVar.echo) + d11, 0.0d) / ((Math.pow(d10, d12) * (-rVar.foxtrot)) + rVar.charlie), 1.0d / rVar.delta) * d9;
    }
}
