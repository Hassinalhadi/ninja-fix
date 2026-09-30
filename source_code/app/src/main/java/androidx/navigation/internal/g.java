package androidx.navigation.internal;

import Cb.ad;
import Lb.ae;
import S.ah;
import Y1.aa;
import Y1.ac;
import Y1.ai;
import Y1.aj;
import Y1.ak;
import Y1.ar;
import Y1.at;
import Y1.au;
import Y1.k;
import Y1.m;
import Y1.n;
import Y1.o;
import Y1.p;
import Y1.r;
import Y1.z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.ab;
import androidx.lifecycle.al;
import androidx.lifecycle.c0;
import androidx.navigation.NavControllerViewModel;
import bv.ax;
import d2.AbstractC1579d;
import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.l;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import pf.AbstractC2360j;
import pf.C2355e;
import s6.S6;
import s6.T5;
import s6.W6;
import s6.X6;
import s6.Z6;
import t6.AbstractC2986e2;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.N;
import yf.av;
import yf.az;

/* loaded from: classes3.dex */
public final class g {
    public final r alpha;
    public final n bravo;
    public ac charlie;
    public Bundle delta;
    public Bundle[] echo;
    public final l foxtrot;
    public final N golf;
    public final N hotel;
    public final av india;
    public final LinkedHashMap juliet;
    public final LinkedHashMap kilo;
    public final LinkedHashMap lima;
    public final LinkedHashMap mike;
    public al november;
    public NavControllerViewModel oscar;
    public final ArrayList papa;
    public ab quebec;
    public final Nb.f romeo;
    public final au sierra;
    public final LinkedHashMap tango;
    public Function1 uniform;
    public e victor;
    public final LinkedHashMap whiskey;
    public int xray;
    public final ArrayList yankee;
    public final az zulu;

    public g(r navController, n nVar) {
        Intrinsics.echo(navController, "navController");
        this.alpha = navController;
        this.bravo = nVar;
        this.foxtrot = new l();
        this.golf = AbstractC3428A.charlie(CollectionsKt.emptyList());
        N charlie = AbstractC3428A.charlie(CollectionsKt.emptyList());
        this.hotel = charlie;
        this.india = new av(charlie);
        this.juliet = new LinkedHashMap();
        this.kilo = new LinkedHashMap();
        this.lima = new LinkedHashMap();
        this.mike = new LinkedHashMap();
        this.papa = new ArrayList();
        this.quebec = ab.purple;
        this.romeo = new Nb.f(1, this);
        this.sierra = new au();
        this.tango = new LinkedHashMap();
        this.whiskey = new LinkedHashMap();
        this.yankee = new ArrayList();
        this.zulu = AbstractC3428A.bravo(1, 0, EnumC3340a.purple, 2);
    }

    public static aa delta(int i4, aa destination, aa aaVar, boolean z2) {
        ac acVar;
        Intrinsics.echo(destination, "destination");
        if (destination.purple.charlie == i4 && (aaVar == null || (Intrinsics.areEqual(destination, aaVar) && Intrinsics.areEqual(destination.red, aaVar.red)))) {
            return destination;
        }
        if (destination instanceof ac) {
            acVar = (ac) destination;
        } else {
            acVar = null;
        }
        if (acVar == null) {
            acVar = destination.red;
            Intrinsics.checkNotNull(acVar);
        }
        return acVar.yellow.echo(i4, acVar, aaVar, z2);
    }

