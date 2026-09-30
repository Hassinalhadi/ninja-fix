package androidx.navigation.internal;

import Fe.t;
import Y1.aa;
import Y1.l;
import android.os.Bundle;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import androidx.lifecycle.ab;
import androidx.lifecycle.an;
import androidx.navigation.NavControllerViewModel;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import o2.C2195e;
import q2.C2406a;
import s6.S6;

/* loaded from: classes3.dex */
public final class d {
    public final l alpha;
    public final aa bravo;
    public final Bundle charlie;
    public ab delta;
    public final NavControllerViewModel echo;
    public final String foxtrot;
    public final Bundle golf;
    public final C2195e hotel;
    public boolean india;
    public final Lazy juliet;
    public final an kilo;
    public ab lima;
    public final V mike;
    public final Lazy november;

    public d(l entry) {
        Intrinsics.echo(entry, "entry");
        this.alpha = entry;
        this.bravo = entry.purple;
        this.charlie = entry.red;
        this.delta = entry.silver;
        this.echo = entry.teal;
        this.foxtrot = entry.white;
        this.golf = entry.yellow;
        this.hotel = new C2195e(new C2406a(entry, new n(8, entry)));
        final int i4 = 1;
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: androidx.navigation.internal.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        t tVar = new t(1);
                        tVar.alpha(u.alpha.bravo(NavBackStackEntryImpl$SavedStateViewModel.class), new c(0));
                        return tVar.bravo();
                    default:
                        return new V();
                }
            }
        });
        this.juliet = lazy;
        this.kilo = new an(entry);
        this.lima = ab.purple;
        this.mike = (V) lazy.getValue();
        final int i5 = 0;
        this.november = LazyKt.lazy(new Function0() { // from class: androidx.navigation.internal.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        t tVar = new t(1);
                        tVar.alpha(u.alpha.bravo(NavBackStackEntryImpl$SavedStateViewModel.class), new c(0));
                        return tVar.bravo();
                    default:
                        return new V();
                }
            }
        });
    }

    public final Bundle alpha() {
        Bundle bundle = this.charlie;
        if (bundle == null) {
            return null;
        }
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        charlie.putAll(bundle);
        return charlie;
    }

    public final P bravo() {
        if (this.india) {
            if (this.kilo.delta != ab.alpha) {
                return ((NavBackStackEntryImpl$SavedStateViewModel) U8.a.foxtrot(this.alpha, (a0) this.november.getValue(), 4).alpha(u.alpha.bravo(NavBackStackEntryImpl$SavedStateViewModel.class))).alpha;
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public final void charlie() {
        if (!this.india) {
            C2195e c2195e = this.hotel;
            c2195e.alpha();
            this.india = true;
            if (this.echo != null) {
                T.charlie(this.alpha);
            }
            c2195e.bravo(this.golf);
        }
        int ordinal = this.delta.ordinal();
        int ordinal2 = this.lima.ordinal();
        an anVar = this.kilo;
        if (ordinal < ordinal2) {
            anVar.hotel(this.delta);
        } else {
            anVar.hotel(this.lima);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u.alpha.bravo(this.alpha.getClass()).kilo());
        sb2.append("(" + this.foxtrot + ')');
        sb2.append(" destination=");
        sb2.append(this.bravo);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
