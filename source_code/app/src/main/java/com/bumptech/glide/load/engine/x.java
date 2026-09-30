package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x implements e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile J3.q f3604a;
    public final i alpha;

    /* renamed from: b, reason: collision with root package name */
    public File f3605b;

    /* renamed from: c, reason: collision with root package name */
    public y f3606c;
    public final f purple;
    public int red;
    public int silver = -1;
    public E3.f teal;
    public List white;
    public int yellow;

    public x(f fVar, i iVar) {
        this.purple = fVar;
        this.alpha = iVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void bravo(Exception exc) {
        this.alpha.alpha(this.f3606c, exc, this.f3604a.charlie, E3.a.silver);
    }

    @Override // com.bumptech.glide.load.engine.e
    public final void cancel() {
        J3.q qVar = this.f3604a;
        if (qVar != null) {
            qVar.charlie.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.e
    public final boolean charlie() {
        List list;
        ArrayList alpha = this.purple.alpha();
        boolean z2 = false;
        if (!alpha.isEmpty()) {
            f fVar = this.purple;
            com.bumptech.glide.h bravo = fVar.charlie.bravo();
            Class<?> cls = fVar.delta.getClass();
            Class cls2 = fVar.golf;
            Class cls3 = fVar.kilo;
            J2.l lVar = bravo.hotel;
            Y3.j jVar = (Y3.j) ((AtomicReference) lVar.alpha).getAndSet(null);
            if (jVar == null) {
                jVar = new Y3.j(cls, cls2, cls3);
            } else {
                jVar.alpha = cls;
                jVar.bravo = cls2;
                jVar.charlie = cls3;
            }
            synchronized (((bv.e) lVar.purple)) {
                list = (List) ((bv.e) lVar.purple).get(jVar);
            }
            ((AtomicReference) lVar.alpha).set(jVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = bravo.alpha.alpha(cls).iterator();
                while (it.hasNext()) {
                    Iterator it2 = bravo.charlie.xray((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!bravo.foxtrot.echo(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                bravo.hotel.oscar(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.white;
                    if (list3 != null && this.yellow < list3.size()) {
                        this.f3604a = null;
                        while (!z2 && this.yellow < this.white.size()) {
                            List list4 = this.white;
                            int i4 = this.yellow;
                            this.yellow = i4 + 1;
                            J3.r rVar = (J3.r) list4.get(i4);
                            File file = this.f3605b;
                            f fVar2 = this.purple;
                            this.f3604a = rVar.alpha(file, fVar2.echo, fVar2.foxtrot, fVar2.india);
                            if (this.f3604a != null && this.purple.charlie(this.f3604a.charlie.alpha()) != null) {
                                this.f3604a.charlie.delta(this.purple.oscar, this);
                                z2 = true;
                            }
                        }
                        return z2;
                    }
                    int i5 = this.silver + 1;
                    this.silver = i5;
                    if (i5 >= list2.size()) {
                        int i10 = this.red + 1;
                        this.red = i10;
                        if (i10 >= alpha.size()) {
                            break;
                        }
                        this.silver = 0;
                    }
                    E3.f fVar3 = (E3.f) alpha.get(this.red);
                    Class cls5 = (Class) list2.get(this.silver);
                    E3.m echo = this.purple.echo(cls5);
                    f fVar4 = this.purple;
                    this.f3606c = new y(fVar4.charlie.alpha, fVar3, fVar4.november, fVar4.echo, fVar4.foxtrot, echo, cls5, fVar4.india);
                    File delta = fVar4.hotel.alpha().delta(this.f3606c);
                    this.f3605b = delta;
                    if (delta != null) {
                        this.teal = fVar3;
                        this.white = this.purple.charlie.bravo().golf(delta);
                        this.yellow = 0;
                    }
                }
            } else if (!File.class.equals(this.purple.kilo)) {
                throw new IllegalStateException("Failed to find any load path from " + this.purple.delta.getClass() + " to " + this.purple.kilo);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void echo(Object obj) {
        this.alpha.bravo(this.teal, obj, this.f3604a.charlie, E3.a.silver, this.f3606c);
    }
}
