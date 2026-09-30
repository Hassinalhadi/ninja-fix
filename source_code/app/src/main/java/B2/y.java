package B2;

import android.app.ActivityManager;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import delivery.samurai.android.R;
import g0.C1726f;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m2.AbstractC2096a;
import pe.AbstractC2327c;
import s2.InterfaceC2593a;

/* loaded from: classes3.dex */
public abstract class y {
    public static C1726f alpha;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int alpha(int i4, int i5, int i10, boolean z2) {
        if (i5 >= i10) {
            if (z2) {
                return 0;
            }
            return i10 - i5;
        }
        if (!z2) {
            if (z2 ? i10 - i5 > i4 : i5 <= i4) {
                if (z2) {
                    return i4 - i5;
                }
            } else {
                if (!z2) {
                    return 0;
                }
                return i10 - i5;
            }
        } else if (z2) {
            if (!z2) {
            }
        } else if (!z2) {
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cf A[LOOP:6: B:104:0x0398->B:118:0x03cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029e A[LOOP:1: B:52:0x0269->B:64:0x029e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w bravo(Context context, A2.a aVar) {
        l2.o oVar;
        ActivityManager activityManager;
        int i4;
        String str;
        boolean z2;
        boolean z10;
        boolean z11;
        int i5 = 0;
        Intrinsics.echo(context, "context");
        L2.c cVar = new L2.c(aVar.charlie);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "context.applicationContext");
        K2.i iVar = cVar.alpha;
        Intrinsics.delta(iVar, "workTaskExecutor.serialTaskExecutor");
        boolean z12 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        A2.aa clock = aVar.delta;
        Intrinsics.echo(clock, "clock");
        if (z12) {
            oVar = new l2.o(applicationContext, null);
            oVar.india = true;
        } else if (!StringsKt.gray("androidx.work.workdb")) {
            l2.o oVar2 = new l2.o(applicationContext, "androidx.work.workdb");
            oVar2.hotel = new s(i5, applicationContext);
            oVar = oVar2;
        } else {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        oVar.foxtrot = iVar;
        a aVar2 = new a(clock);
        ArrayList arrayList = oVar.charlie;
        arrayList.add(aVar2);
        oVar.alpha(d.hotel);
        oVar.alpha(new g(applicationContext, 2, 3));
        oVar.alpha(d.india);
        oVar.alpha(d.juliet);
        oVar.alpha(new g(applicationContext, 5, 6));
        oVar.alpha(d.kilo);
        oVar.alpha(d.lima);
        oVar.alpha(d.mike);
        oVar.alpha(new g(applicationContext));
        oVar.alpha(new g(applicationContext, 10, 11));
        oVar.alpha(d.delta);
        oVar.alpha(d.echo);
        oVar.alpha(d.foxtrot);
        oVar.alpha(d.golf);
        oVar.alpha(new g(applicationContext, 21, 22));
        oVar.kilo = false;
        oVar.lima = true;
        Executor executor = oVar.foxtrot;
        if (executor == null && oVar.golf == null) {
            ap.a aVar3 = ap.b.charlie;
            oVar.golf = aVar3;
            oVar.foxtrot = aVar3;
        } else if (executor != null && oVar.golf == null) {
            oVar.golf = executor;
        } else if (executor == null) {
            oVar.foxtrot = oVar.golf;
        }
        HashSet hashSet = oVar.papa;
        LinkedHashSet linkedHashSet = oVar.oscar;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(ao.ad.zulu(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC2593a interfaceC2593a = oVar.hotel;
        if (interfaceC2593a == null) {
            interfaceC2593a = new g7.f(15);
        }
        InterfaceC2593a interfaceC2593a2 = interfaceC2593a;
        if (oVar.mike > 0) {
            if (oVar.bravo != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z13 = oVar.india;
        int i10 = oVar.juliet;
        if (i10 != 0) {
            Context context2 = oVar.alpha;
            if (i10 != 1) {
                i4 = i10;
            } else {
                Object systemService = context2.getSystemService("activity");
                if (systemService instanceof ActivityManager) {
                    activityManager = (ActivityManager) systemService;
                } else {
                    activityManager = null;
                }
                if (activityManager != null && !activityManager.isLowRamDevice()) {
                    i4 = 3;
                } else {
                    i4 = 2;
                }
            }
            Executor executor2 = oVar.foxtrot;
            if (executor2 != null) {
                Executor executor3 = oVar.golf;
                if (executor3 != null) {
                    l2.e eVar = new l2.e(context2, oVar.bravo, interfaceC2593a2, oVar.november, arrayList, z13, i4, executor2, executor3, oVar.kilo, oVar.lima, linkedHashSet, oVar.delta, oVar.echo);
                    Package r32 = WorkDatabase.class.getPackage();
                    Intrinsics.checkNotNull(r32);
                    String fullPackage = r32.getName();
                    String canonicalName = WorkDatabase.class.getCanonicalName();
                    Intrinsics.checkNotNull(canonicalName);
                    Intrinsics.delta(fullPackage, "fullPackage");
                    if (fullPackage.length() != 0) {
                        canonicalName = canonicalName.substring(fullPackage.length() + 1);
                        Intrinsics.delta(canonicalName, "this as java.lang.String).substring(startIndex)");
                    }
                    String concat = kotlin.text.r.november(canonicalName, '.', '_').concat("_Impl");
                    try {
                        if (fullPackage.length() == 0) {
                            str = concat;
                        } else {
                            str = fullPackage + '.' + concat;
                        }
                        Class<?> cls = Class.forName(str, true, WorkDatabase.class.getClassLoader());
                        Intrinsics.charlie(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                        WorkDatabase workDatabase = (WorkDatabase) cls.getDeclaredConstructor(null).newInstance(null);
                        workDatabase.getClass();
                        workDatabase.charlie = workDatabase.echo(eVar);
                        Set india = workDatabase.india();
                        BitSet bitSet = new BitSet();
                        Iterator it2 = india.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            LinkedHashMap linkedHashMap = workDatabase.golf;
                            ArrayList arrayList2 = eVar.november;
                            if (hasNext) {
                                Class cls2 = (Class) it2.next();
                                int size = arrayList2.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i11 = size - 1;
                                        if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                            bitSet.set(size);
                                            break;
                                        }
                                        if (i11 < 0) {
                                            break;
                                        }
                                        size = i11;
                                    }
                                    if (size < 0) {
                                        linkedHashMap.put(cls2, arrayList2.get(size));
                                    } else {
                                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                                    }
                                }
                                size = -1;
                                if (size < 0) {
                                }
                            } else {
                                int size2 = arrayList2.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i12 = size2 - 1;
                                        if (bitSet.get(size2)) {
                                            if (i12 < 0) {
                                                break;
                                            }
                                            size2 = i12;
                                        } else {
                                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                        }
                                    }
                                }
                                for (AbstractC2096a abstractC2096a : workDatabase.golf(linkedHashMap)) {
                                    int i13 = abstractC2096a.alpha;
                                    A2.h hVar = eVar.delta;
                                    LinkedHashMap linkedHashMap2 = hVar.alpha;
                                    if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                                        if (map == null) {
                                            map = kotlin.collections.t.alpha;
                                        }
                                        z11 = map.containsKey(Integer.valueOf(abstractC2096a.bravo));
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11) {
                                        hVar.alpha(abstractC2096a);
                                    }
                                }
                                if (eVar.golf == 3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                workDatabase.hotel().setWriteAheadLoggingEnabled(z2);
                                workDatabase.foxtrot = eVar.echo;
                                workDatabase.bravo = eVar.hotel;
                                new K2.i(eVar.india);
                                workDatabase.echo = eVar.foxtrot;
                                Map juliet = workDatabase.juliet();
                                BitSet bitSet2 = new BitSet();
                                Iterator it3 = juliet.entrySet().iterator();
                                while (true) {
                                    boolean hasNext2 = it3.hasNext();
                                    ArrayList arrayList3 = eVar.mike;
                                    if (hasNext2) {
                                        Map.Entry entry = (Map.Entry) it3.next();
                                        Class cls3 = (Class) entry.getKey();
                                        for (Class cls4 : (List) entry.getValue()) {
                                            int size3 = arrayList3.size() - 1;
                                            if (size3 >= 0) {
                                                while (true) {
                                                    int i14 = size3 - 1;
                                                    if (cls4.isAssignableFrom(arrayList3.get(size3).getClass())) {
                                                        bitSet2.set(size3);
                                                        break;
                                                    }
                                                    if (i14 < 0) {
                                                        break;
                                                    }
                                                    size3 = i14;
                                                }
                                                if (size3 < 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (!z10) {
                                                    workDatabase.kilo.put(cls4, arrayList3.get(size3));
                                                } else {
                                                    throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                                }
                                            }
                                            size3 = -1;
                                            if (size3 < 0) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    } else {
                                        int size4 = arrayList3.size() - 1;
                                        if (size4 >= 0) {
                                            while (true) {
                                                int i15 = size4 - 1;
                                                if (bitSet2.get(size4)) {
                                                    if (i15 < 0) {
                                                        break;
                                                    }
                                                    size4 = i15;
                                                } else {
                                                    throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                }
                                            }
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Intrinsics.delta(applicationContext2, "context.applicationContext");
                                        H2.l lVar = new H2.l(applicationContext2, cVar);
                                        f fVar = new f(context.getApplicationContext(), aVar, cVar, workDatabase);
                                        return new w(context.getApplicationContext(), aVar, cVar, workDatabase, (List) x.alpha.invoke(context, aVar, cVar, workDatabase, lVar, fVar), fVar, lVar);
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                        throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
                    } catch (IllegalAccessException unused2) {
                        throw new RuntimeException(AbstractC2327c.whiskey(WorkDatabase.class, new StringBuilder("Cannot access the constructor ")));
                    } catch (InstantiationException unused3) {
                        throw new RuntimeException(AbstractC2327c.whiskey(WorkDatabase.class, new StringBuilder("Failed to create an instance of ")));
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw null;
        }
    }
}
