package s0;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.AbstractC2384c;
import q0.C2396o;
import s6.AbstractC2609a7;
import t0.C2907c0;

/* loaded from: classes3.dex */
public final class am {
    public final AbstractC2367C alpha;
    public boolean charlie;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public InterfaceC2542b hotel;
    public final /* synthetic */ int juliet;
    public boolean bravo = true;
    public final HashMap india = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public am(InterfaceC2542b interfaceC2542b, int i4) {
        this.juliet = i4;
        this.alpha = (AbstractC2367C) interfaceC2542b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Xd.l, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r12v7, types: [q0.C, s0.b] */
    public static final void alpha(am amVar, C2396o c2396o, int i4, L l10) {
        float intBitsToFloat;
        amVar.getClass();
        float f5 = i4;
        long floatToRawIntBits = Float.floatToRawIntBits(f5);
        int floatToRawIntBits2 = Float.floatToRawIntBits(f5);
        while (true) {
            long j5 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            do {
                switch (amVar.juliet) {
                    case 0:
                        U u4 = l10.C;
                        if (u4 != null) {
                            j5 = ((C2907c0) u4).delta(j5, false);
                        }
                        j5 = AbstractC2609a7.bravo(j5, l10.f13262t);
                        break;
                    default:
                        au y10 = l10.y();
                        Intrinsics.checkNotNull(y10);
                        long j6 = y10.f13316j;
                        j5 = Z.b.golf((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L), j5);
                        break;
                }
                l10 = l10.f13253k;
                Intrinsics.checkNotNull(l10);
                if (Intrinsics.areEqual(l10, amVar.alpha.golf())) {
                    if (c2396o instanceof C2396o) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j5 & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    HashMap hashMap = amVar.india;
                    if (hashMap.containsKey(c2396o)) {
                        int intValue = ((Number) kotlin.collections.y.papa(hashMap, c2396o)).intValue();
                        C2396o c2396o2 = AbstractC2384c.alpha;
                        round = ((Number) c2396o.alpha.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(c2396o, Integer.valueOf(round));
                    return;
                }
            } while (!amVar.bravo(l10).containsKey(c2396o));
            float charlie = amVar.charlie(l10, c2396o);
            floatToRawIntBits = Float.floatToRawIntBits(charlie);
            floatToRawIntBits2 = Float.floatToRawIntBits(charlie);
        }
    }

    public final Map bravo(L l10) {
        switch (this.juliet) {
            case 0:
                return l10.i().charlie();
            default:
                au y10 = l10.y();
                Intrinsics.checkNotNull(y10);
                return y10.i().charlie();
        }
    }

    public final int charlie(L l10, C2396o c2396o) {
        switch (this.juliet) {
            case 0:
                return l10.magenta(c2396o);
            default:
                au y10 = l10.y();
                Intrinsics.checkNotNull(y10);
                return y10.magenta(c2396o);
        }
    }

    public final boolean delta() {
        if (!this.charlie && !this.echo && !this.foxtrot && !this.golf) {
            return false;
        }
        return true;
    }

    public final boolean echo() {
        hotel();
        if (this.hotel != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q0.C, s0.b] */
    public final void foxtrot() {
        this.bravo = true;
        ?? r02 = this.alpha;
        InterfaceC2542b hotel = r02.hotel();
        if (hotel == null) {
            return;
        }
        if (this.charlie) {
            hotel.green();
        } else if (this.echo || this.delta) {
            hotel.requestLayout();
        }
        if (this.foxtrot) {
            r02.green();
        }
        if (this.golf) {
            r02.requestLayout();
        }
        hotel.charlie().foxtrot();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q0.C, s0.b] */
    public final void golf() {
        HashMap hashMap = this.india;
        hashMap.clear();
        C2541a c2541a = new C2541a(this);
        ?? r22 = this.alpha;
        r22.fuchsia(c2541a);
        hashMap.putAll(bravo(r22.golf()));
        this.bravo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [q0.C, s0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hotel() {
        am charlie;
        am charlie2;
        boolean delta = delta();
        ?? r12 = this.alpha;
        InterfaceC2542b interfaceC2542b = r12;
        if (!delta) {
            InterfaceC2542b hotel = r12.hotel();
            if (hotel != null) {
                InterfaceC2542b interfaceC2542b2 = hotel.charlie().hotel;
                if (interfaceC2542b2 != null) {
                    boolean delta2 = interfaceC2542b2.charlie().delta();
                    interfaceC2542b = interfaceC2542b2;
                }
                InterfaceC2542b interfaceC2542b3 = this.hotel;
                if (interfaceC2542b3 != null && !interfaceC2542b3.charlie().delta()) {
                    InterfaceC2542b hotel2 = interfaceC2542b3.hotel();
                    if (hotel2 != null && (charlie2 = hotel2.charlie()) != null) {
                        charlie2.hotel();
                    }
                    InterfaceC2542b hotel3 = interfaceC2542b3.hotel();
                    if (hotel3 != null && (charlie = hotel3.charlie()) != null) {
                        interfaceC2542b = charlie.hotel;
                    } else {
                        interfaceC2542b = null;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.hotel = interfaceC2542b;
    }
}
