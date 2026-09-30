package nc;

import B9.ab;
import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oc.C2223f;
import r3.C2492a;
import yf.InterfaceC3440j;

/* renamed from: nc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2169b implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ RedeemFragment purple;

    public /* synthetic */ C2169b(RedeemFragment redeemFragment, int i4) {
        this.alpha = i4;
        this.purple = redeemFragment;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        Integer num;
        Integer num2;
        List list;
        int i4;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                if (c2492a != null) {
                    num = new Integer(c2492a.alpha);
                } else {
                    num = null;
                }
                if (num == null || num.intValue() != 2) {
                    RedeemFragment redeemFragment = this.purple;
                    if (num != null && num.intValue() == 1) {
                        J2.f.alpha(redeemFragment).echo();
                        Toast.makeText(redeemFragment.getContext(), redeemFragment.getString(R.string.reward_redeemed_successfully), 1).show();
                    } else if (num != null && num.intValue() == 0) {
                        Context context = redeemFragment.getContext();
                        String str = c2492a.bravo;
                        if (str == null) {
                            str = redeemFragment.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(str, "getString(...)");
                        }
                        Toast.makeText(context, str, 1);
                    }
                }
                return Unit.INSTANCE;
            default:
                C2492a c2492a2 = (C2492a) obj;
                if (c2492a2 != null) {
                    num2 = new Integer(c2492a2.alpha);
                } else {
                    num2 = null;
                }
                RedeemFragment redeemFragment2 = this.purple;
                boolean z2 = true;
                if (num2 != null && num2.intValue() == 2) {
                    ab abVar = redeemFragment2.f12442f;
                    if (abVar != null) {
                        ((LinearLayout) abVar.silver).setVisibility(8);
                        ab abVar2 = redeemFragment2.f12442f;
                        if (abVar2 != null) {
                            ((SwipeRefreshLayout) abVar2.teal).setRefreshing(true);
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                } else if (num2 != null && num2.intValue() == 1) {
                    DataResponse dataResponse = (DataResponse) c2492a2.charlie;
                    if (dataResponse != null) {
                        list = dataResponse.getItems();
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    DataResponse dataResponse2 = (DataResponse) c2492a2.charlie;
                    if (dataResponse2 != null) {
                        i4 = dataResponse2.getPageCount() - 1;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != redeemFragment2.f12445i) {
                        z2 = false;
                    }
                    redeemFragment2.f12446j = z2;
                    if (list.isEmpty()) {
                        String string = redeemFragment2.getString(R.string.redeem_empty);
                        Intrinsics.delta(string, "getString(...)");
                        ab abVar3 = redeemFragment2.f12442f;
                        if (abVar3 != null) {
                            ((RecyclerView) abVar3.white).setVisibility(8);
                            ab abVar4 = redeemFragment2.f12442f;
                            if (abVar4 != null) {
                                ((LinearLayout) abVar4.silver).setVisibility(0);
                                ab abVar5 = redeemFragment2.f12442f;
                                if (abVar5 != null) {
                                    ((TextView) abVar5.red).setText(string);
                                    ab abVar6 = redeemFragment2.f12442f;
                                    if (abVar6 != null) {
                                        ((Button) abVar6.purple).setVisibility(8);
                                        ab abVar7 = redeemFragment2.f12442f;
                                        if (abVar7 != null) {
                                            ((SwipeRefreshLayout) abVar7.teal).setRefreshing(false);
                                        } else {
                                            Intrinsics.lima("binding");
                                            throw null;
                                        }
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    } else {
                        if (redeemFragment2.f12445i > 0) {
                            C2223f c2223f = redeemFragment2.f12444h;
                            if (c2223f != null) {
                                c2223f.alpha(list);
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        } else {
                            C2223f c2223f2 = redeemFragment2.f12444h;
                            if (c2223f2 != null) {
                                c2223f2.bravo(list);
                            } else {
                                Intrinsics.lima("adapter");
                                throw null;
                            }
                        }
                        ab abVar8 = redeemFragment2.f12442f;
                        if (abVar8 != null) {
                            ((RecyclerView) abVar8.white).setVisibility(0);
                            ab abVar9 = redeemFragment2.f12442f;
                            if (abVar9 != null) {
                                ((LinearLayout) abVar9.silver).setVisibility(8);
                                ab abVar10 = redeemFragment2.f12442f;
                                if (abVar10 != null) {
                                    ((SwipeRefreshLayout) abVar10.teal).setRefreshing(false);
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                } else if (num2 != null && num2.intValue() == 0) {
                    String str2 = c2492a2.bravo;
                    if (str2 == null) {
                        str2 = redeemFragment2.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str2, "getString(...)");
                    }
                    ab abVar11 = redeemFragment2.f12442f;
                    if (abVar11 != null) {
                        ((RecyclerView) abVar11.white).setVisibility(8);
                        ab abVar12 = redeemFragment2.f12442f;
                        if (abVar12 != null) {
                            ((LinearLayout) abVar12.silver).setVisibility(0);
                            ab abVar13 = redeemFragment2.f12442f;
                            if (abVar13 != null) {
                                ((TextView) abVar13.red).setText(str2);
                                ab abVar14 = redeemFragment2.f12442f;
                                if (abVar14 != null) {
                                    ((Button) abVar14.purple).setVisibility(0);
                                    ab abVar15 = redeemFragment2.f12442f;
                                    if (abVar15 != null) {
                                        ((SwipeRefreshLayout) abVar15.teal).setRefreshing(false);
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                } else if (num2 != null && num2.intValue() == 3) {
                    ab abVar16 = redeemFragment2.f12442f;
                    if (abVar16 != null) {
                        ((SwipeRefreshLayout) abVar16.teal).setRefreshing(false);
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
