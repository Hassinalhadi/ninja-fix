package Ic;

import Cb.l;
import Cb.m;
import D0.y;
import Jb.C0206n;
import i.C1860i;
import i.InterfaceC1869r;
import j.C1922e;
import j.C1923f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ a(List list, Function1 function1, int i4) {
        this.alpha = i4;
        this.purple = list;
        this.red = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                C1923f LazyVerticalGrid = (C1923f) obj;
                Intrinsics.echo(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list = this.purple;
                LazyVerticalGrid.charlie.alpha(list.size(), new C1922e(C1923f.delta, new m(2, list), new P.d(new d(list, this.red, 0), -1117249557, true)));
                return Unit.INSTANCE;
            case 1:
                InterfaceC1869r LazyColumn = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                y yVar = new y(23);
                List list2 = this.purple;
                ((C1860i) LazyColumn).quebec(list2.size(), new l(4, yVar, list2), new m(4, list2), new P.d(new d(list2, this.red, 1), 2039820996, true));
                return Unit.INSTANCE;
            default:
                InterfaceC1869r LazyColumn2 = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyColumn2, "$this$LazyColumn");
                List list3 = this.purple;
                ((C1860i) LazyColumn2).quebec(list3.size(), null, new m(6, list3), new P.d(new C0206n(list3, this.red, list3), 2039820996, true));
                return Unit.INSTANCE;
        }
    }
}