    public static /* synthetic */ void oscar(g gVar, Y1.l lVar) {
        gVar.november(lVar, false, new l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0180, code lost:
    
        r15 = r5.charlie;
        r0 = r11.charlie;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r2 = r11.charlie;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r6 = Y1.ar.alpha(r15, r0, r2.bravo(r13), hotel(), r11.oscar);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        r1.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        r13 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a5, code lost:
    
        if (r13.hasNext() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a7, code lost:
    
        r15 = (Y1.l) r13.next();
        r0 = r11.tango.get(r11.sierra.bravo(r15.purple.alpha));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        ((Y1.o) r0).alpha(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dd, code lost:
    
        throw new java.lang.IllegalStateException(androidx.appcompat.widget.P0.gold(new java.lang.StringBuilder("NavigatorBackStack for "), r12.alpha, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01de, code lost:
    
        r3.addAll(r1);
        r3.addLast(r14);
        r12 = kotlin.collections.CollectionsKt.plus(r1, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f0, code lost:
    
        if (r12.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f2, code lost:
    
        r13 = (Y1.l) r12.next();
        r14 = r13.purple.red;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fc, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fe, code lost:
    
        juliet(r13, echo(r14.purple.charlie));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0150, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0099, code lost:
    
        r4 = ((Y1.l) r1.first()).purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1 = new kotlin.collections.l();
        r4 = r12 instanceof Y1.ac;
        r5 = r11.alpha;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r4 = r4.red;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r7.hasPrevious() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((Y1.l) r8).purple, r4) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r8 = (Y1.l) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r8 = Y1.ar.alpha(r5.charlie, r4, r13, hotel(), r11.oscar);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r3.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (((Y1.l) r3.last()).purple != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        oscar(r11, (Y1.l) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r4 != r12) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r1.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r4 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (charlie(r4.purple.charlie, r4) == r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r4 = r4.red;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r4 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.isEmpty() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r8.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((Y1.l) r9).purple, r4) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = (Y1.l) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r9 = Y1.ar.alpha(r5.charlie, r4, r4.bravo(r7), hotel(), r11.oscar);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        r1.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((((Y1.l) r3.last()).purple instanceof Y1.g) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
    
        if (r1.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r0 = ((Y1.l) r1.first()).purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        if (r3.isEmpty() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0112, code lost:
    
        if ((((Y1.l) r3.last()).purple instanceof Y1.ac) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
    
        r2 = ((Y1.l) r3.last()).purple;
        kotlin.jvm.internal.Intrinsics.charlie(r2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        if (((bv.ax) ((Y1.ac) r2).yellow.charlie).delta(r0.purple.charlie) != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        oscar(r11, (Y1.l) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013d, code lost:
    
        r0 = (Y1.l) r3.india();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        r0 = (Y1.l) r1.india();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        r0 = r0.purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (mike(((Y1.l) r3.last()).purple.purple.charlie, true, false) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r11.charlie) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0165, code lost:
    
        if (r15.hasPrevious() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = r15.previous();
        r2 = ((Y1.l) r0).purple;
        r4 = r11.charlie;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0179, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r4) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        r6 = (Y1.l) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017e, code lost:
    
        if (r6 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(aa aaVar, Bundle bundle, Y1.l lVar, List list) {
        aa aaVar2 = lVar.purple;
        boolean z2 = aaVar2 instanceof Y1.g;
        l lVar2 = this.foxtrot;
    }

    public final boolean bravo() {
        l lVar;
        while (true) {
            lVar = this.foxtrot;
            if (lVar.isEmpty() || !(((Y1.l) lVar.last()).purple instanceof ac)) {
                break;
            }
            oscar(this, (Y1.l) lVar.last());
        }
        Y1.l lVar2 = (Y1.l) lVar.lima();
        ArrayList arrayList = this.yankee;
        if (lVar2 != null) {
            arrayList.add(lVar2);
        }
        this.xray++;
        tango();
        int i4 = this.xray - 1;
        this.xray = i4;
        if (i4 == 0) {
            ArrayList B = CollectionsKt.B(arrayList);
            arrayList.clear();
            Iterator it = B.iterator();
            while (it.hasNext()) {
                Y1.l lVar3 = (Y1.l) it.next();
                Iterator it2 = CollectionsKt.z(this.papa).iterator();
                while (it2.hasNext()) {
                    ((p) it2.next()).alpha(this.alpha, lVar3.purple, lVar3.f2268a.alpha());
                }
                this.zulu.alpha(lVar3);
            }
            ArrayList B6 = CollectionsKt.B(lVar);
            N n5 = this.golf;
            n5.getClass();
            n5.juliet(null, B6);
            ArrayList papa = papa();
            N n10 = this.hotel;
            n10.getClass();
            n10.juliet(null, papa);
        }
        if (lVar2 != null) {
            return true;
        }
        return false;
    }

    public final aa charlie(int i4, aa aaVar) {
        aa aaVar2;
        ac acVar = this.charlie;
        if (acVar == null) {
            return null;
        }
        Intrinsics.checkNotNull(acVar);
        if (acVar.purple.charlie == i4) {
            if (aaVar != null) {
                if (Intrinsics.areEqual(this.charlie, aaVar) && aaVar.red == null) {
                    return this.charlie;
                }
            } else {
                return this.charlie;
            }
        }
        Y1.l lVar = (Y1.l) this.foxtrot.lima();
        if (lVar == null || (aaVar2 = lVar.purple) == null) {
            aaVar2 = this.charlie;
            Intrinsics.checkNotNull(aaVar2);
        }
        return delta(i4, aaVar2, aaVar, false);
    }

    public final Y1.l echo(int i4) {
        Object obj;
        l lVar = this.foxtrot;
        ListIterator<E> listIterator = lVar.listIterator(lVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((Y1.l) obj).purple.purple.charlie == i4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Y1.l lVar2 = (Y1.l) obj;
        if (lVar2 != null) {
            return lVar2;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sierra.append(foxtrot());
        throw new IllegalArgumentException(sierra.toString().toString());
    }

    public final aa foxtrot() {
        Y1.l lVar = (Y1.l) this.foxtrot.lima();
        if (lVar != null) {
            return lVar.purple;
        }
        return null;
    }

    public final ac golf() {
        ac acVar = this.charlie;
        if (acVar != null) {
            Intrinsics.charlie(acVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return acVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final ab hotel() {
        if (this.november == null) {
            return ab.red;
        }
        return this.quebec;
    }

    public final ac india() {
        aa aaVar;
        ac acVar;
        Y1.l lVar = (Y1.l) this.foxtrot.lima();
        if (lVar == null || (aaVar = lVar.purple) == null) {
            aaVar = this.charlie;
            Intrinsics.checkNotNull(aaVar);
        }
        if (aaVar instanceof ac) {
            acVar = (ac) aaVar;
        } else {
            acVar = null;
        }
        if (acVar == null) {
            ac acVar2 = aaVar.red;
            Intrinsics.checkNotNull(acVar2);
            return acVar2;
        }
        return acVar;
    }

    public final void juliet(Y1.l lVar, Y1.l lVar2) {
        this.juliet.put(lVar, lVar2);
        LinkedHashMap linkedHashMap = this.kilo;
        if (linkedHashMap.get(lVar2) == null) {
            linkedHashMap.put(lVar2, new a());
        }
        Object obj = linkedHashMap.get(lVar2);
        Intrinsics.checkNotNull(obj);
        ((a) obj).alpha.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, r0) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        r0 = new kotlin.collections.l();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (kotlin.collections.CollectionsKt.ivory(r12) < r14) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        r10 = (Y1.l) kotlin.collections.CollectionsKt.f(r12);
        sierra(r10);
        r24 = r1;
        r15 = new Y1.l(r10.alpha, r10.purple, r10.purple.bravo(r27), r10.silver, r10.teal, r10.white, r10.yellow);
        r1 = r10.silver;
        r8 = r15.f2268a;
        r8.getClass();
        kotlin.jvm.internal.Intrinsics.echo(r1, "<set-?>");
        r8.delta = r1;
        r1 = r10.f2268a.lima;
        kotlin.jvm.internal.Intrinsics.echo(r1, "maxState");
        r8.lima = r1;
        r8.charlie();
        r0.addFirst(r15);
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
    
        r24 = r1;
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016d, code lost:
    
        if (r1.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016f, code lost:
    
        r4 = (Y1.l) r1.next();
        r8 = r4.purple.red;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
    
        if (r8 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
    
        juliet(r4, echo(r8.purple.charlie));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
    
        r12.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        r1 = (Y1.l) r0.next();
        r11.bravo(r1.purple.alpha).foxtrot(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a6, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0103, code lost:
    
        if (r10.charlie == r0.purple.charlie) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo(aa node, Bundle bundle, aj ajVar) {
        boolean z2;
        q qVar;
        boolean z10;
        q qVar2;
        int i4;
        int collectionSizeOrDefault;
        int i5;
        Intrinsics.echo(node, "node");
        LinkedHashMap linkedHashMap = this.tango;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o) it.next()).delta = true;
        }
        ?? obj = new Object();
        if (ajVar != null && (i5 = ajVar.charlie) != -1) {
            z2 = mike(i5, ajVar.delta, ajVar.echo);
        } else {
            z2 = false;
        }
        Bundle bravo = node.bravo(bundle);
        He.b bVar = node.purple;
        if (ajVar != null && ajVar.bravo && this.lima.containsKey(Integer.valueOf(bVar.charlie))) {
            obj.alpha = quebec(bVar.charlie, bravo, ajVar);
            z10 = false;
            qVar2 = obj;
        } else {
            au auVar = this.sierra;
            if (ajVar != null && ajVar.alpha) {
                l lVar = this.foxtrot;
                Y1.l lVar2 = (Y1.l) lVar.lima();
                ListIterator listIterator = lVar.listIterator(lVar.alpha());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((Y1.l) listIterator.previous()).purple == node) {
                            i4 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    if (node instanceof ac) {
                        int i10 = ac.f2266a;
                        List quebec = AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.lima((ac) node, new X9.i(7)), new c(3)));
                        if (lVar.red - i4 == quebec.size()) {
                            List subList = lVar.subList(i4, lVar.red);
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((Y1.l) it2.next()).purple.purple.charlie));
                            }
                        }
                    } else if (lVar2 != null) {
                        aa aaVar = lVar2.purple;
                        if (aaVar != null) {
                        }
                    }
                    if (z10) {
                        Y1.l alpha = ar.alpha(this.alpha.charlie, node, bravo, hotel(), this.oscar);
                        at bravo2 = auVar.bravo(node.alpha);
                        List juliet = kotlin.collections.ab.juliet(alpha);
                        q qVar3 = qVar;
                        this.uniform = new X9.e(qVar3, this, node, bravo, 4);
                        bravo2.delta(juliet, ajVar);
                        this.uniform = null;
                        qVar2 = qVar3;
                    } else {
                        qVar2 = qVar;
                    }
                }
            }
            qVar = obj;
            z10 = false;
            if (z10) {
            }
        }
        this.bravo.invoke();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((o) it3.next()).delta = false;
        }
        if (!z2 && !qVar2.alpha && !z10) {
            tango();
        } else {
            bravo();
        }
    }

    public final void lima(Object route, aj ajVar) {
        String uriString;
        Intrinsics.echo(route, "route");
        Intrinsics.echo(route, "route");
        Class<?> cls = route.getClass();
        v vVar = u.alpha;
        aa delta = delta(AbstractC1579d.charlie(T5.bravo(vVar.bravo(cls))), golf(), null, true);
        if (delta != null) {
            Map india = delta.india();
            LinkedHashMap linkedHashMap = new LinkedHashMap(y.quebec(india.size()));
            for (Map.Entry entry : india.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((k) entry.getValue()).alpha);
            }
            String route2 = AbstractC1579d.delta(route, linkedHashMap);
            Intrinsics.echo(route2, "route");
            if (this.charlie != null) {
                ac india2 = india();
                z quebec = india2.quebec(route2, true, india2);
                if (quebec != null) {
                    aa aaVar = quebec.alpha;
                    Bundle bravo = aaVar.bravo(quebec.purple);
                    if (bravo == null) {
                        bravo = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    int i4 = aa.white;
                    String str = (String) aaVar.purple.golf;
                    if (str != null) {
                        uriString = "android-app://androidx.navigation/".concat(str);
                    } else {
                        uriString = "";
                    }
                    Intrinsics.echo(uriString, "uriString");
                    Uri parse = Uri.parse(uriString);
                    Intrinsics.delta(parse, "parse(...)");
                    this.alpha.getClass();
                    Intent intent = new Intent();
                    intent.setDataAndType(parse, null);
                    intent.setAction(null);
                    Z6.charlie(intent, bravo);
                    kilo(aaVar, bravo, ajVar);
                    return;
                }
                StringBuilder victor = Q0.c.victor("Navigation destination that matches route ", route2, " cannot be found in the navigation graph ");
                victor.append(this.charlie);
                throw new IllegalArgumentException(victor.toString());
            }
            throw new IllegalArgumentException(("Cannot navigate to " + route2 + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        throw new IllegalArgumentException(("Destination with route " + vVar.bravo(route.getClass()).kilo() + " cannot be found in navigation graph " + this.charlie).toString());
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public final boolean mike(int i4, boolean z2, boolean z10) {
        aa aaVar;
        boolean z11;
        S5.k kVar;
        String str;
        final int i5 = 1;
        l lVar = this.foxtrot;
        final int i10 = 0;
        if (lVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.i(lVar).iterator();
        while (true) {
            if (it.hasNext()) {
                aa aaVar2 = ((Y1.l) it.next()).purple;
                at bravo = this.sierra.bravo(aaVar2.alpha);
                He.b bVar = aaVar2.purple;
                if (z2 || bVar.charlie != i4) {
                    arrayList.add(bravo);
                }
                if (bVar.charlie == i4) {
                    aaVar = aaVar2;
                    break;
                }
            } else {
                aaVar = null;
                break;
            }
        }
        if (aaVar == null) {
            int i11 = aa.white;
            String message = "Ignoring popBackStack to destination " + Y1.y.alpha(this.alpha.charlie, i4) + " as it was not found on the current back stack";
            Intrinsics.echo(message, "message");
            Log.i("NavController", message);
            return false;
        }
        ?? obj = new Object();
        l lVar2 = new l();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                at navigator = (at) it2.next();
                ?? obj2 = new Object();
                Y1.l popUpTo = (Y1.l) lVar.last();
                z11 = z10;
                e eVar = new e(obj2, obj, this, z11, lVar2);
                Intrinsics.echo(navigator, "navigator");
                Intrinsics.echo(popUpTo, "popUpTo");
                this.victor = eVar;
                navigator.india(popUpTo, z11);
                this.victor = null;
                if (!obj2.alpha) {
                    break;
                }
            } else {
                z11 = z10;
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.lima;
            if (!z2) {
                C2355e c2355e = new C2355e(new kotlin.io.h(AbstractC2360j.lima(aaVar, new c(i5)), new Function1(this) { // from class: androidx.navigation.internal.f
                    public final /* synthetic */ g purple;

                    {
                        this.purple = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        aa destination = (aa) obj3;
                        switch (i10) {
                            case 0:
                                Intrinsics.echo(destination, "destination");
                                return Boolean.valueOf(!this.purple.lima.containsKey(Integer.valueOf(destination.purple.charlie)));
                            default:
                                Intrinsics.echo(destination, "destination");
                                return Boolean.valueOf(!this.purple.lima.containsKey(Integer.valueOf(destination.purple.charlie)));
                        }
                    }
                }));
                while (c2355e.hasNext()) {
                    Integer valueOf = Integer.valueOf(((aa) c2355e.next()).purple.charlie);
                    m mVar = (m) lVar2.india();
                    if (mVar != null) {
                        str = (String) mVar.alpha.purple;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!lVar2.isEmpty()) {
                m mVar2 = (m) lVar2.first();
                C2355e c2355e2 = new C2355e(new kotlin.io.h(AbstractC2360j.lima(charlie(mVar2.alpha.alpha, null), new c(2)), new Function1(this) { // from class: androidx.navigation.internal.f
                    public final /* synthetic */ g purple;

                    {
                        this.purple = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        aa destination = (aa) obj3;
                        switch (i5) {
                            case 0:
                                Intrinsics.echo(destination, "destination");
                                return Boolean.valueOf(!this.purple.lima.containsKey(Integer.valueOf(destination.purple.charlie)));
                            default:
                                Intrinsics.echo(destination, "destination");
                                return Boolean.valueOf(!this.purple.lima.containsKey(Integer.valueOf(destination.purple.charlie)));
                        }
                    }
                }));
                while (true) {
                    boolean hasNext = c2355e2.hasNext();
                    kVar = mVar2.alpha;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((aa) c2355e2.next()).purple.charlie), (String) kVar.purple);
                }
                if (linkedHashMap.values().contains((String) kVar.purple)) {
                    this.mike.put((String) kVar.purple, lVar2);
                }
            }
        }
        this.bravo.invoke();
        return obj.alpha;
    }

    public final void november(Y1.l popUpTo, boolean z2, l lVar) {
        NavControllerViewModel navControllerViewModel;
        av avVar;
        Set set;
        Intrinsics.echo(popUpTo, "popUpTo");
        l lVar2 = this.foxtrot;
        Y1.l lVar3 = (Y1.l) lVar2.last();
        if (Intrinsics.areEqual(lVar3, popUpTo)) {
            CollectionsKt.f(lVar2);
            o oVar = (o) this.tango.get(this.sierra.bravo(lVar3.purple.alpha));
            boolean z10 = true;
            if ((oVar == null || (avVar = oVar.foxtrot) == null || (set = (Set) ((N) avVar.alpha).getValue()) == null || !set.contains(lVar3)) && !this.kilo.containsKey(lVar3)) {
                z10 = false;
            }
            ab abVar = lVar3.f2268a.kilo.delta;
            ab abVar2 = ab.red;
            if (abVar.compareTo(abVar2) >= 0) {
                if (z2) {
                    lVar3.alpha(abVar2);
                    lVar.addFirst(new m(lVar3));
                }
                if (!z10) {
                    lVar3.alpha(ab.alpha);
                    sierra(lVar3);
                } else {
                    lVar3.alpha(abVar2);
                }
            }
            if (!z2 && !z10 && (navControllerViewModel = this.oscar) != null) {
                String backStackEntryId = lVar3.white;
                Intrinsics.echo(backStackEntryId, "backStackEntryId");
                c0 c0Var = (c0) navControllerViewModel.alpha.remove(backStackEntryId);
                if (c0Var != null) {
                    c0Var.alpha();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + popUpTo.purple + ", which is not the top of the back stack (" + lVar3.purple + ')').toString());
    }

    public final ArrayList papa() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.tango.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((N) ((o) it.next()).foxtrot.alpha).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                Y1.l lVar = (Y1.l) obj;
                if (!arrayList.contains(lVar) && lVar.f2268a.lima.compareTo(ab.silver) < 0) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.foxtrot.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Y1.l lVar2 = (Y1.l) next;
            if (!arrayList.contains(lVar2) && lVar2.f2268a.lima.compareTo(ab.silver) >= 0) {
                arrayList3.add(next);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((Y1.l) next2).purple instanceof ac)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public final boolean quebec(int i4, Bundle bundle, aj ajVar) {
        aa golf;
        String str;
        Y1.l lVar;
        aa aaVar;
        Bundle bundle2;
        ClassLoader classLoader;
        LinkedHashMap linkedHashMap = this.lima;
        if (!linkedHashMap.containsKey(Integer.valueOf(i4))) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i4));
        CollectionsKt.c(linkedHashMap.values(), new ae(str2, 6));
        l lVar2 = (l) x.charlie(this.mike).remove(str2);
        ArrayList arrayList = new ArrayList();
        Y1.l lVar3 = (Y1.l) this.foxtrot.lima();
        if (lVar3 == null || (golf = lVar3.purple) == null) {
            golf = golf();
        }
        if (lVar2 != null) {
            Iterator it = lVar2.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                aa delta = delta(mVar.alpha.alpha, golf, null, true);
                S5.k kVar = mVar.alpha;
                r rVar = this.alpha;
                if (delta != null) {
                    H0.a context = rVar.charlie;
                    ab hostLifecycleState = hotel();
                    NavControllerViewModel navControllerViewModel = this.oscar;
                    Intrinsics.echo(context, "context");
                    Intrinsics.echo(hostLifecycleState, "hostLifecycleState");
                    Bundle bundle3 = (Bundle) kVar.red;
                    if (bundle3 != null) {
                        Context context2 = context.purple;
                        if (context2 != null) {
                            classLoader = context2.getClassLoader();
                        } else {
                            classLoader = null;
                        }
                        bundle3.setClassLoader(classLoader);
                        bundle2 = bundle3;
                    } else {
                        bundle2 = null;
                    }
                    String id2 = (String) kVar.purple;
                    Intrinsics.echo(id2, "id");
                    arrayList.add(new Y1.l(context, delta, bundle2, hostLifecycleState, navControllerViewModel, id2, (Bundle) kVar.silver));
                    golf = delta;
                } else {
                    int i5 = aa.white;
                    throw new IllegalStateException(("Restore State failed: destination " + Y1.y.alpha(rVar.charlie, kVar.alpha) + " cannot be found from the current destination " + golf).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((Y1.l) next).purple instanceof ac)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Y1.l lVar4 = (Y1.l) it3.next();
            List list = (List) CollectionsKt.olive(arrayList2);
            if (list != null && (lVar = (Y1.l) CollectionsKt.ochre(list)) != null && (aaVar = lVar.purple) != null) {
                str = aaVar.alpha;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, lVar4.purple.alpha)) {
                list.add(lVar4);
            } else {
                arrayList2.add(CollectionsKt.white(lVar4));
            }
        }
        ?? obj = new Object();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            at bravo = this.sierra.bravo(((Y1.l) CollectionsKt.gold(list2)).purple.alpha);
            this.uniform = new Ec.d(obj, arrayList, new Object(), this, bundle, 1);
            bravo.delta(list2, ajVar);
            this.uniform = null;
        }
        return obj.alpha;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void romeo(ac graph, Bundle bundle) {
        boolean z2;
        Activity activity;
        int[] intArray;
        ArrayList arrayList;
        Bundle bundle2;
        g gVar;
        ac india;
        z oscar;
        Bundle bravo;
        int length;
        int i4;
        String str;
        boolean z10;
        aa charlie;
        Bundle[] bundleArr;
        int i5;
        int i10;
        int[] iArr;
        r rVar;
        ac acVar;
        Bundle bundle3;
        aa charlie2;
        ac acVar2;
        ClassLoader classLoader;
        boolean z11 = true;
        Intrinsics.echo(graph, "graph");
        l lVar = this.foxtrot;
        if (!lVar.isEmpty() && hotel() == ab.alpha) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!Intrinsics.areEqual(this.charlie, graph)) {
            ac acVar3 = this.charlie;
            LinkedHashMap linkedHashMap = this.tango;
            boolean z12 = true;
            if (acVar3 != null) {
                Iterator it = new ArrayList(this.lima.keySet()).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    Intrinsics.checkNotNull(num);
                    int intValue = num.intValue();
                    Iterator it2 = linkedHashMap.values().iterator();
                    while (it2.hasNext()) {
                        ((o) it2.next()).delta = true;
                    }
                    ak akVar = new ak();
                    akVar.charlie = true;
                    boolean z13 = akVar.bravo;
                    ai aiVar = akVar.alpha;
                    aiVar.alpha = z13;
                    aiVar.bravo = akVar.charlie;
                    int i11 = akVar.delta;
                    boolean z14 = akVar.echo;
                    boolean z15 = akVar.foxtrot;
                    aiVar.charlie = i11;
                    aiVar.delta = z14;
                    aiVar.echo = z15;
                    boolean quebec = quebec(intValue, null, aiVar.alpha());
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((o) it3.next()).delta = false;
                    }
                    if (quebec) {
                        mike(intValue, true, false);
                    }
                }
                mike(acVar3.purple.charlie, true, false);
            }
            this.charlie = graph;
            Bundle bundle4 = this.delta;
            au auVar = this.sierra;
            if (bundle4 != null && bundle4.containsKey("android-support-nav:controller:navigatorState:names")) {
                ArrayList<String> stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names");
                if (stringArrayList != null) {
                    for (String str2 : stringArrayList) {
                        at bravo2 = auVar.bravo(str2);
                        if (bundle4.containsKey(str2)) {
                            bravo2.golf(W6.foxtrot(bundle4, str2));
                        }
                    }
                } else {
                    X6.charlie("android-support-nav:controller:navigatorState:names");
                    throw null;
                }
            }
            Bundle[] bundleArr2 = this.echo;
            r rVar2 = this.alpha;
            if (bundleArr2 != null) {
                int length2 = bundleArr2.length;
                int i12 = 0;
                while (i12 < length2) {
                    Bundle state = bundleArr2[i12];
                    Intrinsics.echo(state, "state");
                    state.setClassLoader(m.class.getClassLoader());
                    String hotel = W6.hotel(state, "nav-entry-state:id");
                    int delta = W6.delta(state, "nav-entry-state:destination-id");
                    boolean z16 = z11;
                    Bundle foxtrot = W6.foxtrot(state, "nav-entry-state:args");
                    boolean z17 = z12;
                    Bundle foxtrot2 = W6.foxtrot(state, "nav-entry-state:saved-state");
                    aa charlie3 = charlie(delta, null);
                    if (charlie3 != null) {
                        H0.a context = rVar2.charlie;
                        ab hostLifecycleState = hotel();
                        NavControllerViewModel navControllerViewModel = this.oscar;
                        Intrinsics.echo(context, "context");
                        Intrinsics.echo(hostLifecycleState, "hostLifecycleState");
                        Context context2 = context.purple;
                        if (context2 != null) {
                            classLoader = context2.getClassLoader();
                        } else {
                            classLoader = null;
                        }
                        foxtrot.setClassLoader(classLoader);
                        Y1.l lVar2 = new Y1.l(context, charlie3, foxtrot, hostLifecycleState, navControllerViewModel, hotel, foxtrot2);
                        at bravo3 = auVar.bravo(charlie3.alpha);
                        Object obj = linkedHashMap.get(bravo3);
                        if (obj == null) {
                            obj = new o(rVar2, bravo3);
                            linkedHashMap.put(bravo3, obj);
                        }
                        lVar.addLast(lVar2);
                        ((o) obj).alpha(lVar2);
                        ac acVar4 = lVar2.purple.red;
                        if (acVar4 != null) {
                            juliet(lVar2, echo(acVar4.purple.charlie));
                        }
                        i12++;
                        z11 = z16;
                        z12 = z17;
                    } else {
                        int i13 = aa.white;
                        StringBuilder victor = Q0.c.victor("Restoring the Navigation back stack failed: destination ", Y1.y.alpha(rVar2.charlie, delta), " cannot be found from the current destination ");
                        victor.append(foxtrot());
                        throw new IllegalStateException(victor.toString());
                    }
                }
                z2 = z12;
                this.bravo.invoke();
                this.echo = null;
            } else {
                z2 = true;
            }
            Collection values = y.zulu(auVar.alpha).values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : values) {
                if (!((at) obj2).bravo) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                at navigator = (at) it4.next();
                Object obj3 = linkedHashMap.get(navigator);
                if (obj3 == null) {
                    rVar2.getClass();
                    Intrinsics.echo(navigator, "navigator");
                    obj3 = new o(rVar2, navigator);
                    linkedHashMap.put(navigator, obj3);
                }
                navigator.echo((o) obj3);
            }
            if (this.charlie != null && lVar.isEmpty()) {
                if (!rVar2.echo && (activity = rVar2.delta) != null) {
                    Intrinsics.checkNotNull(activity);
                    Intent intent = activity.getIntent();
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                            }
                            if (extras == null) {
                                arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                            } else {
                                arrayList = null;
                            }
                            Bundle charlie4 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            if (extras == null) {
                                bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null) {
                                charlie4.putAll(bundle2);
                            }
                            gVar = rVar2.bravo;
                            if ((intArray != null || intArray.length == 0) && (oscar = (india = gVar.india()).oscar(new C1915c(intent.getData(), intent.getAction(), intent.getType(), 20), india)) != null) {
                                aa aaVar = oscar.alpha;
                                int[] delta2 = aaVar.delta(null);
                                bravo = aaVar.bravo(oscar.purple);
                                if (bravo != null) {
                                    charlie4.putAll(bravo);
                                }
                                intArray = delta2;
                                arrayList = null;
                            }
                            if (intArray != null && intArray.length != 0) {
                                gVar.getClass();
                                ac acVar5 = gVar.charlie;
                                length = intArray.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        int i14 = intArray[i4];
                                        if (i4 == 0) {
                                            ac acVar6 = gVar.charlie;
                                            Intrinsics.checkNotNull(acVar6);
                                            if (acVar6.purple.charlie == i14) {
                                                charlie2 = gVar.charlie;
                                            } else {
                                                charlie2 = null;
                                            }
                                        } else {
                                            Intrinsics.checkNotNull(acVar5);
                                            charlie2 = acVar5.yellow.charlie(i14);
                                        }
                                        if (charlie2 == null) {
                                            int i15 = aa.white;
                                            str = Y1.y.alpha(gVar.alpha.charlie, i14);
                                            break;
                                        }
                                        if (i4 != intArray.length - 1 && (charlie2 instanceof ac)) {
                                            while (true) {
                                                acVar2 = (ac) charlie2;
                                                Intrinsics.checkNotNull(acVar2);
                                                Be.e eVar = acVar2.yellow;
                                                if (!(eVar.charlie(eVar.alpha) instanceof ac)) {
                                                    break;
                                                }
                                                Be.e eVar2 = acVar2.yellow;
                                                charlie2 = eVar2.charlie(eVar2.alpha);
                                            }
                                            acVar5 = acVar2;
                                        }
                                        i4++;
                                    } else {
                                        str = null;
                                        break;
                                    }
                                }
                                if (str == null) {
                                    String message = "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent;
                                    Intrinsics.echo(message, "message");
                                    Log.i("NavController", message);
                                } else {
                                    Z6.charlie(intent, charlie4);
                                    int length3 = intArray.length;
                                    Bundle[] bundleArr3 = new Bundle[length3];
                                    for (int i16 = 0; i16 < length3; i16++) {
                                        Bundle charlie5 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                        charlie5.putAll(charlie4);
                                        if (arrayList != null && (bundle3 = (Bundle) arrayList.get(i16)) != null) {
                                            charlie5.putAll(bundle3);
                                        }
                                        bundleArr3[i16] = charlie5;
                                    }
                                    int flags = intent.getFlags();
                                    int i17 = 268435456 & flags;
                                    if (i17 != 0 && (flags & 32768) == 0) {
                                        intent.addFlags(32768);
                                        f1.ai aiVar2 = new f1.ai(rVar2.alpha);
                                        aiVar2.alpha(intent);
                                        aiVar2.delta();
                                        activity.finish();
                                        activity.overridePendingTransition(0, 0);
                                    } else {
                                        if (i17 != 0) {
                                            z10 = z2;
                                        } else {
                                            z10 = false;
                                        }
                                        H0.a aVar = rVar2.charlie;
                                        if (z10) {
                                            if (!gVar.foxtrot.isEmpty()) {
                                                ac acVar7 = gVar.charlie;
                                                Intrinsics.checkNotNull(acVar7);
                                                gVar.mike(acVar7.purple.charlie, z2, false);
                                            }
                                            int i18 = 0;
                                            while (i18 < intArray.length) {
                                                int i19 = intArray[i18];
                                                int i20 = i18 + 1;
                                                Bundle bundle5 = bundleArr3[i18];
                                                aa charlie6 = gVar.charlie(i19, null);
                                                if (charlie6 != null) {
                                                    gVar.kilo(charlie6, bundle5, AbstractC2986e2.alpha(new ad(20, charlie6, rVar2)));
                                                    i18 = i20;
                                                } else {
                                                    int i21 = aa.white;
                                                    StringBuilder victor2 = Q0.c.victor("Deep Linking failed: destination ", Y1.y.alpha(aVar, i19), " cannot be found from the current destination ");
                                                    victor2.append(gVar.foxtrot());
                                                    throw new IllegalStateException(victor2.toString());
                                                }
                                            }
                                            rVar2.echo = true;
                                        } else {
                                            ac acVar8 = gVar.charlie;
                                            int i22 = 0;
                                            for (int length4 = intArray.length; i22 < length4; length4 = i5) {
                                                int i23 = intArray[i22];
                                                Bundle bundle6 = bundleArr3[i22];
                                                if (i22 == 0) {
                                                    charlie = gVar.charlie;
                                                } else {
                                                    Intrinsics.checkNotNull(acVar8);
                                                    charlie = acVar8.yellow.charlie(i23);
                                                }
                                                if (charlie != null) {
                                                    if (i22 != intArray.length - 1) {
                                                        if (charlie instanceof ac) {
                                                            while (true) {
                                                                acVar = (ac) charlie;
                                                                Intrinsics.checkNotNull(acVar);
                                                                Be.e eVar3 = acVar.yellow;
                                                                if (!(eVar3.charlie(eVar3.alpha) instanceof ac)) {
                                                                    break;
                                                                }
                                                                Be.e eVar4 = acVar.yellow;
                                                                charlie = eVar4.charlie(eVar4.alpha);
                                                            }
                                                            iArr = intArray;
                                                            i5 = length4;
                                                            bundleArr = bundleArr3;
                                                            i10 = i22;
                                                            rVar = rVar2;
                                                            acVar8 = acVar;
                                                        } else {
                                                            iArr = intArray;
                                                            i5 = length4;
                                                            bundleArr = bundleArr3;
                                                            i10 = i22;
                                                            rVar = rVar2;
                                                        }
                                                    } else {
                                                        ac acVar9 = gVar.charlie;
                                                        Intrinsics.checkNotNull(acVar9);
                                                        bundleArr = bundleArr3;
                                                        i5 = length4;
                                                        i10 = i22;
                                                        iArr = intArray;
                                                        rVar = rVar2;
                                                        gVar.kilo(charlie, bundle6, new aj(false, false, acVar9.purple.charlie, true, false, 0, 0, -1, -1));
                                                    }
                                                    i22 = i10 + 1;
                                                    intArray = iArr;
                                                    rVar2 = rVar;
                                                    bundleArr3 = bundleArr;
                                                } else {
                                                    int i24 = aa.white;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + Y1.y.alpha(aVar, i23) + " cannot be found in graph " + acVar8);
                                                }
                                            }
                                            rVar2.echo = true;
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle charlie42 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        if (extras == null) {
                        }
                        if (bundle2 != null) {
                        }
                        gVar = rVar2.bravo;
                        if (intArray != null) {
                        }
                        aa aaVar2 = oscar.alpha;
                        int[] delta22 = aaVar2.delta(null);
                        bravo = aaVar2.bravo(oscar.purple);
                        if (bravo != null) {
                        }
                        intArray = delta22;
                        arrayList = null;
                        if (intArray != null) {
                            gVar.getClass();
                            ac acVar52 = gVar.charlie;
                            length = intArray.length;
                            i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                }
                                i4++;
                            }
                            if (str == null) {
                            }
                        }
                    }
                }
                ac acVar10 = this.charlie;
                Intrinsics.checkNotNull(acVar10);
                kilo(acVar10, bundle, null);
                return;
            }
            bravo();
            return;
        }
        Be.e eVar5 = graph.yellow;
        int golf = ((ax) eVar5.charlie).golf();
        for (int i25 = 0; i25 < golf; i25++) {
            aa aaVar3 = (aa) ((ax) eVar5.charlie).hotel(i25);
            ac acVar11 = this.charlie;
            Intrinsics.checkNotNull(acVar11);
            int echo = ((ax) acVar11.yellow.charlie).echo(i25);
            ac acVar12 = this.charlie;
            Intrinsics.checkNotNull(acVar12);
            ax axVar = (ax) acVar12.yellow.charlie;
            if (axVar.alpha) {
                bv.v.alpha(axVar);
            }
            int alpha = bw.a.alpha(axVar.silver, echo, axVar.purple);
            if (alpha >= 0) {
                Object[] objArr = axVar.red;
                Object obj4 = objArr[alpha];
                objArr[alpha] = aaVar3;
            }
        }
        Iterator it5 = lVar.iterator();
        while (it5.hasNext()) {
            Y1.l lVar3 = (Y1.l) it5.next();
            int i26 = aa.white;
            kotlin.collections.aa victor3 = kotlin.collections.q.victor(AbstractC2360j.quebec(Y1.y.bravo(lVar3.purple)));
            aa aaVar4 = this.charlie;
            Intrinsics.checkNotNull(aaVar4);
            Iterator it6 = victor3.iterator();
            while (true) {
                ListIterator listIterator = (ListIterator) ((ah) it6).purple;
                if (listIterator.hasPrevious()) {
                    aa aaVar5 = (aa) listIterator.previous();
                    if (!Intrinsics.areEqual(aaVar5, this.charlie) || !Intrinsics.areEqual(aaVar4, graph)) {
                        if (aaVar4 instanceof ac) {
                            aaVar4 = ((ac) aaVar4).yellow.charlie(aaVar5.purple.charlie);
                            Intrinsics.checkNotNull(aaVar4);
                        }
                    }
                }
            }
            Intrinsics.echo(aaVar4, "<set-?>");
            lVar3.purple = aaVar4;
        }
    }

    public final void sierra(Y1.l child) {
        Integer num;
        Intrinsics.echo(child, "child");
        Y1.l lVar = (Y1.l) this.juliet.remove(child);
        if (lVar != null) {
            LinkedHashMap linkedHashMap = this.kilo;
            a aVar = (a) linkedHashMap.get(lVar);
            if (aVar != null) {
                num = Integer.valueOf(aVar.alpha.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                o oVar = (o) this.tango.get(this.sierra.bravo(lVar.purple.alpha));
                if (oVar != null) {
                    oVar.charlie(lVar);
                }
                linkedHashMap.remove(lVar);
            }
        }
    }

    public final void tango() {
        Boolean bool;
        a aVar;
        av avVar;
        Set set;
        ArrayList B = CollectionsKt.B(this.foxtrot);
        if (!B.isEmpty()) {
            ArrayList white = CollectionsKt.white(((Y1.l) CollectionsKt.ochre(B)).purple);
            ArrayList arrayList = new ArrayList();
            if (CollectionsKt.ochre(white) instanceof Y1.g) {
                Iterator it = CollectionsKt.i(B).iterator();
                while (it.hasNext()) {
                    aa aaVar = ((Y1.l) it.next()).purple;
                    arrayList.add(aaVar);
                    if (!(aaVar instanceof Y1.g) && !(aaVar instanceof ac)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (Y1.l lVar : CollectionsKt.i(B)) {
                ab abVar = lVar.f2268a.lima;
                aa aaVar2 = lVar.purple;
                aa aaVar3 = (aa) CollectionsKt.green(white);
                if (aaVar3 != null && aaVar3.purple.charlie == aaVar2.purple.charlie) {
                    ab abVar2 = ab.teal;
                    if (abVar != abVar2) {
                        o oVar = (o) this.tango.get(this.sierra.bravo(lVar.purple.alpha));
                        if (oVar != null && (avVar = oVar.foxtrot) != null && (set = (Set) ((N) avVar.alpha).getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(lVar));
                        } else {
                            bool = null;
                        }
                        if (!Intrinsics.areEqual(bool, Boolean.TRUE) && ((aVar = (a) this.kilo.get(lVar)) == null || aVar.alpha.get() != 0)) {
                            hashMap.put(lVar, abVar2);
                        } else {
                            hashMap.put(lVar, ab.silver);
                        }
                    }
                    aa aaVar4 = (aa) CollectionsKt.green(arrayList);
                    if (aaVar4 != null && aaVar4.purple.charlie == aaVar2.purple.charlie) {
                        CollectionsKt.e(arrayList);
                    }
                    CollectionsKt.e(white);
                    ac acVar = aaVar2.red;
                    if (acVar != null) {
                        white.add(acVar);
                    }
                } else if (!arrayList.isEmpty() && aaVar2.purple.charlie == ((aa) CollectionsKt.gold(arrayList)).purple.charlie) {
                    aa aaVar5 = (aa) CollectionsKt.e(arrayList);
                    if (abVar == ab.teal) {
                        lVar.alpha(ab.silver);
                    } else {
                        ab abVar3 = ab.silver;
                        if (abVar != abVar3) {
                            hashMap.put(lVar, abVar3);
                        }
                    }
                    ac acVar2 = aaVar5.red;
                    if (acVar2 != null && !arrayList.contains(acVar2)) {
                        arrayList.add(acVar2);
                    }
                } else {
                    lVar.alpha(ab.red);
                }
            }
            Iterator it2 = B.iterator();
            while (it2.hasNext()) {
                Y1.l lVar2 = (Y1.l) it2.next();
                ab abVar4 = (ab) hashMap.get(lVar2);
                if (abVar4 != null) {
                    lVar2.alpha(abVar4);
                } else {
                    lVar2.f2268a.charlie();
                }
            }
        }
    }
}
