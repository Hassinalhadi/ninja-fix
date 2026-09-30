package t6;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public abstract class L2 {
    public static final Z.d alpha(float f5, float f10, float f11, float f12, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new Z.d(f5, f10, f11, f12, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final int bravo(n.ax axVar, long j5, t0.C0 c02) {
        long cyan;
        int foxtrot;
        n.e0 delta = axVar.delta();
        if (delta != null) {
            D0.o oVar = delta.alpha.bravo;
            q0.z charlie = axVar.charlie();
            if (charlie != null && (foxtrot = foxtrot(oVar, (cyan = charlie.cyan(j5)), c02)) != -1) {
                return oVar.golf(Z.b.alpha((oVar.bravo(foxtrot) + oVar.foxtrot(foxtrot)) / 2.0f, 1, cyan));
            }
        }
        return -1;
    }

    public static final long charlie(n.ax axVar, Z.c cVar, Z.c cVar2, int i4) {
        long golf = golf(axVar, cVar, i4);
        if (D0.am.charlie(golf)) {
            return D0.am.bravo;
        }
        long golf2 = golf(axVar, cVar2, i4);
        if (D0.am.charlie(golf2)) {
            return D0.am.bravo;
        }
        int i5 = (int) (golf >> 32);
        int i10 = (int) (golf2 & 4294967295L);
        return D0.ae.bravo(Math.min(i5, i5), Math.max(i10, i10));
    }

    public static final boolean delta(D0.ak akVar, int i4) {
        D0.o oVar = akVar.bravo;
        int delta = oVar.delta(i4);
        if (i4 == akVar.foxtrot(delta) || i4 == oVar.charlie(delta, false) ? akVar.golf(i4) == akVar.alpha(i4) : akVar.alpha(i4) == akVar.alpha(i4 - 1)) {
            return false;
        }
        return true;
    }

    public static final long echo(PointF pointF) {
        float f5 = pointF.x;
        float f10 = pointF.y;
        return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final int foxtrot(D0.o oVar, long j5, t0.C0 c02) {
        float f5;
        if (c02 != null) {
            f5 = c02.golf();
        } else {
            f5 = 0.0f;
        }
        int i4 = (int) (4294967295L & j5);
        int echo = oVar.echo(Float.intBitsToFloat(i4));
        if (Float.intBitsToFloat(i4) >= oVar.foxtrot(echo) - f5 && Float.intBitsToFloat(i4) <= oVar.bravo(echo) + f5) {
            int i5 = (int) (j5 >> 32);
            if (Float.intBitsToFloat(i5) >= (-f5) && Float.intBitsToFloat(i5) <= oVar.delta + f5) {
                return echo;
            }
            return -1;
        }
        return -1;
    }

    public static final long golf(n.ax axVar, Z.c cVar, int i4) {
        D0.o oVar;
        A8.a aVar = D0.ai.bravo;
        n.e0 delta = axVar.delta();
        if (delta != null) {
            oVar = delta.alpha.bravo;
        } else {
            oVar = null;
        }
        q0.z charlie = axVar.charlie();
        if (oVar != null && charlie != null) {
            return oVar.hotel(cVar.hotel(charlie.cyan(0L)), i4, aVar);
        }
        return D0.am.bravo;
    }

    public static final boolean hotel(int i4) {
        int type = Character.getType(i4);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean india(Z.d dVar) {
        long j5 = dVar.echo;
        if ((j5 >>> 32) == (4294967295L & j5) && j5 == dVar.foxtrot && j5 == dVar.golf && j5 == dVar.hotel) {
            return true;
        }
        return false;
    }

    public static final boolean juliet(int i4) {
        if (!Character.isWhitespace(i4) && i4 != 160) {
            return false;
        }
        return true;
    }

    public static final boolean kilo(int i4) {
        int type;
        if (juliet(i4) && (type = Character.getType(i4)) != 14 && type != 13 && i4 != 10) {
            return true;
        }
        return false;
    }
}
