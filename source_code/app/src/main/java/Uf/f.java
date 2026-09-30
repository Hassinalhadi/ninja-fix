package Uf;

import Tf.ah;
import ao.ad;
import av.q;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final Tf.n alpha;
    public static final Tf.n bravo;
    public static final Tf.n charlie;
    public static final Tf.n delta;
    public static final Tf.n echo;

    static {
        Tf.n nVar = Tf.n.silver;
        alpha = g8.d.oscar("/");
        bravo = g8.d.oscar("\\");
        charlie = g8.d.oscar("/\\");
        delta = g8.d.oscar(".");
        echo = g8.d.oscar("..");
    }

    public static final int alpha(ah ahVar) {
        if (ahVar.alpha.delta() != 0) {
            Tf.n nVar = ahVar.alpha;
            if (nVar.india(0) != 47) {
                if (nVar.india(0) == 92) {
                    if (nVar.delta() > 2 && nVar.india(1) == 92) {
                        Tf.n other = bravo;
                        Intrinsics.echo(other, "other");
                        int foxtrot = nVar.foxtrot(2, other.alpha);
                        if (foxtrot == -1) {
                            return nVar.delta();
                        }
                        return foxtrot;
                    }
                } else if (nVar.delta() > 2 && nVar.india(1) == 58 && nVar.india(2) == 92) {
                    char india = (char) nVar.india(0);
                    if ('a' > india || india >= '{') {
                        if ('A' <= india && india < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Tf.k, java.lang.Object] */
    public static final ah bravo(ah ahVar, ah child, boolean z2) {
        Intrinsics.echo(ahVar, "<this>");
        Intrinsics.echo(child, "child");
        if (alpha(child) != -1) {
            return child;
        }
        if (child.india() != null) {
            return child;
        }
        Tf.n charlie2 = charlie(ahVar);
        if (charlie2 == null && (charlie2 = charlie(child)) == null) {
            charlie2 = foxtrot(ah.purple);
        }
        ?? obj = new Object();
        obj.navy(ahVar.alpha);
        if (obj.purple > 0) {
            obj.navy(charlie2);
        }
        obj.navy(child.alpha);
        return delta(obj, z2);
    }

    public static final Tf.n charlie(ah ahVar) {
        Tf.n nVar = ahVar.alpha;
        Tf.n nVar2 = alpha;
        if (Tf.n.golf(nVar, nVar2) != -1) {
            return nVar2;
        }
        Tf.n nVar3 = bravo;
        if (Tf.n.golf(ahVar.alpha, nVar3) != -1) {
            return nVar3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.k, java.lang.Object] */
    public static final ah delta(Tf.k kVar, boolean z2) {
        long j5;
        Tf.n nVar;
        boolean z10;
        Tf.n nVar2;
        char juliet;
        boolean z11;
        Tf.n nVar3;
        Tf.n november;
        ?? obj = new Object();
        Tf.n nVar4 = null;
        int i4 = 0;
        while (true) {
            j5 = 0;
            if (!kVar.whiskey(0L, alpha)) {
                nVar = bravo;
                if (!kVar.whiskey(0L, nVar)) {
                    break;
                }
            }
            byte readByte = kVar.readByte();
            if (nVar4 == null) {
                nVar4 = echo(readByte);
            }
            i4++;
        }
        if (i4 >= 2 && Intrinsics.areEqual(nVar4, nVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        Tf.n nVar5 = charlie;
        if (z10) {
            Intrinsics.checkNotNull(nVar4);
            obj.navy(nVar4);
            obj.navy(nVar4);
        } else if (i4 > 0) {
            Intrinsics.checkNotNull(nVar4);
            obj.navy(nVar4);
        } else {
            long i5 = kVar.i(nVar5);
            if (nVar4 == null) {
                if (i5 == -1) {
                    nVar4 = foxtrot(ah.purple);
                } else {
                    nVar4 = echo(kVar.juliet(i5));
                }
            }
            if (!Intrinsics.areEqual(nVar4, nVar)) {
                nVar2 = nVar4;
            } else {
                nVar2 = nVar4;
                if (kVar.purple >= 2 && kVar.juliet(1L) == 58 && (('a' <= (juliet = (char) kVar.juliet(0L)) && juliet < '{') || ('A' <= juliet && juliet < '['))) {
                    if (i5 == 2) {
                        obj.write(kVar, 3L);
                    } else {
                        obj.write(kVar, 2L);
                    }
                }
            }
            nVar4 = nVar2;
        }
        if (obj.purple > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean hotel = kVar.hotel();
            nVar3 = delta;
            if (hotel) {
                break;
            }
            long j6 = j5;
            long i10 = kVar.i(nVar5);
            if (i10 == -1) {
                november = kVar.november(kVar.purple);
            } else {
                november = kVar.november(i10);
                kVar.readByte();
            }
            Tf.n nVar6 = echo;
            if (Intrinsics.areEqual(november, nVar6)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (z2 && (z11 || (!arrayList.isEmpty() && !Intrinsics.areEqual(CollectionsKt.ochre(arrayList), nVar6)))) {
                        if (!z10 || arrayList.size() != 1) {
                            CollectionsKt.g(arrayList);
                        }
                    } else {
                        arrayList.add(november);
                    }
                }
            } else if (!Intrinsics.areEqual(november, nVar3) && !Intrinsics.areEqual(november, Tf.n.silver)) {
                arrayList.add(november);
            }
            j5 = j6;
        }
        long j7 = j5;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                obj.navy(nVar4);
            }
            obj.navy((Tf.n) arrayList.get(i11));
        }
        if (obj.purple == j7) {
            obj.navy(nVar3);
        }
        return new ah(obj.november(obj.purple));
    }

    public static final Tf.n echo(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return bravo;
            }
            throw new IllegalArgumentException(ad.zulu(b2, "not a directory separator: "));
        }
        return alpha;
    }

    public static final Tf.n foxtrot(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return alpha;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return bravo;
        }
        throw new IllegalArgumentException(q.echo("not a directory separator: ", str));
    }
}
