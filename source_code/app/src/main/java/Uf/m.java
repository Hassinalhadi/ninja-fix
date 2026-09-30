package Uf;

import Tf.ah;
import Tf.ak;
import ao.ad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal.ws.WebSocketProtocol;
import r6.u;
import s6.AbstractC2743p6;

/* loaded from: classes3.dex */
public abstract class m {
    public static final LinkedHashMap alpha(ArrayList arrayList) {
        String str = ah.purple;
        ah bravo = u.bravo("/", false);
        LinkedHashMap tango = y.tango(new Pair(bravo, new j(bravo, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (j jVar : CollectionsKt.p(arrayList, new Sb.k(1))) {
            if (((j) tango.put(jVar.alpha, jVar)) == null) {
                while (true) {
                    ah ahVar = jVar.alpha;
                    ah charlie = ahVar.charlie();
                    if (charlie != null) {
                        j jVar2 = (j) tango.get(charlie);
                        if (jVar2 != null) {
                            jVar2.quebec.add(ahVar);
                            break;
                        }
                        j jVar3 = new j(charlie, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        tango.put(charlie, jVar3);
                        jVar3.quebec.add(ahVar);
                        jVar = jVar3;
                    }
                }
            }
        }
        return tango;
    }

    public static final String bravo(int i4) {
        AbstractC2743p6.alpha(16);
        String num = Integer.toString(i4, 16);
        Intrinsics.delta(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.t, java.lang.Object] */
    public static final j charlie(final ak akVar) {
        final long j5;
        int echo = akVar.echo();
        if (echo == 33639248) {
            akVar.india(4L);
            short golf = akVar.golf();
            int i4 = golf & 65535;
            if ((golf & 1) == 0) {
                int golf2 = akVar.golf() & 65535;
                int golf3 = akVar.golf() & 65535;
                int golf4 = akVar.golf() & 65535;
                long echo2 = akVar.echo() & 4294967295L;
                final ?? obj = new Object();
                obj.alpha = akVar.echo() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.alpha = akVar.echo() & 4294967295L;
                int golf5 = akVar.golf() & 65535;
                int golf6 = akVar.golf() & 65535;
                int golf7 = 65535 & akVar.golf();
                akVar.india(8L);
                final ?? obj3 = new Object();
                obj3.alpha = akVar.echo() & 4294967295L;
                String juliet = akVar.juliet(golf5);
                if (!StringsKt.black(juliet, (char) 0)) {
                    if (obj2.alpha == 4294967295L) {
                        j5 = 8;
                    } else {
                        j5 = 0;
                    }
                    if (obj.alpha == 4294967295L) {
                        j5 += 8;
                    }
                    if (obj3.alpha == 4294967295L) {
                        j5 += 8;
                    }
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    final ?? obj4 = new Object();
                    delta(akVar, golf6, new Xd.l() { // from class: Uf.l
                        @Override // Xd.l
                        public final Object invoke(Object obj5, Object obj6) {
                            long j6;
                            int intValue = ((Integer) obj5).intValue();
                            long longValue = ((Long) obj6).longValue();
                            ak akVar2 = akVar;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        akVar2.india(4L);
                                        m.delta(akVar2, (int) (longValue - 4), new k(objectRef, akVar2, objectRef2, objectRef3));
                                    } else {
                                        throw new IOException("bad zip: NTFS extra too short");
                                    }
                                }
                            } else {
                                q qVar = q.this;
                                if (!qVar.alpha) {
                                    qVar.alpha = true;
                                    if (longValue >= j5) {
                                        t tVar = obj2;
                                        long j7 = tVar.alpha;
                                        if (j7 == 4294967295L) {
                                            j7 = akVar2.foxtrot();
                                        }
                                        tVar.alpha = j7;
                                        t tVar2 = obj;
                                        long j10 = 0;
                                        if (tVar2.alpha == 4294967295L) {
                                            j6 = akVar2.foxtrot();
                                        } else {
                                            j6 = 0;
                                        }
                                        tVar2.alpha = j6;
                                        t tVar3 = obj3;
                                        if (tVar3.alpha == 4294967295L) {
                                            j10 = akVar2.foxtrot();
                                        }
                                        tVar3.alpha = j10;
                                    } else {
                                        throw new IOException("bad zip: zip64 extra too short");
                                    }
                                } else {
                                    throw new IOException("bad zip: zip64 extra repeated");
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    if (j5 > 0 && !obj4.alpha) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String juliet2 = akVar.juliet(golf7);
                    String str = ah.purple;
                    return new j(u.bravo("/", false).foxtrot(juliet), r.golf(juliet, "/", false), juliet2, echo2, obj.alpha, obj2.alpha, golf2, obj3.alpha, golf4, golf3, (Long) objectRef.alpha, (Long) objectRef2.alpha, (Long) objectRef3.alpha, 57344);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + bravo(i4));
        }
        throw new IOException("bad zip: expected " + bravo(33639248) + " but was " + bravo(echo));
    }

    public static final void delta(ak akVar, int i4, Xd.l lVar) {
        long j5 = i4;
        while (j5 != 0) {
            if (j5 >= 4) {
                int golf = akVar.golf() & 65535;
                long golf2 = akVar.golf() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j6 = j5 - 4;
                if (j6 >= golf2) {
                    akVar.kilo(golf2);
                    Tf.k kVar = akVar.purple;
                    long j7 = kVar.purple;
                    lVar.invoke(Integer.valueOf(golf), Long.valueOf(golf2));
                    long j10 = (kVar.purple + golf2) - j7;
                    if (j10 >= 0) {
                        if (j10 > 0) {
                            kVar.india(j10);
                        }
                        j5 = j6 - golf2;
                    } else {
                        throw new IOException(ad.zulu(golf, "unsupported zip: too many bytes processed for "));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final j echo(ak akVar, j jVar) {
        int echo = akVar.echo();
        if (echo == 67324752) {
            akVar.india(2L);
            short golf = akVar.golf();
            int i4 = golf & 65535;
            if ((golf & 1) == 0) {
                akVar.india(18L);
                long golf2 = akVar.golf() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int golf3 = akVar.golf() & 65535;
                akVar.india(golf2);
                if (jVar == null) {
                    akVar.india(golf3);
                    return null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                delta(akVar, golf3, new k(akVar, objectRef, objectRef2, objectRef3));
                return new j(jVar.alpha, jVar.bravo, jVar.charlie, jVar.delta, jVar.echo, jVar.foxtrot, jVar.golf, jVar.hotel, jVar.india, jVar.juliet, jVar.kilo, jVar.lima, jVar.mike, (Integer) objectRef.alpha, (Integer) objectRef2.alpha, (Integer) objectRef3.alpha);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + bravo(i4));
        }
        throw new IOException("bad zip: expected " + bravo(67324752) + " but was " + bravo(echo));
    }
}
