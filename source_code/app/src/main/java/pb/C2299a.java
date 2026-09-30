package pb;

import P.d;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2726n7;
import s6.AbstractC2744p7;
import s6.AbstractC2753q7;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2299a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13144a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ s teal;
    public final /* synthetic */ d white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C2299a(String str, Function0 function0, boolean z2, s sVar, d dVar, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = str;
        this.red = function0;
        this.silver = z2;
        this.teal = sVar;
        this.white = dVar;
        this.yellow = i4;
        this.f13144a = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.yellow | 1);
                d dVar = this.white;
                AbstractC2726n7.alpha(this.purple, this.red, this.silver, this.teal, dVar, (InterfaceC0581m) obj, cyan, this.f13144a);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.yellow | 1);
                d dVar2 = this.white;
                AbstractC2744p7.alpha(this.purple, this.red, this.silver, this.teal, dVar2, (InterfaceC0581m) obj, cyan2, this.f13144a);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.yellow | 1);
                String str = this.purple;
                d dVar3 = this.white;
                AbstractC2753q7.alpha(str, this.red, this.silver, this.teal, dVar3, (InterfaceC0581m) obj, cyan3, this.f13144a);
                return Unit.INSTANCE;
        }
    }
}
