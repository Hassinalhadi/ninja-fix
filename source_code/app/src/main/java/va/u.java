package va;

import android.content.Intent;
import com.app.network.network.models.AppUpdate;
import com.app.network.network.models.UpdateActions;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import g1.AbstractC1735d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class u extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ SignInActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SignInActivity signInActivity, Nd.c cVar) {
        super(2, cVar);
        this.purple = signInActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        u uVar = new u(this.purple, cVar);
        uVar.alpha = obj;
        return uVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        UpdateActions updateActions;
        int i4;
        long j5;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (c2492a != null) {
            SignInActivity signInActivity = this.purple;
            int i5 = c2492a.alpha;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        signInActivity.bronze();
                    }
                } else {
                    signInActivity.tango();
                    UserInfo userInfo = (UserInfo) c2492a.charlie;
                    if (userInfo == null) {
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(userInfo.getNafathVerificationRequired(), Boolean.TRUE)) {
                        Long userIdentityRequestId = userInfo.getUserIdentityRequestId();
                        if (userIdentityRequestId != null) {
                            j5 = userIdentityRequestId.longValue();
                        } else {
                            j5 = 0;
                        }
                        String india = new com.google.gson.l().india(userInfo);
                        Intent intent = new Intent(signInActivity, (Class<?>) NafathVerificationActivity.class);
                        intent.putExtra("EXTRA_REQUEST_ID", j5);
                        intent.putExtra("EXTRA_SIGN_IN_RESPONSE", india);
                        signInActivity.f12180O.alpha(intent);
                        return Unit.INSTANCE;
                    }
                    AppUpdate india2 = L9.d.india(signInActivity.lima());
                    if (india2 != null) {
                        updateActions = india2.getUpdateAction();
                    } else {
                        updateActions = null;
                    }
                    if (updateActions == null) {
                        i4 = -1;
                    } else {
                        i4 = t.$EnumSwitchMapping$0[updateActions.ordinal()];
                    }
                    if (i4 != -1 && i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                d3.k.azure(signInActivity, india2, null, 4);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            d3.k.azure(signInActivity, india2, new p(signInActivity, 6), 2);
                        }
                    } else if (AbstractC1735d.alpha(signInActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                        signInActivity.startActivityForResult(new Intent(signInActivity, (Class<?>) LocationInfoActivity.class), 1002);
                    } else {
                        signInActivity.uniform(signInActivity.getIntent());
                    }
                    signInActivity.green(userInfo);
                }
            } else {
                signInActivity.tango();
            }
        }
        return Unit.INSTANCE;
    }
}
