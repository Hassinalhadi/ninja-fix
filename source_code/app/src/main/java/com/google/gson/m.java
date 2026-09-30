package com.google.gson;

import androidx.appcompat.widget.P0;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m {
    public Excluder alpha = Excluder.DEFAULT;
    public final int bravo = 1;
    public i charlie = i.alpha;
    public final HashMap delta = new HashMap();
    public final ArrayList echo = new ArrayList();
    public final ArrayList foxtrot = new ArrayList();
    public final int golf;
    public final int hotel;
    public final boolean india;
    public final k juliet;
    public final boolean kilo;
    public final w lima;
    public final x mike;
    public final ArrayDeque november;

    public m() {
        k kVar = l.hotel;
        this.golf = 2;
        this.hotel = 2;
        this.india = true;
        this.juliet = l.hotel;
        this.kilo = true;
        this.lima = l.juliet;
        this.mike = l.kilo;
        this.november = new ArrayDeque();
    }

    public final l alpha() {
        ae aeVar;
        ae aeVar2;
        ArrayList arrayList = this.echo;
        int size = arrayList.size();
        ArrayList arrayList2 = this.foxtrot;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z2 = com.google.gson.internal.sql.b.alpha;
        com.google.gson.internal.bind.a aVar = com.google.gson.internal.bind.b.bravo;
        int i4 = this.golf;
        int i5 = this.hotel;
        if (i4 != 2 || i5 != 2) {
            ae alpha = aVar.alpha(i4, i5);
            if (z2) {
                aeVar = com.google.gson.internal.sql.b.charlie.alpha(i4, i5);
                aeVar2 = com.google.gson.internal.sql.b.bravo.alpha(i4, i5);
            } else {
                aeVar = null;
                aeVar2 = null;
            }
            arrayList3.add(alpha);
            if (z2) {
                arrayList3.add(aeVar);
                arrayList3.add(aeVar2);
            }
        }
        Excluder excluder = this.alpha;
        i iVar = this.charlie;
        HashMap hashMap = new HashMap(this.delta);
        int i10 = this.bravo;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new l(excluder, iVar, hashMap, this.india, this.juliet, this.kilo, i10, arrayList3, this.lima, this.mike, new ArrayList(this.november));
    }

    public final void bravo(Class cls, Object obj) {
        boolean z2;
        boolean z10 = obj instanceof v;
        if (!z10 && !(obj instanceof p) && !(obj instanceof ad)) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.google.gson.internal.f.bravo(z2);
        if (cls != Object.class) {
            ArrayList arrayList = this.echo;
            if (z10 || (obj instanceof p)) {
                arrayList.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get((Type) cls), obj));
            }
            if (obj instanceof ad) {
                arrayList.add(com.google.gson.internal.bind.l.alpha(TypeToken.get((Type) cls), (ad) obj));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(P0.blue(cls, "Cannot override built-in adapter for "));
    }
}
