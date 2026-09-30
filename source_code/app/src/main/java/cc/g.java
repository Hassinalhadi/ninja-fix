package cc;

import Cb.u;
import D0.an;
import Ec.aa;
import Ec.af;
import Ec.au;
import Ec.aw;
import F.G2;
import F.K1;
import H0.v;
import Lb.ai;
import a0.C0366t;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import ao.ad;
import b.c0;
import bz.AbstractC0782g;
import bz.h0;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Attachment;
import com.app.network.network.models.LocalVote;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import i.AbstractC1876y;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1869r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.E7;
import s6.J4;
import t0.AbstractC2901T;
import t6.AbstractC3033o;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.M3;
import t6.S3;
import z.ak;

/* loaded from: classes2.dex */
public abstract class g {
    public static final P.d alpha = new P.d(new Gb.b(2), 926072163, false);

    public static final void alpha(AddressNoteListItem note, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        T.p pVar2;
        boolean z10;
        T.s bravo;
        boolean z11;
        int i10 = 3;
        Intrinsics.echo(note, "note");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1286465154);
        if (c0585q2.india(note)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4 | 48;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i11 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            Object[] objArr = {Integer.valueOf(note.getId())};
            Object jade = c0585q2.jade();
            Object obj = C0580l.alpha;
            if (jade == obj) {
                jade = new c0(i10);
                c0585q2.f(jade);
            }
            ax axVar = (ax) R.l.echo(objArr, (Function0) jade, c0585q2, 48);
            boolean echo = c0585q2.echo(note.getId());
            Object jade2 = c0585q2.jade();
            if (echo || jade2 == obj) {
                jade2 = C0564b.whiskey(0);
                c0585q2.f(jade2);
            }
            p0 p0Var = (p0) jade2;
            an anVar = new an(Db.c.lime, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BAD_REQUEST), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, AbstractC2636d7.charlie(22), 0, 16646104);
            Q0.d dVar = (Q0.d) c0585q2.kilo(AbstractC2901T.hotel);
            float gold = dVar.gold(dVar.teal(anVar.bravo.charlie) * 3.4f);
            if (p0Var.juliet() > 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            T.s charlie = V.charlie(pVar3, 1.0f);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j5 = c0585q2.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q2);
            InterfaceC2552l.maroon.getClass();
            Function0 function0 = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(function0);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q2, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie2);
            String description = note.getDescription();
            if (description == null) {
                description = "";
            }
            T.s charlie3 = V.charlie(pVar3, 1.0f);
            if (((Boolean) axVar.getValue()).booleanValue()) {
                bravo = pVar3;
            } else {
                bravo = AbstractC3087z.bravo(V.golf(pVar3, 0.0f, gold, 1));
            }
            T.s then = charlie3.then(bravo);
            boolean golf = c0585q2.golf(p0Var);
            Object jade3 = c0585q2.jade();
            if (golf || jade3 == obj) {
                jade3 = new au(p0Var, 1);
                c0585q2.f(jade3);
            }
            String str = description;
            pVar2 = pVar3;
            boolean z12 = z10;
            ak.bravo(str, then, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, (Function1) jade3, anVar, c0585q2, 0, 0, 32764);
            c0585q = c0585q2;
            if (z12) {
                c0585q.purple(1334616632);
                boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
                boolean golf2 = c0585q.golf(axVar);
                Object jade4 = c0585q.jade();
                if (golf2 || jade4 == obj) {
                    jade4 = new u(axVar, 12);
                    c0585q.f(jade4);
                }
                z11 = false;
                echo(0, null, c0585q, (Function0) jade4, booleanValue);
            } else {
                z11 = false;
                c0585q.purple(1330614346);
            }
            c0585q.quebec(z11);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 24, note, pVar2);
        }
    }

    public static final void bravo(AddressNoteListItem note, Function1 onNoteShown, Xd.m onVote, Function0 onAllCardsRemoved, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        Intrinsics.echo(note, "note");
        Intrinsics.echo(onNoteShown, "onNoteShown");
        Intrinsics.echo(onVote, "onVote");
        Intrinsics.echo(onAllCardsRemoved, "onAllCardsRemoved");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(384421766);
        if (c0585q.india(note)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.india(onNoteShown)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(onVote)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.golf(sVar)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i16 = i15 | i12;
        boolean z10 = true;
        if ((i16 & 8339) != 8338) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            Integer valueOf = Integer.valueOf(note.getId());
            if ((i16 & 112) != 32) {
                z10 = false;
            }
            boolean india = c0585q.india(note) | z10;
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new C0844a(onNoteShown, note, null);
                c0585q.f(jade);
            }
            C0564b.foxtrot((Xd.l) jade, c0585q, valueOf);
            float f5 = 4;
            float f10 = 8;
            K1.charlie(AbstractC0538d.victor(sVar, f5, f10, f5, f10), AbstractC2094g.bravo(14), K1.lima(C0366t.echo, c0585q, 6), K1.mike(6, 62), null, P.e.echo(1890018808, new af(6, note, onVote), c0585q), c0585q, 196608, 16);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.e(note, onNoteShown, onVote, onAllCardsRemoved, sVar, i4);
        }
    }

    public static final void charlie(final List notes, final Function1 onNoteShown, final Xd.m onVote, final Function0 onAllCardsRemoved, final T.s sVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        boolean z2;
        C0585q c0585q;
        Intrinsics.echo(notes, "notes");
        Intrinsics.echo(onNoteShown, "onNoteShown");
        Intrinsics.echo(onVote, "onVote");
        Intrinsics.echo(onAllCardsRemoved, "onAllCardsRemoved");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2144606699);
        if (c0585q2.india(notes)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q2.india(onVote)) {
            i10 = 2048;
        } else {
            i10 = Barcode.FORMAT_UPC_E;
        }
        int i12 = i11 | i10;
        if ((74899 & i12) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i12 & 1, z2)) {
            if (notes.isEmpty()) {
                Q uniform = c0585q2.uniform();
                if (uniform != null) {
                    final int i13 = 0;
                    uniform.delta = new Xd.l(notes, onNoteShown, onVote, onAllCardsRemoved, sVar, i4, i13) { // from class: cc.b
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ List purple;
                        public final /* synthetic */ Function1 red;
                        public final /* synthetic */ Xd.m silver;
                        public final /* synthetic */ Function0 teal;
                        public final /* synthetic */ T.s white;

                        {
                            this.alpha = i13;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.alpha) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int cyan = C0564b.cyan(221617);
                                    Function0 function0 = this.teal;
                                    T.s sVar2 = this.white;
                                    g.charlie(this.purple, this.red, this.silver, function0, sVar2, (InterfaceC0581m) obj, cyan);
                                    return Unit.INSTANCE;
                                default:
                                    ((Integer) obj2).getClass();
                                    int cyan2 = C0564b.cyan(221617);
                                    Function0 function02 = this.teal;
                                    T.s sVar3 = this.white;
                                    g.charlie(this.purple, this.red, this.silver, function02, sVar3, (InterfaceC0581m) obj, cyan2);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            final C1874w alpha2 = AbstractC1876y.alpha(c0585q2);
            final float f5 = 4;
            final float f10 = 1;
            c0585q = c0585q2;
            AbstractC0538d.alpha(V.charlie(sVar, 1.0f), null, false, P.e.echo(-1539676673, new Xd.m() { // from class: cc.c
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z10;
                    final boolean z11;
                    float f11;
                    M bravo;
                    int i14;
                    C0552s BoxWithConstraints = (C0552s) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((intValue & 6) == 0) {
                        if (((C0585q) interfaceC0581m2).golf(BoxWithConstraints)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        intValue |= i14;
                    }
                    if ((intValue & 19) != 18) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z10)) {
                        float charlie = BoxWithConstraints.charlie();
                        final List list = notes;
                        if (list.size() > 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            f11 = 0.07f * charlie;
                        } else {
                            f11 = 0;
                        }
                        float f12 = f5;
                        float f13 = f10;
                        if (z11) {
                            charlie = ((Q0.g) J4.alpha(new Q0.g(((charlie - (2 * f12)) - f11) - f13), new Q0.g(0))).alpha;
                        }
                        final float f14 = charlie;
                        T.s charlie2 = V.charlie(T.p.alpha, 1.0f);
                        if (z11) {
                            bravo = AbstractC0538d.delta(f12, 0.0f, f12, 0.0f, 10);
                        } else {
                            bravo = AbstractC0538d.bravo(3, 0.0f, 0.0f);
                        }
                        C0537c c0537c = AbstractC0542h.alpha;
                        if (!z11) {
                            f13 = 0;
                        }
                        C0540f golf = AbstractC0542h.golf(f13);
                        boolean india = c0585q3.india(list);
                        final Function1 function1 = onNoteShown;
                        boolean golf2 = india | c0585q3.golf(function1);
                        final Xd.m mVar = onVote;
                        boolean golf3 = golf2 | c0585q3.golf(mVar);
                        final Function0 function0 = onAllCardsRemoved;
                        boolean golf4 = golf3 | c0585q3.golf(function0) | c0585q3.hotel(z11) | c0585q3.delta(f14);
                        Object jade = c0585q3.jade();
                        if (golf4 || jade == C0580l.alpha) {
                            Function1 function12 = new Function1() { // from class: cc.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC1869r LazyRow = (InterfaceC1869r) obj4;
                                    Intrinsics.echo(LazyRow, "$this$LazyRow");
                                    h0 h0Var = new h0(9);
                                    List list2 = list;
                                    C1860i c1860i = (C1860i) LazyRow;
                                    c1860i.quebec(list2.size(), new Cb.l(11, h0Var, list2), new Cb.m(8, list2), new P.d(new f(list2, function1, mVar, function0, z11, f14), 802480018, true));
                                    return Unit.INSTANCE;
                                }
                            };
                            c0585q3.f(function12);
                            jade = function12;
                        }
                        AbstractC2616b5.charlie(charlie2, alpha2, bravo, golf, null, null, false, null, (Function1) jade, c0585q3, 6, 488);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q2), c0585q, 3072, 6);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i14 = 1;
            uniform2.delta = new Xd.l(notes, onNoteShown, onVote, onAllCardsRemoved, sVar, i4, i14) { // from class: cc.b
                public final /* synthetic */ int alpha;
                public final /* synthetic */ List purple;
                public final /* synthetic */ Function1 red;
                public final /* synthetic */ Xd.m silver;
                public final /* synthetic */ Function0 teal;
                public final /* synthetic */ T.s white;

                {
                    this.alpha = i14;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.alpha) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(221617);
                            Function0 function0 = this.teal;
                            T.s sVar2 = this.white;
                            g.charlie(this.purple, this.red, this.silver, function0, sVar2, (InterfaceC0581m) obj, cyan);
                            return Unit.INSTANCE;
                        default:
                            ((Integer) obj2).getClass();
                            int cyan2 = C0564b.cyan(221617);
                            Function0 function02 = this.teal;
                            T.s sVar3 = this.white;
                            g.charlie(this.purple, this.red, this.silver, function02, sVar3, (InterfaceC0581m) obj, cyan2);
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static final void delta(Function0 onClick, T.s sVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(182097738);
        if (c0585q2.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i10 | i5;
        if (c0585q2.india(onClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i13 & 1, z2)) {
            c0585q = c0585q2;
            z.r.alpha(((i13 >> 6) & 14) | 24576, P.e.echo(-554895898, new F4.g(i4, 20), c0585q2), androidx.compose.foundation.a.bravo(V.kilo(sVar, 44), C0366t.bravo(0.4f, C0366t.bravo), AbstractC2094g.alpha), c0585q, onClick, false);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, sVar, onClick, i5, 14);
        }
    }

    public static final void echo(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, Function0 function0, boolean z2) {
        int i5;
        int i10;
        boolean z10;
        T.p pVar2;
        float f5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2085254904);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10 | 384;
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i12 & 1, z10)) {
            T.p pVar3 = T.p.alpha;
            if (z2) {
                f5 = 270.0f;
            } else {
                f5 = 90.0f;
            }
            D0 bravo = AbstractC0782g.bravo(f5, null, "address-chevron-rotation", c0585q, 3072, 22);
            T.s whiskey = AbstractC0538d.whiskey(V.charlie(pVar3, 1.0f), 0.0f, 6, 0.0f, 2, 5);
            T.k kVar = T.d.teal;
            ap delta = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(whiskey, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            AbstractC3033o.alpha(V.charlie(pVar3, 1.0f), 0.0f, c0585q, 6, 2);
            T.s echo = androidx.compose.foundation.a.echo(15, androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.kilo(pVar3, 28), AbstractC2094g.alpha), C0366t.bravo, ao.alpha), null, function0, false);
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j6 = c0585q.magenta;
            int i14 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(echo, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            z.s.alpha(AbstractC3076w3.charlie(R.drawable.chevron_right, c0585q, 6), null, t6.aa.bravo(V.kilo(pVar3, 18), ((Number) bravo.getValue()).floatValue()), C0366t.echo, c0585q, 3120, 0);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Uc.a(z2, function0, pVar2, i4, 1);
        }
    }

    public static final void foxtrot(AddressNoteListItem note, final Xd.m onVote, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        final AddressNoteListItem addressNoteListItem;
        T.p pVar2;
        boolean z10;
        C2549i c2549i;
        T.p pVar3;
        C2549i c2549i2;
        C2550j c2550j;
        C2549i c2549i3;
        T.j jVar;
        C0537c c0537c;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.echo(note, "note");
        Intrinsics.echo(onVote, "onVote");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1481674989);
        if (c0585q.india(note)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(onVote)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 384;
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            T.p pVar4 = T.p.alpha;
            LocalVote localVote = note.getLocalVote();
            if (localVote == null) {
                localVote = LocalVote.NONE;
            }
            if (note.getTotalNotes() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            T.s charlie = V.charlie(pVar4, 1.0f);
            T.j jVar2 = T.d.f2061d;
            C0537c c0537c2 = AbstractC0542h.alpha;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(c0537c2, jVar2, c0585q, 48);
            LocalVote localVote2 = localVote;
            long j5 = c0585q.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            boolean z15 = z10;
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i4 = C2551k.foxtrot;
            C0564b.blue(c2549i4, c0585q, alpha2);
            C2549i c2549i5 = C2551k.echo;
            C0564b.blue(c2549i5, c0585q, mike);
            C2549i c2549i6 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i6);
            }
            C2549i c2549i7 = C2551k.delta;
            C0564b.blue(c2549i7, c0585q, charlie2);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.echo, T.d.f2062f, c0585q, 6);
            long j6 = c0585q.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar4, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i4, c0585q, alpha3);
            C0564b.blue(c2549i5, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q, charlie3);
            if (z15) {
                c0585q.purple(-1065519240);
                pVar3 = pVar4;
                i11 = 32;
                c2549i = c2549i5;
                jVar = jVar2;
                c2549i3 = c2549i4;
                c2549i2 = c2549i6;
                c0537c = c0537c2;
                c2550j = c2550j2;
                ak.bravo(P0.azure(note.getNoteNumber(), note.getTotalNotes(), "(", "/", ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(AbstractC3071v3.alpha(c0585q, R.color.coolgray_800), AbstractC2636d7.charlie(13), new v(HttpConstants.HTTP_INTERNAL_ERROR), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                c0585q = c0585q;
                AbstractC0538d.echo(V.echo(pVar3, 6), c0585q);
                z11 = false;
                juliet(note.getTotalNotes(), J4.delta(note.getNoteNumber() - 1, 0, note.getTotalNotes() - 1), null, c0585q, 0);
            } else {
                c2549i = c2549i5;
                pVar3 = pVar4;
                c2549i2 = c2549i6;
                c2550j = c2550j2;
                c2549i3 = c2549i4;
                jVar = jVar2;
                c0537c = c0537c2;
                i11 = 32;
                z11 = false;
                c0585q.purple(-1067728517);
            }
            c0585q.quebec(z11);
            c0585q.quebec(true);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            AbstractC0538d.echo(new LayoutWeightElement(1.0f, true), c0585q);
            int i16 = k.$EnumSwitchMapping$0[localVote2.ordinal()];
            if (i16 != 1) {
                if (i16 != 2 && i16 != 3) {
                    throw ad.black(c0585q, -461626147, false);
                }
                c0585q.purple(-1424761319);
                kilo(localVote2, null, c0585q, 0);
                c0585q.quebec(false);
                z14 = true;
                addressNoteListItem = note;
            } else {
                c0585q.purple(-1425469855);
                S alpha4 = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 48);
                long j7 = c0585q.magenta;
                int i17 = (int) (j7 ^ (j7 >>> i11));
                I mike3 = c0585q.mike();
                T.s charlie4 = T.a.charlie(pVar3, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i3, c0585q, alpha4);
                C0564b.blue(c2549i, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                    ad.blue(i17, c0585q, i17, c2549i2);
                }
                C0564b.blue(c2549i7, c0585q, charlie4);
                long j10 = C0366t.bravo;
                int i18 = i13 & 112;
                if (i18 == i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                addressNoteListItem = note;
                boolean india = z12 | c0585q.india(addressNoteListItem);
                Object jade = c0585q.jade();
                as asVar = C0580l.alpha;
                if (india || jade == asVar) {
                    final int i19 = 0;
                    jade = new Function0() { // from class: cc.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    AddressNoteListItem addressNoteListItem2 = addressNoteListItem;
                                    onVote.invoke(Integer.valueOf(addressNoteListItem2.getId()), Boolean.FALSE, addressNoteListItem2.getOwnerType());
                                    return Unit.INSTANCE;
                                default:
                                    AddressNoteListItem addressNoteListItem3 = addressNoteListItem;
                                    onVote.invoke(Integer.valueOf(addressNoteListItem3.getId()), Boolean.TRUE, addressNoteListItem3.getOwnerType());
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    c0585q.f(jade);
                }
                lima(R.drawable.thumb_down_fill, j10, (Function0) jade, c0585q, 54);
                AbstractC0538d.echo(V.oscar(pVar3, 8), c0585q);
                long alpha5 = AbstractC3071v3.alpha(c0585q, R.color.green_500);
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean india2 = c0585q.india(addressNoteListItem) | z13;
                Object jade2 = c0585q.jade();
                if (!india2 && jade2 != asVar) {
                    z14 = true;
                } else {
                    z14 = true;
                    final char c3 = 1 == true ? 1 : 0;
                    jade2 = new Function0() { // from class: cc.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (c3) {
                                case 0:
                                    AddressNoteListItem addressNoteListItem2 = addressNoteListItem;
                                    onVote.invoke(Integer.valueOf(addressNoteListItem2.getId()), Boolean.FALSE, addressNoteListItem2.getOwnerType());
                                    return Unit.INSTANCE;
                                default:
                                    AddressNoteListItem addressNoteListItem3 = addressNoteListItem;
                                    onVote.invoke(Integer.valueOf(addressNoteListItem3.getId()), Boolean.TRUE, addressNoteListItem3.getOwnerType());
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    c0585q.f(jade2);
                }
                lima(R.drawable.vector, alpha5, (Function0) jade2, c0585q, 6);
                c0585q.quebec(z14);
                c0585q.quebec(false);
            }
            c0585q.quebec(z14);
            pVar2 = pVar3;
        } else {
            addressNoteListItem = note;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(addressNoteListItem, onVote, pVar2, i4, 8);
        }
    }

    public static final void golf(List list, int i4, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        boolean z10 = true;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1242682501);
        if (c0585q.india(list)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i5;
        if (c0585q.echo(i4)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (c0585q.india(onDismiss)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            Object[] objArr = {list, Integer.valueOf(i4)};
            if ((i15 & 112) != 32) {
                z10 = false;
            }
            boolean india = z10 | c0585q.india(list);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new aw(i4, list, 2);
                c0585q.f(jade);
            }
            E7.alpha(onDismiss, null, P.e.echo(-1983947580, new Cb.a(25, list, (p0) R.l.echo(objArr, (Function0) jade, c0585q, 0)), c0585q), c0585q, ((i15 >> 6) & 14) | 384, 2);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(list, i4, onDismiss, i5, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0209, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13.jade(), java.lang.Integer.valueOf(r14)) == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hotel(AddressNoteListItem note, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        boolean z12;
        Function0 function0;
        T.p pVar;
        List list;
        Object obj;
        int i10;
        ax axVar;
        C0585q c0585q2;
        Object obj2;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11 = 4;
        Intrinsics.echo(note, "note");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(1458715595);
        if (c0585q3.india(note)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q3.magenta(i12 & 1, z2)) {
            boolean echo = c0585q3.echo(note.getId()) | c0585q3.golf(note.getAttachments());
            Object jade = c0585q3.jade();
            Object obj3 = C0580l.alpha;
            if (echo || jade == obj3) {
                List<Attachment> attachments = note.getAttachments();
                if (attachments == null) {
                    attachments = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = attachments.iterator();
                while (it.hasNext()) {
                    String fileUrl = ((Attachment) it.next()).getFileUrl();
                    if (fileUrl != null) {
                        arrayList.add(fileUrl);
                    }
                }
                jade = CollectionsKt.coral(arrayList);
                c0585q3.f(jade);
            }
            List list2 = (List) jade;
            boolean echo2 = c0585q3.echo(note.getId());
            Object jade2 = c0585q3.jade();
            if (echo2 || jade2 == obj3) {
                jade2 = C0564b.zulu(kotlin.collections.u.alpha);
                c0585q3.f(jade2);
            }
            ax axVar2 = (ax) jade2;
            boolean golf = c0585q3.golf((Set) axVar2.getValue()) | c0585q3.golf(list2);
            Object jade3 = c0585q3.jade();
            Object obj4 = jade3;
            if (golf || jade3 == obj3) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (!((Set) axVar2.getValue()).contains((String) obj5)) {
                        arrayList2.add(obj5);
                    }
                }
                c0585q3.f(arrayList2);
                obj4 = arrayList2;
            }
            List list3 = (List) obj4;
            Object[] objArr = {Integer.valueOf(note.getId())};
            Object jade4 = c0585q3.jade();
            if (jade4 == obj3) {
                jade4 = new c0(i11);
                c0585q3.f(jade4);
            }
            p0 p0Var = (p0) R.l.echo(objArr, (Function0) jade4, c0585q3, 48);
            boolean echo3 = c0585q3.echo(note.getId());
            Object jade5 = c0585q3.jade();
            if (echo3 || jade5 == obj3) {
                jade5 = C0564b.zulu(Boolean.FALSE);
                c0585q3.f(jade5);
            }
            ax axVar3 = (ax) jade5;
            Integer valueOf = Integer.valueOf(note.getId());
            boolean golf2 = c0585q3.golf(p0Var) | c0585q3.golf(axVar3) | c0585q3.golf(axVar2);
            Object jade6 = c0585q3.jade();
            if (golf2 || jade6 == obj3) {
                jade6 = new l(p0Var, axVar3, axVar2, null);
                c0585q3.f(jade6);
            }
            C0564b.foxtrot((Xd.l) jade6, c0585q3, valueOf);
            Integer valueOf2 = Integer.valueOf(list3.size());
            boolean india = c0585q3.india(list3) | c0585q3.golf(p0Var) | c0585q3.golf(axVar3);
            Object jade7 = c0585q3.jade();
            if (india || jade7 == obj3) {
                jade7 = new m(list3, p0Var, axVar3, null);
                c0585q3.f(jade7);
            }
            C0564b.foxtrot((Xd.l) jade7, c0585q3, valueOf2);
            boolean isEmpty = list3.isEmpty();
            int juliet = p0Var.juliet();
            int ivory = CollectionsKt.ivory(list3);
            if (ivory < 0) {
                ivory = 0;
            }
            int delta = J4.delta(juliet, 0, ivory);
            if (list3.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && delta > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && delta < CollectionsKt.ivory(list3)) {
                z12 = true;
            } else {
                z12 = false;
            }
            T.p pVar2 = T.p.alpha;
            T.s alpha2 = AbstractC3087z.alpha(V.echo(V.charlie(pVar2, 1.0f), 289), AbstractC2094g.bravo(16));
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q3.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q3.mike();
            T.s charlie = T.a.charlie(alpha2, c0585q3);
            InterfaceC2552l.maroon.getClass();
            Function0 function02 = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(function02);
            } else {
                c0585q3.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q3, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q3, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q3.lime) {
                function0 = function02;
            } else {
                function0 = function02;
            }
            ad.blue(i13, c0585q3, i13, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q3, charlie);
            C0551q c0551q = C0551q.alpha;
            if (!isEmpty) {
                c0585q3.purple(1450686647);
                String str = (String) list3.get(delta);
                FillElement fillElement = V.charlie;
                boolean golf3 = c0585q3.golf(axVar3);
                Object jade8 = c0585q3.jade();
                if (golf3 || jade8 == obj3) {
                    jade8 = new u(axVar3, 13);
                    c0585q3.f(jade8);
                }
                pVar = pVar2;
                N2.p.echo(str, androidx.compose.foundation.a.echo(15, fillElement, null, (Function0) jade8, false), alpha, P.e.echo(707966061, new a5.j(1, str, axVar2), c0585q3), null, c0585q3, 1597488, 128936);
                c0585q3.quebec(false);
                obj = obj3;
                axVar = axVar3;
                i10 = delta;
                list = list3;
                c0585q2 = c0585q3;
            } else {
                pVar = pVar2;
                c0585q3.purple(1451398004);
                FillElement fillElement2 = V.charlie;
                list = list3;
                obj = obj3;
                Function0 function03 = function0;
                i10 = delta;
                axVar = axVar3;
                N2.p.echo(Integer.valueOf(R.drawable.no_preview), fillElement2, null, null, null, c0585q3, 438, 129016);
                T.s bravo = androidx.compose.foundation.a.bravo(fillElement2, ao.delta(4294111986L), ao.alpha);
                ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                long j6 = c0585q3.magenta;
                int i14 = (int) (j6 ^ (j6 >>> 32));
                I mike2 = c0585q3.mike();
                T.s charlie2 = T.a.charlie(bravo, c0585q3);
                c0585q3.white();
                if (c0585q3.lime) {
                    c0585q3.lima(function03);
                } else {
                    c0585q3.i();
                }
                C0564b.blue(c2549i, c0585q3, delta3);
                C0564b.blue(c2549i2, c0585q3, mike2);
                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i14))) {
                    ad.blue(i14, c0585q3, i14, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q3, charlie2);
                G2.bravo(AbstractC3086y3.bravo(c0585q3, R.string.no_image_available), null, ao.delta(4288585374L), AbstractC2636d7.charlie(16), v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 200064, 0, 131026);
                C0585q c0585q4 = c0585q3;
                c0585q4.quebec(true);
                c0585q4.quebec(false);
                c0585q2 = c0585q4;
            }
            if (!isEmpty && z11) {
                c0585q2.purple(1452159984);
                T.s whiskey = AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.silver), 12, 0.0f, 0.0f, 0.0f, 14);
                boolean golf4 = c0585q2.golf(p0Var);
                Object jade9 = c0585q2.jade();
                obj2 = obj;
                if (golf4 || jade9 == obj2) {
                    jade9 = new e(p0Var, 2);
                    c0585q2.f(jade9);
                }
                delta((Function0) jade9, whiskey, c0585q2, R.drawable.ic_chevron_left, 6);
                z13 = false;
            } else {
                obj2 = obj;
                z13 = false;
                c0585q2.purple(1448091389);
            }
            c0585q2.quebec(z13);
            if (!isEmpty && z12) {
                c0585q2.purple(1452496086);
                T.s whiskey2 = AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.white), 0.0f, 0.0f, 12, 0.0f, 11);
                boolean golf5 = c0585q2.golf(p0Var);
                Object jade10 = c0585q2.jade();
                if (golf5 || jade10 == obj2) {
                    jade10 = new e(p0Var, 3);
                    c0585q2.f(jade10);
                }
                delta((Function0) jade10, whiskey2, c0585q2, R.drawable.chevron_right, 6);
                z14 = false;
            } else {
                z14 = false;
                c0585q2.purple(1448091389);
            }
            c0585q2.quebec(z14);
            c0585q2.quebec(true);
            if (!isEmpty && ((Boolean) axVar.getValue()).booleanValue()) {
                c0585q2.purple(120824779);
                ax axVar4 = axVar;
                boolean golf6 = c0585q2.golf(axVar4);
                Object jade11 = c0585q2.jade();
                if (golf6 || jade11 == obj2) {
                    jade11 = new u(axVar4, 14);
                    c0585q2.f(jade11);
                }
                z15 = false;
                golf(list, i10, (Function0) jade11, c0585q2, 0);
            } else {
                z15 = false;
                c0585q2.purple(116090583);
            }
            c0585q2.quebec(z15);
            c0585q = c0585q2;
        } else {
            c0585q3.ochre();
            c0585q = c0585q3;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new bz.af(note, i4, 1);
        }
    }

    public static final void india(p0 p0Var, int i4) {
        p0Var.kilo(i4);
    }

    public static final void juliet(int i4, int i5, T.s sVar, InterfaceC0581m interfaceC0581m, int i10) {
        int i11;
        int i12;
        boolean z2;
        boolean z10;
        int i13;
        long j5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1402957800);
        if (c0585q.echo(i4)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i11 | i10;
        if (c0585q.echo(i5)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i15 = i14 | i12 | 384;
        if ((i15 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            sVar = T.p.alpha;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q, 54);
            long j6 = c0585q.magenta;
            int i16 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q, i16, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            c0585q.purple(468888706);
            for (int i17 = 0; i17 < i4; i17++) {
                if (i17 == i5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i13 = 7;
                } else {
                    i13 = 6;
                }
                T.s alpha3 = AbstractC3087z.alpha(V.kilo(sVar, i13), AbstractC2094g.alpha);
                if (z10) {
                    j5 = 4281019179L;
                } else {
                    j5 = 4292006610L;
                }
                AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(alpha3, ao.delta(j5), ao.alpha), c0585q, 0);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ai(i4, i5, sVar, i10);
        }
    }

    public static final void kilo(final LocalVote localVote, T.s sVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final int i10;
        final T.s sVar2;
        q qVar;
        final int i11 = 0;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-588771588);
        if (c0585q.echo(localVote.ordinal())) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4 | 48;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            final T.p pVar = T.p.alpha;
            int i13 = s.$EnumSwitchMapping$0[localVote.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        c0585q.purple(552904128);
                        c0585q.quebec(false);
                        Q uniform = c0585q.uniform();
                        if (uniform != null) {
                            uniform.delta = new Xd.l(localVote, pVar, i4, i11) { // from class: cc.r
                                public final /* synthetic */ int alpha;
                                public final /* synthetic */ LocalVote purple;
                                public final /* synthetic */ T.s red;

                                {
                                    this.alpha = i11;
                                }

                                @Override // Xd.l
                                public final Object invoke(Object obj, Object obj2) {
                                    int i14 = this.alpha;
                                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i14) {
                                        case 0:
                                            g.kilo(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                                            return Unit.INSTANCE;
                                        default:
                                            g.kilo(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    throw ad.black(c0585q, 1126190999, false);
                }
                c0585q.purple(1126204258);
                long j5 = Db.c.indigo;
                String bravo = AbstractC3086y3.bravo(c0585q, R.string.disliked);
                long j6 = C0366t.bravo;
                qVar = new q(j5, bravo, j6, R.drawable.thumb_down_fill, j6, 100);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1126191815);
                qVar = new q(p.alpha, AbstractC3086y3.bravo(c0585q, R.string.voted), AbstractC3071v3.alpha(c0585q, R.color.coolgray_800), R.drawable.checkbox_circle_fill, AbstractC3071v3.alpha(c0585q, R.color.green_500), 89);
                c0585q.quebec(false);
            }
            q qVar2 = qVar;
            T.s uniform2 = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(V.oscar(V.echo(pVar, 40), qVar2.foxtrot), qVar2.alpha, AbstractC2094g.bravo(8)), 12, 0.0f, 2);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            long j7 = c0585q.magenta;
            int i14 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(uniform2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            sVar2 = pVar;
            ak.bravo(qVar2.bravo, null, qVar2.charlie, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.lime, AbstractC2636d7.charlie(14), new v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65530);
            c0585q = c0585q;
            AbstractC0538d.echo(V.oscar(sVar2, 4), c0585q);
            z.s.alpha(AbstractC3076w3.charlie(qVar2.delta, c0585q, 0), null, V.kilo(sVar2, 24), qVar2.echo, c0585q, 432, 0);
            i10 = 1;
            c0585q.quebec(true);
        } else {
            i10 = 1;
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            uniform3.delta = new Xd.l(localVote, sVar2, i4, i10) { // from class: cc.r
                public final /* synthetic */ int alpha;
                public final /* synthetic */ LocalVote purple;
                public final /* synthetic */ T.s red;

                {
                    this.alpha = i10;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            g.kilo(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                        default:
                            g.kilo(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static final void lima(int i4, final long j5, Function0 function0, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        boolean z2;
        final int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1960818839);
        if ((i5 & 48) == 0) {
            if (c0585q.foxtrot(j5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 = i5 | i13;
        } else {
            i10 = i5;
        }
        if (c0585q.india(function0)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i10 | i11;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            float f5 = 0;
            i12 = i4;
            M3.bravo(function0, V.kilo(T.p.alpha, 40), null, AbstractC2094g.bravo(8), S3.alpha(1, Db.c.amber), null, new M(f5, f5, f5, f5), P.e.echo(-2021756837, new Xd.m() { // from class: cc.i
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z10;
                    T OutlinedButton = (T) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(OutlinedButton, "$this$OutlinedButton");
                    if ((intValue & 17) != 16) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.magenta(intValue & 1, z10)) {
                        z.s.alpha(AbstractC3076w3.charlie(i12, c0585q2, 0), null, V.kilo(T.p.alpha, 24), j5, c0585q2, 432, 0);
                    } else {
                        c0585q2.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q), c0585q, ((i14 >> 6) & 14) | 905969712, 156);
        } else {
            i12 = i4;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(i12, j5, function0, i5);
        }
    }
}
