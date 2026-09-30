package Ge;

import B9.K;
import Ie.ac;
import cf.C0848d;
import cf.C0853i;
import cf.C0856l;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import pe.InterfaceC2321ad;
import ue.C3158b;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public final class e {
    public static final Set bravo = ab.oscar(He.a.CLASS);
    public static final Set charlie = ArraysKt.g(new He.a[]{He.a.FILE_FACADE, He.a.MULTIFILE_CLASS_PART});
    public static final Me.f delta;
    public static final Me.f echo;
    public K alpha;

    static {
        new Me.f(new int[]{1, 1, 2}, false);
        delta = new Me.f(new int[]{1, 1, 11}, false);
        echo = new Me.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (Ge.e.charlie.contains((He.a) r0.delta) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ef.p alpha(InterfaceC2321ad descriptor, C3158b kotlinClass) {
        Pair pair;
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(kotlinClass, "kotlinClass");
        He.b bVar = kotlinClass.bravo;
        String[] strArr = (String[]) bVar.foxtrot;
        if (strArr == null) {
            strArr = (String[]) bVar.golf;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            Me.f fVar = (Me.f) bVar.echo;
            String[] strArr2 = (String[]) bVar.hotel;
            if (strArr2 != null) {
                try {
                    try {
                        pair = Me.h.hotel(strArr, strArr2);
                    } catch (InvalidProtocolBufferException e) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.alpha(), e);
                    }
                } catch (Throwable th) {
                    ((C0853i) charlie().charlie).getClass();
                    Intrinsics.echo((C0853i) charlie().charlie, "<this>");
                    if (!fVar.bravo(Me.f.golf)) {
                        pair = null;
                    } else {
                        throw th;
                    }
                }
                if (pair != null) {
                    Me.g gVar = (Me.g) pair.first;
                    ac acVar = (ac) pair.second;
                    delta(kotlinClass);
                    echo(kotlinClass);
                    g gVar2 = new g(kotlinClass, acVar, gVar, bravo(kotlinClass));
                    return new ef.p(descriptor, acVar, gVar, fVar, gVar2, charlie(), "scope for " + gVar2 + " in " + descriptor, d.alpha);
                }
            }
        }
        return null;
    }

    public final int bravo(C3158b c3158b) {
        boolean z2;
        ((C0853i) charlie().charlie).getClass();
        int i4 = c3158b.bravo.charlie;
        if ((i4 & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (i4 & 32) == 0) {
            return 2;
        }
        if ((i4 & 16) == 0 || (i4 & 32) != 0) {
            return 1;
        }
        return 3;
    }

    public final K charlie() {
        K k6 = this.alpha;
        if (k6 != null) {
            return k6;
        }
        Intrinsics.lima("components");
        throw null;
    }

    public final C0856l delta(C3158b c3158b) {
        Me.f fVar;
        Me.f fVar2;
        ((C0853i) charlie().charlie).getClass();
        Me.f fVar3 = (Me.f) c3158b.bravo.echo;
        Intrinsics.echo((C0853i) charlie().charlie, "<this>");
        Me.f fVar4 = Me.f.golf;
        if (fVar3.bravo(fVar4)) {
            return null;
        }
        Me.f fVar5 = (Me.f) c3158b.bravo.echo;
        Intrinsics.echo((C0853i) charlie().charlie, "<this>");
        Intrinsics.echo((C0853i) charlie().charlie, "<this>");
        fVar4.getClass();
        if (fVar5.foxtrot) {
            fVar = fVar4;
        } else {
            fVar = Me.f.hotel;
        }
        fVar.getClass();
        int i4 = fVar4.bravo;
        int i5 = fVar.bravo;
        if (i5 > i4 || (i5 >= i4 && fVar.charlie > fVar4.charlie)) {
            fVar2 = fVar;
        } else {
            fVar2 = fVar4;
        }
        return new C0856l(fVar5, fVar4, fVar4, fVar2, c3158b.alpha(), AbstractC3192d.alpha(c3158b.alpha));
    }

    public final boolean echo(C3158b c3158b) {
        boolean z2;
        ((C0853i) charlie().charlie).getClass();
        ((C0853i) charlie().charlie).getClass();
        He.b bVar = c3158b.bravo;
        if ((bVar.charlie & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.areEqual((Me.f) bVar.echo, delta)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (Ge.e.bravo.contains((He.a) r1.delta) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0848d foxtrot(C3158b c3158b) {
        Pair pair;
        He.b bVar = c3158b.bravo;
        String[] strArr = (String[]) bVar.foxtrot;
        if (strArr == null) {
            strArr = (String[]) bVar.golf;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            Me.f fVar = (Me.f) bVar.echo;
            String[] strArr2 = (String[]) bVar.hotel;
            try {
            } catch (Throwable th) {
                ((C0853i) charlie().charlie).getClass();
                Intrinsics.echo((C0853i) charlie().charlie, "<this>");
                if (!fVar.bravo(Me.f.golf)) {
                    pair = null;
                } else {
                    throw th;
                }
            }
            if (strArr2 != null) {
                try {
                    pair = Me.h.foxtrot(strArr, strArr2);
                    if (pair != null) {
                        Me.g gVar = (Me.g) pair.first;
                        Ie.j jVar = (Ie.j) pair.second;
                        delta(c3158b);
                        echo(c3158b);
                        return new C0848d(gVar, jVar, fVar, new n(c3158b, bravo(c3158b)));
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalStateException("Could not read data from " + c3158b.alpha(), e);
                }
            }
        }
        return null;
    }
}
