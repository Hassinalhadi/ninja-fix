package w9;

import androidx.lifecycle.P;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class r implements ViewModelComponentBuilder {
    public final p alpha;
    public P bravo;
    public ViewModelLifecycle charlie;

    public r(p pVar, l lVar) {
        this.alpha = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w9.s, java.lang.Object, dagger.hilt.android.components.ViewModelComponent] */
    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponent build() {
        AbstractC2763s0.bravo(P.class, this.bravo);
        AbstractC2763s0.bravo(ViewModelLifecycle.class, this.charlie);
        ?? obj = new Object();
        p pVar = this.alpha;
        obj.alpha = new o(pVar, 0, 1);
        obj.bravo = new o(pVar, 1, 1);
        obj.charlie = new o(pVar, 2, 1);
        obj.delta = new o(pVar, 3, 1);
        obj.echo = new o(pVar, 4, 1);
        obj.foxtrot = new o(pVar, 5, 1);
        obj.golf = new o(pVar, 6, 1);
        obj.hotel = new o(pVar, 7, 1);
        obj.india = new o(pVar, 8, 1);
        obj.juliet = new o(pVar, 9, 1);
        obj.kilo = new o(pVar, 10, 1);
        obj.lima = new o(pVar, 11, 1);
        obj.mike = new o(pVar, 12, 1);
        obj.november = new o(pVar, 13, 1);
        obj.oscar = new o(pVar, 14, 1);
        obj.papa = new o(pVar, 15, 1);
        obj.quebec = new o(pVar, 16, 1);
        obj.romeo = new o(pVar, 17, 1);
        obj.sierra = new o(pVar, 18, 1);
        obj.tango = new o(pVar, 19, 1);
        obj.uniform = new o(pVar, 20, 1);
        obj.victor = new o(pVar, 21, 1);
        obj.whiskey = new o(pVar, 22, 1);
        obj.xray = new o(pVar, 23, 1);
        obj.yankee = new o(pVar, 24, 1);
        obj.zulu = new o(pVar, 25, 1);
        obj.amber = new o(pVar, 26, 1);
        obj.azure = new o(pVar, 27, 1);
        obj.beige = new o(pVar, 28, 1);
        obj.black = new o(pVar, 29, 1);
        obj.blue = new o(pVar, 30, 1);
        obj.bronze = new o(pVar, 31, 1);
        obj.coral = new o(pVar, 32, 1);
        obj.crimson = new o(pVar, 33, 1);
        obj.cyan = new o(pVar, 34, 1);
        return obj;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder savedStateHandle(P p4) {
        p4.getClass();
        this.bravo = p4;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
        viewModelLifecycle.getClass();
        this.charlie = viewModelLifecycle;
        return this;
    }
}
