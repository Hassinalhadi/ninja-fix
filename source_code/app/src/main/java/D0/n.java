package D0;

import a0.C0352f;
import a0.C0360n;
import android.location.Location;
import android.text.Layout;
import com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt;
import com.checkout.components.ui.model.CardScheme;
import i.InterfaceC1869r;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ n(long j5, float[] fArr, kotlin.jvm.internal.s sVar, kotlin.jvm.internal.r rVar) {
        this.purple = j5;
        this.red = fArr;
        this.silver = sVar;
        this.teal = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int foxtrot;
        a aVar;
        long j5;
        boolean z2;
        boolean z10;
        float alpha;
        float alpha2;
        switch (this.alpha) {
            case 0:
                q qVar = (q) obj;
                int i4 = qVar.bravo;
                long j6 = this.purple;
                if (i4 > am.foxtrot(j6)) {
                    foxtrot = qVar.bravo;
                } else {
                    foxtrot = am.foxtrot(j6);
                }
                int echo = am.echo(j6);
                int i5 = qVar.charlie;
                if (i5 >= echo) {
                    i5 = am.echo(j6);
                }
                long bravo = ae.bravo(qVar.delta(foxtrot), qVar.delta(i5));
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.silver;
                int i10 = sVar.alpha;
                a aVar2 = qVar.alpha;
                int foxtrot2 = am.foxtrot(bravo);
                int echo2 = am.echo(bravo);
                E0.r rVar = aVar2.delta;
                Layout layout = rVar.foxtrot;
                int length = layout.getText().length();
                if (foxtrot2 < 0) {
                    J0.a.alpha("startOffset must be > 0");
                }
                if (foxtrot2 >= length) {
                    J0.a.alpha("startOffset must be less than text length");
                }
                if (echo2 <= foxtrot2) {
                    J0.a.alpha("endOffset must be greater than startOffset");
                }
                if (echo2 > length) {
                    J0.a.alpha("endOffset must be smaller or equal to text length");
                }
                int i11 = (echo2 - foxtrot2) * 4;
                float[] fArr = (float[]) this.red;
                if (fArr.length - i10 < i11) {
                    J0.a.alpha("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(foxtrot2);
                int lineForOffset2 = layout.getLineForOffset(echo2 - 1);
                E0.h hVar = new E0.h(rVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int foxtrot3 = rVar.foxtrot(lineForOffset);
                        int max = Math.max(foxtrot2, lineStart);
                        int min = Math.min(echo2, foxtrot3);
                        float golf = rVar.golf(lineForOffset);
                        float echo3 = rVar.echo(lineForOffset);
                        aVar = aVar2;
                        j5 = bravo;
                        boolean z11 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z2 && !isRtlCharAt) {
                                alpha = hVar.alpha(z11, z11, true, max);
                                z10 = z2;
                                alpha2 = hVar.alpha(true, true, true, max + 1);
                            } else {
                                if (z2 && isRtlCharAt) {
                                    z11 = false;
                                    float alpha3 = hVar.alpha(false, false, false, max);
                                    z10 = z2;
                                    alpha = hVar.alpha(true, true, false, max + 1);
                                    alpha2 = alpha3;
                                } else {
                                    z10 = z2;
                                    z11 = false;
                                    if (!z10 && isRtlCharAt) {
                                        alpha2 = hVar.alpha(false, false, true, max);
                                        alpha = hVar.alpha(true, true, true, max + 1);
                                    } else {
                                        alpha = hVar.alpha(false, false, false, max);
                                        alpha2 = hVar.alpha(true, true, false, max + 1);
                                    }
                                }
                                fArr[i10] = alpha;
                                fArr[i10 + 1] = golf;
                                fArr[i10 + 2] = alpha2;
                                fArr[i10 + 3] = echo3;
                                i10 += 4;
                                max++;
                                z2 = z10;
                            }
                            z11 = false;
                            fArr[i10] = alpha;
                            fArr[i10 + 1] = golf;
                            fArr[i10 + 2] = alpha2;
                            fArr[i10 + 3] = echo3;
                            i10 += 4;
                            max++;
                            z2 = z10;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            aVar2 = aVar;
                            bravo = j5;
                        }
                    }
                } else {
                    aVar = aVar2;
                    j5 = bravo;
                }
                int delta = (am.delta(j5) * 4) + sVar.alpha;
                int i12 = sVar.alpha;
                while (true) {
                    kotlin.jvm.internal.r rVar2 = (kotlin.jvm.internal.r) this.teal;
                    if (i12 < delta) {
                        int i13 = i12 + 1;
                        float f5 = fArr[i13];
                        float f10 = rVar2.alpha;
                        fArr[i13] = f5 + f10;
                        int i14 = i12 + 3;
                        fArr[i14] = fArr[i14] + f10;
                        i12 += 4;
                    } else {
                        sVar.alpha = delta;
                        rVar2.alpha = aVar.bravo() + rVar2.alpha;
                        return Unit.INSTANCE;
                    }
                }
            case 1:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.silver;
                long j7 = this.purple;
                C0360n c0360n = (C0360n) this.teal;
                s0.an anVar = (s0.an) obj;
                anVar.charlie();
                Z.c cVar = (Z.c) this.red;
                c0.b bVar = anVar.alpha;
                av.ah ahVar = (av.ah) bVar.purple.alpha;
                float f11 = cVar.alpha;
                float f12 = cVar.bravo;
                ahVar.red(f11, f12);
                try {
                    ao.ad.hotel(anVar, (C0352f) objectRef.alpha, j7, 0L, 0.0f, c0360n, 0, 890);
                    ((av.ah) bVar.purple.alpha).red(-f11, -f12);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ((av.ah) bVar.purple.alpha).red(-f11, -f12);
                    throw th;
                }
            case 2:
                return SchemeChoiceSelectionViewKt.foxtrot((Map) this.red, (CardScheme) this.silver, (Function1) this.teal, this.purple, (InterfaceC1869r) obj);
            default:
                Throwable err = (Throwable) obj;
                Intrinsics.echo(err, "err");
                InterfaceC3142e interfaceC3142e = ((p3.ab) this.red).alpha.charlie;
                String message = err.getMessage();
                Location location = (Location) this.silver;
                interfaceC3142e.alpha("LocationFlow", "[SEND_ERROR] Send failed | seq=" + this.purple + " | error=" + message + " | lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + " | accuracyMode=" + ((String) this.teal));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(Z.c cVar, Ref.ObjectRef objectRef, long j5, C0360n c0360n) {
        this.red = cVar;
        this.silver = objectRef;
        this.purple = j5;
        this.teal = c0360n;
    }

    public /* synthetic */ n(Map map, CardScheme cardScheme, Function1 function1, long j5) {
        this.red = map;
        this.silver = cardScheme;
        this.teal = function1;
        this.purple = j5;
    }

    public /* synthetic */ n(p3.ab abVar, long j5, Location location, String str) {
        this.red = abVar;
        this.purple = j5;
        this.silver = location;
        this.teal = str;
    }
}
