package va;

import X9.aa;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import g3.C1746g;
import g3.C1751l;
import g3.EnumC1747h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignInActivity purple;

    public /* synthetic */ o(SignInActivity signInActivity, int i4) {
        this.alpha = i4;
        this.purple = signInActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        int i5;
        androidx.appcompat.app.g foxtrot;
        int i10 = 4;
        SignInActivity signInActivity = this.purple;
        int i11 = 0;
        int i12 = 1;
        int i13 = 2;
        switch (this.alpha) {
            case 0:
                g3.s result = (g3.s) obj;
                int i14 = SignInActivity.f12172P;
                Intrinsics.echo(result, "result");
                J2.t tVar = signInActivity.f12178M;
                tVar.getClass();
                androidx.appcompat.app.g gVar = (androidx.appcompat.app.g) tVar.purple;
                if (gVar != null) {
                    gVar.dismiss();
                }
                androidx.appcompat.app.g gVar2 = null;
                tVar.purple = null;
                boolean z2 = result instanceof g3.q;
                C1746g c1746g = (C1746g) tVar.alpha;
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) tVar.red;
                boolean z10 = c1746g.charlie;
                if (z2) {
                    g3.q qVar = (g3.q) result;
                    Function0 function0 = c1746g.hotel;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    for (C1751l recommendation : qVar.alpha) {
                        if (recommendation != null) {
                            if (z10) {
                                Ac.g gVar3 = new Ac.g(23, tVar, recommendation);
                                V9.f fVar = new V9.f(tVar, i13);
                                oVar.getClass();
                                Intrinsics.echo(recommendation, "recommendation");
                                C1746g c1746g2 = (C1746g) oVar.bravo;
                                if (!c1746g2.charlie) {
                                    i4 = i10;
                                    foxtrot = gVar2;
                                } else {
                                    d3.k kVar = (d3.k) oVar.alpha;
                                    U7.c delta = U7.c.delta(LayoutInflater.from(kVar));
                                    g3.p pVar = new g3.p(recommendation.alpha);
                                    EnumC1747h enumC1747h = EnumC1747h.purple;
                                    V9.d echo = ((O7.j) oVar.charlie).echo(pVar, enumC1747h);
                                    TextView textView = (TextView) delta.yellow;
                                    textView.setText(echo.alpha);
                                    ((TextView) delta.silver).setText(echo.bravo);
                                    MaterialButton materialButton = (MaterialButton) delta.white;
                                    materialButton.setText(echo.charlie);
                                    MaterialButton materialButton2 = (MaterialButton) delta.teal;
                                    materialButton2.setText(echo.delta);
                                    materialButton2.setVisibility(i11);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) delta.red;
                                    constraintLayout.setBackgroundResource(R.drawable.bg_gradient_location_warning);
                                    ((ImageView) delta.purple).setColorFilter(kVar.getColor(R.color.white));
                                    textView.setTextColor(kVar.getColor(R.color.location_warning_yellow_dark));
                                    materialButton.setBackgroundColor(kVar.getColor(R.color.location_warning_yellow));
                                    Integer num = c1746g2.golf;
                                    if (num != null) {
                                        i5 = num.intValue();
                                    } else {
                                        i5 = 0;
                                    }
                                    Fe.c cVar = new Fe.c(kVar, i5);
                                    androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                                    dVar.sierra = (ConstraintLayout) delta.alpha;
                                    dVar.mike = true;
                                    foxtrot = cVar.foxtrot();
                                    i4 = 4;
                                    materialButton.setOnClickListener(new Kb.k(i4, gVar3, foxtrot));
                                    materialButton2.setOnClickListener(new V9.b(foxtrot, 0));
                                    foxtrot.setOnDismissListener(new Ba.d(2, fVar));
                                    if (c1746g2.echo) {
                                        ((O7.l) oVar.delta).purple(foxtrot, constraintLayout, enumC1747h);
                                    }
                                    if (!kVar.isFinishing() && !kVar.isDestroyed()) {
                                        foxtrot.show();
                                    } else {
                                        foxtrot = null;
                                    }
                                }
                                tVar.purple = foxtrot;
                            } else {
                                i4 = i10;
                            }
                            i10 = i4;
                            gVar2 = null;
                            i11 = 0;
                            i13 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    EnumC1747h enumC1747h2 = (EnumC1747h) c1746g.alpha.get(result.getClass());
                    if (enumC1747h2 == null) {
                        enumC1747h2 = EnumC1747h.purple;
                    }
                    int ordinal = enumC1747h2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                if (c1746g.delta) {
                                    oVar.golf(result, enumC1747h2, null);
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            tVar.purple = oVar.golf(result, enumC1747h2, new V9.f(tVar, 1));
                        }
                    } else if (c1746g.bravo) {
                        tVar.purple = oVar.golf(result, enumC1747h2, new V9.f(tVar, 0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                Pair pair = (Pair) obj;
                int i15 = SignInActivity.f12172P;
                AtomicReference atomicReference = aa.alpha;
                String str = (String) atomicReference.get();
                SignInActivity signInActivity2 = this.purple;
                if (str != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        K7.b.alpha().bravo("security: device_verification_failed_login -> killing app reason=" + ((String) atomicReference.get()));
                        Result.m206constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    String string = signInActivity2.getString(R.string.device_verification_failed_title);
                    Intrinsics.delta(string, "getString(...)");
                    String string2 = signInActivity2.getString(R.string.device_verification_failed_message);
                    Intrinsics.delta(string2, "getString(...)");
                    String string3 = signInActivity2.getString(android.R.string.ok);
                    Intrinsics.delta(string3, "getString(...)");
                    L9.d.ochre(signInActivity2, string, string2, string3, new p(signInActivity2, i13), null, null, false);
                    return Unit.INSTANCE;
                }
                int intValue = ((Number) pair.getFirst()).intValue();
                if (intValue != 401) {
                    switch (intValue) {
                        case 901:
                            String string4 = signInActivity2.getString(R.string.app_name);
                            Intrinsics.delta(string4, "getString(...)");
                            String string5 = signInActivity2.getString(R.string.server_time_out_retry);
                            Intrinsics.delta(string5, "getString(...)");
                            String string6 = signInActivity2.getString(R.string.retry);
                            Intrinsics.delta(string6, "getString(...)");
                            L9.d.olive(signInActivity2, string4, string5, string6, new p(signInActivity2, i12), null, null, 112);
                            break;
                        case 902:
                            String string7 = signInActivity2.getString(R.string.app_name);
                            Intrinsics.delta(string7, "getString(...)");
                            String string8 = signInActivity2.getString(R.string.no_internet_retry);
                            Intrinsics.delta(string8, "getString(...)");
                            String string9 = signInActivity2.getString(R.string.retry);
                            Intrinsics.delta(string9, "getString(...)");
                            L9.d.olive(signInActivity2, string7, string8, string9, new p(signInActivity2, i10), null, null, 112);
                            break;
                        case 903:
                            signInActivity2.indigo((String) pair.getSecond());
                            break;
                    }
                } else {
                    signInActivity2.indigo((String) pair.getSecond());
                }
                return Unit.INSTANCE;
            default:
                g3.s result2 = (g3.s) obj;
                int i16 = SignInActivity.f12172P;
                Intrinsics.echo(result2, "result");
                if (result2 instanceof g3.p) {
                    signInActivity.f12179N.alpha(((g3.p) result2).alpha);
                }
                return Unit.INSTANCE;
        }
    }
}
