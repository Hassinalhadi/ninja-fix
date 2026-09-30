package androidx.compose.runtime;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0584p extends AbstractC0587t {
    public final long alpha;
    public final boolean bravo;
    public final boolean charlie;
    public HashSet delta;
    public final LinkedHashSet echo = new LinkedHashSet();
    public final ax foxtrot = new t0(P.i.silver, as.silver);
    public final /* synthetic */ C0585q golf;

    public C0584p(C0585q c0585q, long j5, boolean z2, boolean z10, O7.j jVar) {
        this.golf = c0585q;
        this.alpha = j5;
        this.bravo = z2;
        this.charlie = z10;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void alpha(C0590w c0590w, Xd.l lVar) {
        this.golf.bravo.alpha(c0590w, lVar);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final bv.am bravo(C0590w c0590w, com.google.firebase.messaging.l lVar, Xd.l lVar2) {
        return this.golf.bravo.bravo(c0590w, lVar, lVar2);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void charlie() {
        C0585q c0585q = this.golf;
        c0585q.amber--;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean delta() {
        return this.golf.bravo.delta();
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean echo() {
        return this.bravo;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean foxtrot() {
        return this.charlie;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final long golf() {
        return this.alpha;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final InterfaceC0586s hotel() {
        return this.golf.hotel;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final I india() {
        return (I) ((t0) this.foxtrot).getValue();
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final Nd.h juliet() {
        return this.golf.bravo.juliet();
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void kilo(C0590w c0590w) {
        C0585q c0585q = this.golf;
        c0585q.bravo.kilo(c0585q.hotel);
        c0585q.bravo.kilo(c0590w);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final au lima(av avVar) {
        return this.golf.bravo.lima(avVar);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final bv.am mike(C0590w c0590w, com.google.firebase.messaging.l lVar, bv.am amVar) {
        return this.golf.bravo.mike(c0590w, lVar, amVar);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void november(Set set) {
        HashSet hashSet = this.delta;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.delta = hashSet;
        }
        hashSet.add(set);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void oscar(C0585q c0585q) {
        this.echo.add(c0585q);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void papa(Q q4) {
        this.golf.bravo.papa(q4);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void quebec(C0590w c0590w) {
        this.golf.bravo.quebec(c0590w);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void romeo() {
        this.golf.amber++;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void sierra(InterfaceC0581m interfaceC0581m) {
        HashSet hashSet = this.delta;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                Intrinsics.charlie(interfaceC0581m, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((C0585q) interfaceC0581m).charlie);
            }
        }
        kotlin.jvm.internal.x.alpha(this.echo).remove(interfaceC0581m);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void tango(C0590w c0590w) {
        this.golf.bravo.tango(c0590w);
    }

    public final void uniform() {
        LinkedHashSet<C0585q> linkedHashSet = this.echo;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.delta;
            if (hashSet != null) {
                for (C0585q c0585q : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c0585q.charlie);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
