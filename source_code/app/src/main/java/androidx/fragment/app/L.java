package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.R;
import g1.InterfaceC1738g;
import g1.InterfaceC1739h;
import ge.InterfaceC1772d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2196f;
import r1.InterfaceC2482a;
import s1.InterfaceC2578k;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public abstract class L {
    public ai amber;
    public ah.g black;
    public ah.g blue;
    public boolean bravo;
    public ah.g bronze;
    public boolean crimson;
    public boolean cyan;
    public ArrayList echo;
    public boolean emerald;
    public boolean fuchsia;
    public boolean gold;
    public ae.ai golf;
    public ArrayList gray;
    public ArrayList green;
    public ArrayList indigo;
    public FragmentManagerViewModel ivory;
    public final aw romeo;
    public final aw sierra;
    public final aw tango;
    public final aw uniform;
    public as xray;
    public aq yankee;
    public ai zulu;
    public final ArrayList alpha = new ArrayList();
    public final T charlie = new T();
    public ArrayList delta = new ArrayList();
    public final au foxtrot = new au(this);
    public C0606a hotel = null;
    public boolean india = false;
    public final ay juliet = new ay(this);
    public final AtomicInteger kilo = new AtomicInteger();
    public final Map lima = Collections.synchronizedMap(new HashMap());
    public final Map mike = Collections.synchronizedMap(new HashMap());
    public final Map november = Collections.synchronizedMap(new HashMap());
    public final ArrayList oscar = new ArrayList();
    public final ao papa = new ao(this);
    public final CopyOnWriteArrayList quebec = new CopyOnWriteArrayList();
    public final az victor = new az(this);
    public int whiskey = -1;
    public final A azure = new A(this);
    public final B beige = new Object();
    public ArrayDeque coral = new ArrayDeque();
    public final r jade = new r(2, this);

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.aw] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.aw] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.aw] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.aw] */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.fragment.app.B, java.lang.Object] */
    public L() {
        final int i4 = 0;
        this.romeo = new InterfaceC2482a(this) { // from class: androidx.fragment.app.aw
            public final /* synthetic */ L bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l10 = this.bravo;
                        if (l10.indigo()) {
                            l10.india(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l11 = this.bravo;
                        if (l11.indigo() && num.intValue() == 80) {
                            l11.mike(false);
                            return;
                        }
                        return;
                    case 2:
                        f1.l lVar = (f1.l) obj;
                        L l12 = this.bravo;
                        if (l12.indigo()) {
                            l12.november(lVar.alpha, false);
                            return;
                        }
                        return;
                    default:
                        f1.af afVar = (f1.af) obj;
                        L l13 = this.bravo;
                        if (l13.indigo()) {
                            l13.sierra(afVar.alpha, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 1;
        this.sierra = new InterfaceC2482a(this) { // from class: androidx.fragment.app.aw
            public final /* synthetic */ L bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l10 = this.bravo;
                        if (l10.indigo()) {
                            l10.india(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l11 = this.bravo;
                        if (l11.indigo() && num.intValue() == 80) {
                            l11.mike(false);
                            return;
                        }
                        return;
                    case 2:
                        f1.l lVar = (f1.l) obj;
                        L l12 = this.bravo;
                        if (l12.indigo()) {
                            l12.november(lVar.alpha, false);
                            return;
                        }
                        return;
                    default:
                        f1.af afVar = (f1.af) obj;
                        L l13 = this.bravo;
                        if (l13.indigo()) {
                            l13.sierra(afVar.alpha, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 2;
        this.tango = new InterfaceC2482a(this) { // from class: androidx.fragment.app.aw
            public final /* synthetic */ L bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l10 = this.bravo;
                        if (l10.indigo()) {
                            l10.india(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l11 = this.bravo;
                        if (l11.indigo() && num.intValue() == 80) {
                            l11.mike(false);
                            return;
                        }
                        return;
                    case 2:
                        f1.l lVar = (f1.l) obj;
                        L l12 = this.bravo;
                        if (l12.indigo()) {
                            l12.november(lVar.alpha, false);
                            return;
                        }
                        return;
                    default:
                        f1.af afVar = (f1.af) obj;
                        L l13 = this.bravo;
                        if (l13.indigo()) {
                            l13.sierra(afVar.alpha, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i11 = 3;
        this.uniform = new InterfaceC2482a(this) { // from class: androidx.fragment.app.aw
            public final /* synthetic */ L bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l10 = this.bravo;
                        if (l10.indigo()) {
                            l10.india(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l11 = this.bravo;
                        if (l11.indigo() && num.intValue() == 80) {
                            l11.mike(false);
                            return;
                        }
                        return;
                    case 2:
                        f1.l lVar = (f1.l) obj;
                        L l12 = this.bravo;
                        if (l12.indigo()) {
                            l12.november(lVar.alpha, false);
                            return;
                        }
                        return;
                    default:
                        f1.af afVar = (f1.af) obj;
                        L l13 = this.bravo;
                        if (l13.indigo()) {
                            l13.sierra(afVar.alpha, false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static ai bronze(View view) {
        ai aiVar;
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof ai) {
                aiVar = (ai) tag;
            } else {
                aiVar = null;
            }
            if (aiVar != null) {
                return aiVar;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static HashSet crimson(C0606a c0606a) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < c0606a.alpha.size(); i4++) {
            ai aiVar = ((U) c0606a.alpha.get(i4)).bravo;
            if (aiVar != null && c0606a.golf) {
                hashSet.add(aiVar);
            }
        }
        return hashSet;
    }

    public static boolean gray(int i4) {
        if (Log.isLoggable("FragmentManager", i4)) {
            return true;
        }
        return false;
    }

    public static boolean green(ai aiVar) {
        if (!aiVar.mHasMenu || !aiVar.mMenuVisible) {
            Iterator it = aiVar.mChildFragmentManager.charlie.echo().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                ai aiVar2 = (ai) it.next();
                if (aiVar2 != null) {
                    z2 = green(aiVar2);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean ivory(ai aiVar) {
        if (aiVar != null) {
            L l10 = aiVar.mFragmentManager;
            if (aiVar.equals(l10.amber) && ivory(l10.zulu)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void teal(ai aiVar) {
        if (gray(2)) {
            Log.v("FragmentManager", "show: " + aiVar);
        }
        if (aiVar.mHidden) {
            aiVar.mHidden = false;
            aiVar.mHiddenChanged = !aiVar.mHiddenChanged;
        }
    }

    public final S alpha(ai aiVar) {
        String str = aiVar.mPreviousWho;
        if (str != null) {
            O1.c.charlie(aiVar, str);
        }
        if (gray(2)) {
            Log.v("FragmentManager", "add: " + aiVar);
        }
        S golf = golf(aiVar);
        aiVar.mFragmentManager = this;
        T t5 = this.charlie;
        t5.golf(golf);
        if (!aiVar.mDetached) {
            t5.alpha(aiVar);
            aiVar.mRemoving = false;
            if (aiVar.mView == null) {
                aiVar.mHiddenChanged = false;
            }
            if (green(aiVar)) {
                this.crimson = true;
            }
        }
        return golf;
    }

    public final void amber(C0606a c0606a, boolean z2) {
        if (z2 && (this.xray == null || this.fuchsia)) {
            return;
        }
        yankee(z2);
        C0606a c0606a2 = this.hotel;
        if (c0606a2 != null) {
            c0606a2.sierra = false;
            c0606a2.hotel();
            if (gray(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.hotel + " as part of execSingleAction for action " + c0606a);
            }
            this.hotel.juliet(false, false);
            this.hotel.alpha(this.gray, this.green);
            Iterator it = this.hotel.alpha.iterator();
            while (it.hasNext()) {
                ai aiVar = ((U) it.next()).bravo;
                if (aiVar != null) {
                    aiVar.mTransitioning = false;
                }
            }
            this.hotel = null;
        }
        c0606a.alpha(this.gray, this.green);
        this.bravo = true;
        try {
            olive(this.gray, this.green);
            delta();
            yellow();
            boolean z10 = this.gold;
            T t5 = this.charlie;
            if (z10) {
                this.gold = false;
                Iterator it2 = t5.delta().iterator();
                while (it2.hasNext()) {
                    S s3 = (S) it2.next();
                    ai aiVar2 = s3.charlie;
                    if (aiVar2.mDeferStart) {
                        if (this.bravo) {
                            this.gold = true;
                        } else {
                            aiVar2.mDeferStart = false;
                            s3.kilo();
                        }
                    }
                }
            }
            t5.bravo.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            delta();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:136:0x022b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x02f7. Please report as an issue. */
    public final void azure(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        int i10;
        boolean z2;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16 = i4;
        boolean z12 = ((C0606a) arrayList.get(i16)).papa;
        ArrayList arrayList3 = this.indigo;
        if (arrayList3 == null) {
            this.indigo = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.indigo;
        T t5 = this.charlie;
        arrayList4.addAll(t5.foxtrot());
        ai aiVar = this.amber;
        int i17 = i16;
        boolean z13 = false;
        while (true) {
            int i18 = 1;
            if (i17 < i5) {
                C0606a c0606a = (C0606a) arrayList.get(i17);
                if (!((Boolean) arrayList2.get(i17)).booleanValue()) {
                    ArrayList arrayList5 = this.indigo;
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList6 = c0606a.alpha;
                        if (i19 < arrayList6.size()) {
                            U u4 = (U) arrayList6.get(i19);
                            boolean z14 = z12;
                            int i20 = u4.alpha;
                            if (i20 != i18) {
                                i12 = i17;
                                if (i20 != 2) {
                                    if (i20 != 3 && i20 != 6) {
                                        if (i20 != 7) {
                                            if (i20 == 8) {
                                                arrayList6.add(i19, new U(aiVar, 9, 0));
                                                u4.charlie = true;
                                                i19++;
                                                aiVar = u4.bravo;
                                            }
                                        } else {
                                            i13 = 1;
                                        }
                                    } else {
                                        arrayList5.remove(u4.bravo);
                                        ai aiVar2 = u4.bravo;
                                        if (aiVar2 == aiVar) {
                                            arrayList6.add(i19, new U(aiVar2, 9));
                                            i19++;
                                            z11 = z13;
                                            aiVar = null;
                                            i13 = 1;
                                        }
                                    }
                                    z11 = z13;
                                    i13 = 1;
                                } else {
                                    ai aiVar3 = u4.bravo;
                                    int i21 = aiVar3.mContainerId;
                                    int size = arrayList5.size() - 1;
                                    boolean z15 = false;
                                    while (size >= 0) {
                                        int i22 = size;
                                        ai aiVar4 = (ai) arrayList5.get(size);
                                        boolean z16 = z13;
                                        if (aiVar4.mContainerId == i21) {
                                            if (aiVar4 == aiVar3) {
                                                i14 = i21;
                                                z15 = true;
                                            } else {
                                                if (aiVar4 == aiVar) {
                                                    i14 = i21;
                                                    i15 = 0;
                                                    arrayList6.add(i19, new U(aiVar4, 9, 0));
                                                    i19++;
                                                    aiVar = null;
                                                } else {
                                                    i14 = i21;
                                                    i15 = 0;
                                                }
                                                U u10 = new U(aiVar4, 3, i15);
                                                u10.delta = u4.delta;
                                                u10.foxtrot = u4.foxtrot;
                                                u10.echo = u4.echo;
                                                u10.golf = u4.golf;
                                                arrayList6.add(i19, u10);
                                                arrayList5.remove(aiVar4);
                                                i19++;
                                                aiVar = aiVar;
                                            }
                                        } else {
                                            i14 = i21;
                                        }
                                        size = i22 - 1;
                                        i21 = i14;
                                        z13 = z16;
                                    }
                                    z11 = z13;
                                    i13 = 1;
                                    if (z15) {
                                        arrayList6.remove(i19);
                                        i19--;
                                    } else {
                                        u4.alpha = 1;
                                        u4.charlie = true;
                                        arrayList5.add(aiVar3);
                                    }
                                }
                                i19 += i13;
                                i18 = i13;
                                z12 = z14;
                                i17 = i12;
                                z13 = z11;
                            } else {
                                i12 = i17;
                                i13 = i18;
                            }
                            z11 = z13;
                            arrayList5.add(u4.bravo);
                            i19 += i13;
                            i18 = i13;
                            z12 = z14;
                            i17 = i12;
                            z13 = z11;
                        } else {
                            z2 = z12;
                            i11 = i17;
                            z10 = z13;
                        }
                    }
                } else {
                    z2 = z12;
                    i11 = i17;
                    z10 = z13;
                    int i23 = 1;
                    ArrayList arrayList7 = this.indigo;
                    ArrayList arrayList8 = c0606a.alpha;
                    int size2 = arrayList8.size() - 1;
                    while (size2 >= 0) {
                        U u11 = (U) arrayList8.get(size2);
                        int i24 = u11.alpha;
                        if (i24 != i23) {
                            if (i24 != 3) {
                                switch (i24) {
                                    case 8:
                                        aiVar = null;
                                        break;
                                    case 9:
                                        aiVar = u11.bravo;
                                        break;
                                    case 10:
                                        u11.india = u11.hotel;
                                        break;
                                }
                                size2--;
                                i23 = 1;
                            }
                            arrayList7.add(u11.bravo);
                            size2--;
                            i23 = 1;
                        }
                        arrayList7.remove(u11.bravo);
                        size2--;
                        i23 = 1;
                    }
                }
                if (!z10 && !c0606a.golf) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                i17 = i11 + 1;
                z12 = z2;
            } else {
                boolean z17 = z12;
                boolean z18 = z13;
                this.indigo.clear();
                if (!z17 && this.whiskey >= 1) {
                    for (int i25 = i16; i25 < i5; i25++) {
                        Iterator it = ((C0606a) arrayList.get(i25)).alpha.iterator();
                        while (it.hasNext()) {
                            ai aiVar5 = ((U) it.next()).bravo;
                            if (aiVar5 != null && aiVar5.mFragmentManager != null) {
                                t5.golf(golf(aiVar5));
                            }
                        }
                    }
                }
                int i26 = i16;
                while (i26 < i5) {
                    C0606a c0606a2 = (C0606a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue()) {
                        c0606a2.golf(-1);
                        ArrayList arrayList9 = c0606a2.alpha;
                        boolean z19 = true;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            U u12 = (U) arrayList9.get(size3);
                            ai aiVar6 = u12.bravo;
                            if (aiVar6 != null) {
                                aiVar6.mBeingSaved = c0606a2.uniform;
                                aiVar6.setPopDirection(z19);
                                int i27 = c0606a2.foxtrot;
                                int i28 = 8194;
                                int i29 = 4097;
                                if (i27 != 4097) {
                                    if (i27 != 8194) {
                                        i28 = 4100;
                                        i29 = 8197;
                                        if (i27 != 8197) {
                                            if (i27 != 4099) {
                                                if (i27 != 4100) {
                                                    i28 = 0;
                                                }
                                            } else {
                                                i28 = 4099;
                                            }
                                        }
                                    }
                                    i28 = i29;
                                }
                                aiVar6.setNextTransition(i28);
                                aiVar6.setSharedElementNames(c0606a2.oscar, c0606a2.november);
                            }
                            int i30 = u12.alpha;
                            L l10 = c0606a2.romeo;
                            switch (i30) {
                                case 1:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    z19 = true;
                                    l10.plum(aiVar6, true);
                                    l10.ochre(aiVar6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u12.alpha);
                                case 3:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    l10.alpha(aiVar6);
                                    z19 = true;
                                case 4:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    l10.getClass();
                                    teal(aiVar6);
                                    z19 = true;
                                case 5:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    l10.plum(aiVar6, true);
                                    l10.gold(aiVar6);
                                    z19 = true;
                                case 6:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    l10.charlie(aiVar6);
                                    z19 = true;
                                case 7:
                                    aiVar6.setAnimations(u12.delta, u12.echo, u12.foxtrot, u12.golf);
                                    l10.plum(aiVar6, true);
                                    l10.hotel(aiVar6);
                                    z19 = true;
                                case 8:
                                    l10.red(null);
                                    z19 = true;
                                case 9:
                                    l10.red(aiVar6);
                                    z19 = true;
                                case 10:
                                    u12.india = aiVar6.mMaxState;
                                    l10.purple(aiVar6, u12.hotel);
                                    z19 = true;
                            }
                        }
                    } else {
                        c0606a2.golf(1);
                        ArrayList arrayList10 = c0606a2.alpha;
                        int size4 = arrayList10.size();
                        int i31 = 0;
                        while (i31 < size4) {
                            U u13 = (U) arrayList10.get(i31);
                            ai aiVar7 = u13.bravo;
                            if (aiVar7 != null) {
                                aiVar7.mBeingSaved = c0606a2.uniform;
                                aiVar7.setPopDirection(false);
                                aiVar7.setNextTransition(c0606a2.foxtrot);
                                aiVar7.setSharedElementNames(c0606a2.november, c0606a2.oscar);
                            }
                            int i32 = u13.alpha;
                            L l11 = c0606a2.romeo;
                            switch (i32) {
                                case 1:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.plum(aiVar7, false);
                                    l11.alpha(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u13.alpha);
                                case 3:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.ochre(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 4:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.gold(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 5:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.plum(aiVar7, false);
                                    teal(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 6:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.hotel(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 7:
                                    i10 = i26;
                                    aiVar7.setAnimations(u13.delta, u13.echo, u13.foxtrot, u13.golf);
                                    l11.plum(aiVar7, false);
                                    l11.charlie(aiVar7);
                                    i31++;
                                    i26 = i10;
                                case 8:
                                    l11.red(aiVar7);
                                    i10 = i26;
                                    i31++;
                                    i26 = i10;
                                case 9:
                                    l11.red(null);
                                    i10 = i26;
                                    i31++;
                                    i26 = i10;
                                case 10:
                                    u13.hotel = aiVar7.mMaxState;
                                    l11.purple(aiVar7, u13.india);
                                    i10 = i26;
                                    i31++;
                                    i26 = i10;
                            }
                        }
                    }
                    i26++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
                ArrayList arrayList11 = this.oscar;
                if (z18 && !arrayList11.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(crimson((C0606a) it2.next()));
                    }
                    if (this.hotel == null) {
                        Iterator it3 = arrayList11.iterator();
                        while (it3.hasNext()) {
                            G g2 = (G) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                g2.onBackStackChangeStarted((ai) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList11.iterator();
                        while (it5.hasNext()) {
                            G g5 = (G) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                g5.onBackStackChangeCommitted((ai) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i33 = i16; i33 < i5; i33++) {
                    C0606a c0606a3 = (C0606a) arrayList.get(i33);
                    if (booleanValue) {
                        for (int size5 = c0606a3.alpha.size() - 1; size5 >= 0; size5--) {
                            ai aiVar8 = ((U) c0606a3.alpha.get(size5)).bravo;
                            if (aiVar8 != null) {
                                golf(aiVar8).kilo();
                            }
                        }
                    } else {
                        Iterator it7 = c0606a3.alpha.iterator();
                        while (it7.hasNext()) {
                            ai aiVar9 = ((U) it7.next()).bravo;
                            if (aiVar9 != null) {
                                golf(aiVar9).kilo();
                            }
                        }
                    }
                }
                lavender(this.whiskey, true);
                Iterator it8 = foxtrot(arrayList, i16, i5).iterator();
                while (it8.hasNext()) {
                    C0622q c0622q = (C0622q) it8.next();
                    c0622q.echo = booleanValue;
                    c0622q.lima();
                    c0622q.echo();
                }
                while (i16 < i5) {
                    C0606a c0606a4 = (C0606a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && c0606a4.tango >= 0) {
                        c0606a4.tango = -1;
                    }
                    if (c0606a4.quebec != null) {
                        for (int i34 = 0; i34 < c0606a4.quebec.size(); i34++) {
                            ((Runnable) c0606a4.quebec.get(i34)).run();
                        }
                        c0606a4.quebec = null;
                    }
                    i16++;
                }
                if (z18) {
                    for (int i35 = 0; i35 < arrayList11.size(); i35++) {
                        ((G) arrayList11.get(i35)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final int beige(String str, int i4, boolean z2) {
        if (this.delta.isEmpty()) {
            return -1;
        }
        if (str == null && i4 < 0) {
            if (z2) {
                return 0;
            }
            return this.delta.size() - 1;
        }
        int size = this.delta.size() - 1;
        while (size >= 0) {
            C0606a c0606a = (C0606a) this.delta.get(size);
            if ((str != null && str.equals(c0606a.india)) || (i4 >= 0 && i4 == c0606a.tango)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z2) {
            while (size > 0) {
                C0606a c0606a2 = (C0606a) this.delta.get(size - 1);
                if ((str == null || !str.equals(c0606a2.india)) && (i4 < 0 || i4 != c0606a2.tango)) {
                    break;
                }
                size--;
            }
            return size;
        }
        if (size == this.delta.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    public final ai black(int i4) {
        T t5 = this.charlie;
        ArrayList arrayList = t5.alpha;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ai aiVar = (ai) arrayList.get(size);
            if (aiVar != null && aiVar.mFragmentId == i4) {
                return aiVar;
            }
        }
        for (S s3 : t5.bravo.values()) {
            if (s3 != null) {
                ai aiVar2 = s3.charlie;
                if (aiVar2.mFragmentId == i4) {
                    return aiVar2;
                }
            }
        }
        return null;
    }

    public final ai blue(String str) {
        T t5 = this.charlie;
        if (str != null) {
            ArrayList arrayList = t5.alpha;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ai aiVar = (ai) arrayList.get(size);
                if (aiVar != null && str.equals(aiVar.mTag)) {
                    return aiVar;
                }
            }
        }
        if (str != null) {
            for (S s3 : t5.bravo.values()) {
                if (s3 != null) {
                    ai aiVar2 = s3.charlie;
                    if (str.equals(aiVar2.mTag)) {
                        return aiVar2;
                    }
                }
            }
            return null;
        }
        t5.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bravo(as asVar, aq aqVar, ai aiVar) {
        String str;
        if (this.xray == null) {
            this.xray = asVar;
            this.yankee = aqVar;
            this.zulu = aiVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.quebec;
            if (aiVar != null) {
                copyOnWriteArrayList.add(new D(aiVar));
            } else if (asVar instanceof O) {
                copyOnWriteArrayList.add((O) asVar);
            }
            if (this.zulu != null) {
                yellow();
            }
            if (asVar instanceof ae.aj) {
                ae.aj ajVar = (ae.aj) asVar;
                ae.ai onBackPressedDispatcher = ajVar.getOnBackPressedDispatcher();
                this.golf = onBackPressedDispatcher;
                androidx.lifecycle.al alVar = ajVar;
                if (aiVar != null) {
                    alVar = aiVar;
                }
                onBackPressedDispatcher.alpha(alVar, this.juliet);
            }
            if (aiVar != null) {
                FragmentManagerViewModel fragmentManagerViewModel = aiVar.mFragmentManager.ivory;
                HashMap hashMap = fragmentManagerViewModel.bravo;
                FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) hashMap.get(aiVar.mWho);
                if (fragmentManagerViewModel2 == null) {
                    fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.delta);
                    hashMap.put(aiVar.mWho, fragmentManagerViewModel2);
                }
                this.ivory = fragmentManagerViewModel2;
            } else if (asVar instanceof androidx.lifecycle.d0) {
                androidx.lifecycle.c0 store = ((androidx.lifecycle.d0) asVar).getViewModelStore();
                N n5 = FragmentManagerViewModel.golf;
                Intrinsics.echo(store, "store");
                T1.a defaultCreationExtras = T1.a.bravo;
                Intrinsics.echo(defaultCreationExtras, "defaultCreationExtras");
                J2.i iVar = new J2.i(store, n5, defaultCreationExtras);
                InterfaceC1772d echo = AbstractC3062u.echo(FragmentManagerViewModel.class);
                String juliet = echo.juliet();
                if (juliet != null) {
                    this.ivory = (FragmentManagerViewModel) iVar.charlie(echo, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.ivory = new FragmentManagerViewModel(false);
            }
            this.ivory.foxtrot = jade();
            this.charlie.delta = this.ivory;
            Object obj = this.xray;
            if ((obj instanceof InterfaceC2196f) && aiVar == null) {
                C2194d savedStateRegistry = ((InterfaceC2196f) obj).getSavedStateRegistry();
                savedStateRegistry.charlie("android:support:fragments", new aj(1, this));
                Bundle alpha = savedStateRegistry.alpha("android:support:fragments");
                if (alpha != null) {
                    orange(alpha);
                }
            }
            Object obj2 = this.xray;
            if (obj2 instanceof ah.i) {
                ah.h activityResultRegistry = ((ah.i) obj2).getActivityResultRegistry();
                if (aiVar != null) {
                    str = P0.gold(new StringBuilder(), aiVar.mWho, ":");
                } else {
                    str = "";
                }
                String echo2 = av.q.echo("FragmentManager:", str);
                this.black = activityResultRegistry.charlie(P0.crimson(echo2, "StartActivityForResult"), new a4.s(5), new ax(this, 1));
                this.blue = activityResultRegistry.charlie(P0.crimson(echo2, "StartIntentSenderForResult"), new a4.s(8), new ax(this, 2));
                this.bronze = activityResultRegistry.charlie(P0.crimson(echo2, "RequestPermissions"), new a4.s(3), new ax(this, 0));
            }
            Object obj3 = this.xray;
            if (obj3 instanceof InterfaceC1738g) {
                ((InterfaceC1738g) obj3).addOnConfigurationChangedListener(this.romeo);
            }
            Object obj4 = this.xray;
            if (obj4 instanceof InterfaceC1739h) {
                ((InterfaceC1739h) obj4).addOnTrimMemoryListener(this.sierra);
            }
            Object obj5 = this.xray;
            if (obj5 instanceof f1.ad) {
                ((f1.ad) obj5).addOnMultiWindowModeChangedListener(this.tango);
            }
            Object obj6 = this.xray;
            if (obj6 instanceof f1.ae) {
                ((f1.ae) obj6).addOnPictureInPictureModeChangedListener(this.uniform);
            }
            Object obj7 = this.xray;
            if ((obj7 instanceof InterfaceC2578k) && aiVar == null) {
                ((InterfaceC2578k) obj7).addMenuProvider(this.victor);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void charlie(ai aiVar) {
        if (gray(2)) {
            Log.v("FragmentManager", "attach: " + aiVar);
        }
        if (aiVar.mDetached) {
            aiVar.mDetached = false;
            if (!aiVar.mAdded) {
                this.charlie.alpha(aiVar);
                if (gray(2)) {
                    Log.v("FragmentManager", "add from attach: " + aiVar);
                }
                if (green(aiVar)) {
                    this.crimson = true;
                }
            }
        }
    }

    public final void coral() {
        Iterator it = echo().iterator();
        while (it.hasNext()) {
            C0622q c0622q = (C0622q) it.next();
            if (c0622q.foxtrot) {
                if (gray(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0622q.foxtrot = false;
                c0622q.echo();
            }
        }
    }

    public final ViewGroup cyan(ai aiVar) {
        ViewGroup viewGroup = aiVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aiVar.mContainerId > 0 && this.yankee.charlie()) {
            View bravo = this.yankee.bravo(aiVar.mContainerId);
            if (bravo instanceof ViewGroup) {
                return (ViewGroup) bravo;
            }
            return null;
        }
        return null;
    }

    public final void delta() {
        this.bravo = false;
        this.green.clear();
        this.gray.clear();
    }

    public final HashSet echo() {
        C0622q c0622q;
        HashSet hashSet = new HashSet();
        Iterator it = this.charlie.delta().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((S) it.next()).charlie.mContainer;
            if (viewGroup != null) {
                B factory = fuchsia();
                Intrinsics.echo(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0622q) {
                    c0622q = (C0622q) tag;
                } else {
                    c0622q = new C0622q(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0622q);
                }
                hashSet.add(c0622q);
            }
        }
        return hashSet;
    }

    public final A emerald() {
        ai aiVar = this.zulu;
        if (aiVar != null) {
            return aiVar.mFragmentManager.emerald();
        }
        return this.azure;
    }

    public final HashSet foxtrot(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator it = ((C0606a) arrayList.get(i4)).alpha.iterator();
            while (it.hasNext()) {
                ai aiVar = ((U) it.next()).bravo;
                if (aiVar != null && (viewGroup = aiVar.mContainer) != null) {
                    hashSet.add(C0622q.juliet(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public final B fuchsia() {
        ai aiVar = this.zulu;
        if (aiVar != null) {
            return aiVar.mFragmentManager.fuchsia();
        }
        return this.beige;
    }

    public final void gold(ai aiVar) {
        if (gray(2)) {
            Log.v("FragmentManager", "hide: " + aiVar);
        }
        if (!aiVar.mHidden) {
            aiVar.mHidden = true;
            aiVar.mHiddenChanged = true ^ aiVar.mHiddenChanged;
            silver(aiVar);
        }
    }

    public final S golf(ai aiVar) {
        String str = aiVar.mWho;
        T t5 = this.charlie;
        S s3 = (S) t5.bravo.get(str);
        if (s3 != null) {
            return s3;
        }
        S s9 = new S(this.papa, t5, aiVar);
        s9.lima(this.xray.purple.getClassLoader());
        s9.echo = this.whiskey;
        return s9;
    }

    public final void hotel(ai aiVar) {
        if (gray(2)) {
            Log.v("FragmentManager", "detach: " + aiVar);
        }
        if (!aiVar.mDetached) {
            aiVar.mDetached = true;
            if (aiVar.mAdded) {
                if (gray(2)) {
                    Log.v("FragmentManager", "remove from detach: " + aiVar);
                }
                T t5 = this.charlie;
                synchronized (t5.alpha) {
                    t5.alpha.remove(aiVar);
                }
                aiVar.mAdded = false;
                if (green(aiVar)) {
                    this.crimson = true;
                }
                silver(aiVar);
            }
        }
    }

    public final void india(boolean z2, Configuration configuration) {
        if (z2 && (this.xray instanceof InterfaceC1738g)) {
            white(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null) {
                aiVar.performConfigurationChanged(configuration);
                if (z2) {
                    aiVar.mChildFragmentManager.india(true, configuration);
                }
            }
        }
    }

    public final boolean indigo() {
        ai aiVar = this.zulu;
        if (aiVar == null) {
            return true;
        }
        if (aiVar.isAdded() && this.zulu.getParentFragmentManager().indigo()) {
            return true;
        }
        return false;
    }

    public final boolean jade() {
        if (!this.cyan && !this.emerald) {
            return false;
        }
        return true;
    }

    public final boolean juliet(MenuItem menuItem) {
        if (this.whiskey < 1) {
            return false;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null && aiVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean kilo(Menu menu, MenuInflater menuInflater) {
        if (this.whiskey < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null && aiVar.isMenuVisible() && aiVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aiVar);
                z2 = true;
            }
        }
        if (this.echo != null) {
            for (int i4 = 0; i4 < this.echo.size(); i4++) {
                ai aiVar2 = (ai) this.echo.get(i4);
                if (arrayList == null || !arrayList.contains(aiVar2)) {
                    aiVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.echo = arrayList;
        return z2;
    }

    public final void lavender(int i4, boolean z2) {
        HashMap hashMap;
        as asVar;
        if (this.xray == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i4 != this.whiskey) {
            this.whiskey = i4;
            T t5 = this.charlie;
            Iterator it = t5.alpha.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = t5.bravo;
                if (!hasNext) {
                    break;
                }
                S s3 = (S) hashMap.get(((ai) it.next()).mWho);
                if (s3 != null) {
                    s3.kilo();
                }
            }
            for (S s9 : hashMap.values()) {
                if (s9 != null) {
                    s9.kilo();
                    ai aiVar = s9.charlie;
                    if (aiVar.mRemoving && !aiVar.isInBackStack()) {
                        if (aiVar.mBeingSaved && !t5.charlie.containsKey(aiVar.mWho)) {
                            t5.india(s9.november(), aiVar.mWho);
                        }
                        t5.hotel(s9);
                    }
                }
            }
            Iterator it2 = t5.delta().iterator();
            while (it2.hasNext()) {
                S s10 = (S) it2.next();
                ai aiVar2 = s10.charlie;
                if (aiVar2.mDeferStart) {
                    if (this.bravo) {
                        this.gold = true;
                    } else {
                        aiVar2.mDeferStart = false;
                        s10.kilo();
                    }
                }
            }
            if (this.crimson && (asVar = this.xray) != null && this.whiskey == 7) {
                ((am) asVar).teal.invalidateMenu();
                this.crimson = false;
            }
        }
    }

    public final void lima() {
        boolean z2 = true;
        this.fuchsia = true;
        zulu(true);
        whiskey();
        as asVar = this.xray;
        boolean z10 = asVar instanceof androidx.lifecycle.d0;
        T t5 = this.charlie;
        if (z10) {
            z2 = t5.delta.echo;
        } else {
            an anVar = asVar.purple;
            if (av.q.kilo(anVar)) {
                z2 = true ^ anVar.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it = this.lima.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).alpha.iterator();
                while (it2.hasNext()) {
                    t5.delta.charlie((String) it2.next(), false);
                }
            }
        }
        uniform(-1);
        Object obj = this.xray;
        if (obj instanceof InterfaceC1739h) {
            ((InterfaceC1739h) obj).removeOnTrimMemoryListener(this.sierra);
        }
        Object obj2 = this.xray;
        if (obj2 instanceof InterfaceC1738g) {
            ((InterfaceC1738g) obj2).removeOnConfigurationChangedListener(this.romeo);
        }
        Object obj3 = this.xray;
        if (obj3 instanceof f1.ad) {
            ((f1.ad) obj3).removeOnMultiWindowModeChangedListener(this.tango);
        }
        Object obj4 = this.xray;
        if (obj4 instanceof f1.ae) {
            ((f1.ae) obj4).removeOnPictureInPictureModeChangedListener(this.uniform);
        }
        Object obj5 = this.xray;
        if ((obj5 instanceof InterfaceC2578k) && this.zulu == null) {
            ((InterfaceC2578k) obj5).removeMenuProvider(this.victor);
        }
        this.xray = null;
        this.yankee = null;
        this.zulu = null;
        if (this.golf != null) {
            this.juliet.remove();
            this.golf = null;
        }
        ah.g gVar = this.black;
        if (gVar != null) {
            gVar.bravo();
            this.blue.bravo();
            this.bronze.bravo();
        }
    }

    public final void lime() {
        if (this.xray != null) {
            this.cyan = false;
            this.emerald = false;
            this.ivory.foxtrot = false;
            for (ai aiVar : this.charlie.foxtrot()) {
                if (aiVar != null) {
                    aiVar.noteStateNotSaved();
                }
            }
        }
    }

    public final boolean magenta() {
        return maroon(-1, 0);
    }

    public final boolean maroon(int i4, int i5) {
        zulu(false);
        yankee(true);
        ai aiVar = this.amber;
        if (aiVar != null && i4 < 0 && aiVar.getChildFragmentManager().magenta()) {
            return true;
        }
        boolean navy = navy(this.gray, this.green, null, i4, i5);
        if (navy) {
            this.bravo = true;
            try {
                olive(this.gray, this.green);
            } finally {
                delta();
            }
        }
        yellow();
        boolean z2 = this.gold;
        T t5 = this.charlie;
        if (z2) {
            this.gold = false;
            Iterator it = t5.delta().iterator();
            while (it.hasNext()) {
                S s3 = (S) it.next();
                ai aiVar2 = s3.charlie;
                if (aiVar2.mDeferStart) {
                    if (this.bravo) {
                        this.gold = true;
                    } else {
                        aiVar2.mDeferStart = false;
                        s3.kilo();
                    }
                }
            }
        }
        t5.bravo.values().removeAll(Collections.singleton(null));
        return navy;
    }

    public final void mike(boolean z2) {
        if (z2 && (this.xray instanceof InterfaceC1739h)) {
            white(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null) {
                aiVar.performLowMemory();
                if (z2) {
                    aiVar.mChildFragmentManager.mike(true);
                }
            }
        }
    }

    public final boolean navy(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i5) {
        boolean z2;
        if ((i5 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int beige = beige(str, i4, z2);
        if (beige < 0) {
            return false;
        }
        for (int size = this.delta.size() - 1; size >= beige; size--) {
            arrayList.add((C0606a) this.delta.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void november(boolean z2, boolean z10) {
        if (z10 && (this.xray instanceof f1.ad)) {
            white(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null) {
                aiVar.performMultiWindowModeChanged(z2);
                if (z10) {
                    aiVar.mChildFragmentManager.november(z2, true);
                }
            }
        }
    }

    public final void ochre(ai aiVar) {
        if (gray(2)) {
            Log.v("FragmentManager", "remove: " + aiVar + " nesting=" + aiVar.mBackStackNesting);
        }
        boolean isInBackStack = aiVar.isInBackStack();
        if (aiVar.mDetached && isInBackStack) {
            return;
        }
        T t5 = this.charlie;
        synchronized (t5.alpha) {
            t5.alpha.remove(aiVar);
        }
        aiVar.mAdded = false;
        if (green(aiVar)) {
            this.crimson = true;
        }
        aiVar.mRemoving = true;
        silver(aiVar);
    }

    public final void olive(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    if (!((C0606a) arrayList.get(i4)).papa) {
                        if (i5 != i4) {
                            azure(arrayList, arrayList2, i5, i4);
                        }
                        i5 = i4 + 1;
                        if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                            while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0606a) arrayList.get(i5)).papa) {
                                i5++;
                            }
                        }
                        azure(arrayList, arrayList2, i4, i5);
                        i4 = i5 - 1;
                    }
                    i4++;
                }
                if (i5 != size) {
                    azure(arrayList, arrayList2, i5, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void orange(Bundle bundle) {
        ao aoVar;
        S s3;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.xray.purple.getClassLoader());
                this.mike.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.xray.purple.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        T t5 = this.charlie;
        HashMap hashMap2 = t5.charlie;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = t5.bravo;
        hashMap3.clear();
        Iterator it = fragmentManagerState.alpha.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aoVar = this.papa;
            if (!hasNext) {
                break;
            }
            Bundle india = t5.india(null, (String) it.next());
            if (india != null) {
                ai aiVar = (ai) this.ivory.alpha.get(((FragmentState) india.getParcelable("state")).purple);
                if (aiVar != null) {
                    if (gray(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + aiVar);
                    }
                    s3 = new S(aoVar, t5, aiVar, india);
                } else {
                    s3 = new S(this.papa, this.charlie, this.xray.purple.getClassLoader(), emerald(), india);
                }
                ai aiVar2 = s3.charlie;
                aiVar2.mSavedFragmentState = india;
                aiVar2.mFragmentManager = this;
                if (gray(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + aiVar2.mWho + "): " + aiVar2);
                }
                s3.lima(this.xray.purple.getClassLoader());
                t5.golf(s3);
                s3.echo = this.whiskey;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.ivory;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.alpha.values()).iterator();
        while (it2.hasNext()) {
            ai aiVar3 = (ai) it2.next();
            if (hashMap3.get(aiVar3.mWho) == null) {
                if (gray(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + aiVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.alpha);
                }
                this.ivory.echo(aiVar3);
                aiVar3.mFragmentManager = this;
                S s9 = new S(aoVar, t5, aiVar3);
                s9.echo = 1;
                s9.kilo();
                aiVar3.mRemoving = true;
                s9.kilo();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.purple;
        t5.alpha.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                ai bravo = t5.bravo(str3);
                if (bravo != null) {
                    if (gray(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + bravo);
                    }
                    t5.alpha(bravo);
                } else {
                    throw new IllegalStateException(ao.ad.gray("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (fragmentManagerState.red != null) {
            this.delta = new ArrayList(fragmentManagerState.red.length);
            int i4 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.red;
                if (i4 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i4];
                backStackRecordState.getClass();
                C0606a c0606a = new C0606a(this);
                backStackRecordState.charlie(c0606a);
                c0606a.tango = backStackRecordState.yellow;
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.purple;
                    if (i5 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i5);
                    if (str4 != null) {
                        ((U) c0606a.alpha.get(i5)).bravo = t5.bravo(str4);
                    }
                    i5++;
                }
                c0606a.golf(1);
                if (gray(2)) {
                    StringBuilder sierra = Q0.c.sierra(i4, "restoreAllState: back stack #", " (index ");
                    sierra.append(c0606a.tango);
                    sierra.append("): ");
                    sierra.append(c0606a);
                    Log.v("FragmentManager", sierra.toString());
                    PrintWriter printWriter = new PrintWriter(new f0());
                    c0606a.kilo("  ", printWriter, false);
                    printWriter.close();
                }
                this.delta.add(c0606a);
                i4++;
            }
        } else {
            this.delta = new ArrayList();
        }
        this.kilo.set(fragmentManagerState.silver);
        String str5 = fragmentManagerState.teal;
        if (str5 != null) {
            ai bravo2 = t5.bravo(str5);
            this.amber = bravo2;
            romeo(bravo2);
        }
        ArrayList arrayList3 = fragmentManagerState.white;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                this.lima.put((String) arrayList3.get(i10), (BackStackState) fragmentManagerState.yellow.get(i10));
            }
        }
        this.coral = new ArrayDeque(fragmentManagerState.f3112a);
    }

    public final void oscar() {
        Iterator it = this.charlie.echo().iterator();
        while (it.hasNext()) {
            ai aiVar = (ai) it.next();
            if (aiVar != null) {
                aiVar.onHiddenChanged(aiVar.isHidden());
                aiVar.mChildFragmentManager.oscar();
            }
        }
    }

    public final boolean papa(MenuItem menuItem) {
        if (this.whiskey < 1) {
            return false;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null && aiVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.os.Parcelable, androidx.fragment.app.FragmentManagerState, java.lang.Object] */
    public final Bundle peach() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        coral();
        whiskey();
        zulu(true);
        this.cyan = true;
        this.ivory.foxtrot = true;
        T t5 = this.charlie;
        t5.getClass();
        HashMap hashMap = t5.bravo;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (S s3 : hashMap.values()) {
            if (s3 != null) {
                ai aiVar = s3.charlie;
                t5.india(s3.november(), aiVar.mWho);
                arrayList2.add(aiVar.mWho);
                if (gray(2)) {
                    Log.v("FragmentManager", "Saved state of " + aiVar + ": " + aiVar.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.charlie.charlie;
        if (hashMap2.isEmpty()) {
            if (gray(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            T t10 = this.charlie;
            synchronized (t10.alpha) {
                try {
                    if (t10.alpha.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(t10.alpha.size());
                        Iterator it = t10.alpha.iterator();
                        while (it.hasNext()) {
                            ai aiVar2 = (ai) it.next();
                            arrayList.add(aiVar2.mWho);
                            if (gray(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + aiVar2.mWho + "): " + aiVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.delta.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i4 = 0; i4 < size; i4++) {
                    backStackRecordStateArr[i4] = new BackStackRecordState((C0606a) this.delta.get(i4));
                    if (gray(2)) {
                        StringBuilder sierra = Q0.c.sierra(i4, "saveAllState: adding back stack #", ": ");
                        sierra.append(this.delta.get(i4));
                        Log.v("FragmentManager", sierra.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            ?? obj = new Object();
            obj.teal = null;
            ArrayList arrayList3 = new ArrayList();
            obj.white = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.yellow = arrayList4;
            obj.alpha = arrayList2;
            obj.purple = arrayList;
            obj.red = backStackRecordStateArr;
            obj.silver = this.kilo.get();
            ai aiVar3 = this.amber;
            if (aiVar3 != null) {
                obj.teal = aiVar3.mWho;
            }
            arrayList3.addAll(this.lima.keySet());
            arrayList4.addAll(this.lima.values());
            obj.f3112a = new ArrayList(this.coral);
            bundle.putParcelable("state", obj);
            for (String str : this.mike.keySet()) {
                bundle.putBundle(av.q.echo("result_", str), (Bundle) this.mike.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(av.q.echo("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void pink() {
        synchronized (this.alpha) {
            try {
                if (this.alpha.size() == 1) {
                    this.xray.red.removeCallbacks(this.jade);
                    this.xray.red.post(this.jade);
                    yellow();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void plum(ai aiVar, boolean z2) {
        ViewGroup cyan = cyan(aiVar);
        if (cyan != null && (cyan instanceof FragmentContainerView)) {
            ((FragmentContainerView) cyan).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void purple(ai aiVar, androidx.lifecycle.ab abVar) {
        if (aiVar.equals(this.charlie.bravo(aiVar.mWho)) && (aiVar.mHost == null || aiVar.mFragmentManager == this)) {
            aiVar.mMaxState = abVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + aiVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void quebec(Menu menu) {
        if (this.whiskey >= 1) {
            for (ai aiVar : this.charlie.foxtrot()) {
                if (aiVar != null) {
                    aiVar.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void red(ai aiVar) {
        if (aiVar != null) {
            if (!aiVar.equals(this.charlie.bravo(aiVar.mWho)) || (aiVar.mHost != null && aiVar.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + aiVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        ai aiVar2 = this.amber;
        this.amber = aiVar;
        romeo(aiVar2);
        romeo(this.amber);
    }

    public final void romeo(ai aiVar) {
        if (aiVar != null) {
            if (aiVar.equals(this.charlie.bravo(aiVar.mWho))) {
                aiVar.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void sierra(boolean z2, boolean z10) {
        if (z10 && (this.xray instanceof f1.ae)) {
            white(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null) {
                aiVar.performPictureInPictureModeChanged(z2);
                if (z10) {
                    aiVar.mChildFragmentManager.sierra(z2, true);
                }
            }
        }
    }

    public final void silver(ai aiVar) {
        ViewGroup cyan = cyan(aiVar);
        if (cyan != null) {
            if (aiVar.getPopExitAnim() + aiVar.getPopEnterAnim() + aiVar.getExitAnim() + aiVar.getEnterAnim() > 0) {
                if (cyan.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    cyan.setTag(R.id.visible_removing_fragment_view_tag, aiVar);
                }
                ((ai) cyan.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(aiVar.getPopDirection());
            }
        }
    }

    public final boolean tango(Menu menu) {
        boolean z2 = false;
        if (this.whiskey < 1) {
            return false;
        }
        for (ai aiVar : this.charlie.foxtrot()) {
            if (aiVar != null && aiVar.isMenuVisible() && aiVar.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ai aiVar = this.zulu;
        if (aiVar != null) {
            sb2.append(aiVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.zulu)));
            sb2.append("}");
        } else {
            as asVar = this.xray;
            if (asVar != null) {
                sb2.append(asVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.xray)));
                sb2.append("}");
            } else {
                sb2.append(BuildConfig.TRAVIS);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void uniform(int i4) {
        try {
            this.bravo = true;
            for (S s3 : this.charlie.bravo.values()) {
                if (s3 != null) {
                    s3.echo = i4;
                }
            }
            lavender(i4, false);
            Iterator it = echo().iterator();
            while (it.hasNext()) {
                ((C0622q) it.next()).india();
            }
            this.bravo = false;
            zulu(true);
        } catch (Throwable th) {
            this.bravo = false;
            throw th;
        }
    }

    public final void victor(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String crimson = P0.crimson(str, "    ");
        T t5 = this.charlie;
        t5.getClass();
        String str2 = str + "    ";
        HashMap hashMap = t5.bravo;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (S s3 : hashMap.values()) {
                printWriter.print(str);
                if (s3 != null) {
                    ai aiVar = s3.charlie;
                    printWriter.println(aiVar);
                    aiVar.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.TRAVIS);
                }
            }
        }
        ArrayList arrayList = t5.alpha;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size2; i4++) {
                ai aiVar2 = (ai) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aiVar2.toString());
            }
        }
        ArrayList arrayList2 = this.echo;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                ai aiVar3 = (ai) this.echo.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aiVar3.toString());
            }
        }
        int size3 = this.delta.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size3; i10++) {
                C0606a c0606a = (C0606a) this.delta.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c0606a.toString());
                c0606a.kilo(crimson, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.kilo.get());
        synchronized (this.alpha) {
            try {
                int size4 = this.alpha.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i11 = 0; i11 < size4; i11++) {
                        Object obj = (H) this.alpha.get(i11);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i11);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.xray);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.yankee);
        if (this.zulu != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.zulu);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.whiskey);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.cyan);
        printWriter.print(" mStopped=");
        printWriter.print(this.emerald);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.fuchsia);
        if (this.crimson) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.crimson);
        }
    }

    public final void whiskey() {
        Iterator it = echo().iterator();
        while (it.hasNext()) {
            ((C0622q) it.next()).india();
        }
    }

    public final void white(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new f0());
        as asVar = this.xray;
        if (asVar != null) {
            try {
                ((am) asVar).teal.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            victor("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw runtimeException;
        }
    }

    public final void xray(H h4, boolean z2) {
        if (!z2) {
            if (this.xray == null) {
                if (this.fuchsia) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (jade()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.alpha) {
            try {
                if (this.xray == null) {
                    if (z2) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.alpha.add(h4);
                    pink();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yankee(boolean z2) {
        if (!this.bravo) {
            if (this.xray == null) {
                if (this.fuchsia) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.xray.red.getLooper()) {
                if (!z2 && jade()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.gray == null) {
                    this.gray = new ArrayList();
                    this.green = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final void yellow() {
        int i4;
        synchronized (this.alpha) {
            try {
                boolean z2 = true;
                if (!this.alpha.isEmpty()) {
                    this.juliet.setEnabled(true);
                    if (gray(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.delta.size();
                if (this.hotel != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (size + i4 <= 0 || !ivory(this.zulu)) {
                    z2 = false;
                }
                if (gray(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z2);
                }
                this.juliet.setEnabled(z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zulu(boolean z2) {
        boolean z10;
        C0606a c0606a;
        yankee(z2);
        if (!this.india && (c0606a = this.hotel) != null) {
            c0606a.sierra = false;
            c0606a.hotel();
            if (gray(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.hotel + " as part of execPendingActions for actions " + this.alpha);
            }
            this.hotel.juliet(false, false);
            this.alpha.add(0, this.hotel);
            Iterator it = this.hotel.alpha.iterator();
            while (it.hasNext()) {
                ai aiVar = ((U) it.next()).bravo;
                if (aiVar != null) {
                    aiVar.mTransitioning = false;
                }
            }
            this.hotel = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.gray;
            ArrayList arrayList2 = this.green;
            synchronized (this.alpha) {
                if (this.alpha.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.alpha.size();
                        z10 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            z10 |= ((H) this.alpha.get(i4)).alpha(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                break;
            }
            this.bravo = true;
            try {
                olive(this.gray, this.green);
                delta();
                z11 = true;
            } catch (Throwable th) {
                delta();
                throw th;
            }
        }
        yellow();
        if (this.gold) {
            this.gold = false;
            Iterator it2 = this.charlie.delta().iterator();
            while (it2.hasNext()) {
                S s3 = (S) it2.next();
                ai aiVar2 = s3.charlie;
                if (aiVar2.mDeferStart) {
                    if (this.bravo) {
                        this.gold = true;
                    } else {
                        aiVar2.mDeferStart = false;
                        s3.kilo();
                    }
                }
            }
        }
        this.charlie.bravo.values().removeAll(Collections.singleton(null));
        return z11;
    }
}
