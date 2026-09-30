package Nf;

import ge.InterfaceC1772d;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class H {
    public static final Ld.g alpha;

    static {
        Ld.g gVar = new Ld.g();
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        gVar.put(vVar.bravo(String.class), P.alpha);
        gVar.put(vVar.bravo(Character.TYPE), C0258p.alpha);
        gVar.put(vVar.bravo(char[].class), C0257o.charlie);
        gVar.put(vVar.bravo(Double.TYPE), C0262u.alpha);
        gVar.put(vVar.bravo(double[].class), C0261t.charlie);
        gVar.put(vVar.bravo(Float.TYPE), ab.alpha);
        gVar.put(vVar.bravo(float[].class), aa.charlie);
        gVar.put(vVar.bravo(Long.TYPE), ao.alpha);
        gVar.put(vVar.bravo(long[].class), an.charlie);
        gVar.put(vVar.bravo(kotlin.p.class), a0.alpha);
        gVar.put(vVar.bravo(Integer.TYPE), aj.alpha);
        gVar.put(vVar.bravo(int[].class), ai.charlie);
        gVar.put(vVar.bravo(UInt.class), X.alpha);
        gVar.put(vVar.bravo(Short.TYPE), O.alpha);
        gVar.put(vVar.bravo(short[].class), N.charlie);
        gVar.put(vVar.bravo(kotlin.s.class), d0.alpha);
        gVar.put(vVar.bravo(Byte.TYPE), C0252j.alpha);
        gVar.put(vVar.bravo(byte[].class), C0251i.charlie);
        gVar.put(vVar.bravo(UByte.class), U.alpha);
        gVar.put(vVar.bravo(Boolean.TYPE), C0249g.alpha);
        gVar.put(vVar.bravo(boolean[].class), C0248f.charlie);
        InterfaceC1772d bravo = vVar.bravo(Unit.class);
        Intrinsics.echo(Unit.INSTANCE, "<this>");
        gVar.put(bravo, e0.bravo);
        gVar.put(vVar.bravo(Void.class), av.alpha);
        try {
            InterfaceC1772d bravo2 = vVar.bravo(kotlin.time.b.class);
            int i4 = kotlin.time.b.silver;
            gVar.put(bravo2, C0263v.alpha);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            gVar.put(kotlin.jvm.internal.u.alpha.bravo(kotlin.q.class), Z.charlie);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            gVar.put(kotlin.jvm.internal.u.alpha.bravo(kotlin.o.class), W.charlie);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            gVar.put(kotlin.jvm.internal.u.alpha.bravo(kotlin.t.class), c0.charlie);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            gVar.put(kotlin.jvm.internal.u.alpha.bravo(kotlin.n.class), T.charlie);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            gVar.put(kotlin.jvm.internal.u.alpha.bravo(rf.b.class), f0.alpha);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        alpha = gVar.bravo();
    }
}
