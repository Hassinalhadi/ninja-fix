package n;

import F.C0130l1;
import Yb.C0331t0;
import a0.AbstractC0349c;
import a0.InterfaceC0364r;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Base64;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.n0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.ReferralResponse;
import com.app.network.network.models.SignUpResponse;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.app.network.network.response.DataResponse;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.system.PlayStoreAppRatingTemplate;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryFragment;
import delivery.samurai.android.ui.auth.signup.RegisterActivity;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.referralProgram.ReferYourFriendFragment;
import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.score.ScoreFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import io.reactivex.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import k4.C2007a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oc.C2219b;
import okhttp3.internal.cache.DiskLruCache;
import p.C2263a;
import r3.C2492a;
import s0.AbstractC2557q;
import sd.AbstractC2850a;
import t.C2875a;
import t.C2876b;
import u.C3130d;
import wa.C3248d;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ Y(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x058d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object it) {
        ?? emptyList;
        Single single;
        Integer id2;
        int i4;
        boolean z2;
        List items;
        int i5;
        List items2;
        String str;
        Vibrator vibrator;
        VibrationEffect createOneShot;
        int i10 = 8;
        Integer num = null;
        boolean z10 = false;
        ?? r82 = 0;
        int i11 = 2;
        boolean z11 = true;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                float floatValue = ((Float) it).floatValue();
                c0 c0Var = (c0) obj;
                float alpha = c0Var.alpha() + floatValue;
                androidx.compose.runtime.aw awVar = c0Var.bravo;
                if (alpha > ((n0) awVar).juliet()) {
                    floatValue = ((n0) awVar).juliet() - c0Var.alpha();
                } else if (alpha < 0.0f) {
                    floatValue = -c0Var.alpha();
                }
                ((n0) c0Var.alpha).kilo(c0Var.alpha() + floatValue);
                return Float.valueOf(floatValue);
            case 1:
                String language = Locale.getDefault().getLanguage();
                Intrinsics.delta(language, "getLanguage(...)");
                Order assignLocalizedMetaData = ((Order) it).assignLocalizedMetaData(language);
                List<OrderTask> tasks = assignLocalizedMetaData.getTasks();
                if (tasks != null) {
                    emptyList = new ArrayList();
                    for (Object obj2 : tasks) {
                        OrderTask orderTask = (OrderTask) obj2;
                        if (orderTask.getTaskType() == TaskType.DELIVERY && orderTask.getTaskStatus() == TaskStatus.STARTED) {
                            emptyList.add(obj2);
                        }
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                if (emptyList.isEmpty()) {
                    return Single.just(assignLocalizedMetaData);
                }
                ArrayList arrayList = new ArrayList();
                for (OrderTask orderTask2 : emptyList) {
                    OrderAddress address = orderTask2.getAddress();
                    if (address != null && (id2 = address.getId()) != null) {
                        int intValue = id2.intValue();
                        OrdersViewModel ordersViewModel = (OrdersViewModel) obj;
                        AndroidApp androidApp = ordersViewModel.alpha;
                        AtomicInteger atomicInteger = L9.d.alpha;
                        Intrinsics.echo(androidApp, "<this>");
                        if (androidApp.getSharedPreferences("AddressNotesPref", 0).contains("addr_notes_" + intValue)) {
                            List<AddressNoteListItem> hotel = L9.d.hotel(intValue, ordersViewModel.alpha);
                            orderTask2.setAllAddressNotes(hotel);
                            orderTask2.setFirstAddressNote((AddressNoteListItem) CollectionsKt.green(hotel));
                        } else {
                            single = ordersViewModel.charlie.bronze(intValue).map(new na.j(i11, new androidx.compose.runtime.P(intValue, 3, ordersViewModel, orderTask2))).onErrorReturn(new Object());
                            if (single == null) {
                                arrayList.add(single);
                            }
                        }
                    }
                    single = null;
                    if (single == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    return Single.just(assignLocalizedMetaData);
                }
                return Single.zip(arrayList, new na.j(r82 == true ? 1 : 0, new Y(i11, assignLocalizedMetaData)));
            case 2:
                return (Order) obj;
            case 3:
                PointRewardResponse it2 = (PointRewardResponse) it;
                Intrinsics.echo(it2, "it");
                RedeemFragment redeemFragment = (RedeemFragment) obj;
                float f5 = redeemFragment.f12443g;
                Yb.F f10 = new Yb.F(24, redeemFragment, it2);
                C2219b c2219b = new C2219b();
                c2219b.f13129u = it2;
                c2219b.f13130v = f5;
                c2219b.f13131w = f10;
                c2219b.f14101q = true;
                c2219b.romeo(redeemFragment.getChildFragmentManager(), null);
                return Unit.INSTANCE;
            case 4:
                return DiskLruCache.charlie((DiskLruCache) obj, (IOException) it);
            case 5:
                Throwable err = (Throwable) it;
                Intrinsics.echo(err, "err");
                ((C2007a) obj).invoke(err);
                return Unit.INSTANCE;
            case 6:
                p3.ag it3 = (p3.ag) it;
                Intrinsics.echo(it3, "it");
                if (it3.alpha.getTime() != ((p3.ag) obj).alpha.getTime()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 7:
                C2492a c2492a = (C2492a) it;
                int i12 = c2492a.alpha;
                ReferYourFriendFragment referYourFriendFragment = (ReferYourFriendFragment) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            referYourFriendFragment.kilo().bronze();
                            ((ConstraintLayout) referYourFriendFragment.quebec().silver).setVisibility(8);
                        }
                    } else {
                        ReferralResponse referralResponse = (ReferralResponse) c2492a.charlie;
                        if (referralResponse != null) {
                            ((ConstraintLayout) referYourFriendFragment.quebec().silver).setVisibility(0);
                            ((TextView) referYourFriendFragment.quebec().teal).setText(referralResponse.getCode());
                            ((TextView) referYourFriendFragment.quebec().white).setText(referralResponse.getMessage());
                            ((MaterialButton) referYourFriendFragment.quebec().red).setOnClickListener(new Kb.k(10, referYourFriendFragment, referralResponse));
                        }
                        referYourFriendFragment.kilo().tango();
                    }
                } else {
                    String str2 = c2492a.bravo;
                    if (str2 != null) {
                        L9.d.pink(referYourFriendFragment.kilo(), str2);
                    }
                    referYourFriendFragment.kilo().tango();
                }
                return Unit.INSTANCE;
            case 8:
                Intrinsics.echo(it, "it");
                return ((Lambda) obj).invoke();
            case 9:
                C2492a c2492a2 = (C2492a) it;
                int i13 = AssetsListActivity.Q;
                int i14 = c2492a2.alpha;
                AssetsListActivity assetsListActivity = (AssetsListActivity) obj;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            assetsListActivity.gray().delta.setRefreshing(true);
                        }
                    } else {
                        assetsListActivity.gray().delta.setRefreshing(false);
                        DataResponse dataResponse = (DataResponse) c2492a2.charlie;
                        if (dataResponse != null) {
                            i4 = dataResponse.getPageCount() - 1;
                        } else {
                            i4 = 0;
                        }
                        int i15 = assetsListActivity.f12156J;
                        if (i4 == i15) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetsListActivity.f12159M = z2;
                        Ca.c cVar = assetsListActivity.f12160N;
                        if (i15 > 0) {
                            if (dataResponse != null && (items2 = dataResponse.getItems()) != null) {
                                cVar.alpha(items2);
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else if (dataResponse != null && (items = dataResponse.getItems()) != null) {
                            cVar.bravo(items);
                            LinearLayoutCompat linearLayoutCompat = assetsListActivity.gray().bravo;
                            List items3 = dataResponse.getItems();
                            if (items3 != null && !items3.isEmpty()) {
                                z11 = false;
                            }
                            if (z11) {
                                i5 = 0;
                            } else {
                                i5 = 8;
                            }
                            linearLayoutCompat.setVisibility(i5);
                            RecyclerView recyclerView = assetsListActivity.gray().charlie;
                            List items4 = dataResponse.getItems();
                            if (items4 != null && !items4.isEmpty()) {
                                i10 = 0;
                            }
                            recyclerView.setVisibility(i10);
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    assetsListActivity.gray().delta.setRefreshing(false);
                }
                return Unit.INSTANCE;
            case 10:
                C2492a c2492a3 = (C2492a) it;
                int i16 = c2492a3.alpha;
                qa.k kVar = (qa.k) obj;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            kVar.tango().bronze();
                        }
                    } else {
                        kVar.tango().tango();
                        d3.k tango = kVar.tango();
                        String string = kVar.getString(R.string.asset_returned_success);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(tango, string);
                        kVar.tango().setResult(-1);
                        kVar.tango().finish();
                        kVar.lima(false, false);
                    }
                } else {
                    kVar.tango().tango();
                    L9.d.pink(kVar.tango(), String.valueOf(c2492a3.bravo));
                }
                ((TextInputLayout) kVar.azure().red).setError(null);
                return Unit.INSTANCE;
            case 11:
                c0.d dVar = (c0.d) it;
                InterfaceC0364r mike = dVar.lime().mike();
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar.bravo() >> 32)), (int) Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)));
                drawable.draw(AbstractC0349c.alpha(mike));
                return Unit.INSTANCE;
            case 12:
                return PlayStoreAppRatingTemplate.delta((CustomTemplateContext.FunctionContext) obj, (Exception) it);
            case 13:
                C2492a c2492a4 = (C2492a) it;
                int i17 = c2492a4.alpha;
                AttendanceRegistryFragment attendanceRegistryFragment = (AttendanceRegistryFragment) obj;
                String str3 = c2492a4.bravo;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            attendanceRegistryFragment.kilo().bronze();
                        }
                    } else {
                        attendanceRegistryFragment.kilo().tango();
                        L9.d.pink(attendanceRegistryFragment.kilo(), String.valueOf(str3));
                        J2.f.alpha(attendanceRegistryFragment).echo();
                    }
                } else {
                    attendanceRegistryFragment.kilo().tango();
                    L9.d.pink(attendanceRegistryFragment.kilo(), String.valueOf(str3));
                    attendanceRegistryFragment.startActivityForResult(new Intent(attendanceRegistryFragment.getContext(), (Class<?>) ScannerActivity.class), attendanceRegistryFragment.f12163f);
                }
                return Unit.INSTANCE;
            case 14:
                Byte b2 = (Byte) it;
                byte byteValue = b2.byteValue();
                StringBuilder sb2 = (StringBuilder) obj;
                if (byteValue == 32) {
                    sb2.append("%20");
                } else if (!AbstractC2850a.alpha.contains(b2) && !AbstractC2850a.charlie.contains(b2)) {
                    sb2.append(AbstractC2850a.hotel(byteValue));
                } else {
                    sb2.append((char) byteValue);
                }
                return Unit.INSTANCE;
            case 15:
                C2876b c2876b = (C2876b) obj;
                c2876b.red.invoke((C2263a) it, AbstractC2557q.echo(c2876b, AndroidCompositionLocals_androidKt.bravo));
                return Unit.INSTANCE;
            case 16:
                ((Function1) it).invoke((C2263a) obj);
                return Unit.INSTANCE;
            case 17:
                s0.j0 j0Var = (s0.j0) it;
                if (j0Var instanceof C2875a) {
                    ((Y) obj).invoke(((C2875a) j0Var).alpha);
                    return Boolean.TRUE;
                }
                throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
            case 18:
                return new C0130l1(12, (C3130d) obj);
            case 19:
                C2492a c2492a5 = (C2492a) it;
                int i18 = ResetPasswordActivity.f12449K;
                int i19 = c2492a5.alpha;
                ResetPasswordActivity resetPasswordActivity = (ResetPasswordActivity) obj;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            resetPasswordActivity.bronze();
                        }
                    } else {
                        resetPasswordActivity.tango();
                        String string2 = resetPasswordActivity.getString(R.string.password_resent);
                        Intrinsics.delta(string2, "getString(...)");
                        L9.d.pink(resetPasswordActivity, string2);
                        resetPasswordActivity.finish();
                    }
                } else {
                    resetPasswordActivity.tango();
                    String str4 = c2492a5.bravo;
                    if (str4 != null) {
                        String string3 = resetPasswordActivity.getString(R.string.attention);
                        Intrinsics.delta(string3, "getString(...)");
                        String string4 = resetPasswordActivity.getString(R.string.ok);
                        Intrinsics.delta(string4, "getString(...)");
                        L9.d.olive(resetPasswordActivity, string3, str4, string4, null, null, null, 120);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                List list = (List) it;
                int i20 = ScannerActivity.Q;
                Intrinsics.checkNotNull(list);
                Barcode barcode = (Barcode) CollectionsKt.green(list);
                if (barcode == null) {
                    return Unit.INSTANCE;
                }
                String rawValue = barcode.getRawValue();
                byte[] rawBytes = barcode.getRawBytes();
                if (rawValue == null && rawBytes == null) {
                    return Unit.INSTANCE;
                }
                ScannerActivity scannerActivity = (ScannerActivity) obj;
                if (scannerActivity.f12454K.compareAndSet(false, true)) {
                    if (rawValue == null) {
                        if (rawBytes != null) {
                            num = Integer.valueOf(rawBytes.length);
                        }
                        str = "<binary, " + num + " bytes>";
                    } else {
                        str = rawValue;
                    }
                    Log.d("QrScanner", "Scanned value: " + str);
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 31) {
                        Object systemService = scannerActivity.getSystemService("vibrator_manager");
                        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                        vibrator = t0.aj.bravo(systemService).getDefaultVibrator();
                    } else {
                        Object systemService2 = scannerActivity.getSystemService("vibrator");
                        Intrinsics.charlie(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                        vibrator = (Vibrator) systemService2;
                    }
                    Intrinsics.checkNotNull(vibrator);
                    if (i21 >= 26) {
                        createOneShot = VibrationEffect.createOneShot(100L, -1);
                        vibrator.vibrate(createOneShot);
                    } else {
                        vibrator.vibrate(100L);
                    }
                    Intent intent = new Intent();
                    if (rawValue != null) {
                        intent.putExtra("SCAN_RESULT", rawValue);
                    }
                    if (rawBytes != null) {
                        intent.putExtra("SCAN_RESULT_B64", Base64.encodeToString(rawBytes, 2));
                    }
                    scannerActivity.setResult(-1, intent);
                    scannerActivity.finish();
                }
                return Unit.INSTANCE;
            case 21:
                ((w.v) obj).alpha((I0.g) it);
                return Unit.INSTANCE;
            case 22:
                C2492a c2492a6 = (C2492a) it;
                int i22 = c2492a6.alpha;
                C3248d c3248d = (C3248d) obj;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            c3248d.victor().bronze();
                        }
                    } else {
                        c3248d.victor().tango();
                        c3248d.f14036z = false;
                        c3248d.juliet();
                    }
                } else {
                    c3248d.victor().tango();
                    String str5 = c2492a6.bravo;
                    if (str5 == null) {
                        return Unit.INSTANCE;
                    }
                    c3248d.black(str5);
                    c3248d.f14036z = false;
                    c3248d.bronze().f379f.setEnabled(true);
                }
                return Unit.INSTANCE;
            case 23:
                C2492a c2492a7 = (C2492a) it;
                int i23 = RegisterActivity.f12181J;
                int i24 = c2492a7.alpha;
                RegisterActivity registerActivity = (RegisterActivity) obj;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            registerActivity.bronze();
                        }
                    } else {
                        registerActivity.tango();
                        SignUpResponse signUpResponse = (SignUpResponse) c2492a7.charlie;
                        if (signUpResponse != null) {
                            ((AuthViewModel) registerActivity.f12183I.getValue()).updateRequest(new C2007a(14, registerActivity, signUpResponse));
                        }
                    }
                } else {
                    registerActivity.tango();
                }
                return Unit.INSTANCE;
            case 24:
                C2492a c2492a8 = (C2492a) it;
                int i25 = c2492a8.alpha;
                ScoreFragment scoreFragment = (ScoreFragment) obj;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            scoreFragment.kilo().bronze();
                        }
                    } else {
                        scoreFragment.kilo().tango();
                        List list2 = (List) c2492a8.charlie;
                        if (list2 != null && !list2.isEmpty()) {
                            scoreFragment.f12462f.bravo(CollectionsKt.p(list2, new Sb.k(20)));
                            ((RecyclerView) scoreFragment.romeo().red).setVisibility(0);
                            ((LinearLayout) scoreFragment.romeo().purple).setVisibility(8);
                        } else {
                            ((RecyclerView) scoreFragment.romeo().red).setVisibility(8);
                            ((LinearLayout) scoreFragment.romeo().purple).setVisibility(0);
                        }
                        ((SwipeRefreshLayout) scoreFragment.romeo().silver).setRefreshing(false);
                    }
                } else {
                    scoreFragment.kilo().tango();
                    ((SwipeRefreshLayout) scoreFragment.romeo().silver).setRefreshing(false);
                    Context context = scoreFragment.getContext();
                    if (context != null) {
                        L9.d.pink(context, String.valueOf(c2492a8.bravo));
                    }
                }
                return Unit.INSTANCE;
            default:
                return InternalCheckoutComponents.echo((InternalCheckoutComponents) obj, (UpdateDetails) it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Y(Function0 function0) {
        this.alpha = 8;
        this.purple = (Lambda) function0;
    }

    public /* synthetic */ Y(Y y10, C0331t0 c0331t0) {
        this.alpha = 17;
        this.purple = y10;
    }
}
