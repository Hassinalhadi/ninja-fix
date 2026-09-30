package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile J3.q f3564a;
    public final List alpha;

    /* renamed from: b, reason: collision with root package name */
    public File f3565b;
    public final f purple;
    public final d red;
    public int silver = -1;
    public E3.f teal;
    public List white;
    public int yellow;

    public b(List list, f fVar, d dVar) {
        this.alpha = list;
        this.purple = fVar;
        this.red = dVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void bravo(Exception exc) {
        this.red.alpha(this.teal, exc, this.f3564a.charlie, E3.a.red);
    }

    @Override // com.bumptech.glide.load.engine.e
    public final void cancel() {
        J3.q qVar = this.f3564a;
        if (qVar != null) {
            qVar.charlie.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.e
    public final boolean charlie() {
        while (true) {
            List list = this.white;
            boolean z2 = false;
            if (list != null && this.yellow < list.size()) {
                this.f3564a = null;
                while (!z2 && this.yellow < this.white.size()) {
                    List list2 = this.white;
                    int i4 = this.yellow;
                    this.yellow = i4 + 1;
                    J3.r rVar = (J3.r) list2.get(i4);
                    File file = this.f3565b;
                    f fVar = this.purple;
                    this.f3564a = rVar.alpha(file, fVar.echo, fVar.foxtrot, fVar.india);
                    if (this.f3564a != null && this.purple.charlie(this.f3564a.charlie.alpha()) != null) {
                        this.f3564a.charlie.delta(this.purple.oscar, this);
                        z2 = true;
                    }
                }
                return z2;
            }
            int i5 = this.silver + 1;
            this.silver = i5;
            if (i5 >= this.alpha.size()) {
                return false;
            }
            E3.f fVar2 = (E3.f) this.alpha.get(this.silver);
            f fVar3 = this.purple;
            File delta = fVar3.hotel.alpha().delta(new c(fVar2, fVar3.november));
            this.f3565b = delta;
            if (delta != null) {
                this.teal = fVar2;
                this.white = this.purple.charlie.bravo().golf(delta);
                this.yellow = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void echo(Object obj) {
        this.red.bravo(this.teal, obj, this.f3564a.charlie, E3.a.red, this.teal);
    }
}
