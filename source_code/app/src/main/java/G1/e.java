package G1;

import C1.C0081c;
import C1.ap;
import Tf.aj;
import Tf.ak;
import Tf.j;
import Tf.u;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.C0599f;
import androidx.datastore.preferences.protobuf.C0602i;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import av.q;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import td.C3117a;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class e {
    public static final e alpha = new Object();

    public static d alpha(D8.c cVar, Function0 function0) {
        List migrations = CollectionsKt.emptyList();
        Cf.e eVar = ao.alpha;
        C3117a charlie = ad.charlie(Cf.d.purple.plus(ad.foxtrot()));
        Intrinsics.echo(migrations, "migrations");
        return new d(new d(new ap(new E1.f(u.SYSTEM, new F2.e(function0, 1)), ab.juliet(new C0081c(migrations, null)), cVar, charlie)));
    }

    public b bravo(ak akVar) {
        int i4;
        byte[] bArr;
        try {
            F1.c oscar = F1.c.oscar(new Hd.b(2, akVar));
            b bVar = new b(false);
            g[] pairs = (g[]) Arrays.copyOf(new g[0], 0);
            Intrinsics.echo(pairs, "pairs");
            bVar.bravo();
            if (pairs.length <= 0) {
                Map mike = oscar.mike();
                Intrinsics.delta(mike, "preferencesProto.preferencesMap");
                for (Map.Entry entry : mike.entrySet()) {
                    String name = (String) entry.getKey();
                    F1.g value = (F1.g) entry.getValue();
                    Intrinsics.delta(name, "name");
                    Intrinsics.delta(value, "value");
                    int beige = value.beige();
                    if (beige == 0) {
                        i4 = -1;
                    } else {
                        i4 = i.$EnumSwitchMapping$0[q.mike(beige)];
                    }
                    switch (i4) {
                        case -1:
                            throw new CorruptionException("Value case is null.", null, 2, null);
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            bVar.delta(new f(name), Boolean.valueOf(value.tango()));
                            break;
                        case 2:
                            bVar.delta(new f(name), Float.valueOf(value.xray()));
                            break;
                        case 3:
                            bVar.delta(new f(name), Double.valueOf(value.whiskey()));
                            break;
                        case 4:
                            bVar.delta(new f(name), Integer.valueOf(value.yankee()));
                            break;
                        case 5:
                            bVar.delta(new f(name), Long.valueOf(value.zulu()));
                            break;
                        case 6:
                            f fVar = new f(name);
                            String amber = value.amber();
                            Intrinsics.delta(amber, "value.string");
                            bVar.delta(fVar, amber);
                            break;
                        case 7:
                            f fVar2 = new f(name);
                            t november = value.azure().november();
                            Intrinsics.delta(november, "value.stringSet.stringsList");
                            bVar.delta(fVar2, CollectionsKt.D(november));
                            break;
                        case 8:
                            f fVar3 = new f(name);
                            C0599f uniform = value.uniform();
                            int size = uniform.size();
                            if (size == 0) {
                                bArr = androidx.datastore.preferences.protobuf.u.bravo;
                            } else {
                                byte[] bArr2 = new byte[size];
                                uniform.hotel(size, bArr2);
                                bArr = bArr2;
                            }
                            Intrinsics.delta(bArr, "value.bytes.toByteArray()");
                            bVar.delta(fVar3, bArr);
                            break;
                        case 9:
                            throw new CorruptionException("Value not set.", null, 2, null);
                    }
                }
                return new b(y.amber(bVar.alpha()), true);
            }
            g gVar = pairs[0];
            throw null;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    public Unit charlie(Object obj, aj ajVar) {
        s alpha2;
        Map alpha3 = ((b) obj).alpha();
        F1.a november = F1.c.november();
        for (Map.Entry entry : alpha3.entrySet()) {
            f fVar = (f) entry.getKey();
            Object value = entry.getValue();
            String str = fVar.alpha;
            if (value instanceof Boolean) {
                F1.f black = F1.g.black();
                boolean booleanValue = ((Boolean) value).booleanValue();
                black.charlie();
                F1.g.quebec((F1.g) black.purple, booleanValue);
                alpha2 = black.alpha();
            } else if (value instanceof Float) {
                F1.f black2 = F1.g.black();
                float floatValue = ((Number) value).floatValue();
                black2.charlie();
                F1.g.romeo((F1.g) black2.purple, floatValue);
                alpha2 = black2.alpha();
            } else if (value instanceof Double) {
                F1.f black3 = F1.g.black();
                double doubleValue = ((Number) value).doubleValue();
                black3.charlie();
                F1.g.oscar((F1.g) black3.purple, doubleValue);
                alpha2 = black3.alpha();
            } else if (value instanceof Integer) {
                F1.f black4 = F1.g.black();
                int intValue = ((Number) value).intValue();
                black4.charlie();
                F1.g.sierra((F1.g) black4.purple, intValue);
                alpha2 = black4.alpha();
            } else if (value instanceof Long) {
                F1.f black5 = F1.g.black();
                long longValue = ((Number) value).longValue();
                black5.charlie();
                F1.g.lima((F1.g) black5.purple, longValue);
                alpha2 = black5.alpha();
            } else if (value instanceof String) {
                F1.f black6 = F1.g.black();
                black6.charlie();
                F1.g.mike((F1.g) black6.purple, (String) value);
                alpha2 = black6.alpha();
            } else if (value instanceof Set) {
                F1.f black7 = F1.g.black();
                F1.d oscar = F1.e.oscar();
                Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                oscar.charlie();
                F1.e.lima((F1.e) oscar.purple, (Set) value);
                black7.charlie();
                F1.g.november((F1.g) black7.purple, (F1.e) oscar.alpha());
                alpha2 = black7.alpha();
            } else if (value instanceof byte[]) {
                F1.f black8 = F1.g.black();
                byte[] bArr = (byte[]) value;
                C0599f c0599f = C0599f.red;
                C0599f delta = C0599f.delta(bArr, 0, bArr.length);
                black8.charlie();
                F1.g.papa((F1.g) black8.purple, delta);
                alpha2 = black8.alpha();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            november.getClass();
            november.charlie();
            F1.c.lima((F1.c) november.purple).put(str, (F1.g) alpha2);
        }
        F1.c cVar = (F1.c) november.alpha();
        j jVar = new j(ajVar, 1);
        int alpha4 = cVar.alpha(null);
        Logger logger = C0602i.foxtrot;
        if (alpha4 > 4096) {
            alpha4 = 4096;
        }
        C0602i c0602i = new C0602i(jVar, alpha4);
        cVar.kilo(c0602i);
        if (c0602i.delta > 0) {
            c0602i.mike();
        }
        return Unit.INSTANCE;
    }
}
