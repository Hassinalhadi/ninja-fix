package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import s6.AbstractC2797v7;

/* renamed from: F.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0177y1 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f1262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f1263d;
    public final /* synthetic */ AbstractC2367C e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f1264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0180z1 f1265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q0.ar f1266h;
    public final /* synthetic */ int purple;
    public final /* synthetic */ AbstractC2367C red;
    public final /* synthetic */ AbstractC2367C silver;
    public final /* synthetic */ AbstractC2367C teal;
    public final /* synthetic */ AbstractC2367C white;
    public final /* synthetic */ AbstractC2367C yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177y1(int i4, int i5, AbstractC2367C abstractC2367C, AbstractC2367C abstractC2367C2, AbstractC2367C abstractC2367C3, AbstractC2367C abstractC2367C4, AbstractC2367C abstractC2367C5, AbstractC2367C abstractC2367C6, AbstractC2367C abstractC2367C7, AbstractC2367C abstractC2367C8, AbstractC2367C abstractC2367C9, C0180z1 c0180z1, q0.ar arVar) {
        super(1);
        this.alpha = i4;
        this.purple = i5;
        this.red = abstractC2367C;
        this.silver = abstractC2367C2;
        this.teal = abstractC2367C3;
        this.white = abstractC2367C4;
        this.yellow = abstractC2367C5;
        this.f1262c = abstractC2367C6;
        this.f1263d = abstractC2367C7;
        this.e = abstractC2367C8;
        this.f1264f = abstractC2367C9;
        this.f1265g = c0180z1;
        this.f1266h = arVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        float f5;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        C0180z1 c0180z1 = this.f1265g;
        float f11 = c0180z1.charlie;
        q0.ar arVar = this.f1266h;
        float alpha = arVar.alpha();
        Q0.n layoutDirection = arVar.getLayoutDirection();
        float f12 = AbstractC0174x1.alpha;
        AbstractC2366B.india(abstractC2366B, this.e, 0L);
        float f13 = androidx.compose.material3.internal.at.bravo;
        AbstractC2367C abstractC2367C = this.f1264f;
        if (abstractC2367C != null) {
            i4 = abstractC2367C.purple;
        } else {
            i4 = 0;
        }
        int i14 = this.alpha - i4;
        androidx.compose.foundation.layout.M m4 = c0180z1.delta;
        int delta = Zd.a.delta(m4.bravo * alpha);
        int delta2 = Zd.a.delta(AbstractC0538d.india(m4, layoutDirection) * alpha);
        float f14 = androidx.compose.material3.internal.at.charlie * alpha;
        AbstractC2367C abstractC2367C2 = this.red;
        if (abstractC2367C2 != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C2, 0, Math.round((1 + 0.0f) * ((i14 - abstractC2367C2.purple) / 2.0f)));
        }
        boolean z2 = c0180z1.bravo;
        AbstractC2367C abstractC2367C3 = this.f1262c;
        if (abstractC2367C3 != null) {
            if (z2) {
                f5 = 2.0f;
                i13 = Math.round((1 + 0.0f) * ((i14 - abstractC2367C3.purple) / 2.0f));
            } else {
                f5 = 2.0f;
                i13 = delta;
            }
            int foxtrot = AbstractC2797v7.foxtrot(i13, -(abstractC2367C3.purple / 2), f11);
            if (abstractC2367C2 == null) {
                f10 = 0.0f;
            } else {
                f10 = (1 - f11) * (abstractC2367C2.alpha - f14);
            }
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C3, Zd.a.delta(f10) + delta2, foxtrot);
        } else {
            f5 = 2.0f;
        }
        AbstractC2367C abstractC2367C4 = this.teal;
        if (abstractC2367C4 != null) {
            if (abstractC2367C2 != null) {
                i12 = abstractC2367C2.alpha;
            } else {
                i12 = 0;
            }
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C4, i12, AbstractC0174x1.echo(z2, i14, delta, abstractC2367C3, abstractC2367C4));
        }
        if (abstractC2367C2 != null) {
            i5 = abstractC2367C2.alpha;
        } else {
            i5 = 0;
        }
        if (abstractC2367C4 != null) {
            i10 = abstractC2367C4.alpha;
        } else {
            i10 = 0;
        }
        int i15 = i5 + i10;
        AbstractC2367C abstractC2367C5 = this.yellow;
        AbstractC2366B.juliet(abstractC2366B, abstractC2367C5, i15, AbstractC0174x1.echo(z2, i14, delta, abstractC2367C3, abstractC2367C5));
        AbstractC2367C abstractC2367C6 = this.f1263d;
        if (abstractC2367C6 != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C6, i15, AbstractC0174x1.echo(z2, i14, delta, abstractC2367C3, abstractC2367C6));
        }
        int i16 = this.purple;
        AbstractC2367C abstractC2367C7 = this.silver;
        AbstractC2367C abstractC2367C8 = this.white;
        if (abstractC2367C8 != null) {
            if (abstractC2367C7 != null) {
                i11 = abstractC2367C7.alpha;
            } else {
                i11 = 0;
            }
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C8, (i16 - i11) - abstractC2367C8.alpha, AbstractC0174x1.echo(z2, i14, delta, abstractC2367C3, abstractC2367C8));
        }
        if (abstractC2367C7 != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C7, i16 - abstractC2367C7.alpha, Math.round((1 + 0.0f) * ((i14 - abstractC2367C7.purple) / f5)));
        }
        if (abstractC2367C != null) {
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C, 0, i14);
        }
        return Unit.INSTANCE;
    }
}
