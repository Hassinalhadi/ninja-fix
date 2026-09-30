package s6;

import com.google.maps.android.BuildConfig;
import com.zendesk.service.HttpConstants;
import gf.InterfaceC1789d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.AbstractC2120h;

/* renamed from: s6.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2680i6 {
    public static final kf.a alpha(kotlin.reflect.jvm.internal.impl.types.y type) {
        Object foxtrot;
        int bravo;
        kf.d dVar;
        Intrinsics.echo(type, "type");
        if (kotlin.reflect.jvm.internal.impl.types.c.juliet(type)) {
            kf.a alpha = alpha(kotlin.reflect.jvm.internal.impl.types.c.kilo(type));
            kf.a alpha2 = alpha(kotlin.reflect.jvm.internal.impl.types.c.yankee(type));
            return new kf.a(kotlin.reflect.jvm.internal.impl.types.c.golf(kotlin.reflect.jvm.internal.impl.types.ab.alpha(kotlin.reflect.jvm.internal.impl.types.c.kilo((kotlin.reflect.jvm.internal.impl.types.y) alpha.alpha), kotlin.reflect.jvm.internal.impl.types.c.yankee((kotlin.reflect.jvm.internal.impl.types.y) alpha2.alpha)), type), kotlin.reflect.jvm.internal.impl.types.c.golf(kotlin.reflect.jvm.internal.impl.types.ab.alpha(kotlin.reflect.jvm.internal.impl.types.c.kilo((kotlin.reflect.jvm.internal.impl.types.y) alpha.bravo), kotlin.reflect.jvm.internal.impl.types.c.yankee((kotlin.reflect.jvm.internal.impl.types.y) alpha2.bravo)), type));
        }
        kotlin.reflect.jvm.internal.impl.types.ap green = type.green();
        boolean z2 = true;
        if (type.green() instanceof Re.b) {
            Intrinsics.charlie(green, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            kotlin.reflect.jvm.internal.impl.types.as alpha3 = ((Re.b) green).alpha();
            kotlin.reflect.jvm.internal.impl.types.y bravo2 = alpha3.bravo();
            Intrinsics.delta(bravo2, "typeProjection.type");
            kotlin.reflect.jvm.internal.impl.types.y india = kotlin.reflect.jvm.internal.impl.types.az.india(bravo2, type.indigo());
            Intrinsics.delta(india, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            int mike = av.q.mike(alpha3.alpha());
            if (mike != 1) {
                if (mike == 2) {
                    kotlin.reflect.jvm.internal.impl.types.y india2 = kotlin.reflect.jvm.internal.impl.types.az.india(O5.echo(type).mike(), type.indigo());
                    Intrinsics.delta(india2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                    return new kf.a(india2, india);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + alpha3);
            }
            return new kf.a(india, O5.echo(type).november());
        }
        if (!type.cyan().isEmpty() && type.cyan().size() == green.getParameters().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List cyan = type.cyan();
            List parameters = green.getParameters();
            Intrinsics.delta(parameters, "typeConstructor.parameters");
            Iterator it = CollectionsKt.H(cyan, parameters).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                kotlin.reflect.jvm.internal.impl.types.as asVar = (kotlin.reflect.jvm.internal.impl.types.as) pair.first;
                pe.aq typeParameter = (pe.aq) pair.second;
                Intrinsics.delta(typeParameter, "typeParameter");
                int fuchsia = typeParameter.fuchsia();
                if (fuchsia != 0) {
                    if (asVar != null) {
                        kotlin.reflect.jvm.internal.impl.types.ax axVar = kotlin.reflect.jvm.internal.impl.types.ax.bravo;
                        if (asVar.charlie()) {
                            bravo = 3;
                        } else {
                            bravo = kotlin.reflect.jvm.internal.impl.types.ax.bravo(fuchsia, asVar.alpha());
                        }
                        int mike2 = av.q.mike(bravo);
                        if (mike2 != 0) {
                            if (mike2 != 1) {
                                if (mike2 == 2) {
                                    kotlin.reflect.jvm.internal.impl.types.ae mike3 = Ue.e.echo(typeParameter).mike();
                                    kotlin.reflect.jvm.internal.impl.types.y type2 = asVar.bravo();
                                    Intrinsics.delta(type2, "type");
                                    dVar = new kf.d(typeParameter, mike3, type2);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.types.y type3 = asVar.bravo();
                                Intrinsics.delta(type3, "type");
                                dVar = new kf.d(typeParameter, type3, Ue.e.echo(typeParameter).november());
                            }
                        } else {
                            kotlin.reflect.jvm.internal.impl.types.y type4 = asVar.bravo();
                            Intrinsics.delta(type4, "type");
                            kotlin.reflect.jvm.internal.impl.types.y type5 = asVar.bravo();
                            Intrinsics.delta(type5, "type");
                            dVar = new kf.d(typeParameter, type4, type5);
                        }
                        if (asVar.charlie()) {
                            arrayList.add(dVar);
                            arrayList2.add(dVar);
                        } else {
                            kf.a alpha4 = alpha(dVar.bravo);
                            kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) alpha4.alpha;
                            kotlin.reflect.jvm.internal.impl.types.y yVar2 = (kotlin.reflect.jvm.internal.impl.types.y) alpha4.bravo;
                            kf.a alpha5 = alpha(dVar.charlie);
                            kotlin.reflect.jvm.internal.impl.types.y yVar3 = (kotlin.reflect.jvm.internal.impl.types.y) alpha5.alpha;
                            kotlin.reflect.jvm.internal.impl.types.y yVar4 = (kotlin.reflect.jvm.internal.impl.types.y) alpha5.bravo;
                            pe.aq aqVar = dVar.alpha;
                            kf.d dVar2 = new kf.d(aqVar, yVar2, yVar3);
                            kf.d dVar3 = new kf.d(aqVar, yVar, yVar4);
                            arrayList.add(dVar2);
                            arrayList2.add(dVar3);
                        }
                    } else {
                        kotlin.reflect.jvm.internal.impl.types.ax.alpha(36);
                        throw null;
                    }
                } else {
                    kotlin.reflect.jvm.internal.impl.types.ax.alpha(35);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kf.d dVar4 = (kf.d) it2.next();
                    dVar4.getClass();
                    if (!InterfaceC1789d.alpha.bravo(dVar4.bravo, dVar4.charlie)) {
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                foxtrot = O5.echo(type).mike();
            } else {
                foxtrot = foxtrot(type, arrayList);
            }
            return new kf.a(foxtrot, foxtrot(type, arrayList2));
        }
        return new kf.a(type, type);
    }

    public static final String bravo(float f5, float f10, float f11, boolean z2, boolean z10) {
        if (!z2) {
            return "missing_current_fix";
        }
        if (z10) {
            return "last_sent_invalid_or_missing";
        }
        Jb.aw awVar = new Jb.aw(5);
        Jb.aw awVar2 = new Jb.aw(6);
        if (((Boolean) awVar.invoke(Float.valueOf(f10))).booleanValue() && ((Boolean) awVar2.invoke(Float.valueOf(f5))).booleanValue() && ((Boolean) awVar2.invoke(Float.valueOf(f11))).booleanValue()) {
            return "stale_last_sent_server_candidate";
        }
        if (((Boolean) awVar2.invoke(Float.valueOf(f5))).booleanValue() && ((Boolean) awVar2.invoke(Float.valueOf(f10))).booleanValue() && ((Boolean) awVar.invoke(Float.valueOf(f11))).booleanValue()) {
            return "driver_far_from_target";
        }
        if (((Boolean) awVar2.invoke(Float.valueOf(f11))).booleanValue() && ((Boolean) awVar.invoke(Float.valueOf(f10))).booleanValue() && ((Boolean) awVar.invoke(Float.valueOf(f5))).booleanValue()) {
            return "location_jump_between_current_and_last_sent";
        }
        return "mixed_signal";
    }

    public static final float charlie(double d4, double d9, double d10, double d11) {
        double radians = Math.toRadians(d10 - d4);
        double radians2 = Math.toRadians(d11 - d9);
        double d12 = 2;
        double d13 = radians / d12;
        double d14 = radians2 / d12;
        double sin = (Math.sin(d14) * Math.sin(d14) * Math.cos(Math.toRadians(d10)) * Math.cos(Math.toRadians(d4))) + (Math.sin(d13) * Math.sin(d13));
        return (float) (Math.atan2(Math.sqrt(sin), Math.sqrt(1 - sin)) * d12 * 6371000.0d);
    }

    public static final String delta(float f5) {
        if (Float.isNaN(f5)) {
            return "NaN";
        }
        if (Float.isInfinite(f5)) {
            if (f5 > 0.0f) {
                return "Infinity";
            }
            return "-Infinity";
        }
        return f5 + "m";
    }

    public static final String echo(String str) {
        if (str == null) {
            return BuildConfig.TRAVIS;
        }
        String obj = StringsKt.b(kotlin.text.r.oscar(kotlin.text.r.oscar(StringsKt.yellow(550, str), "\r", " "), "\n", " ")).toString();
        if (str.length() > 500) {
            return StringsKt.yellow(HttpConstants.HTTP_INTERNAL_ERROR, obj).concat("...");
        }
        return obj;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.y foxtrot(kotlin.reflect.jvm.internal.impl.types.y yVar, ArrayList arrayList) {
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.at atVar;
        yVar.cyan().size();
        arrayList.size();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kf.d dVar = (kf.d) it.next();
            dVar.getClass();
            gf.l lVar = InterfaceC1789d.alpha;
            kotlin.reflect.jvm.internal.impl.types.y yVar2 = dVar.bravo;
            kotlin.reflect.jvm.internal.impl.types.y yVar3 = dVar.charlie;
            lVar.bravo(yVar2, yVar3);
            if (!Intrinsics.areEqual(yVar2, yVar3)) {
                pe.aq aqVar = dVar.alpha;
                int i4 = 2;
                if (aqVar.fuchsia() != 2) {
                    int i5 = 1;
                    if (AbstractC2120h.black(yVar2) && aqVar.fuchsia() != 2) {
                        if (3 != aqVar.fuchsia()) {
                            i5 = 3;
                        }
                        atVar = new kotlin.reflect.jvm.internal.impl.types.at(i5, yVar3);
                    } else if (yVar3 != null) {
                        if (AbstractC2120h.whiskey(yVar3) && yVar3.indigo()) {
                            if (2 == aqVar.fuchsia()) {
                                i4 = 1;
                            }
                            atVar = new kotlin.reflect.jvm.internal.impl.types.at(i4, yVar2);
                        } else {
                            if (3 != aqVar.fuchsia()) {
                                i5 = 3;
                            }
                            atVar = new kotlin.reflect.jvm.internal.impl.types.at(i5, yVar3);
                        }
                    } else {
                        AbstractC2120h.alpha(140);
                        throw null;
                    }
                    arrayList2.add(atVar);
                }
            }
            atVar = new kotlin.reflect.jvm.internal.impl.types.at(yVar2);
            arrayList2.add(atVar);
        }
        return kotlin.reflect.jvm.internal.impl.types.c.oscar(yVar, arrayList2, null, 6);
    }
}
