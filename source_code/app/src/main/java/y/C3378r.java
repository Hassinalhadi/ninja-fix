package y;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3378r extends Pd.i implements Xd.l {
    public Ef.c alpha;
    public C3379s purple;
    public CharSequence red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14137s;
    public long silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C3379s f14138t;
    public int teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ CharSequence yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3378r(CharSequence charSequence, long j5, C3379s c3379s, Nd.c cVar) {
        super(2, cVar);
        this.yellow = charSequence;
        this.f14137s = j5;
        this.f14138t = c3379s;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3378r c3378r = new C3378r(this.yellow, this.f14137s, this.f14138t, cVar);
        c3378r.white = obj;
        return c3378r;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3378r) create(vg.al.kilo(obj), (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j5;
        TextClassification textClassification;
        Ef.c cVar;
        CharSequence charSequence;
        TextSelection textSelection;
        C3379s c3379s;
        TextClassification textClassification2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.teal;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    j5 = this.silver;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                j5 = this.silver;
                charSequence = this.red;
                c3379s = this.purple;
                cVar = this.alpha;
                textSelection = vg.al.lima(this.white);
                ResultKt.alpha(obj);
                try {
                    textClassification2 = textSelection.getTextClassification();
                    Intrinsics.checkNotNull(textClassification2);
                    ((t0) c3379s.golf).setValue(new ao(charSequence, j5, textClassification2));
                } finally {
                    cVar.foxtrot(null);
                }
            }
        } else {
            ResultKt.alpha(obj);
            TextClassifier kilo = vg.al.kilo(this.white);
            q1.c.azure();
            long j6 = this.f14137s;
            int foxtrot = D0.am.foxtrot(j6);
            int echo = D0.am.echo(j6);
            CharSequence charSequence2 = this.yellow;
            TextSelection.Request.Builder oscar = q1.c.oscar(charSequence2, foxtrot, echo);
            C3379s c3379s2 = this.f14138t;
            defaultLocales = oscar.setDefaultLocales(c3379s2.bravo());
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = kilo.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long bravo = D0.ae.bravo(selectionStartIndex, selectionEndIndex);
            if (i5 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    this.white = suggestSelection;
                    Ef.c cVar2 = c3379s2.echo;
                    this.alpha = cVar2;
                    this.purple = c3379s2;
                    this.red = charSequence2;
                    this.silver = bravo;
                    this.teal = 1;
                    if (cVar2.delta(this) != aVar) {
                        cVar = cVar2;
                        charSequence = charSequence2;
                        textSelection = suggestSelection;
                        c3379s = c3379s2;
                        j5 = bravo;
                        textClassification2 = textSelection.getTextClassification();
                        Intrinsics.checkNotNull(textClassification2);
                        ((t0) c3379s.golf).setValue(new ao(charSequence, j5, textClassification2));
                    }
                    return aVar;
                }
            }
            this.silver = bravo;
            this.teal = 2;
            if (C3379s.alpha(this.f14138t, this.yellow, bravo, kilo, this) != aVar) {
                j5 = bravo;
            }
            return aVar;
        }
        return new D0.am(j5);
    }
}
