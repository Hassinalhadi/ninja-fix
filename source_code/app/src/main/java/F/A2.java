package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class A2 extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f996d;
    public final /* synthetic */ AbstractC2367C e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2367C f997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B2 f998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0.ar f1000i;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ AbstractC2367C silver;
    public final /* synthetic */ AbstractC2367C teal;
    public final /* synthetic */ AbstractC2367C white;
    public final /* synthetic */ AbstractC2367C yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(AbstractC2367C abstractC2367C, int i4, int i5, AbstractC2367C abstractC2367C2, AbstractC2367C abstractC2367C3, AbstractC2367C abstractC2367C4, AbstractC2367C abstractC2367C5, AbstractC2367C abstractC2367C6, AbstractC2367C abstractC2367C7, AbstractC2367C abstractC2367C8, AbstractC2367C abstractC2367C9, B2 b2, int i10, q0.ar arVar) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = i4;
        this.red = i5;
        this.silver = abstractC2367C2;
        this.teal = abstractC2367C3;
        this.white = abstractC2367C4;
        this.yellow = abstractC2367C5;
        this.f995c = abstractC2367C6;
        this.f996d = abstractC2367C7;
        this.e = abstractC2367C8;
        this.f997f = abstractC2367C9;
        this.f998g = b2;
        this.f999h = i10;
        this.f1000i = arVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int delta;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        AbstractC2367C abstractC2367C = this.silver;
        AbstractC2367C abstractC2367C2 = this.e;
        q0.ar arVar = this.f1000i;
        AbstractC2367C abstractC2367C3 = this.f997f;
        AbstractC2367C abstractC2367C4 = this.f996d;
        AbstractC2367C abstractC2367C5 = this.f995c;
        AbstractC2367C abstractC2367C6 = this.yellow;
        AbstractC2367C abstractC2367C7 = this.white;
        AbstractC2367C abstractC2367C8 = this.teal;
        int i19 = this.red;
        int i20 = this.purple;
        B2 b2 = this.f998g;
        AbstractC2367C abstractC2367C9 = this.alpha;
        if (abstractC2367C9 != null) {
            boolean z2 = b2.alpha;
            int i21 = abstractC2367C9.purple;
            int i22 = this.f999h + i21;
            float alpha = arVar.alpha();
            float f5 = z2.alpha;
            AbstractC2366B.india(abstractC2366B, abstractC2367C2, 0L);
            float f10 = androidx.compose.material3.internal.at.bravo;
            if (abstractC2367C3 != null) {
                i13 = abstractC2367C3.purple;
            } else {
                i13 = 0;
            }
            int i23 = i19 - i13;
            if (abstractC2367C7 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C7, 0, Math.round((1 + 0.0f) * ((i23 - abstractC2367C7.purple) / 2.0f)));
            }
            if (z2) {
                delta = Math.round((1 + 0.0f) * ((i23 - abstractC2367C9.purple) / 2.0f));
            } else {
                delta = Zd.a.delta(androidx.compose.material3.internal.at.bravo * alpha);
            }
            int delta2 = delta - Zd.a.delta((delta - r5) * b2.bravo);
            if (abstractC2367C7 != null) {
                i14 = abstractC2367C7.alpha;
            } else {
                i14 = 0;
            }
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C9, i14, delta2);
            if (abstractC2367C5 != null) {
                if (abstractC2367C7 != null) {
                    i18 = abstractC2367C7.alpha;
                } else {
                    i18 = 0;
                }
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C5, i18, i22);
            }
            if (abstractC2367C7 != null) {
                i15 = abstractC2367C7.alpha;
            } else {
                i15 = 0;
            }
            if (abstractC2367C5 != null) {
                i16 = abstractC2367C5.alpha;
            } else {
                i16 = 0;
            }
            int i24 = i15 + i16;
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C, i24, i22);
            if (abstractC2367C8 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C8, i24, i22);
            }
            if (abstractC2367C4 != null) {
                if (abstractC2367C6 != null) {
                    i17 = abstractC2367C6.alpha;
                } else {
                    i17 = 0;
                }
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C4, (i20 - i17) - abstractC2367C4.alpha, i22);
            }
            if (abstractC2367C6 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C6, i20 - abstractC2367C6.alpha, Math.round((1 + 0.0f) * ((i23 - abstractC2367C6.purple) / 2.0f)));
            }
            if (abstractC2367C3 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C3, 0, i23);
            }
        } else {
            boolean z10 = b2.alpha;
            float alpha2 = arVar.alpha();
            float f11 = z2.alpha;
            AbstractC2366B.india(abstractC2366B, abstractC2367C2, 0L);
            float f12 = androidx.compose.material3.internal.at.bravo;
            if (abstractC2367C3 != null) {
                i4 = abstractC2367C3.purple;
            } else {
                i4 = 0;
            }
            int i25 = i19 - i4;
            int delta3 = Zd.a.delta(b2.charlie.bravo * alpha2);
            if (abstractC2367C7 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C7, 0, Math.round((1 + 0.0f) * ((i25 - abstractC2367C7.purple) / 2.0f)));
            }
            if (abstractC2367C5 != null) {
                if (abstractC2367C7 != null) {
                    i12 = abstractC2367C7.alpha;
                } else {
                    i12 = 0;
                }
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C5, i12, z2.delta(z10, i25, delta3, abstractC2367C5));
            }
            if (abstractC2367C7 != null) {
                i5 = abstractC2367C7.alpha;
            } else {
                i5 = 0;
            }
            if (abstractC2367C5 != null) {
                i10 = abstractC2367C5.alpha;
            } else {
                i10 = 0;
            }
            int i26 = i5 + i10;
            AbstractC2366B.juliet(abstractC2366B, abstractC2367C, i26, z2.delta(z10, i25, delta3, abstractC2367C));
            if (abstractC2367C8 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C8, i26, z2.delta(z10, i25, delta3, abstractC2367C8));
            }
            if (abstractC2367C4 != null) {
                if (abstractC2367C6 != null) {
                    i11 = abstractC2367C6.alpha;
                } else {
                    i11 = 0;
                }
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C4, (i20 - i11) - abstractC2367C4.alpha, z2.delta(z10, i25, delta3, abstractC2367C4));
            }
            if (abstractC2367C6 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C6, i20 - abstractC2367C6.alpha, Math.round((1 + 0.0f) * ((i25 - abstractC2367C6.purple) / 2.0f)));
            }
            if (abstractC2367C3 != null) {
                AbstractC2366B.juliet(abstractC2366B, abstractC2367C3, 0, i25);
            }
        }
        return Unit.INSTANCE;
    }
}
